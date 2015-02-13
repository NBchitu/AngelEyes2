package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jx;

public abstract class g<T>
{
  private final String a;
  private T b;
  
  protected g(String paramString)
  {
    this.a = paramString;
  }
  
  protected final T a(Context paramContext)
  {
    ClassLoader localClassLoader;
    if (this.b == null)
    {
      jx.a(paramContext);
      Context localContext = GooglePlayServicesUtil.c(paramContext);
      if (localContext == null) {
        throw new g.a("Could not get remote context.");
      }
      localClassLoader = localContext.getClassLoader();
    }
    try
    {
      this.b = a((IBinder)localClassLoader.loadClass(this.a).newInstance());
      return this.b;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new g.a("Could not load creator class.", localClassNotFoundException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new g.a("Could not instantiate creator.", localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new g.a("Could not access creator.", localIllegalAccessException);
    }
  }
  
  protected abstract T a(IBinder paramIBinder);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.g
 * JD-Core Version:    0.7.0.1
 */