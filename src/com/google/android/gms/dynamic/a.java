package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.LinkedList;

public abstract class a<T extends LifecycleDelegate>
{
  private T a;
  private Bundle b;
  private LinkedList<a.a> c;
  private final f<T> d = new a.1(this);
  
  private void a(int paramInt)
  {
    while ((!this.c.isEmpty()) && (((a.a)this.c.getLast()).a() >= paramInt)) {
      this.c.removeLast();
    }
  }
  
  private void a(Bundle paramBundle, a.a parama)
  {
    if (this.a != null)
    {
      parama.a(this.a);
      return;
    }
    if (this.c == null) {
      this.c = new LinkedList();
    }
    this.c.add(parama);
    if (paramBundle != null)
    {
      if (this.b != null) {
        break label76;
      }
      this.b = ((Bundle)paramBundle.clone());
    }
    for (;;)
    {
      a(this.d);
      return;
      label76:
      this.b.putAll(paramBundle);
    }
  }
  
  public static void b(FrameLayout paramFrameLayout)
  {
    Context localContext = paramFrameLayout.getContext();
    int i = GooglePlayServicesUtil.a(localContext);
    String str1 = GooglePlayServicesUtil.a(localContext, i);
    String str2 = GooglePlayServicesUtil.b(localContext, i);
    LinearLayout localLinearLayout = new LinearLayout(paramFrameLayout.getContext());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.addView(localLinearLayout);
    TextView localTextView = new TextView(paramFrameLayout.getContext());
    localTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    localTextView.setText(str1);
    localLinearLayout.addView(localTextView);
    if (str2 != null)
    {
      Button localButton = new Button(localContext);
      localButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
      localButton.setText(str2);
      localLinearLayout.addView(localButton);
      localButton.setOnClickListener(new a.5(localContext, i));
    }
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramLayoutInflater.getContext());
    a(paramBundle, new a.4(this, localFrameLayout, paramLayoutInflater, paramViewGroup, paramBundle));
    if (this.a == null) {
      a(localFrameLayout);
    }
    return localFrameLayout;
  }
  
  public T a()
  {
    return this.a;
  }
  
  public void a(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    a(paramBundle2, new a.2(this, paramActivity, paramBundle1, paramBundle2));
  }
  
  public void a(Bundle paramBundle)
  {
    a(paramBundle, new a.3(this, paramBundle));
  }
  
  protected void a(FrameLayout paramFrameLayout)
  {
    b(paramFrameLayout);
  }
  
  protected abstract void a(f<T> paramf);
  
  public void b()
  {
    a(null, new a.7(this));
  }
  
  public void b(Bundle paramBundle)
  {
    if (this.a != null) {
      this.a.b(paramBundle);
    }
    while (this.b == null) {
      return;
    }
    paramBundle.putAll(this.b);
  }
  
  public void c()
  {
    if (this.a != null)
    {
      this.a.b();
      return;
    }
    a(5);
  }
  
  public void d()
  {
    if (this.a != null)
    {
      this.a.c();
      return;
    }
    a(2);
  }
  
  public void e()
  {
    if (this.a != null)
    {
      this.a.d();
      return;
    }
    a(1);
  }
  
  public void f()
  {
    if (this.a != null) {
      this.a.e();
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.a
 * JD-Core Version:    0.7.0.1
 */