package com.telesoftas.deeper.activities;

import android.app.ProgressDialog;
import android.widget.ListView;
import java.util.ArrayList;

class LocationsListActivity$3
  implements Runnable
{
  LocationsListActivity$3(LocationsListActivity paramLocationsListActivity) {}
  
  public void run()
  {
    if ((LocationsListActivity.c(this.a) != null) && (LocationsListActivity.c(this.a).size() > 0))
    {
      LocationsListActivity.b(this.a).notifyDataSetChanged();
      for (int i = 0; i < LocationsListActivity.c(this.a).size(); i++) {
        LocationsListActivity.b(this.a).add(LocationsListActivity.c(this.a).get(i));
      }
    }
    if (LocationsListActivity.c(this.a).size() == 0) {
      LocationsListActivity.f(this.a);
    }
    for (;;)
    {
      LocationsListActivity.g(this.a).dismiss();
      LocationsListActivity.h(this.a).setAdapter(LocationsListActivity.b(this.a));
      LocationsListActivity.b(this.a).notifyDataSetChanged();
      return;
      LocationsListActivity.e(this.a);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.LocationsListActivity.3
 * JD-Core Version:    0.7.0.1
 */