package com.google.common.base;

import javax.annotation.Nullable;

public final class Objects
{
  public static boolean a(@Nullable Object paramObject1, @Nullable Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.base.Objects
 * JD-Core Version:    0.7.0.1
 */