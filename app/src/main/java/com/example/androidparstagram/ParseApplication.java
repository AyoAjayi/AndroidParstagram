package com.example.androidparstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("android-pastagram") // should correspond to APP_ID env variable
                .clientKey("AyoParseKey")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://android-pastagram.herokuapp.com/parse/").build());
    }
}
