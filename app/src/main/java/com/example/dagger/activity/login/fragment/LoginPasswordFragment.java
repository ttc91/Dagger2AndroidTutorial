package com.example.dagger.activity.login.fragment;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.dagger.activity.login.LoginActivity;
import com.example.dagger.activity.login.LoginViewModel;

import javax.inject.Inject;

public class LoginPasswordFragment extends Fragment {

    /**
     * Fields that need to be injected by the login graph.
     */
    @Inject
    LoginViewModel loginViewModel;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        //Obtaining the login graph from LoginActivity and instantiate
        //the @Inject fields with objects from the graph
        ((LoginActivity)getActivity()).loginComponent.inject(this);

        // Now you can access loginViewModel here and onCreateView too
        // (shared instance with the Activity and the other Fragment)
    }

}
