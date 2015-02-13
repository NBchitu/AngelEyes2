package com.telesoftas.deeper.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.telesoftas.deeper.database.LocationData;
import java.util.ArrayList;
import java.util.List;

class LocationsListActivity$LocationDataAdapter
  extends ArrayAdapter<LocationData>
  implements Filterable
{
  public LocationsListActivity$LocationDataAdapter(Context paramContext, int paramInt, ArrayList<LocationData> paramArrayList)
  {
    super(paramInt, paramArrayList, localList);
  }
  
  public int getCount()
  {
    return LocationsListActivity.c(this.a).size();
  }
  
  public Filter getFilter()
  {
    return new LocationsListActivity.LocationDataAdapter.3(this);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(2130903060, null);
    }
    paramView.setOnFocusChangeListener(new LocationsListActivity.LocationDataAdapter.1(this));
    LocationData localLocationData = (LocationData)LocationsListActivity.c(this.a).get(paramInt);
    TextView localTextView2;
    ImageView localImageView1;
    ImageView localImageView2;
    if (localLocationData != null)
    {
      TextView localTextView1 = (TextView)paramView.findViewById(2131296357);
      localTextView2 = (TextView)paramView.findViewById(2131296355);
      localImageView1 = (ImageView)paramView.findViewById(2131296354);
      localImageView2 = (ImageView)paramView.findViewById(2131296356);
      if (localTextView1 != null) {
        localTextView1.setText(LocationsListActivity.o[localLocationData.d()]);
      }
      if (localTextView2 != null)
      {
        if ((localLocationData.a() == null) || (localLocationData.a().equals(""))) {
          break label216;
        }
        localTextView2.setText(localLocationData.a());
      }
    }
    for (;;)
    {
      if (localImageView1 != null) {
        localImageView1.setImageResource(LocationsListActivity.n[localLocationData.d()]);
      }
      if (localImageView2 != null) {
        localImageView2.setOnClickListener(new LocationsListActivity.LocationDataAdapter.2(this, localLocationData, paramInt));
      }
      this.a.a(paramView, LocationsListActivity.c(this.a).size(), paramInt);
      return paramView;
      label216:
      localTextView2.setText(localLocationData.b());
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.LocationsListActivity.LocationDataAdapter
 * JD-Core Version:    0.7.0.1
 */