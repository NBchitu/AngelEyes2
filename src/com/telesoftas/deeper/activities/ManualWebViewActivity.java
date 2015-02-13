package com.telesoftas.deeper.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.telesoftas.utilities.deeper.SettingsUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

public class ManualWebViewActivity
  extends TrackedActivity
{
  public static final String[] n = { "cs", "de", "en", "fr", "it", "lv", "lt", "hu", "nl", "sk", "fi", "tk", "bg", "ru", "uk", "ko", "zh_CN" };
  
  public static Intent a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(paramContext, ManualWebViewActivity.class);
    localIntent.putExtra("language", paramString);
    return localIntent;
  }
  
  public static void a(Context paramContext)
  {
    SharedPreferences localSharedPreferences = SettingsUtils.a(paramContext);
    if (localSharedPreferences.getInt("manual_translation_revision", 0) >= 1) {
      return;
    }
    if (paramContext.getResources().getConfiguration().locale.getLanguage().equals("de"))
    {
      localSharedPreferences.edit().remove("preferred_manual_language").putInt("manual_translation_revision", 1).apply();
      return;
    }
    localSharedPreferences.edit().putInt("manual_translation_revision", 1).apply();
  }
  
  public boolean b(String paramString)
  {
    try
    {
      getAssets().open(paramString).close();
      return true;
    }
    catch (IOException localIOException)
    {
      return false;
    }
    catch (FileNotFoundException localFileNotFoundException) {}
    return false;
  }
  
  @SuppressLint({"SetJavaScriptEnabled"})
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903097);
    WebView localWebView = (WebView)findViewById(2131296641);
    localWebView.getSettings().setJavaScriptEnabled(true);
    String str1 = getIntent().getStringExtra("language");
    if (TextUtils.isEmpty(str1)) {
      str1 = getResources().getConfiguration().locale.getLanguage();
    }
    if ((str1.equals("zh")) || (str1.equals("zh_CN"))) {}
    for (str1 = "zh-Hans";; str1 = "nb") {
      do
      {
        String str2 = String.format("Manual/index_%s.html", new Object[] { str1 });
        if (!b(str2)) {
          str2 = "Manual/index_en.html";
        }
        localWebView.loadUrl("file:///android_asset/" + str2);
        return;
      } while ((!str1.equals("no")) && (!str1.equals("nn")));
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.ManualWebViewActivity
 * JD-Core Version:    0.7.0.1
 */