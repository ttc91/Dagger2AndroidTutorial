package com.example.dagger.activity.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger.R;
import com.example.dagger.component.LoginComponent;
import com.example.dagger.component.provider.LoginComponentProvider;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {

    /**
     * Reference to the Login graph.
     */
    public LoginComponent loginComponent;

    /**
     * You want Dagger to provide an instance of LoginViewModel from the graph.
     */
    @Inject
    LoginViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Creation of the login graph using the application graph.
        loginComponent = ((LoginComponentProvider) getApplicationContext()).provideLoginComponent();

        // Make Dagger instantiate @Inject fields in LoginActivity
        loginComponent.inject(this);
        // Now loginViewModel is available

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}