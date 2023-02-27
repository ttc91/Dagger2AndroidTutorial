package com.example.dagger;


import android.app.Application;

import com.example.dagger.component.LoginComponent;
import com.example.dagger.component.provider.LoginComponentProvider;
import com.example.dagger.repository.UserRepository;

public class MyApplication extends Application implements LoginComponentProvider {

    /**
     * Create an instance of application graph.
     */
    public ApplicationGraph graph = DaggerApplicationGraph.create();

    /**
     * Grab an instance of UserRepository from the application graph
     */
    UserRepository userRepository = graph.userRepository();

    @Override
    public LoginComponent provideLoginComponent() {
        return graph.loginComponent().create();
    }
}
