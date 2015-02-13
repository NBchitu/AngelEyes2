package com.telesoftas.utilities.social;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.android.AsyncFacebookRunner;
import com.facebook.android.Facebook;
import com.facebook.android.SessionStore;
import java.io.ByteArrayOutputStream;

public class PostHelper
{
  Location a = new Location("loc");
  String b = " ";
  private final Context c;
  private ProgressDialog d;
  private final Handler e = new Handler();
  private Facebook f;
  private String g = " ";
  private String h = " ";
  private final Handler i = new PostHelper.3(this);
  
  public PostHelper(Context paramContext)
  {
    this.c = paramContext;
  }
  
  private String a(String paramString1, String paramString2)
  {
    if (paramString2 == null) {
      paramString2 = "";
    }
    if (!paramString1.equals("")) {
      return paramString1 + " (" + paramString2.trim() + ")";
    }
    return paramString2.trim();
  }
  
  private void a()
  {
    if (!this.f.a()) {
      return;
    }
    new PostHelper.2(this).start();
  }
  
  private void a(Activity paramActivity)
  {
    this.f.a(paramActivity, SocialNetworksConstants.a, -1, new PostHelper.FbLoginDialogListener(this, null));
  }
  
  private void a(String paramString)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.c);
    localBuilder.setMessage(paramString).setCancelable(false).setPositiveButton(2131427551, new PostHelper.1(this));
    localBuilder.create().show();
  }
  
  private void b(String paramString1, String paramString2)
  {
    AsyncFacebookRunner localAsyncFacebookRunner = new AsyncFacebookRunner(this.f);
    Bundle localBundle = new Bundle();
    if (paramString2 == null)
    {
      localBundle.putString("message", paramString1);
      localAsyncFacebookRunner.a("me/feed", localBundle, "POST", new PostHelper.WallPostListener(this, null), null);
      return;
    }
    Bitmap localBitmap = BitmapFactory.decodeFile(paramString2);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    localBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    localBundle.putByteArray("picture", localByteArrayOutputStream.toByteArray());
    localBundle.putString("name", paramString1);
    localAsyncFacebookRunner.a("me/photos", localBundle, "POST", new PostHelper.WallPostListener(this, null), null);
  }
  
  public void a(Activity paramActivity, ProgressDialog paramProgressDialog, String paramString1, String paramString2, String paramString3)
  {
    this.f = new Facebook("348962841848059");
    SessionStore.b(this.f, this.c);
    this.d = paramProgressDialog;
    this.d.requestWindowFeature(1);
    this.d.setCancelable(false);
    if (paramString1 == null) {
      paramString1 = "";
    }
    this.g = paramString1;
    this.h = paramString2;
    this.b = paramString3;
    String str = this.c.getSharedPreferences("prefs", 0).getString("facebook_last_note", null);
    if ((str != null) && (paramString1.compareTo(str) == 0) && (paramString2 == null))
    {
      a(this.c.getString(2131427579));
      return;
    }
    if (paramString3 != null) {
      paramString1 = a(paramString1, paramString3);
    }
    if (!this.f.a())
    {
      a(paramActivity);
      return;
    }
    this.d.setMessage(this.c.getString(2131427571));
    this.d.show();
    b(paramString1, paramString2);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.social.PostHelper
 * JD-Core Version:    0.7.0.1
 */