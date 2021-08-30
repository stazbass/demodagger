package com.stz.dagger;

import java.util.UUID;

import dagger.Module;
import dagger.Provides;

@Module
public class StringModule {
    @Provides
    public String genString(){
        return "string " + UUID.randomUUID().toString();
    }
}