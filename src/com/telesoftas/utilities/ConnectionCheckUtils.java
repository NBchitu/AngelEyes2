package com.telesoftas.utilities;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.crashlytics.android.Crashlytics;

public class ConnectionCheckUtils
{
  public static boolean a(Activity paramActivity)
  {
    if (a(paramActivity)) {
      return true;
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity);
    localBuilder.setMessage(paramActivity.getString(2131427544)).setCancelable(false).setPositiveButton(paramActivity.getString(2131427640), new ConnectionCheckUtils.2(paramActivity)).setNegativeButton(paramActivity.getString(2131427541), new ConnectionCheckUtils.1());
    localBuilder.create().show();
    return false;
  }
  
  public static boolean a(Context paramContext)
  {
    for (NetworkInfo localNetworkInfo : ((ConnectivityManager)paramContext.getSystemService("connectivity")).getAllNetworkInfo()) {
      if (((localNetworkInfo.getType() == 1) || (localNetworkInfo.getType() == 0)) && (localNetworkInfo.isConnected())) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean b(Activity paramActivity)
  {
    LocationManager localLocationManager = (LocationManager)paramActivity.getSystemService("location");
    for (;;)
    {
      try
      {
        boolean bool3 = localLocationManager.isProviderEnabled("gps");
        boolean bool1 = bool3;
        boolean bool4;
        Crashlytics.a(localException1);
      }
      catch (Exception localException1)
      {
        try
        {
          bool4 = localLocationManager.isProviderEnabled("network");
          bool2 = bool4;
          if ((!bool1) && (!bool2)) {
            break;
          }
          return true;
        }
        catch (Exception localException2)
        {
          boolean bool2;
          AlertDialog.Builder localBuilder;
          break label47;
        }
        localException1 = localException1;
        bool1 = false;
      }
      label47:
      bool2 = false;
    }
    localBuilder = new AlertDialog.Builder(paramActivity);
    localBuilder.setMessage(paramActivity.getString(2131427543)).setCancelable(false).setPositiveButton(paramActivity.getString(2131427640), new ConnectionCheckUtils.4(paramActivity)).setNegativeButton(paramActivity.getString(2131427541), new ConnectionCheckUtils.3());
    localBuilder.create().show();
    return false;
  }
  
  public static boolean b(Context paramContext)
  {
    LocationManager localLocationManager = (LocationManager)paramContext.getSystemService("location");
    for (;;)
    {
      try
      {
        boolean bool3 = localLocationManager.isProviderEnabled("gps");
        boolean bool1 = bool3;
        boolean bool4;
        Crashlytics.a(localException1);
      }
      catch (Exception localException1)
      {
        try
        {
          bool4 = localLocationManager.isProviderEnabled("network");
          bool2 = bool4;
          if ((!bool1) && (!bool2)) {
            break;
          }
          return true;
        }
        catch (Exception localException2)
        {
          boolean bool2;
          break label47;
        }
        localException1 = localException1;
        bool1 = false;
      }
      label47:
      bool2 = false;
    }
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.ConnectionCheckUtils
 * JD-Core Version:    0.7.0.1
 */