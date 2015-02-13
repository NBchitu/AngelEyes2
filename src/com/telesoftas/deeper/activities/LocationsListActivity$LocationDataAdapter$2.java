package com.telesoftas.deeper.activities;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import com.telesoftas.deeper.database.LocationData;

class LocationsListActivity$LocationDataAdapter$2
  implements View.OnClickListener
{
  LocationsListActivity$LocationDataAdapter$2(LocationsListActivity.LocationDataAdapter paramLocationDataAdapter, LocationData paramLocationData, int paramInt) {}
  
  public void onClick(View paramView)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.c.a);
    localBuilder.setTitle(this.c.a.getString(2131427485)).setCancelable(false).setPositiveButton(this.c.a.getString(17039379), new LocationsListActivity.LocationDataAdapter.2.2(this)).setNegativeButton(this.c.a.getString(17039360), new LocationsListActivity.LocationDataAdapter.2.1(this));
    localBuilder.create().show();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.LocationsListActivity.LocationDataAdapter.2
 * JD-Core Version:    0.7.0.1
 */