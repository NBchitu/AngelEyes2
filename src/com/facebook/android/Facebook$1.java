package com.facebook.android;

import android.os.Bundle;
import android.webkit.CookieSyncManager;

class Facebook$1
  implements Facebook.DialogListener
{
  Facebook$1(Facebook paramFacebook) {}
  
  public void a()
  {
    Util.a("Facebook-authorize", "Login canceled");
    Facebook.a(this.a).a();
  }
  
  public void a(Bundle paramBundle)
  {
    CookieSyncManager.getInstance().sync();
    this.a.b(paramBundle.getString("access_token"));
    this.a.c(paramBundle.getString("expires_in"));
    if (this.a.a())
    {
      Util.a("Facebook-authorize", "Login Success! access_token=" + this.a.b() + " expires=" + this.a.c());
      Facebook.a(this.a).a(paramBundle);
      return;
    }
    Facebook.a(this.a).a(new FacebookError("Failed to receive access token."));
  }
  
  public void a(DialogError paramDialogError)
  {
    Util.a("Facebook-authorize", "Login failed: " + paramDialogError);
    Facebook.a(this.a).a(paramDialogError);
  }
  
  public void a(FacebookError paramFacebookError)
  {
    Util.a("Facebook-authorize", "Login failed: " + paramFacebookError);
    Facebook.a(this.a).a(paramFacebookError);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.facebook.android.Facebook.1
 * JD-Core Version:    0.7.0.1
 */