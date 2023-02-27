package com.example.dagger.custom;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

final public class MyCustomScope{

    @Scope
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ActivityScope {}

}
