package com.telesoftas.utilities.social;

import android.os.Handler;
import com.crashlytics.android.Crashlytics;
import com.facebook.android.Facebook;
import org.json.JSONObject;
import org.json.JSONTokener;

class PostHelper$2
  extends Thread
{
  PostHelper$2(PostHelper paramPostHelper) {}
  
  public void run()
  {
    try
    {
      String str2 = ((JSONObject)new JSONTokener(PostHelper.a(this.a).a("me")).nextValue()).getString("name");
      str1 = str2;
      i = 0;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Crashlytics.a(localException);
        int i = 1;
        String str1 = "";
      }
    }
    PostHelper.g(this.a).sendMessage(PostHelper.g(this.a).obtainMessage(i, str1));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.social.PostHelper.2
 * JD-Core Version:    0.7.0.1
 */