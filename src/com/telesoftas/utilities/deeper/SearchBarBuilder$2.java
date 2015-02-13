package com.telesoftas.utilities.deeper;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

class SearchBarBuilder$2
  implements TextWatcher
{
  SearchBarBuilder$2(SearchBarBuilder paramSearchBarBuilder, View paramView) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() > 0)
    {
      this.a.setVisibility(0);
      return;
    }
    this.a.setVisibility(8);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.deeper.SearchBarBuilder.2
 * JD-Core Version:    0.7.0.1
 */