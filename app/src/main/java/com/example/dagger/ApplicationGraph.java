package com.example.dagger;

import com.example.dagger.component.LoginComponent;
import com.example.dagger.component.RegisterComponent;
import com.example.dagger.component.sub.SubcomponentsModule;
import com.example.dagger.data.api.NetworkModule;
import com.example.dagger.repository.UserRepository;

import javax.inject.Singleton;

import dagger.Component;

/**
 * <p>Dagger can create a graph of the dependencies in your project that it can use to find out where it should get those dependencies when they are needed. To make Dagger do this, you need to create an interface and annotate it with @Component. Dagger creates a container as you would have done with manual dependency injection.</p>
 * <p>Inside the @Component interface, you can define functions that return instances of the classes you need (i.e. UserRepository). @Component tells Dagger to generate a container with all the dependencies required to satisfy the types it exposes. This is called a Dagger component; it contains a graph that consists of the objects that Dagger knows how to provide and their respective dependencies.</p>
 * <p><b>@Component</b> makes Dagger create a graph of dependencies.</p>
 * With this annotation (i.e. @Singleton) are scoped to the graph and the same
 * instance of that type is provided every time the type is requested.
 */
@Component(
        modules = {NetworkModule.class, SubcomponentsModule.class }
)
@Singleton
public interface ApplicationGraph{

    /**
     *   The return type  of functions inside the component interface is
     *   what can be consumed from the graph
     * @return
     */
    UserRepository userRepository();

    /**
     * This function exposes the LoginComponent Factory out of the graph so customer
     * can use it to obtain new instances of LoginComponent.
     */
    LoginComponent.Factory loginComponent();

}
