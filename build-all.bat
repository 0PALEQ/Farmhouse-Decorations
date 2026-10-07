@echo off
setlocal EnableExtensions

set "ROOT=%~dp0"
set "OUTPUT=%ROOT%build\libs"
set "MOD_VERSION="
set "ORIGINAL_PATH=%PATH%"

for /f "tokens=1,* delims==" %%A in ('findstr /b /c:"mod_version=" "%ROOT%gradle.properties"') do set "MOD_VERSION=%%B"

if not defined MOD_VERSION (
    echo ERROR: mod_version is missing from "%ROOT%gradle.properties".
    exit /b 1
)

if exist "%OUTPUT%" rmdir /s /q "%OUTPUT%"
mkdir "%OUTPUT%" || exit /b 1

call :build "fabric_1.20.1" "fdm-%MOD_VERSION%-fabric-1.20.1.jar" "17" || exit /b 1
call :build "fabric_1.21.1" "fdm-%MOD_VERSION%-fabric-1.21.1.jar" "21" || exit /b 1
call :build "fabric_1.21.11" "fdm-%MOD_VERSION%-fabric-1.21.11.jar" "21" || exit /b 1
call :build "fabric_26.1.2" "fdm-%MOD_VERSION%-fabric-26.1.2.jar" "25" || exit /b 1
call :build "fabric_26.2" "fdm-%MOD_VERSION%-fabric-26.2.jar" "25" || exit /b 1
call :build "forge_1.20.1" "fdm-%MOD_VERSION%-forge-1.20.1.jar" "17" || exit /b 1
call :build "neoforge_1.21.1" "fdm-%MOD_VERSION%-neoforge-1.21.1.jar" "21" || exit /b 1
call :build "neoforge_1.21.11" "fdm-%MOD_VERSION%-neoforge-1.21.11.jar" "21" || exit /b 1
call :build "neoforge_26.1.2" "fdm-%MOD_VERSION%-neoforge-26.1.2.jar" "25" || exit /b 1
call :build "neoforge_26.2" "fdm-%MOD_VERSION%-neoforge-26.2.jar" "25" || exit /b 1

echo.
echo All builds completed successfully. Jars are in "%OUTPUT%".
exit /b 0

:build
set "VERSION_DIR=%~1"
set "JAR_NAME=%~2"
call :select_java "%~3" || exit /b 1
echo.
echo ==== Building %VERSION_DIR% with Java %~3 ====
call "%ROOT%versions\%VERSION_DIR%\gradlew.bat" -p "%ROOT%versions\%VERSION_DIR%" --no-daemon clean build
if errorlevel 1 (
    echo ERROR: Build failed for %VERSION_DIR%.
    exit /b 1
)

if not exist "%ROOT%versions\%VERSION_DIR%\build\libs\%JAR_NAME%" (
    echo ERROR: Expected jar was not produced: %JAR_NAME%
    exit /b 1
)

copy /y "%ROOT%versions\%VERSION_DIR%\build\libs\%JAR_NAME%" "%OUTPUT%\%JAR_NAME%" >nul
if errorlevel 1 exit /b 1
echo Built %JAR_NAME%
exit /b 0

:select_java
set "REQUIRED_JAVA=%~1"
set "SELECTED_JAVA="

for /d %%J in ("%USERPROFILE%\.gradle\jdks\eclipse_adoptium-%REQUIRED_JAVA%-*") do if exist "%%~fJ\bin\java.exe" set "SELECTED_JAVA=%%~fJ"
if not defined SELECTED_JAVA for /d %%J in ("%USERPROFILE%\.jdks\*%REQUIRED_JAVA%*") do if exist "%%~fJ\bin\java.exe" set "SELECTED_JAVA=%%~fJ"
if not defined SELECTED_JAVA for /d %%J in ("%ProgramFiles%\Eclipse Adoptium\jdk-%REQUIRED_JAVA%-*") do if exist "%%~fJ\bin\java.exe" set "SELECTED_JAVA=%%~fJ"
if not defined SELECTED_JAVA for /d %%J in ("%ProgramFiles%\Java\jdk-%REQUIRED_JAVA%*") do if exist "%%~fJ\bin\java.exe" set "SELECTED_JAVA=%%~fJ"

if not defined SELECTED_JAVA (
    echo ERROR: Java %REQUIRED_JAVA% is required but no matching JDK was found.
    echo Checked Gradle toolchains, user JDKs, Eclipse Adoptium, and Program Files\Java.
    exit /b 1
)

set "JAVA_HOME=%SELECTED_JAVA%"
set "PATH=%JAVA_HOME%\bin;%ORIGINAL_PATH%"
exit /b 0
