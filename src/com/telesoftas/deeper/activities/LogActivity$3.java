package com.telesoftas.deeper.activities;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.deeper.ui.fragments.LogFragment;

class LogActivity$3
  implements TextWatcher
{
  LogActivity$3(LogActivity paramLogActivity) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.a.H) && (LogActivity.c(this.a) == 0) && (paramInt3 > 0)) {
      LogActivity.a(this.a, true);
    }
    if ((LogActivity.d(this.a) != null) && (LogActivity.d(this.a).p()))
    {
      LogActivity.d(this.a).a(paramCharSequence.toString());
      this.a.m().a(MapBuilder.a("Notes", "search", paramCharSequence.toString(), null).a());
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.LogActivity.3
 * JD-Core Version:    0.7.0.1
 */