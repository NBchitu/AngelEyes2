package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jv.a;

public final class ConnectionResult
{
  public static final ConnectionResult a = new ConnectionResult(0, null);
  private final PendingIntent b;
  private final int c;
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent)
  {
    this.c = paramInt;
    this.b = paramPendingIntent;
  }
  
  private String e()
  {
    switch (this.c)
    {
    case 12: 
    default: 
      return "unknown status code " + this.c;
    case 0: 
      return "SUCCESS";
    case 1: 
      return "SERVICE_MISSING";
    case 2: 
      return "SERVICE_VERSION_UPDATE_REQUIRED";
    case 3: 
      return "SERVICE_DISABLED";
    case 4: 
      return "SIGN_IN_REQUIRED";
    case 5: 
      return "INVALID_ACCOUNT";
    case 6: 
      return "RESOLUTION_REQUIRED";
    case 7: 
      return "NETWORK_ERROR";
    case 8: 
      return "INTERNAL_ERROR";
    case 9: 
      return "SERVICE_INVALID";
    case 10: 
      return "DEVELOPER_ERROR";
    case 11: 
      return "LICENSE_CHECK_FAILED";
    case 13: 
      return "CANCELED";
    case 14: 
      return "TIMEOUT";
    }
    return "INTERRUPTED";
  }
  
  public void a(Activity paramActivity, int paramInt)
  {
    if (!a()) {
      return;
    }
    paramActivity.startIntentSenderForResult(this.b.getIntentSender(), paramInt, null, 0, 0, 0);
  }
  
  public boolean a()
  {
    return (this.c != 0) && (this.b != null);
  }
  
  public boolean b()
  {
    return this.c == 0;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public PendingIntent d()
  {
    return this.b;
  }
  
  public String toString()
  {
    return jv.a(this).a("statusCode", e()).a("resolution", this.b).toString();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.ConnectionResult
 * JD-Core Version:    0.7.0.1
 */