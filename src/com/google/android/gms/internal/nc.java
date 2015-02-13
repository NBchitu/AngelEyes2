package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public class nc
  extends jl<ni>
{
  protected final np<ni> d = new nc.1(this);
  private final String e;
  
  public nc(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
    this.e = paramString;
  }
  
  protected void a(jt paramjt, jl.e parame)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("client_name", this.e);
    paramjt.e(parame, 6587000, g().getPackageName(), localBundle);
  }
  
  protected ni c(IBinder paramIBinder)
  {
    return ni.a.a(paramIBinder);
  }
  
  protected String d()
  {
    return "com.google.android.location.internal.GoogleLocationManagerService.START";
  }
  
  protected String e()
  {
    return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nc
 * JD-Core Version:    0.7.0.1
 */