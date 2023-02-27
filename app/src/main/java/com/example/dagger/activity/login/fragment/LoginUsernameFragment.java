package com.example.dagger.activity.login.fragment;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.dagger.activity.login.LoginActivity;
import com.example.dagger.activity.login.LoginViewModel;

import javax.inject.Inject;

public class LoginUsernameFragment extends Fragment {

    @Inject
    LoginViewModel loginViewModel;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        ((LoginActivity)getActivity()).loginComponent.inject(this);

    }
}
