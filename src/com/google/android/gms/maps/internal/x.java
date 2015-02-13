package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class x
{
  private static Context a;
  private static c b;
  
  public static c a(Context paramContext)
  {
    jx.a(paramContext);
    if (b != null) {
      return b;
    }
    b(paramContext);
    b = c(paramContext);
    try
    {
      b.a(e.a(d(paramContext).getResources()), 6587000);
      return b;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  private static <T> T a(Class<?> paramClass)
  {
    try
    {
      Object localObject = paramClass.newInstance();
      return localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new IllegalStateException("Unable to instantiate the dynamic class " + paramClass.getName());
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalStateException("Unable to call the default constructor of " + paramClass.getName());
    }
  }
  
  private static <T> T a(ClassLoader paramClassLoader, String paramString)
  {
    try
    {
      Object localObject = a(((ClassLoader)jx.a(paramClassLoader)).loadClass(paramString));
      return localObject;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new IllegalStateException("Unable to find dynamic class " + paramString);
    }
  }
  
  public static boolean a()
  {
    return false;
  }
  
  private static Class<?> b()
  {
    try
    {
      if (Build.VERSION.SDK_INT < 15) {
        return Class.forName("com.google.android.gms.maps.internal.CreatorImplGmm6");
      }
      Class localClass = Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new RuntimeException(localClassNotFoundException);
    }
  }
  
  private static void b(Context paramContext)
  {
    int i = GooglePlayServicesUtil.a(paramContext);
    switch (i)
    {
    default: 
      throw new GooglePlayServicesNotAvailableException(i);
    }
  }
  
  private static c c(Context paramContext)
  {
    if (a())
    {
      Log.i(x.class.getSimpleName(), "Making Creator statically");
      return (c)a(b());
    }
    Log.i(x.class.getSimpleName(), "Making Creator dynamically");
    return c.a.a((IBinder)a(d(paramContext).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
  }
  
  private static Context d(Context paramContext)
  {
    if (a == null) {
      if (!a()) {
        break label23;
      }
    }
    label23:
    for (a = paramContext.getApplicationContext();; a = GooglePlayServicesUtil.c(paramContext)) {
      return a;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.x
 * JD-Core Version:    0.7.0.1
 */