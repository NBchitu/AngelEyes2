package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.crashlytics.android.Crashlytics;
import com.fridaylab.astronomy.AstronomyTools;
import com.fridaylab.astronomy.CelestialMovements;
import com.koniaris.astronomy.Moon;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.utilities.CalendarUtils;
import com.telesoftas.utilities.weather.WeatherCodeUtils;
import com.telesoftas.utilities.weather.WeatherItem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

public class WeatherUiControllerPhone
  extends WeatherUiController
{
  private View e = null;
  
  public WeatherUiControllerPhone(LocationData paramLocationData, Context paramContext)
  {
    super(paramLocationData, paramContext);
  }
  
  private void a(int paramInt1, View paramView, WeatherItem paramWeatherItem, int paramInt2)
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    if (paramWeatherItem != null) {}
    try
    {
      if (paramWeatherItem.b() != null) {
        localGregorianCalendar.setTime(localSimpleDateFormat.parse(paramWeatherItem.b()));
      }
      for (;;)
      {
        if (paramWeatherItem != null)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append((int)paramWeatherItem.c(this.d));
          localStringBuilder.append(WeatherCodeUtils.a(this.d, this.c));
          localStringBuilder.append('/');
          localStringBuilder.append((int)paramWeatherItem.b(this.d));
          localStringBuilder.append(WeatherCodeUtils.a(this.d, this.c));
          ((TextView)paramView.findViewById(2131296405)).setText(localStringBuilder.toString());
        }
        ((TextView)paramView.findViewById(2131296401)).setText(CalendarUtils.a(localGregorianCalendar));
        localTextView = (TextView)paramView.findViewById(2131296402);
        if (!CalendarUtils.b(localGregorianCalendar)) {
          break;
        }
        localTextView.setTextColor(Color.parseColor("#F55600"));
        localTextView.setText(CalendarUtils.a(localGregorianCalendar, this.c));
        if (paramWeatherItem != null)
        {
          ImageView localImageView = (ImageView)paramView.findViewById(2131296578);
          int i = WeatherCodeUtils.a(paramWeatherItem.a());
          if (i != 0) {
            localImageView.setImageResource(i);
          }
        }
        Moon localMoon = AstronomyTools.a(localGregorianCalendar);
        ((ImageView)paramView.findViewById(2131296318)).setImageResource(WeatherCodeUtils.a(localMoon.b(), localMoon.a(), this.a.g()));
        return;
        localGregorianCalendar.add(5, paramInt1);
      }
    }
    catch (ParseException localParseException)
    {
      for (;;)
      {
        TextView localTextView;
        localGregorianCalendar.add(5, paramInt1);
        Crashlytics.a(localParseException);
        continue;
        localTextView.setTextColor(-1);
      }
    }
  }
  
  private void a(GregorianCalendar paramGregorianCalendar)
  {
    CelestialMovements localCelestialMovements = AstronomyTools.a(paramGregorianCalendar, this.a.g());
    ((TextView)this.e.findViewById(2131296592)).setText(a(localCelestialMovements.a, paramGregorianCalendar));
    ((TextView)this.e.findViewById(2131296593)).setText(a(localCelestialMovements.b, paramGregorianCalendar));
  }
  
  private void a(List<WeatherItem> paramList, int paramInt)
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    if (paramList != null) {}
    try
    {
      if ((paramList.get(1) != null) && (((WeatherItem)paramList.get(1)).b() != null)) {
        localGregorianCalendar.setTime(localSimpleDateFormat.parse(((WeatherItem)paramList.get(1)).b()));
      }
      label74:
      localGregorianCalendar.add(5, paramInt);
      if (paramList != null) {
        a(paramList, localGregorianCalendar);
      }
      a(localGregorianCalendar);
      b(localGregorianCalendar);
      if (paramList != null)
      {
        a(1, this.e.findViewById(2131296605), (WeatherItem)paramList.get(2), paramInt);
        a(2, this.e.findViewById(2131296606), (WeatherItem)paramList.get(3), paramInt);
        a(3, this.e.findViewById(2131296607), (WeatherItem)paramList.get(4), paramInt);
        a(4, this.e.findViewById(2131296608), (WeatherItem)paramList.get(5), paramInt);
      }
      for (;;)
      {
        RelativeLayout localRelativeLayout = (RelativeLayout)this.e.getTag(2131296384);
        if ((localRelativeLayout != null) && (localRelativeLayout.getVisibility() == 0))
        {
          localRelativeLayout.startAnimation(AnimationUtils.loadAnimation(this.c, 2130968577));
          localRelativeLayout.setVisibility(8);
        }
        return;
        a(1, this.e.findViewById(2131296605), null, paramInt);
        a(2, this.e.findViewById(2131296606), null, paramInt);
        a(3, this.e.findViewById(2131296607), null, paramInt);
        a(4, this.e.findViewById(2131296608), null, paramInt);
      }
    }
    catch (ParseException localParseException)
    {
      break label74;
    }
  }
  
  private void a(List<WeatherItem> paramList, GregorianCalendar paramGregorianCalendar)
  {
    String str1 = WeatherCodeUtils.a(this.c, ((WeatherItem)paramList.get(0)).a());
    ((TextView)this.e.findViewById(2131296579)).setText(str1);
    ImageView localImageView = (ImageView)this.e.findViewById(2131296603);
    int i = WeatherCodeUtils.a(((WeatherItem)paramList.get(0)).a());
    if (i != 0) {
      localImageView.setImageResource(i);
    }
    String str2 = Integer.toString((int)((WeatherItem)paramList.get(0)).d(this.d));
    ((TextView)this.e.findViewById(2131296405)).setText(str2 + WeatherCodeUtils.a(this.d, this.c));
    String str3 = Integer.toString((int)((WeatherItem)paramList.get(1)).b(this.d));
    ((TextView)this.e.findViewById(2131296581)).setText(" " + str3 + WeatherCodeUtils.a(this.d, this.c));
    String str4 = Integer.toString((int)((WeatherItem)paramList.get(1)).c(this.d));
    ((TextView)this.e.findViewById(2131296583)).setText(" " + str4 + WeatherCodeUtils.a(this.d, this.c));
    double d = ((WeatherItem)paramList.get(0)).c();
    String str5 = a(((WeatherItem)paramList.get(0)).d());
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(' ');
    localStringBuilder.append(str5).append(' ');
    if ((this.d == 1) || (this.d == 2) || (this.d == 3))
    {
      localStringBuilder.append((int)Math.round(d * 0.621371192D));
      localStringBuilder.append(this.c.getString(2131427516));
    }
    for (;;)
    {
      ((TextView)this.e.findViewById(2131296586)).setText(localStringBuilder.toString());
      String str6 = Integer.toString(((WeatherItem)paramList.get(0)).e());
      ((TextView)this.e.findViewById(2131296588)).setText(" " + str6 + "%");
      String str7 = Integer.toString((int)((WeatherItem)paramList.get(0)).f());
      TextView localTextView = (TextView)this.e.findViewById(2131296599);
      String str8 = " " + str7 + " " + this.c.getString(2131427436);
      if ((this.d == 1) || (this.d == 2) || (this.d == 3)) {
        str8 = " " + str7 + " " + this.c.getString(2131427517);
      }
      localTextView.setText(str8);
      return;
      localStringBuilder.append((int)Math.round(d / 3.6D));
      localStringBuilder.append(this.c.getString(2131427514));
    }
  }
  
  private void b(GregorianCalendar paramGregorianCalendar)
  {
    int i = 0;
    Moon localMoon = AstronomyTools.a(paramGregorianCalendar);
    boolean bool = localMoon.a();
    int j = localMoon.b();
    ((TextView)this.e.findViewById(2131296604)).setText(WeatherCodeUtils.a(j, bool, this.c));
    ((ImageView)this.e.findViewById(2131296403)).setImageResource(WeatherCodeUtils.a(j, bool, this.a.g()));
    TextView localTextView1 = (TextView)this.e.findViewById(2131296602);
    View localView1 = this.e.findViewById(2131296597);
    TextView localTextView2 = (TextView)this.e.findViewById(2131296600);
    View localView2 = this.e.findViewById(2131296598);
    TextView localTextView3 = (TextView)this.e.findViewById(2131296601);
    CelestialMovements localCelestialMovements = AstronomyTools.b(paramGregorianCalendar, this.a.g());
    if ((localCelestialMovements.a == null) && (localCelestialMovements.b == null)) {
      if (localCelestialMovements.e) {
        localTextView1.setText(this.c.getString(2131427529));
      }
    }
    for (int k = 4;; k = 0)
    {
      localTextView1.setVisibility(i);
      localView1.setVisibility(k);
      localTextView2.setVisibility(k);
      localView2.setVisibility(k);
      localTextView3.setVisibility(k);
      return;
      localTextView1.setText(this.c.getString(2131427525));
      break;
      localTextView3.setText(a(localCelestialMovements.a, paramGregorianCalendar));
      localTextView2.setText(a(localCelestialMovements.b, paramGregorianCalendar));
      i = 8;
    }
  }
  
  View a()
  {
    if (this.e == null) {
      this.e = LayoutInflater.from(this.c).inflate(2130903095, null);
    }
    return this.e;
  }
  
  void a(LocationData paramLocationData)
  {
    this.a = paramLocationData;
    b(paramLocationData);
  }
  
  void b()
  {
    a(this.b, 0);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.WeatherUiControllerPhone
 * JD-Core Version:    0.7.0.1
 */