package com.telesoftas.utilities.social;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.android.DialogError;
import com.facebook.android.Facebook.DialogListener;
import com.facebook.android.FacebookError;
import com.facebook.android.SessionStore;

final class PostHelper$FbLoginDialogListener
  implements Facebook.DialogListener
{
  private PostHelper$FbLoginDialogListener(PostHelper paramPostHelper) {}
  
  public void a() {}
  
  public void a(Bundle paramBundle)
  {
    SessionStore.a(PostHelper.a(this.a), PostHelper.b(this.a));
    PostHelper.c(this.a).setMessage(PostHelper.b(this.a).getString(2131427435));
    PostHelper.c(this.a).show();
    PostHelper.d(this.a);
  }
  
  public void a(DialogError paramDialogError)
  {
    PostHelper.a(this.a, PostHelper.b(this.a).getString(2131427419));
  }
  
  public void a(FacebookError paramFacebookError)
  {
    PostHelper.a(this.a, PostHelper.b(this.a).getString(2131427419));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.social.PostHelper.FbLoginDialogListener
 * JD-Core Version:    0.7.0.1
 */