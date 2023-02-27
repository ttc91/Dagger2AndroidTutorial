package com.example.dagger.component;

import com.example.dagger.ApplicationGraph;
import com.example.dagger.activity.register.RegisterActivity;
import com.example.dagger.activity.register.fragment.RegisterPasswordFragment;
import com.example.dagger.activity.register.fragment.RegisterUsernameFragment;
import com.example.dagger.custom.MyCustomScope;

import dagger.Component;

@MyCustomScope.ActivityScope
@Component(dependencies = {ApplicationGraph.class})
public interface RegisterComponent {

    @Component.Factory
    interface Factory{
        RegisterComponent create(ApplicationGraph graph);
    }

    void inject(RegisterActivity activity);
    void inject(RegisterPasswordFragment fragment);
    void inject(RegisterUsernameFragment fragment);

}
