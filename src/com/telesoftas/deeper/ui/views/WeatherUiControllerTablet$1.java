package com.telesoftas.deeper.ui.views;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.Callable;

class WeatherUiControllerTablet$1
  implements Callable<Boolean>
{
  WeatherUiControllerTablet$1(WeatherUiControllerTablet paramWeatherUiControllerTablet) {}
  
  public Boolean a()
  {
    ViewGroup localViewGroup = (ViewGroup)WeatherUiControllerTablet.a(this.a).findViewById(2131296631);
    if (localViewGroup == null) {
      return Boolean.valueOf(true);
    }
    int i = 0;
    boolean bool = true;
    while (i < localViewGroup.getChildCount())
    {
      View localView1 = localViewGroup.getChildAt(i);
      if ((localView1 instanceof ViewGroup))
      {
        View localView2 = ((ViewGroup)localView1).getChildAt(0);
        if ((localView2 instanceof TextView))
        {
          TextView localTextView = (TextView)localView2;
          if (localTextView.getLineCount() > 1)
          {
            localTextView.setTextSize(0, 0.9F * localTextView.getTextSize());
            bool = false;
          }
        }
      }
      i++;
    }
    return Boolean.valueOf(bool);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.WeatherUiControllerTablet.1
 * JD-Core Version:    0.7.0.1
 */