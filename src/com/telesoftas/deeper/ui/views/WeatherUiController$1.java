package com.telesoftas.deeper.ui.views;

import android.os.Handler;
import android.os.Message;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.httpcommunication.JsonHelper.WeatherItemList;
import com.telesoftas.utilities.weather.WeatherCache;
import java.util.ArrayList;

class WeatherUiController$1
  extends Handler
{
  WeatherUiController$1(WeatherUiController paramWeatherUiController, LocationData paramLocationData) {}
  
  public void handleMessage(Message paramMessage)
  {
    if ((paramMessage != null) && (paramMessage.what == 1) && ((paramMessage.obj instanceof ArrayList))) {}
    WeatherCache localWeatherCache;
    for (this.b.b = ((JsonHelper.WeatherItemList)paramMessage.obj);; this.b.b = localWeatherCache.b(this.a.g()))
    {
      this.b.b();
      this.b.c();
      return;
      localWeatherCache = new WeatherCache(this.b.c);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.WeatherUiController.1
 * JD-Core Version:    0.7.0.1
 */