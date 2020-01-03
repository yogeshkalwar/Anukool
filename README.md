
# react-native-anukool

## Getting started

`$ npm install react-native-anukool --save`

### Mostly automatic installation

`$ react-native link react-native-anukool`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-anukool` and add `RNAnukool.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNAnukool.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNAnukoolPackage;` to the imports at the top of the file
  - Add `new RNAnukoolPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-anukool'
  	project(':react-native-anukool').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-anukool/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-anukool')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNAnukool.sln` in `node_modules/react-native-anukool/windows/RNAnukool.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Anukool.RNAnukool;` to the usings at the top of the file
  - Add `new RNAnukoolPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNAnukool from 'react-native-anukool';

// TODO: What to do with the module?
RNAnukool;
```
  