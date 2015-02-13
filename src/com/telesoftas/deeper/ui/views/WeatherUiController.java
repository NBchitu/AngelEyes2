package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.fridaylab.util.LocalTime;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.httpcommunication.JsonHelper.WeatherItemList;
import com.telesoftas.utilities.deeper.SettingsUtils;
import com.telesoftas.utilities.weather.WeatherService;
import java.util.GregorianCalendar;
import java.util.Locale;

public abstract class WeatherUiController
{
  protected LocationData a;
  protected JsonHelper.WeatherItemList b;
  protected Context c;
  protected int d = 0;
  
  public WeatherUiController(LocationData paramLocationData, Context paramContext)
  {
    this.a = paramLocationData;
    this.c = paramContext;
    e();
    b(paramLocationData);
  }
  
  private void e()
  {
    this.d = SettingsUtils.a(this.c).getInt(SettingsUtils.a, 0);
  }
  
  abstract View a();
  
  protected String a(LocalTime paramLocalTime, GregorianCalendar paramGregorianCalendar)
  {
    if (paramLocalTime == null) {
      return "-";
    }
    return paramLocalTime.a(this.c, paramGregorianCalendar);
  }
  
  protected String a(String paramString)
  {
    if (paramString.toLowerCase(Locale.US).equals("calm")) {
      return this.c.getString(2131427338);
    }
    return paramString.replace("N", this.c.getString(2131427547)).replace("S", this.c.getString(2131427621)).replace("E", this.c.getString(2131427411)).replace("W", this.c.getString(2131427637));
  }
  
  abstract void a(LocationData paramLocationData);
  
  abstract void b();
  
  protected void b(LocationData paramLocationData)
  {
    if ((paramLocationData.c() == 0.0D) && (paramLocationData.e() == 0.0D))
    {
      c();
      return;
    }
    WeatherUiController.1 local1 = new WeatherUiController.1(this, paramLocationData);
    WeatherService.a(this.c.getApplicationContext()).a(local1, paramLocationData.g());
  }
  
  protected void c()
  {
    RelativeLayout localRelativeLayout = (RelativeLayout)a().findViewById(2131296384);
    if ((localRelativeLayout != null) && (localRelativeLayout.getVisibility() == 0))
    {
      if (this.c != null) {
        localRelativeLayout.startAnimation(AnimationUtils.loadAnimation(this.c, 2130968577));
      }
      localRelativeLayout.setVisibility(8);
    }
  }
  
  protected boolean d()
  {
    RelativeLayout localRelativeLayout = (RelativeLayout)a().findViewById(2131296384);
    if (localRelativeLayout != null) {
      return localRelativeLayout.getVisibility() == 0;
    }
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.WeatherUiController
 * JD-Core Version:    0.7.0.1
 */