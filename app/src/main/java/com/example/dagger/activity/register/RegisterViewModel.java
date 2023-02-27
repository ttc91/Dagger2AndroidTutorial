package com.example.dagger.activity.register;

import androidx.lifecycle.ViewModel;

import com.example.dagger.custom.MyCustomScope;
import com.example.dagger.repository.UserRepository;

import javax.inject.Inject;

@MyCustomScope.ActivityScope
public class RegisterViewModel extends ViewModel {

    private final UserRepository repository;

    @Inject
    public RegisterViewModel(UserRepository repository){
        this.repository = repository;
    }

}
