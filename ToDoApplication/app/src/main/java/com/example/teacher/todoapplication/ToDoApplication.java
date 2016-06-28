package com.example.teacher.todoapplication;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by teacher on 6/28/2016.
 */
public class ToDoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        // other setup code
    }
}
