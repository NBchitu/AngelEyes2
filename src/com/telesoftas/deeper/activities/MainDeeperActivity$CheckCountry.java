package com.telesoftas.deeper.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import com.crashlytics.android.Crashlytics;
import com.fridaylab.util.AsyncDelegate;
import com.telesoftas.utilities.location.LocationHelperSingleton;
import com.telesoftas.utilities.location.LocationListenerInterface;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

class MainDeeperActivity$CheckCountry
  extends AsyncDelegate
  implements LocationListenerInterface
{
  private final Context b;
  private Location c;
  private boolean d;
  
  public MainDeeperActivity$CheckCountry(MainDeeperActivity paramMainDeeperActivity, Context paramContext)
  {
    this.b = paramContext;
    this.d = false;
  }
  
  public void a()
  {
    if (this.d) {
      return;
    }
    LocationHelperSingleton.a(this.b).a(MainDeeperActivity.m(this.a));
    this.d = true;
  }
  
  public void a(Location paramLocation)
  {
    LocationHelperSingleton.a(this.b).b(this);
    if (this.c != null) {
      return;
    }
    this.c = paramLocation;
    h();
  }
  
  protected void d()
  {
    Geocoder localGeocoder = new Geocoder(this.b, Locale.getDefault());
    try
    {
      List localList = localGeocoder.getFromLocation(this.c.getLatitude(), this.c.getLongitude(), 1);
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext()) {
        if (!TextUtils.isEmpty(((Address)localIterator.next()).getCountryCode())) {}
      }
      Address localAddress;
      String str1;
      String str2;
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      Crashlytics.a(localIllegalArgumentException);
      new StringBuilder().append("Illegal arguments ").append(Double.toString(this.c.getLatitude())).append(" , ").append(Double.toString(this.c.getLongitude())).append(" passed to address service").toString();
      return;
    }
    catch (Exception localException)
    {
      do
      {
        Crashlytics.a(localException);
        return;
      } while ((localList == null) || (localList.size() <= 0));
      localAddress = (Address)localList.get(0);
      str1 = localAddress.getCountryCode();
      str2 = localAddress.getLocality();
      if (TextUtils.isEmpty(str2)) {
        str2 = "N/A";
      }
      MainDeeperActivity.k(this.a).edit().putString("PROMO_USER_COUNTRY", str1).putFloat("PROMO_USER_LATITUDE", (float)this.c.getLatitude()).putFloat("PROMO_USER_LONGITUDE", (float)this.c.getLongitude()).putString("PROMO_USER_CITY", str2).apply();
      return;
    }
    catch (IOException localIOException) {}
  }
  
  protected void onPostExecute(Object paramObject)
  {
    this.d = false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.CheckCountry
 * JD-Core Version:    0.7.0.1
 */