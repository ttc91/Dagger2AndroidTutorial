package com.example.dagger.data;

import javax.inject.Inject;

public class UserLocalDataSource {

    /**
     * Now Dagger knows how to create an instance of UserRepository, but it doesn't know how to create its dependencies. If you annotate the other classes too, Dagger knows how to create them.
     */
    @Inject
    public UserLocalDataSource(){}

}
