package com.example.dagger.activity.login;

import androidx.lifecycle.ViewModel;

import com.example.dagger.custom.MyCustomScope;
import com.example.dagger.repository.UserRepository;

import javax.inject.Inject;

/**
 * A unique instance of LoginViewModel is provided in Components
 * annotated with @ActivityScope
 */
@MyCustomScope.ActivityScope
public class LoginViewModel extends ViewModel {

    private final UserRepository repository;

    /**
     * @Inject tells Dagger how to create instances of LoginViewModel
     * @param repository
     */
    @Inject
    public LoginViewModel(UserRepository repository) {
        this.repository = repository;
    }

}
