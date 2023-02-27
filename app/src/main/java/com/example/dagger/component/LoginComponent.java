package com.example.dagger.component;

import com.example.dagger.activity.login.LoginActivity;
import com.example.dagger.activity.login.fragment.LoginPasswordFragment;
import com.example.dagger.activity.login.fragment.LoginUsernameFragment;
import com.example.dagger.custom.MyCustomScope;

import dagger.Subcomponent;

/**
 * Classes annotated with @ActivityScope are scoped to the graph and the same
 * instance of that type is provided every time the type is requested.
 */
@MyCustomScope.ActivityScope
/**
 * Annotation informs Dagger this interface is a Dagger Subcomponent
 */
@Subcomponent
public interface LoginComponent {

    /**
     * Factory that is used to create instances of this subcomponent
     */
    @Subcomponent.Factory
    interface Factory{
        LoginComponent create();
    }

    /**
     * This tells Dagger that LoginActivity requests injection from LoginComponent
     * so that this subcomponent graph needs to satisfy all the dependencies of the
     * fields that LoginActivity is injecting
     * @param loginActivity
     */
    void inject(LoginActivity loginActivity);
    void inject(LoginUsernameFragment loginUsernameFragment);
    void inject(LoginPasswordFragment loginPasswordFragment);

}
