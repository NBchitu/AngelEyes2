package com.telesoftas.utilities.social;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.facebook.android.SessionStore;

class PostHelper$3
  extends Handler
{
  PostHelper$3(PostHelper paramPostHelper) {}
  
  public void handleMessage(Message paramMessage)
  {
    PostHelper.c(this.a).dismiss();
    if (paramMessage.what == 0)
    {
      String str = (String)paramMessage.obj;
      if (str.equals("")) {
        str = "---";
      }
      SessionStore.a(str, PostHelper.b(this.a));
    }
    for (;;)
    {
      PostHelper.c(this.a).setMessage(PostHelper.b(this.a).getString(2131427571));
      PostHelper.c(this.a).show();
      PostHelper.a(this.a, PostHelper.e(this.a), PostHelper.h(this.a));
      return;
      PostHelper.a(this.a, PostHelper.b(this.a).getString(2131427382));
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.social.PostHelper.3
 * JD-Core Version:    0.7.0.1
 */