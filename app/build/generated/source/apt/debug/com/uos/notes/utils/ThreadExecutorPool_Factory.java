package com.uos.notes.utils;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum ThreadExecutorPool_Factory implements Factory<ThreadExecutorPool> {
INSTANCE;

  @Override
  public ThreadExecutorPool get() {  
    return new ThreadExecutorPool();
  }

  public static Factory<ThreadExecutorPool> create() {  
    return INSTANCE;
  }
}

