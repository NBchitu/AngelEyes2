package com.telesoftas.deeper.activities;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Filter;
import java.util.ArrayList;

class LocationsListActivity$2
  implements TextWatcher
{
  LocationsListActivity$2(LocationsListActivity paramLocationsListActivity) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    LocationsListActivity.b(this.a).getFilter().filter(paramEditable.toString());
    if (LocationsListActivity.c(this.a).size() == 0)
    {
      LocationsListActivity.d(this.a);
      return;
    }
    LocationsListActivity.e(this.a);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.LocationsListActivity.2
 * JD-Core Version:    0.7.0.1
 */