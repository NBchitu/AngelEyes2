package com.google.android.gms.dynamic;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.common.GooglePlayServicesUtil;

final class a$5
  implements View.OnClickListener
{
  a$5(Context paramContext, int paramInt) {}
  
  public void onClick(View paramView)
  {
    this.a.startActivity(GooglePlayServicesUtil.a(this.b));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.a.5
 * JD-Core Version:    0.7.0.1
 */