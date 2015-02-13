package com.facebook.android;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FbDialog
  extends Dialog
{
  static final float[] a = { 20.0F, 60.0F };
  static final float[] b = { 40.0F, 60.0F };
  static final FrameLayout.LayoutParams c = new FrameLayout.LayoutParams(-1, -1);
  private String d;
  private Facebook.DialogListener e;
  private ProgressDialog f;
  private ImageView g;
  private WebView h;
  private FrameLayout i;
  
  public FbDialog(Context paramContext, String paramString, Facebook.DialogListener paramDialogListener)
  {
    super(paramContext, 16973840);
    this.d = paramString;
    this.e = paramDialogListener;
  }
  
  private void a()
  {
    this.g = new ImageView(getContext());
    this.g.setOnClickListener(new FbDialog.1(this));
    Drawable localDrawable = getContext().getResources().getDrawable(R.drawable.close);
    this.g.setImageDrawable(localDrawable);
    this.g.setVisibility(4);
  }
  
  private void a(int paramInt)
  {
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    this.h = new WebView(getContext());
    this.h.setVerticalScrollBarEnabled(false);
    this.h.setHorizontalScrollBarEnabled(false);
    this.h.setWebViewClient(new FbDialog.FbWebViewClient(this, null));
    this.h.getSettings().setJavaScriptEnabled(true);
    this.h.loadUrl(this.d);
    this.h.setLayoutParams(c);
    this.h.setVisibility(4);
    this.h.getSettings().setSavePassword(false);
    localLinearLayout.setPadding(paramInt, paramInt, paramInt, paramInt);
    localLinearLayout.addView(this.h);
    this.i.addView(localLinearLayout);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.f = new ProgressDialog(getContext());
    this.f.requestWindowFeature(1);
    this.f.setMessage("Loading...");
    requestWindowFeature(1);
    this.i = new FrameLayout(getContext());
    a();
    a(this.g.getDrawable().getIntrinsicWidth() / 2);
    this.i.addView(this.g, new ViewGroup.LayoutParams(-2, -2));
    addContentView(this.i, new ViewGroup.LayoutParams(-1, -1));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.facebook.android.FbDialog
 * JD-Core Version:    0.7.0.1
 */