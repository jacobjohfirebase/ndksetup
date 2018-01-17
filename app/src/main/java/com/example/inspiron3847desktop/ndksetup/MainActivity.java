package com.example.inspiron3847desktop.ndksetup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static native String getStringFromNative();

}
//javah -d jni -classpath C:/Users/Inspiron3847/DesktopAppDataLocal/Android/Sdk/platforms/android-23/android.jar;C:/Users/Inspiron3847/DesktopAppDataLocal/Android/Sdk/extras/android/support/v7/appcompat/libs/android-support-v7-appcompat.jar;C:/Users/Inspiron3847/DesktopAppDataLocal/Android/Sdk/extras/android/support/v7/appcompat/libs/android-support-v4.jar:../../build/intermediates/classes/debug com.example.inspiron3847desktop.ndksetup.MainActivity