package com.telesoftas.deeper.activities;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class LogActivity$1
  implements View.OnClickListener
{
  LogActivity$1(LogActivity paramLogActivity) {}
  
  public void onClick(View paramView)
  {
    if (!LogActivity.a(this.a).isFocusableInTouchMode())
    {
      LogActivity.a(this.a).setFocusableInTouchMode(true);
      LogActivity.a(this.a).invalidate();
      onClick(paramView);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.LogActivity.1
 * JD-Core Version:    0.7.0.1
 */