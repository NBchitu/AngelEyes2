package com.telesoftas.deeper;

import android.app.ActivityManager;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Environment;
import com.crashlytics.android.Crashlytics;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.Fields;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.services.DeeperDataManager;
import com.telesoftas.services.DeeperDeviceManager;
import com.telesoftas.utilities.DisplayUtils;
import com.telesoftas.utilities.SoundWarningManager;
import com.telesoftas.utilities.deeper.SettingsUtils;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DeeperApplication
  extends Application
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  private DeeperDatabase a;
  private DeeperDataManager b;
  private DeeperDeviceManager c;
  private SoundWarningManager d;
  private boolean e;
  private final Set<String> f;
  
  public DeeperApplication()
  {
    String[] arrayOfString = new String[18];
    arrayOfString[0] = SettingsUtils.a;
    arrayOfString[1] = SettingsUtils.c;
    arrayOfString[2] = SettingsUtils.h;
    arrayOfString[3] = SettingsUtils.i;
    arrayOfString[4] = SettingsUtils.j;
    arrayOfString[5] = SettingsUtils.k;
    arrayOfString[6] = SettingsUtils.l;
    arrayOfString[7] = SettingsUtils.n;
    arrayOfString[8] = SettingsUtils.o;
    arrayOfString[9] = SettingsUtils.p;
    arrayOfString[10] = SettingsUtils.q;
    arrayOfString[11] = SettingsUtils.r;
    arrayOfString[12] = SettingsUtils.u;
    arrayOfString[13] = SettingsUtils.g;
    arrayOfString[14] = SettingsUtils.d;
    arrayOfString[15] = SettingsUtils.f;
    arrayOfString[16] = SettingsUtils.t;
    arrayOfString[17] = SettingsUtils.s;
    this.f = new HashSet(Arrays.asList(arrayOfString));
  }
  
  private void e()
  {
    File localFile = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    if (localFile == null) {}
    while (!new File(localFile, "fl1402667920").exists()) {
      return;
    }
    com.fridaylab.util.ByteLogger.a = true;
  }
  
  private void f()
  {
    GoogleAnalytics.a(this);
    EasyTracker localEasyTracker = EasyTracker.a(this);
    String str1 = Fields.a(1);
    if (SettingsUtils.e(this)) {}
    for (String str2 = "y";; str2 = "n")
    {
      localEasyTracker.a(str1, str2);
      localEasyTracker.a(Fields.a(2), SettingsUtils.a(this).getString("deeper_version", ""));
      return;
    }
  }
  
  public DeeperDatabase a()
  {
    return this.a;
  }
  
  public DeeperDataManager b()
  {
    return this.b;
  }
  
  public boolean c()
  {
    return this.e;
  }
  
  public DeeperDeviceManager d()
  {
    return this.c;
  }
  
  public void onCreate()
  {
    super.onCreate();
    SharedPreferences localSharedPreferences = SettingsUtils.a(this);
    localSharedPreferences.registerOnSharedPreferenceChangeListener(this);
    f();
    this.e = DisplayUtils.a(this);
    this.a = new DeeperDatabase(this);
    int i = localSharedPreferences.getInt(SettingsUtils.u, 15);
    this.b = DeeperDataManager.a();
    this.b.a(i);
    this.d = new SoundWarningManager(this);
    this.c = new DeeperDeviceManager(this, this.b, this.d);
    try
    {
      Class.forName("android.os.AsyncTask");
      label106:
      Crashlytics.a("memoryClass", ((ActivityManager)getSystemService("activity")).getMemoryClass());
      Crashlytics.a(this);
      Tags.a(this);
      e();
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      break label106;
    }
  }
  
  public void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    if (this.f.contains(paramString))
    {
      String str = "change_" + paramString;
      EasyTracker.a(this).a(MapBuilder.a("Settings", str, null, null).a());
    }
    if (paramString.equals(SettingsUtils.c)) {
      this.c.a(this);
    }
    do
    {
      return;
      if (paramString.equals(SettingsUtils.b))
      {
        this.c.b(this);
        return;
      }
    } while (!paramString.equals(SettingsUtils.g));
    this.c.c(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.DeeperApplication
 * JD-Core Version:    0.7.0.1
 */