package com.facebook.android;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;

class FbDialog$FbWebViewClient
  extends WebViewClient
{
  private FbDialog$FbWebViewClient(FbDialog paramFbDialog) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    FbDialog.b(this.a).dismiss();
    FbDialog.c(this.a).setBackgroundColor(0);
    FbDialog.d(this.a).setVisibility(0);
    FbDialog.e(this.a).setVisibility(0);
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    Util.a("Facebook-WebView", "Webview loading URL: " + paramString);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    FbDialog.b(this.a).show();
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    FbDialog.a(this.a).a(new DialogError(paramString1, paramInt, paramString2));
    this.a.dismiss();
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Util.a("Facebook-WebView", "Redirect URL: " + paramString);
    if (paramString.startsWith("fbconnect://success"))
    {
      Bundle localBundle = Util.b(paramString);
      String str = localBundle.getString("error");
      if (str == null) {
        str = localBundle.getString("error_type");
      }
      if (str == null) {
        FbDialog.a(this.a).a(localBundle);
      }
      for (;;)
      {
        this.a.dismiss();
        return true;
        if ((str.equals("access_denied")) || (str.equals("OAuthAccessDeniedException"))) {
          FbDialog.a(this.a).a();
        } else {
          FbDialog.a(this.a).a(new FacebookError(str));
        }
      }
    }
    if (paramString.startsWith("fbconnect://cancel"))
    {
      FbDialog.a(this.a).a();
      this.a.dismiss();
      return true;
    }
    if (paramString.contains("touch")) {
      return false;
    }
    this.a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.facebook.android.FbDialog.FbWebViewClient
 * JD-Core Version:    0.7.0.1
 */