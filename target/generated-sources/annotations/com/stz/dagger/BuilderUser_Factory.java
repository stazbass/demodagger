// Generated by Dagger (https://google.github.io/dagger).
package com.stz.dagger;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class BuilderUser_Factory implements Factory<BuilderUser> {
  private final Provider<String> nameProvider;

  public BuilderUser_Factory(Provider<String> nameProvider) {
    this.nameProvider = nameProvider;
  }

  @Override
  public BuilderUser get() {
    return provideInstance(nameProvider);
  }

  public static BuilderUser provideInstance(Provider<String> nameProvider) {
    return new BuilderUser(nameProvider.get());
  }

  public static BuilderUser_Factory create(Provider<String> nameProvider) {
    return new BuilderUser_Factory(nameProvider);
  }

  public static BuilderUser newBuilderUser(String name) {
    return new BuilderUser(name);
  }
}
