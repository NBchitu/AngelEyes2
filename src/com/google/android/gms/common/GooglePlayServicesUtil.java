package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.R.string;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.jh;
import com.google.android.gms.internal.jo;
import com.google.android.gms.internal.lc;
import com.google.android.gms.internal.ll;
import java.util.Arrays;
import java.util.Set;

public final class GooglePlayServicesUtil
{
  public static boolean a = false;
  public static boolean b = false;
  private static int c = -1;
  private static final Object d = new Object();
  
  public static int a(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (!jf.a) {}
    PackageInfo localPackageInfo1;
    for (;;)
    {
      try
      {
        paramContext.getResources().getString(R.string.common_google_play_services_unknown_issue);
        if (!jf.a) {
          d(paramContext);
        }
      }
      catch (Throwable localThrowable)
      {
        try
        {
          localPackageInfo1 = localPackageManager.getPackageInfo("com.google.android.gms", 64);
          if (!lc.c(localPackageInfo1.versionCode)) {
            break label242;
          }
          if (!a()) {
            break label143;
          }
          j = 0;
          byte[][] arrayOfByte1 = new byte[3][];
          arrayOfByte1[0] = b.a[j];
          arrayOfByte1[1] = b.g[j];
          arrayOfByte1[2] = b.f[j];
          if (a(localPackageInfo1, arrayOfByte1) != null) {
            break;
          }
          Log.w("GooglePlayServicesUtil", "Google Play Services signature invalid on Glass.");
          return 9;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException1)
        {
          Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
          return 1;
        }
        localThrowable = localThrowable;
        Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        continue;
      }
      label143:
      int j = 1;
    }
    String str = paramContext.getPackageName();
    try
    {
      PackageInfo localPackageInfo3 = localPackageManager.getPackageInfo(str, 64);
      if (a(localPackageManager, localPackageInfo3)) {
        break label348;
      }
      Log.w("GooglePlayServicesUtil", "Calling package " + localPackageInfo3.packageName + " signature invalid on Glass.");
      return 9;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException4)
    {
      Log.w("GooglePlayServicesUtil", "Could not get info for calling package: " + str);
      return 9;
    }
    label242:
    if (lc.a(paramContext))
    {
      if (a(localPackageInfo1, b.a) == null)
      {
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
      }
    }
    else
    {
      byte[] arrayOfByte;
      try
      {
        PackageInfo localPackageInfo2 = localPackageManager.getPackageInfo("com.android.vending", 64);
        arrayOfByte = a(localPackageInfo2, b.a);
        if (arrayOfByte == null)
        {
          Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
          return 9;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException2)
      {
        Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
        return 9;
      }
      if (a(localPackageInfo1, new byte[][] { arrayOfByte }) == null)
      {
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
      }
    }
    label348:
    int i = lc.a(6587000);
    if (lc.a(localPackageInfo1.versionCode) < i)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires 6587000 but found " + localPackageInfo1.versionCode);
      return 2;
    }
    try
    {
      ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo("com.google.android.gms", 0);
      if (!localApplicationInfo.enabled) {
        return 3;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException3)
    {
      Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
      localNameNotFoundException3.printStackTrace();
      return 1;
    }
    return 0;
  }
  
  public static Dialog a(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return a(paramInt1, paramActivity, paramInt2, null);
  }
  
  public static Dialog a(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return b(paramInt1, paramActivity, null, paramInt2, paramOnCancelListener);
  }
  
  public static Intent a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
    case 2: 
      return jo.b("com.google.android.gms");
    case 42: 
      return jo.a();
    }
    return jo.a("com.google.android.gms");
  }
  
  public static String a(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    default: 
      return localResources.getString(R.string.common_google_play_services_unknown_issue);
    case 1: 
      if (a(paramContext.getResources())) {
        return localResources.getString(R.string.common_google_play_services_install_text_tablet);
      }
      return localResources.getString(R.string.common_google_play_services_install_text_phone);
    case 3: 
      return localResources.getString(R.string.common_google_play_services_enable_text);
    case 2: 
      return localResources.getString(R.string.common_google_play_services_update_text);
    case 42: 
      return localResources.getString(R.string.common_android_wear_update_text);
    case 9: 
      return localResources.getString(R.string.common_google_play_services_unsupported_text);
    case 7: 
      return localResources.getString(R.string.common_google_play_services_network_error_text);
    }
    return localResources.getString(R.string.common_google_play_services_invalid_account_text);
  }
  
  public static boolean a()
  {
    if (a) {
      return b;
    }
    return "user".equals(Build.TYPE);
  }
  
  public static boolean a(int paramInt1, Activity paramActivity, Fragment paramFragment, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Dialog localDialog = b(paramInt1, paramActivity, paramFragment, paramInt2, paramOnCancelListener);
    if (localDialog == null) {
      return false;
    }
    try
    {
      bool = paramActivity instanceof FragmentActivity;
      if (bool)
      {
        android.support.v4.app.FragmentManager localFragmentManager1 = ((FragmentActivity)paramActivity).f();
        SupportErrorDialogFragment.a(localDialog, paramOnCancelListener).a(localFragmentManager1, "GooglePlayServicesErrorDialog");
      }
      for (;;)
      {
        return true;
        if (!ll.a()) {
          break;
        }
        android.app.FragmentManager localFragmentManager = paramActivity.getFragmentManager();
        ErrorDialogFragment.a(localDialog, paramOnCancelListener).show(localFragmentManager, "GooglePlayServicesErrorDialog");
      }
      throw new RuntimeException("This Activity does not support Fragments.");
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      for (;;)
      {
        boolean bool = false;
      }
    }
  }
  
  public static boolean a(PackageManager paramPackageManager)
  {
    synchronized (d)
    {
      int i = c;
      if (i == -1) {}
      try
      {
        PackageInfo localPackageInfo = paramPackageManager.getPackageInfo("com.google.android.gms", 64);
        byte[][] arrayOfByte = new byte[1][];
        arrayOfByte[0] = b.E[1];
        if (a(localPackageInfo, arrayOfByte) != null) {}
        for (c = 1; c != 0; c = 0) {
          return true;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;)
        {
          c = 0;
        }
      }
    }
    return false;
  }
  
  public static boolean a(PackageManager paramPackageManager, PackageInfo paramPackageInfo)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramPackageInfo == null) {}
    do
    {
      return bool2;
      if (b(paramPackageManager))
      {
        if (a(paramPackageInfo, bool1) != null) {}
        for (;;)
        {
          return bool1;
          bool1 = false;
        }
      }
      byte[] arrayOfByte = a(paramPackageInfo, false);
      bool2 = false;
      if (arrayOfByte != null) {
        bool2 = bool1;
      }
    } while ((bool2) || (a(paramPackageInfo, bool1) == null));
    Log.w("GooglePlayServicesUtil", "Test-keys aren't accepted on this build.");
    return bool2;
  }
  
  public static boolean a(Resources paramResources)
  {
    if (paramResources == null) {}
    for (;;)
    {
      return false;
      if ((0xF & paramResources.getConfiguration().screenLayout) > 3) {}
      for (int i = 1; ((ll.a()) && (i != 0)) || (b(paramResources)); i = 0) {
        return true;
      }
    }
  }
  
  private static byte[] a(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if (paramPackageInfo.signatures.length != 1)
    {
      Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
      return null;
    }
    byte[] arrayOfByte = paramPackageInfo.signatures[0].toByteArray();
    if (paramBoolean) {}
    for (Set localSet = b.a(); localSet.contains(arrayOfByte); localSet = b.b()) {
      return arrayOfByte;
    }
    if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
      Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(arrayOfByte, 0));
    }
    return null;
  }
  
  private static byte[] a(PackageInfo paramPackageInfo, byte[]... paramVarArgs)
  {
    if (paramPackageInfo.signatures.length != 1)
    {
      Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
      return null;
    }
    byte[] arrayOfByte1 = paramPackageInfo.signatures[0].toByteArray();
    for (int i = 0; i < paramVarArgs.length; i++)
    {
      byte[] arrayOfByte2 = paramVarArgs[i];
      if (Arrays.equals(arrayOfByte2, arrayOfByte1)) {
        return arrayOfByte2;
      }
    }
    if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
      Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(arrayOfByte1, 0));
    }
    return null;
  }
  
  private static Dialog b(int paramInt1, Activity paramActivity, Fragment paramFragment, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    if ((lc.a(paramActivity)) && (paramInt1 == 2)) {
      paramInt1 = 42;
    }
    if (ll.c())
    {
      TypedValue localTypedValue = new TypedValue();
      paramActivity.getTheme().resolveAttribute(16843529, localTypedValue, true);
      if (!"Theme.Dialog.Alert".equals(paramActivity.getResources().getResourceEntryName(localTypedValue.resourceId))) {}
    }
    for (AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity, 5);; localBuilder = null)
    {
      if (localBuilder == null) {
        localBuilder = new AlertDialog.Builder(paramActivity);
      }
      localBuilder.setMessage(a(paramActivity, paramInt1));
      if (paramOnCancelListener != null) {
        localBuilder.setOnCancelListener(paramOnCancelListener);
      }
      Intent localIntent = a(paramInt1);
      if (paramFragment == null) {}
      for (jh localjh = new jh(paramActivity, localIntent, paramInt2);; localjh = new jh(paramFragment, localIntent, paramInt2))
      {
        String str = b(paramActivity, paramInt1);
        if (str != null) {
          localBuilder.setPositiveButton(str, localjh);
        }
        switch (paramInt1)
        {
        default: 
          Log.e("GooglePlayServicesUtil", "Unexpected error code " + paramInt1);
          return localBuilder.create();
        }
      }
      return null;
      return localBuilder.create();
      return localBuilder.setTitle(R.string.common_google_play_services_install_title).create();
      return localBuilder.setTitle(R.string.common_google_play_services_enable_title).create();
      return localBuilder.setTitle(R.string.common_google_play_services_update_title).create();
      return localBuilder.setTitle(R.string.common_android_wear_update_title).create();
      Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
      return localBuilder.setTitle(R.string.common_google_play_services_unsupported_title).create();
      Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
      return localBuilder.setTitle(R.string.common_google_play_services_network_error_title).create();
      Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
      return localBuilder.create();
      Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
      return localBuilder.create();
      Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
      return localBuilder.setTitle(R.string.common_google_play_services_invalid_account_title).create();
      Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
      return localBuilder.create();
    }
  }
  
  public static String b(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    default: 
      return localResources.getString(17039370);
    case 1: 
      return localResources.getString(R.string.common_google_play_services_install_button);
    case 3: 
      return localResources.getString(R.string.common_google_play_services_enable_button);
    }
    return localResources.getString(R.string.common_google_play_services_update_button);
  }
  
  public static void b(Context paramContext)
  {
    int i = a(paramContext);
    if (i != 0)
    {
      Intent localIntent = a(i);
      Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + i);
      if (localIntent == null) {
        throw new GooglePlayServicesNotAvailableException(i);
      }
      throw new GooglePlayServicesRepairableException(i, "Google Play Services not available", localIntent);
    }
  }
  
  public static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    default: 
      return false;
    }
    return true;
  }
  
  public static boolean b(PackageManager paramPackageManager)
  {
    return (a(paramPackageManager)) || (!a());
  }
  
  private static boolean b(Resources paramResources)
  {
    Configuration localConfiguration = paramResources.getConfiguration();
    boolean bool1 = ll.b();
    boolean bool2 = false;
    if (bool1)
    {
      int i = 0xF & localConfiguration.screenLayout;
      bool2 = false;
      if (i <= 3)
      {
        int j = localConfiguration.smallestScreenWidthDp;
        bool2 = false;
        if (j >= 600) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public static Context c(Context paramContext)
  {
    try
    {
      Context localContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  public static boolean c(Context paramContext, int paramInt)
  {
    if (paramInt == 1)
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      try
      {
        boolean bool = localPackageManager.getApplicationInfo("com.google.android.gms", 8192).enabled;
        if (bool) {
          return true;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    }
    return false;
  }
  
  private static void d(Context paramContext)
  {
    try
    {
      ApplicationInfo localApplicationInfo2 = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      localApplicationInfo1 = localApplicationInfo2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Bundle localBundle;
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", localNameNotFoundException);
        ApplicationInfo localApplicationInfo1 = null;
      }
    }
    localBundle = localApplicationInfo1.metaData;
    if (localBundle != null)
    {
      int i = localBundle.getInt("com.google.android.gms.version");
      if (i == 6587000) {
        return;
      }
      throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 6587000 but found " + i + ".  You must have the" + " following declaration within the <application> element: " + "    <meta-data android:name=\"" + "com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />");
    }
    throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GooglePlayServicesUtil
 * JD-Core Version:    0.7.0.1
 */