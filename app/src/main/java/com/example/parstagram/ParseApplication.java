package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("oJgNxc0zokLlVMyzmbA67gn30qKhi5xh24lwhMvm")
                .clientKey("t8LtGN1Ix9A3C1fY4aJix7RBUKVVDRL8UQMl4rA8")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

