package com.example.dagger.activity.register;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.dagger.ApplicationGraph;
import com.example.dagger.MyApplication;
import com.example.dagger.component.DaggerRegisterComponent;

import javax.inject.Inject;

public class RegisterActivity extends Activity {

    @Inject
    RegisterViewModel vm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Creates a new instance of RegisterComponent.
        //Injects the component to populate the @Inject fields.
        ApplicationGraph applicationGraph = ((MyApplication) getApplicationContext()).graph;
        DaggerRegisterComponent.factory().create(applicationGraph).inject(this);

        //Now you can access registerViewModel

    }
}
