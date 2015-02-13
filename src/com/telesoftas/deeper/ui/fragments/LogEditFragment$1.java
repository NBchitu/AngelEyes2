package com.telesoftas.deeper.ui.fragments;

import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.fridaylab.astronomy.AstronomyTools;
import com.koniaris.astronomy.Moon;
import com.telesoftas.deeper.database.NoteData;
import com.telesoftas.deeper.database.NoteEntry;
import com.telesoftas.deeper.database.WeatherData;
import com.telesoftas.httpcommunication.JsonHelper.WeatherItemList;
import com.telesoftas.utilities.weather.WeatherCache;
import com.telesoftas.utilities.weather.WeatherCodeUtils;
import com.telesoftas.utilities.weather.WeatherItem;
import java.util.ArrayList;
import java.util.List;

class LogEditFragment$1
  extends Handler
{
  LogEditFragment$1(LogEditFragment paramLogEditFragment, View paramView, Location paramLocation) {}
  
  private void a(List<WeatherItem> paramList, View paramView)
  {
    if ((paramView != null) && (paramList != null) && (this.c.i() != null))
    {
      TextView localTextView = (TextView)paramView.findViewById(2131296405);
      ImageView localImageView1 = (ImageView)paramView.findViewById(2131296407);
      ImageView localImageView2 = (ImageView)paramView.findViewById(2131296403);
      Moon localMoon = AstronomyTools.a(LogEditFragment.a(this.c).a().b());
      int i = WeatherCodeUtils.a(localMoon.b(), localMoon.a(), this.b);
      localImageView2.setImageResource(i);
      localTextView.setText(Integer.toString((int)((WeatherItem)paramList.get(1)).c(LogEditFragment.b(this.c))) + WeatherCodeUtils.a(LogEditFragment.b(this.c), this.c.i()) + "/" + Integer.toString((int)((WeatherItem)paramList.get(1)).b(LogEditFragment.b(this.c))) + WeatherCodeUtils.a(LogEditFragment.b(this.c), this.c.i()));
      int j = WeatherCodeUtils.a(((WeatherItem)paramList.get(0)).a());
      if (j != 0) {
        localImageView1.setImageResource(j);
      }
      LogEditFragment.a(this.c, new WeatherData(j, 0.0F, 0.0F, null, (float)((WeatherItem)paramList.get(1)).b(0), (float)((WeatherItem)paramList.get(1)).b(1), 0.0F, (float)((WeatherItem)paramList.get(1)).c(0), (float)((WeatherItem)paramList.get(1)).c(1), i, LogEditFragment.c(this.c), LogEditFragment.c(this.c), 0.0F, LogEditFragment.c(this.c), LogEditFragment.c(this.c), 0, 0.0F));
    }
    this.c.b();
  }
  
  public void handleMessage(Message paramMessage)
  {
    if ((paramMessage != null) && (paramMessage.what == 1) && ((paramMessage.obj instanceof ArrayList)))
    {
      a((JsonHelper.WeatherItemList)paramMessage.obj, this.a);
      return;
    }
    if (this.c.i() != null)
    {
      JsonHelper.WeatherItemList localWeatherItemList = new WeatherCache(this.c.i()).b(this.b);
      if (localWeatherItemList != null) {
        a(localWeatherItemList, this.a);
      }
    }
    this.c.b();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.LogEditFragment.1
 * JD-Core Version:    0.7.0.1
 */