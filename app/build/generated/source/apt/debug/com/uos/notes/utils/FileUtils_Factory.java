package com.uos.notes.utils;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum FileUtils_Factory implements Factory<FileUtils> {
INSTANCE;

  @Override
  public FileUtils get() {  
    return new FileUtils();
  }

  public static Factory<FileUtils> create() {  
    return INSTANCE;
  }
}

