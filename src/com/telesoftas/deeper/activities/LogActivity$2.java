package com.telesoftas.deeper.activities;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.telesoftas.deeper.ui.fragments.CalendarFragment;

class LogActivity$2
  implements TextView.OnEditorActionListener
{
  LogActivity$2(LogActivity paramLogActivity, InputMethodManager paramInputMethodManager) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent == null)
    {
      if (paramInt == 6)
      {
        if ((!this.b.H) && (LogActivity.b(this.b) != null) && (LogActivity.b(this.b).p())) {
          this.b.b(paramTextView.getText().toString());
        }
        this.a.hideSoftInputFromWindow(this.b.getCurrentFocus().getWindowToken(), 0);
        return true;
      }
    }
    else if ((paramInt == 6) || ((paramKeyEvent.getKeyCode() == 66) && (paramKeyEvent.getAction() == 0)))
    {
      if ((!this.b.H) && (LogActivity.b(this.b) != null) && (LogActivity.b(this.b).p())) {
        this.b.b(paramTextView.getText().toString());
      }
      this.a.hideSoftInputFromWindow(this.b.getCurrentFocus().getWindowToken(), 0);
      return true;
    }
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.LogActivity.2
 * JD-Core Version:    0.7.0.1
 */