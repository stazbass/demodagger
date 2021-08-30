package com.stz.dagger;

import javax.inject.Inject;

public class BuilderUser {
    String name;
    @Inject
    public BuilderUser(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name + super.toString();
    }
}