package com.telesoftas.utilities.social;

import android.os.Handler;
import com.facebook.android.BaseRequestListener;

final class PostHelper$WallPostListener
  extends BaseRequestListener
{
  private PostHelper$WallPostListener(PostHelper paramPostHelper) {}
  
  public void a(String paramString, Object paramObject)
  {
    PostHelper.f(this.a).post(new PostHelper.WallPostListener.1(this));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.social.PostHelper.WallPostListener
 * JD-Core Version:    0.7.0.1
 */