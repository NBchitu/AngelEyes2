package com.facebook.android;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;

public class Facebook
{
  protected static String a = "https://m.facebook.com/dialog/";
  protected static String b = "https://graph.facebook.com/";
  protected static String c = "https://api.facebook.com/restserver.php";
  private String d = null;
  private long e = 0L;
  private long f = 0L;
  private String g;
  private Activity h;
  private String[] i;
  private int j;
  private Facebook.DialogListener k;
  private final long l = 86400000L;
  
  public Facebook(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("You must specify your application ID when instantiating a Facebook object. See README for details.");
    }
    this.g = paramString;
  }
  
  private void a(Activity paramActivity, String[] paramArrayOfString)
  {
    Bundle localBundle = new Bundle();
    if (paramArrayOfString.length > 0) {
      localBundle.putString("scope", TextUtils.join(",", paramArrayOfString));
    }
    CookieSyncManager.createInstance(paramActivity);
    a(paramActivity, "oauth", localBundle, new Facebook.1(this));
  }
  
  private boolean a(Activity paramActivity, String paramString, String[] paramArrayOfString, int paramInt)
  {
    boolean bool = true;
    Intent localIntent = new Intent();
    localIntent.setClassName("com.facebook.katana", "com.facebook.katana.ProxyAuth");
    localIntent.putExtra("client_id", paramString);
    if (paramArrayOfString.length > 0) {
      localIntent.putExtra("scope", TextUtils.join(",", paramArrayOfString));
    }
    if (!a(paramActivity, localIntent)) {
      return false;
    }
    this.h = paramActivity;
    this.i = paramArrayOfString;
    this.j = paramInt;
    try
    {
      paramActivity.startActivityForResult(localIntent, paramInt);
      return bool;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      for (;;)
      {
        bool = false;
      }
    }
  }
  
  private boolean a(Context paramContext, Intent paramIntent)
  {
    ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveActivity(paramIntent, 0);
    if (localResolveInfo == null) {
      return false;
    }
    return a(paramContext, localResolveInfo.activityInfo.packageName);
  }
  
  private boolean a(Context paramContext, String paramString)
  {
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramString, 64);
      Signature[] arrayOfSignature = localPackageInfo.signatures;
      int m = arrayOfSignature.length;
      for (int n = 0;; n++)
      {
        if (n >= m) {
          return false;
        }
        if (arrayOfSignature[n].toCharsString().equals("30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2")) {
          return true;
        }
      }
      return false;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
  }
  
  public String a(Context paramContext)
  {
    Util.a(paramContext);
    Bundle localBundle = new Bundle();
    localBundle.putString("method", "auth.expireSession");
    String str = a(localBundle);
    b(null);
    a(0L);
    return str;
  }
  
  public String a(Bundle paramBundle)
  {
    if (!paramBundle.containsKey("method")) {
      throw new IllegalArgumentException("API method must be specified. (parameters must contain key \"method\" and value). See http://developers.facebook.com/docs/reference/rest/");
    }
    return a(null, paramBundle, "GET");
  }
  
  public String a(String paramString)
  {
    return a(paramString, new Bundle(), "GET");
  }
  
  public String a(String paramString1, Bundle paramBundle, String paramString2)
  {
    paramBundle.putString("format", "json");
    if (a()) {
      paramBundle.putString("access_token", b());
    }
    if (paramString1 != null) {}
    for (String str = b + paramString1;; str = c) {
      return Util.a(str, paramString2, paramBundle);
    }
  }
  
  public void a(long paramLong)
  {
    this.f = paramLong;
  }
  
  public void a(Activity paramActivity, String[] paramArrayOfString, int paramInt, Facebook.DialogListener paramDialogListener)
  {
    this.k = paramDialogListener;
    boolean bool = false;
    if (paramInt >= 0) {
      bool = a(paramActivity, this.g, paramArrayOfString, paramInt);
    }
    if (!bool) {
      a(paramActivity, paramArrayOfString);
    }
  }
  
  public void a(Context paramContext, String paramString, Bundle paramBundle, Facebook.DialogListener paramDialogListener)
  {
    String str1 = a + paramString;
    paramBundle.putString("display", "touch");
    paramBundle.putString("redirect_uri", "fbconnect://success");
    if (paramString.equals("oauth"))
    {
      paramBundle.putString("type", "user_agent");
      paramBundle.putString("client_id", this.g);
    }
    String str2;
    for (;;)
    {
      if (a()) {
        paramBundle.putString("access_token", b());
      }
      str2 = str1 + "?" + Util.a(paramBundle);
      if (paramContext.checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
        break;
      }
      Util.a(paramContext, "Error", "Application requires permission to access the Internet");
      return;
      paramBundle.putString("app_id", this.g);
    }
    new FbDialog(paramContext, str2, paramDialogListener).show();
  }
  
  public boolean a()
  {
    return (b() != null) && ((c() == 0L) || (System.currentTimeMillis() < c()));
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void b(String paramString)
  {
    this.d = paramString;
    this.e = System.currentTimeMillis();
  }
  
  public long c()
  {
    return this.f;
  }
  
  public void c(String paramString)
  {
    if (paramString != null) {
      if (!paramString.equals("0")) {
        break label22;
      }
    }
    label22:
    for (long l1 = 0L;; l1 = System.currentTimeMillis() + 1000L * Long.parseLong(paramString))
    {
      a(l1);
      return;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.facebook.android.Facebook
 * JD-Core Version:    0.7.0.1
 */