package com.example.dagger.data.api;

import com.example.dagger.data.api.service.LoginService;
import com.example.dagger.data.api.service.impl.LoginRetrofitService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 *  To create a module, we need to annotate the class with the @Module annotation. This annotation indicates that the class can make dependencies available to the container:
 */
@Module
public class NetworkModule {

    /**
     * We need to add the @Provides annotation on methods that construct our dependencies
     * @return
     */
    @Singleton
    @Provides
    public LoginRetrofitService provideLoginRetrofitService(){
        return new Retrofit.Builder()
                .baseUrl("http://example.com")
                .build()
                .create(LoginService.class);
    }

}
