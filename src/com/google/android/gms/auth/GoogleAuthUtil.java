package com.google.android.gms.auth;

import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.ii;

public final class GoogleAuthUtil
{
  public static final String a;
  public static final String b;
  private static final ComponentName c;
  private static final ComponentName d;
  private static final Intent e;
  private static final Intent f;
  
  static
  {
    String str1;
    if (Build.VERSION.SDK_INT >= 11)
    {
      str1 = "callerUid";
      a = str1;
      if (Build.VERSION.SDK_INT < 14) {
        break label107;
      }
    }
    label107:
    for (String str2 = "androidPackageName";; str2 = "androidPackageName")
    {
      b = str2;
      c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
      d = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
      e = new Intent().setPackage("com.google.android.gms").setComponent(c);
      f = new Intent().setPackage("com.google.android.gms").setComponent(d);
      return;
      str1 = "callerUid";
      break;
    }
  }
  
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    return a(paramContext, paramString1, paramString2, new Bundle());
  }
  
  /* Error */
  public static String a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 78	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore 4
    //   6: ldc 80
    //   8: invokestatic 85	com/google/android/gms/internal/jx:c	(Ljava/lang/String;)V
    //   11: aload 4
    //   13: invokestatic 88	com/google/android/gms/auth/GoogleAuthUtil:a	(Landroid/content/Context;)V
    //   16: aload_3
    //   17: ifnonnull +150 -> 167
    //   20: new 64	android/os/Bundle
    //   23: dup
    //   24: invokespecial 65	android/os/Bundle:<init>	()V
    //   27: astore 5
    //   29: aload_0
    //   30: invokevirtual 92	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   33: getfield 97	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   36: astore 6
    //   38: aload 5
    //   40: ldc 99
    //   42: aload 6
    //   44: invokevirtual 102	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: aload 5
    //   49: getstatic 29	com/google/android/gms/auth/GoogleAuthUtil:b	Ljava/lang/String;
    //   52: invokevirtual 106	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   55: ifne +13 -> 68
    //   58: aload 5
    //   60: getstatic 29	com/google/android/gms/auth/GoogleAuthUtil:b	Ljava/lang/String;
    //   63: aload 6
    //   65: invokevirtual 102	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: new 108	com/google/android/gms/common/a
    //   71: dup
    //   72: invokespecial 109	com/google/android/gms/common/a:<init>	()V
    //   75: astore 7
    //   77: aload 4
    //   79: getstatic 59	com/google/android/gms/auth/GoogleAuthUtil:e	Landroid/content/Intent;
    //   82: aload 7
    //   84: iconst_1
    //   85: invokevirtual 113	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   88: ifeq +204 -> 292
    //   91: aload 7
    //   93: invokevirtual 116	com/google/android/gms/common/a:a	()Landroid/os/IBinder;
    //   96: invokestatic 121	com/google/android/gms/internal/r$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/r;
    //   99: aload_1
    //   100: aload_2
    //   101: aload 5
    //   103: invokeinterface 126 4 0
    //   108: astore 12
    //   110: aload 12
    //   112: ifnonnull +68 -> 180
    //   115: ldc 128
    //   117: ldc 130
    //   119: invokestatic 136	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   122: pop
    //   123: new 138	com/google/android/gms/auth/GoogleAuthException
    //   126: dup
    //   127: ldc 140
    //   129: invokespecial 142	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   132: athrow
    //   133: astore 10
    //   135: ldc 128
    //   137: ldc 144
    //   139: aload 10
    //   141: invokestatic 148	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   144: pop
    //   145: new 150	java/io/IOException
    //   148: dup
    //   149: ldc 152
    //   151: invokespecial 153	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   154: athrow
    //   155: astore 9
    //   157: aload 4
    //   159: aload 7
    //   161: invokevirtual 157	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   164: aload 9
    //   166: athrow
    //   167: new 64	android/os/Bundle
    //   170: dup
    //   171: aload_3
    //   172: invokespecial 160	android/os/Bundle:<init>	(Landroid/os/Bundle;)V
    //   175: astore 5
    //   177: goto -148 -> 29
    //   180: aload 12
    //   182: ldc 162
    //   184: invokevirtual 166	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   187: astore 14
    //   189: aload 14
    //   191: invokestatic 172	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   194: istore 15
    //   196: iload 15
    //   198: ifne +13 -> 211
    //   201: aload 4
    //   203: aload 7
    //   205: invokevirtual 157	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   208: aload 14
    //   210: areturn
    //   211: aload 12
    //   213: ldc 174
    //   215: invokevirtual 166	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   218: astore 16
    //   220: aload 12
    //   222: ldc 176
    //   224: invokevirtual 180	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   227: checkcast 47	android/content/Intent
    //   230: astore 17
    //   232: aload 16
    //   234: invokestatic 182	com/google/android/gms/auth/GoogleAuthUtil:b	(Ljava/lang/String;)Z
    //   237: ifeq +27 -> 264
    //   240: new 184	com/google/android/gms/auth/UserRecoverableAuthException
    //   243: dup
    //   244: aload 16
    //   246: aload 17
    //   248: invokespecial 187	com/google/android/gms/auth/UserRecoverableAuthException:<init>	(Ljava/lang/String;Landroid/content/Intent;)V
    //   251: athrow
    //   252: astore 8
    //   254: new 138	com/google/android/gms/auth/GoogleAuthException
    //   257: dup
    //   258: ldc 189
    //   260: invokespecial 142	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   263: athrow
    //   264: aload 16
    //   266: invokestatic 191	com/google/android/gms/auth/GoogleAuthUtil:a	(Ljava/lang/String;)Z
    //   269: ifeq +13 -> 282
    //   272: new 150	java/io/IOException
    //   275: dup
    //   276: aload 16
    //   278: invokespecial 153	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   281: athrow
    //   282: new 138	com/google/android/gms/auth/GoogleAuthException
    //   285: dup
    //   286: aload 16
    //   288: invokespecial 142	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   291: athrow
    //   292: new 150	java/io/IOException
    //   295: dup
    //   296: ldc 193
    //   298: invokespecial 153	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   301: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	302	0	paramContext	Context
    //   0	302	1	paramString1	String
    //   0	302	2	paramString2	String
    //   0	302	3	paramBundle	Bundle
    //   4	198	4	localContext	Context
    //   27	149	5	localBundle1	Bundle
    //   36	28	6	str1	String
    //   75	129	7	locala	com.google.android.gms.common.a
    //   252	1	8	localInterruptedException	java.lang.InterruptedException
    //   155	10	9	localObject	Object
    //   133	7	10	localRemoteException	android.os.RemoteException
    //   108	113	12	localBundle2	Bundle
    //   187	22	14	str2	String
    //   194	3	15	bool	boolean
    //   218	69	16	str3	String
    //   230	17	17	localIntent	Intent
    // Exception table:
    //   from	to	target	type
    //   91	110	133	android/os/RemoteException
    //   115	133	133	android/os/RemoteException
    //   180	196	133	android/os/RemoteException
    //   211	252	133	android/os/RemoteException
    //   264	282	133	android/os/RemoteException
    //   282	292	133	android/os/RemoteException
    //   91	110	155	finally
    //   115	133	155	finally
    //   135	155	155	finally
    //   180	196	155	finally
    //   211	252	155	finally
    //   254	264	155	finally
    //   264	282	155	finally
    //   282	292	155	finally
    //   91	110	252	java/lang/InterruptedException
    //   115	133	252	java/lang/InterruptedException
    //   180	196	252	java/lang/InterruptedException
    //   211	252	252	java/lang/InterruptedException
    //   264	282	252	java/lang/InterruptedException
    //   282	292	252	java/lang/InterruptedException
  }
  
  private static void a(Context paramContext)
  {
    try
    {
      GooglePlayServicesUtil.b(paramContext);
      return;
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
    {
      throw new GooglePlayServicesAvailabilityException(localGooglePlayServicesRepairableException.a(), localGooglePlayServicesRepairableException.getMessage(), localGooglePlayServicesRepairableException.b());
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      throw new GoogleAuthException(localGooglePlayServicesNotAvailableException.getMessage());
    }
  }
  
  @Deprecated
  public static void a(Context paramContext, String paramString)
  {
    AccountManager.get(paramContext).invalidateAuthToken("com.google", paramString);
  }
  
  private static boolean a(String paramString)
  {
    return ("NetworkError".equals(paramString)) || ("ServiceUnavailable".equals(paramString)) || ("Timeout".equals(paramString));
  }
  
  private static boolean b(String paramString)
  {
    return ("BadAuthentication".equals(paramString)) || ("CaptchaRequired".equals(paramString)) || ("DeviceManagementRequiredOrSyncDisabled".equals(paramString)) || ("NeedPermission".equals(paramString)) || ("NeedsBrowser".equals(paramString)) || ("UserCancel".equals(paramString)) || ("AppDownloadRequired".equals(paramString)) || (ii.r.a().equals(paramString)) || (ii.s.a().equals(paramString)) || (ii.t.a().equals(paramString)) || (ii.u.a().equals(paramString)) || (ii.v.a().equals(paramString)) || (ii.w.a().equals(paramString));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.GoogleAuthUtil
 * JD-Core Version:    0.7.0.1
 */