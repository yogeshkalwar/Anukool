
package com.yogi.anukool;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class AnukoolModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public AnukoolModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "Anukool";
  }

  @ReactMethod
  public void toast(String message) {
    Toast.makeToast(reactContext, message, Toast.LENGTH_LONG).show();
  }
}
