package com.telesoftas.utilities.social;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;

class PostHelper$WallPostListener$1
  implements Runnable
{
  PostHelper$WallPostListener$1(PostHelper.WallPostListener paramWallPostListener) {}
  
  public void run()
  {
    if ((PostHelper.c(this.a.a) != null) && (PostHelper.c(this.a.a).isShowing())) {
      PostHelper.c(this.a.a).dismiss();
    }
    PostHelper.a(this.a.a, PostHelper.b(this.a.a).getString(2131427569));
    SharedPreferences.Editor localEditor = PostHelper.b(this.a.a).getSharedPreferences("prefs", 0).edit();
    localEditor.putString("facebook_last_note", PostHelper.e(this.a.a));
    localEditor.apply();
    EasyTracker.a(PostHelper.b(this.a.a)).a(MapBuilder.a("Social", "share", "facebook", null).a());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.social.PostHelper.WallPostListener.1
 * JD-Core Version:    0.7.0.1
 */