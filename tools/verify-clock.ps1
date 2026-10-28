param(
    [string]$EqlibDir = "$PSScriptRoot/../../../opaleqsLibrary",
    [string]$JavaDir = "$env:USERPROFILE/.jdks/ms-17.0.18"
)
$ErrorActionPreference = 'Stop'
$taskRoot = Split-Path $PSScriptRoot -Parent
$taskOutput = Join-Path $taskRoot 'build/clock-test'
New-Item -ItemType Directory -Force $taskOutput | Out-Null
$taskApi = Join-Path $EqlibDir 'maven/com/cookiecraftmods/eqlib/1.0.3/eqlib-1.0.3-dev-fabric_1.20.1.jar'
$taskGson = Get-ChildItem "$env:USERPROFILE/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson" -Filter '*.jar' -Recurse | Select-Object -First 1 -ExpandProperty FullName
if (!(Test-Path -LiteralPath $taskApi) -or !$taskGson) { throw 'eqLib 1.0.3 development API and cached Gson are required.' }
$taskClasspath = "$taskApi;$taskGson"
& "$JavaDir/bin/javac.exe" -cp $taskClasspath -d $taskOutput "$taskRoot/shared/src/main/java/com/cookiecraftmods/farmhousedecorations/client/clock/CuckooClockHands.java" "$PSScriptRoot/ClockHandsTest.java"
if ($LASTEXITCODE) { throw 'Clock test compilation failed.' }
& "$JavaDir/bin/java.exe" -cp "$taskOutput;$taskClasspath" ClockHandsTest "$taskRoot/shared/src/main/resources/assets/farmhouse_decorations/models"
if ($LASTEXITCODE) { throw 'Clock tests failed.' }
