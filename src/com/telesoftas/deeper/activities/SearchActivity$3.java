package com.telesoftas.deeper.activities;

import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;

class SearchActivity$3
  implements TextWatcher
{
  SearchActivity$3(SearchActivity paramSearchActivity) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    Message localMessage = new Message();
    localMessage.what = 1234;
    localMessage.obj = paramEditable.toString();
    this.a.o.removeMessages(1234);
    this.a.o.sendMessageDelayed(localMessage, 500L);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SearchActivity.3
 * JD-Core Version:    0.7.0.1
 */