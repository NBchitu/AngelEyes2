package com.telesoftas.deeper.activities;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.telesoftas.deeper.database.LocationData;
import java.util.ArrayList;

class LocationsListActivity$LocationDataAdapter$3
  extends Filter
{
  LocationsListActivity$LocationDataAdapter$3(LocationsListActivity.LocationDataAdapter paramLocationDataAdapter) {}
  
  private ArrayList<LocationData> a(CharSequence paramCharSequence)
  {
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString = paramCharSequence.toString().toLowerCase().split("\\s+");
    for (int i = 0; i < LocationsListActivity.k(this.a.a).size(); i++)
    {
      String str = ((LocationData)LocationsListActivity.k(this.a.a).get(i)).a().toLowerCase() + " " + ((LocationData)LocationsListActivity.k(this.a.a).get(i)).b().toLowerCase();
      int j = 1;
      for (int k = 0; k < arrayOfString.length; k++) {
        if ((!str.startsWith(arrayOfString[k])) && (str.indexOf(" " + arrayOfString[k]) <= 0)) {
          j = 0;
        }
      }
      if (j != 0) {
        localArrayList.add(LocationsListActivity.k(this.a.a).get(i));
      }
    }
    return localArrayList;
  }
  
  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    ArrayList localArrayList = a(paramCharSequence);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    localFilterResults.values = localArrayList;
    return localFilterResults;
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    LocationsListActivity.a(this.a.a, (ArrayList)paramFilterResults.values);
    LocationsListActivity.b(this.a.a).clear();
    int i;
    if ((LocationsListActivity.c(this.a.a) != null) && (LocationsListActivity.c(this.a.a).size() > 0))
    {
      LocationsListActivity.e(this.a.a);
      i = 0;
    }
    while (i < LocationsListActivity.c(this.a.a).size())
    {
      LocationsListActivity.b(this.a.a).add(LocationsListActivity.c(this.a.a).get(i));
      i++;
      continue;
      LocationsListActivity.d(this.a.a);
    }
    LocationsListActivity.b(this.a.a).notifyDataSetChanged();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.LocationsListActivity.LocationDataAdapter.3
 * JD-Core Version:    0.7.0.1
 */