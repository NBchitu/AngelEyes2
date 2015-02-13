package com.google.tagmanager;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

public class PreviewActivity
  extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    try
    {
      super.onCreate(paramBundle);
      Log.c("Preview activity");
      Uri localUri = getIntent().getData();
      if (!TagManager.a(this).a(localUri))
      {
        Log.b("Cannot preview the app with the uri: " + localUri);
        return;
      }
      Intent localIntent = getPackageManager().getLaunchIntentForPackage(getPackageName());
      if (localIntent != null)
      {
        Log.c("Invoke the launch activity for package name: " + getPackageName());
        startActivity(localIntent);
        return;
      }
    }
    catch (Exception localException)
    {
      Log.a("Calling preview threw an exception: " + localException.getMessage());
      return;
    }
    Log.c("No launch activity found for package name: " + getPackageName());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.PreviewActivity
 * JD-Core Version:    0.7.0.1
 */