package com.telesoftas.deeper.activities;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class SearchActivity$2
  implements TextView.OnEditorActionListener
{
  SearchActivity$2(SearchActivity paramSearchActivity) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent == null)
    {
      if (paramInt == 6)
      {
        SearchActivity.a(this.a, SearchActivity.b(this.a).getText().toString());
        return true;
      }
    }
    else if ((paramInt == 6) || ((paramKeyEvent.getKeyCode() == 66) && (paramKeyEvent.getAction() == 0)))
    {
      SearchActivity.a(this.a, SearchActivity.b(this.a).getText().toString());
      return true;
    }
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SearchActivity.2
 * JD-Core Version:    0.7.0.1
 */