package com.example.dagger.repository;

import com.example.dagger.data.UserLocalDataSource;
import com.example.dagger.data.UserRemoteDataSource;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * <p>To demonstrate how can work with Dagger. Lets create a simple factory for <b>UserRepository</b>.</p>
 * <p>To have a unique instance of a UserRepository when you ask for the repository in ApplicationGraph, use the same scope annotation for the @Component interface and UserRepository. You can use the @Singleton annotation that already comes with the javax.inject package.</p>
 */
@Singleton
public class UserRepository {

    private final UserLocalDataSource mUserLocalDataSource;
    private final UserRemoteDataSource mUserRemoteDataSource;

    /**
     * <b>Inject</b> lets Dagger to know how to create instance of this object.
     * @param mUserLocalDataSource dependency of UserRepository.
     * @param mUserRemoteDataSource dependency of UserRepository.
     */
    @Inject
    public UserRepository(UserLocalDataSource mUserLocalDataSource, UserRemoteDataSource mUserRemoteDataSource) {
        this.mUserLocalDataSource = mUserLocalDataSource;
        this.mUserRemoteDataSource = mUserRemoteDataSource;
    }
}
