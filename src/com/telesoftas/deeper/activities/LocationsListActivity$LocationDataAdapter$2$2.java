package com.telesoftas.deeper.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.ListView;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.deeper.database.LocationData;
import java.util.ArrayList;

class LocationsListActivity$LocationDataAdapter$2$2
  implements DialogInterface.OnClickListener
{
  LocationsListActivity$LocationDataAdapter$2$2(LocationsListActivity.LocationDataAdapter.2 param2) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    LocationsListActivity.i(this.a.c.a).e(this.a.a.f());
    LocationsListActivity.c(this.a.c.a).remove(this.a.b);
    if (LocationsListActivity.c(this.a.c.a).size() == 0) {
      LocationsListActivity.f(this.a.c.a);
    }
    for (;;)
    {
      LocationsListActivity.a(this.a.c.a, new Intent());
      LocationsListActivity.j(this.a.c.a).putExtra("deleted", true);
      return;
      LocationsListActivity.h(this.a.c.a).setAdapter(LocationsListActivity.b(this.a.c.a));
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.LocationsListActivity.LocationDataAdapter.2.2
 * JD-Core Version:    0.7.0.1
 */