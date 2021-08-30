package com.stz.dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = StringModule.class)
public interface MainComponent {
    String buildString();
    BuilderUser createUser();
}