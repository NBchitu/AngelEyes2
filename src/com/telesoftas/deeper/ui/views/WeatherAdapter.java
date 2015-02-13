package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.location.Location;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.telesoftas.deeper.DeeperApplication;
import com.telesoftas.deeper.activities.WeatherActivity;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.deeper.database.LocationData;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class WeatherAdapter
  extends PagerAdapter
{
  private Context a;
  private ArrayList<LocationData> b = null;
  private boolean c;
  private WeatherUiController d;
  private Hashtable<Integer, WeatherUiController> e = new Hashtable();
  
  public WeatherAdapter(WeatherActivity paramWeatherActivity, boolean paramBoolean)
  {
    this.c = paramBoolean;
    this.a = paramWeatherActivity;
    DeeperDatabase localDeeperDatabase = ((DeeperApplication)this.a.getApplicationContext()).a();
    LocationData localLocationData = new LocationData("Current Position", "Current Position", 0.0D, -3, 0.0D);
    if (paramBoolean) {}
    for (this.d = new WeatherUiControllerTablet(localLocationData, this.a);; this.d = new WeatherUiControllerPhone(localLocationData, this.a))
    {
      this.e.put(Integer.valueOf(0), this.d);
      this.b = localDeeperDatabase.d(6);
      this.b.add(0, localLocationData);
      return;
    }
  }
  
  public int a(LocationData paramLocationData)
  {
    Iterator localIterator = this.b.iterator();
    for (int i = 0; localIterator.hasNext(); i++) {
      if (((LocationData)localIterator.next()).hashCode() == paramLocationData.hashCode()) {
        return i;
      }
    }
    return -2;
  }
  
  public int a(Object paramObject)
  {
    return -2;
  }
  
  public Parcelable a()
  {
    return null;
  }
  
  public LocationData a(int paramInt)
  {
    if (paramInt < this.b.size()) {
      return (LocationData)this.b.get(paramInt);
    }
    return null;
  }
  
  public Object a(View paramView, int paramInt)
  {
    Object localObject = (WeatherUiController)this.e.get(Integer.valueOf(paramInt));
    if (localObject == null) {
      if (!this.c) {
        break label80;
      }
    }
    label80:
    for (localObject = new WeatherUiControllerTablet((LocationData)this.b.get(paramInt), this.a);; localObject = new WeatherUiControllerPhone((LocationData)this.b.get(paramInt), this.a))
    {
      this.e.put(Integer.valueOf(paramInt), localObject);
      View localView = ((WeatherUiController)localObject).a();
      ((ViewPager)paramView).addView(localView);
      return localView;
    }
  }
  
  public void a(Location paramLocation)
  {
    LocationData localLocationData = new LocationData(paramLocation.getProvider(), paramLocation.getProvider(), paramLocation.getLatitude(), 6, paramLocation.getLongitude());
    this.b.remove(0);
    this.b.add(0, localLocationData);
    ((WeatherUiController)this.e.get(Integer.valueOf(0))).a(localLocationData);
  }
  
  public void a(View paramView, int paramInt, Object paramObject)
  {
    ((ViewPager)paramView).removeView((View)paramObject);
  }
  
  public boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
  
  public int b()
  {
    return this.b.size();
  }
  
  public void d()
  {
    ArrayList localArrayList = ((DeeperApplication)this.a.getApplicationContext()).a().d(6);
    LocationData localLocationData = (LocationData)this.b.get(0);
    this.b.clear();
    this.b.addAll(localArrayList);
    this.b.add(0, localLocationData);
    Enumeration localEnumeration = this.e.keys();
    while (localEnumeration.hasMoreElements())
    {
      Integer localInteger = (Integer)localEnumeration.nextElement();
      WeatherUiController localWeatherUiController = (WeatherUiController)this.e.get(localInteger);
      if (this.b.size() > localInteger.intValue()) {
        localWeatherUiController.a((LocationData)this.b.get(localInteger.intValue()));
      }
    }
    c();
  }
  
  public boolean e()
  {
    if (this.d != null) {
      return this.d.d();
    }
    return false;
  }
  
  public void f()
  {
    if (this.d != null) {
      this.d.c();
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.WeatherAdapter
 * JD-Core Version:    0.7.0.1
 */