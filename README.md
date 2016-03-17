# gradle-zundokokiyoshi-plugin


## Usage

You can add it to your build script using the following configuration:

```gradle
apply plugin: 'com.os.operando.gradle.zundokokiyoshi'

buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'com.os.operando.zundokokiyoshi:gradle-zundokokiyoshi-plugin:0.9.4'
    }
}
```

## Tasks

### `zundokokiyoshi`

```bash
$ gradle zungokokiyoshi
:zungokokiyoshi
ズン ズン ドコ ズン ズン ズン ドコ ズン ズン ズン ズン ズン ドコ キ・ヨ・シ！

BUILD SUCCESSFUL

Total time: 3.814 secs

```

### Android assemble task dependencies zundokokiyoshi

```bash
$ gradle assembleDebug
:app:preBuild UP-TO-DATE
:app:preDebugBuild UP-TO-DATE
:app:checkDebugManifest
:app:preReleaseBuild UP-TO-DATE
:app:prepareComAndroidSupportAppcompatV72211Library
:app:prepareComAndroidSupportSupportV42211Library
:app:prepareDebugDependencies
:app:compileDebugAidl
:app:compileDebugRenderscript
:app:generateDebugBuildConfig
:app:generateDebugAssets UP-TO-DATE
:app:mergeDebugAssets
:app:generateDebugResValues
:app:generateDebugResources
:app:mergeDebugResources
:app:processDebugManifest
:app:processDebugResources
:app:generateDebugSources
:app:compileDebugJavaWithJavac
:app:compileDebugNdk UP-TO-DATE
:app:compileDebugSources
:app:transformClassesWithDexForDebug
:app:mergeDebugJniLibFolders
:app:transformNative_libsWithMergeJniLibsForDebug
:app:processDebugJavaRes UP-TO-DATE
:app:transformResourcesWithMergeJavaResForDebug
:app:validateDebugSigning
:app:packageDebug
:app:zipalignDebug
:app:assembleDebug
ドコ ズン ズン ドコ ズン ズン ドコ ズン ズン ドコ ズン ズン ズン ドコ ズン ズン ズン ズン ドコ ドコ ドコ ズン ズン ドコ ドコ ドコ ズン ドコ ドコ ドコ ドコ ドコ ドコ ドコ ズン ズン ドコ ズン ズン ドコ ドコ ズン ドコ ズン ズン ズン ズン ドコ ズン ドコ ドコ ズン ドコ ドコ ズン ドコ ドコ ズン ドコ ドコ ズン ズン ドコ ドコ ドコ ズン ドコ ズン ズン ドコ ズン ズン ドコ ドコ ズン ズン ズン ドコ ドコ ズン ドコ ドコ ドコ ドコ ドコ ズン ドコ ズン ドコ ズン ズン ズン ズン ズン ドコ キ・ヨ・シ！

BUILD SUCCESSFUL

Total time: 24.083 secs
```

## License

[Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2016 Shinobu Okano

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```