package com.telesoftas.utilities.weather;

import android.location.Location;
import android.os.Handler;
import android.os.Message;
import com.crashlytics.android.Crashlytics;
import com.telesoftas.httpcommunication.JsonHelper;
import java.util.List;
import org.apache.http.client.methods.HttpPost;

class WeatherService$1
  extends Thread
{
  WeatherService$1(WeatherService paramWeatherService, Location paramLocation, Handler paramHandler) {}
  
  public void run()
  {
    localMessage = new Message();
    localMessage.what = 1;
    try
    {
      List localList2 = WeatherService.a(this.c).a(this.a);
      localList1 = localList2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Crashlytics.a(localException);
        List localList1 = null;
        continue;
        String str1 = Double.toString(this.a.getLatitude());
        String str2 = Double.toString(this.a.getLongitude());
        HttpPost localHttpPost = new HttpPost("http://api.worldweatheronline.com/premium/v1/weather.ashx?q=" + str1 + "," + str2 + "&format=json&num_of_days=5&key=" + "4fdwsf5q27hnqjbds9npywtr");
        String str3 = WeatherService.a(this.c, null, localHttpPost);
        if (str3 != null)
        {
          if (JsonHelper.a(str3) != null)
          {
            WeatherService.a(this.c).a(this.a, str3);
            localMessage.obj = JsonHelper.a(str3);
            localMessage.what = 1;
          }
          else
          {
            localMessage.what = 0;
          }
        }
        else {
          localMessage.what = 0;
        }
      }
    }
    if (localList1 != null)
    {
      localMessage.obj = localList1;
      this.b.sendMessage(localMessage);
      return;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.weather.WeatherService.1
 * JD-Core Version:    0.7.0.1
 */