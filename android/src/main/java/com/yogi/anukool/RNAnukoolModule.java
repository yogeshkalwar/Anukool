
package com.yogi.anukool;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.yogi.anukool.constants.Constants;

public class RNAnukoolModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNAnukoolModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return Constants.MODULE_NAME;
  }

  @ReactMethod
  public void show(String message) {
    Toast.makeText(reactContext, message, Toast.LENGTH_LONG).show();
  }
}