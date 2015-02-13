package com.google.common.base;

import javax.annotation.Nullable;

public final class Throwables
{
  public static void a(@Nullable Throwable paramThrowable)
  {
    a(paramThrowable, Error.class);
    a(paramThrowable, RuntimeException.class);
  }
  
  public static <X extends Throwable> void a(@Nullable Throwable paramThrowable, Class<X> paramClass)
  {
    if ((paramThrowable != null) && (paramClass.isInstance(paramThrowable))) {
      throw ((Throwable)paramClass.cast(paramThrowable));
    }
  }
  
  public static RuntimeException b(Throwable paramThrowable)
  {
    a((Throwable)Preconditions.a(paramThrowable));
    throw new RuntimeException(paramThrowable);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.base.Throwables
 * JD-Core Version:    0.7.0.1
 */