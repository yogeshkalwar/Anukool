
# react-native-anukool

## Getting started

`$ npm install react-native-anukool --save`

### Mostly automatic installation

`$ react-native link react-native-anukool`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-anukool` and add `Anukool.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libAnukool.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.AnukoolPackage;` to the imports at the top of the file
  - Add `new AnukoolPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-anukool'
  	project(':react-native-anukool').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-anukool/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-anukool')
  	```

## Usage
```javascript
import Anukool from 'react-native-anukool';

// TODO: What to do with the module?
Anukool;
```
