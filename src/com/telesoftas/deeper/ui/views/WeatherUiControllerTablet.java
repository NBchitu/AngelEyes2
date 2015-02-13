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
import com.fridaylab.deeper.ui.ViewTools;
import com.fridaylab.util.LocalTime;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
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
import java.util.concurrent.Callable;

public class WeatherUiControllerTablet
  extends WeatherUiController
{
  private View e = null;
  private final Callable<Boolean> f = new WeatherUiControllerTablet.1(this);
  
  public WeatherUiControllerTablet(LocationData paramLocationData, Context paramContext)
  {
    super(paramLocationData, paramContext);
  }
  
  private void a(int paramInt1, View paramView, WeatherItem paramWeatherItem, int paramInt2)
  {
    if ((paramInt1 + 1 == paramInt2) || ((paramInt1 == 0) && (paramInt2 == 0))) {
      paramView.setBackgroundResource(2130837523);
    }
    for (;;)
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
            break label345;
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
          paramView.setBackgroundResource(2130837521);
          break;
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
          label345:
          localTextView.setTextColor(-1);
        }
      }
    }
  }
  
  private void a(WeatherItem paramWeatherItem, GregorianCalendar paramGregorianCalendar)
  {
    String str1 = WeatherCodeUtils.a(this.c, paramWeatherItem.a());
    ((TextView)this.e.findViewById(2131296615)).setText(str1);
    ImageView localImageView = (ImageView)this.e.findViewById(2131296609);
    int i = WeatherCodeUtils.a(paramWeatherItem.a());
    if (i != 0) {
      localImageView.setImageResource(i);
    }
    double d1 = paramWeatherItem.d(this.d);
    if (d1 == 0.0D) {}
    for (double d2 = (paramWeatherItem.b(this.d) + paramWeatherItem.c(this.d)) / 2.0D;; d2 = d1)
    {
      ((TextView)this.e.findViewById(2131296612)).setText((int)d2 + "");
      ((TextView)this.e.findViewById(2131296613)).setText(WeatherCodeUtils.a(this.d, this.c));
      TextView localTextView1 = (TextView)this.e.findViewById(2131296636);
      TextView localTextView2 = (TextView)this.e.findViewById(2131296637);
      double d3 = paramWeatherItem.c();
      TextView localTextView3;
      label362:
      String str3;
      TextView localTextView4;
      TextView localTextView5;
      String str4;
      if ((this.d == 1) || (this.d == 2) || (this.d == 3))
      {
        int j = (int)Math.round(d3 * 0.621371192D);
        localTextView1.setText(j + "");
        localTextView2.setText(this.c.getString(2131427516));
        String str2 = a(paramWeatherItem.d());
        ((TextView)this.e.findViewById(2131296638)).setText(str2);
        localTextView3 = (TextView)this.e.findViewById(2131296632);
        if (paramWeatherItem.e() == 0) {
          break label525;
        }
        localTextView3.setText(paramWeatherItem.e() + "");
        this.e.findViewById(2131296633).setVisibility(0);
        str3 = Integer.toString((int)paramWeatherItem.f());
        localTextView4 = (TextView)this.e.findViewById(2131296634);
        localTextView5 = (TextView)this.e.findViewById(2131296635);
        if ((this.d != 1) && (this.d != 2) && (this.d != 3)) {
          break label549;
        }
        str4 = this.c.getString(2131427517);
        str3 = Integer.toString(10 * (int)paramWeatherItem.f());
      }
      for (;;)
      {
        if ((int)paramWeatherItem.f() == 0) {
          break label563;
        }
        localTextView4.setText(str3);
        localTextView5.setText(str4);
        return;
        int k = (int)Math.round(d3 / 3.6D);
        localTextView1.setText(k + "");
        localTextView2.setText(this.c.getString(2131427514));
        break;
        label525:
        this.e.findViewById(2131296633).setVisibility(8);
        localTextView3.setText("-");
        break label362;
        label549:
        str4 = this.c.getString(2131427436);
      }
      label563:
      localTextView4.setText("-");
      localTextView5.setText("");
      return;
    }
  }
  
  private void a(GregorianCalendar paramGregorianCalendar)
  {
    CelestialMovements localCelestialMovements = AstronomyTools.a(paramGregorianCalendar, this.a.g());
    String str1;
    if (localCelestialMovements.a == null)
    {
      str1 = "";
      if (localCelestialMovements.b != null) {
        break label123;
      }
    }
    label123:
    for (String str2 = "";; str2 = this.c.getString(2131427584) + " " + localCelestialMovements.b.a(this.c, paramGregorianCalendar))
    {
      ((TextView)this.e.findViewById(2131296614)).setText(str1 + " - " + str2);
      return;
      str1 = this.c.getString(2131427577) + " " + localCelestialMovements.a.a(this.c, paramGregorianCalendar);
      break;
    }
  }
  
  private void a(List<WeatherItem> paramList, int paramInt)
  {
    EasyTracker.a(this.c).a(MapBuilder.a("Weather", "review_date", "forecast", Long.valueOf(paramInt)).a());
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    if (paramList != null) {}
    try
    {
      if ((paramList.get(1) != null) && (((WeatherItem)paramList.get(1)).b() != null)) {
        localGregorianCalendar.setTime(localSimpleDateFormat.parse(((WeatherItem)paramList.get(1)).b()));
      }
      localGregorianCalendar.add(5, paramInt);
      localTextView = (TextView)this.e.findViewById(2131296611);
      if (this.a.a().length() > 0)
      {
        localTextView.setText(this.a.a());
        if (paramInt != 0) {
          paramInt++;
        }
        if (paramList != null) {
          a((WeatherItem)paramList.get(paramInt), localGregorianCalendar);
        }
        a(localGregorianCalendar);
        b(localGregorianCalendar);
        ((TextView)this.e.findViewById(2131296610)).setText(new SimpleDateFormat("EE dd MMM", Locale.getDefault()).format(localGregorianCalendar.getTime()));
        if (paramList == null) {
          break label544;
        }
        ((WeatherItem)paramList.get(1)).a(((WeatherItem)paramList.get(0)).a());
        a(0, this.e.findViewById(2131296640), (WeatherItem)paramList.get(1), paramInt);
        a(1, this.e.findViewById(2131296605), (WeatherItem)paramList.get(2), paramInt);
        a(2, this.e.findViewById(2131296606), (WeatherItem)paramList.get(3), paramInt);
        a(3, this.e.findViewById(2131296607), (WeatherItem)paramList.get(4), paramInt);
        a(4, this.e.findViewById(2131296608), (WeatherItem)paramList.get(5), paramInt);
        RelativeLayout localRelativeLayout = (RelativeLayout)this.e.getTag(2131296384);
        if ((localRelativeLayout != null) && (localRelativeLayout.getVisibility() == 0))
        {
          localRelativeLayout.startAnimation(AnimationUtils.loadAnimation(this.c, 2130968577));
          localRelativeLayout.setVisibility(8);
        }
        WeatherUiControllerTablet.2 local2 = new WeatherUiControllerTablet.2(this, paramList);
        this.e.findViewById(2131296640).setOnClickListener(local2);
        this.e.findViewById(2131296605).setOnClickListener(local2);
        this.e.findViewById(2131296606).setOnClickListener(local2);
        this.e.findViewById(2131296607).setOnClickListener(local2);
        this.e.findViewById(2131296608).setOnClickListener(local2);
      }
    }
    catch (ParseException localParseException)
    {
      for (;;)
      {
        TextView localTextView;
        Crashlytics.a(localParseException);
        continue;
        localTextView.setText(this.a.b());
        continue;
        label544:
        a(0, this.e.findViewById(2131296640), null, paramInt);
        a(1, this.e.findViewById(2131296605), null, paramInt);
        a(2, this.e.findViewById(2131296606), null, paramInt);
        a(3, this.e.findViewById(2131296607), null, paramInt);
        a(4, this.e.findViewById(2131296608), null, paramInt);
      }
    }
  }
  
  private void b(GregorianCalendar paramGregorianCalendar)
  {
    Moon localMoon = AstronomyTools.a(paramGregorianCalendar);
    boolean bool = localMoon.a();
    int i = localMoon.b();
    ((TextView)this.e.findViewById(2131296629)).setText(WeatherCodeUtils.a(i, bool, this.c));
    ((ImageView)this.e.findViewById(2131296630)).setImageResource(WeatherCodeUtils.a(i, bool, this.a.g()));
    TextView localTextView1 = (TextView)this.e.findViewById(2131296625);
    TextView localTextView2 = (TextView)this.e.findViewById(2131296628);
    TextView localTextView3 = (TextView)this.e.findViewById(2131296620);
    TextView localTextView4 = (TextView)this.e.findViewById(2131296623);
    CelestialMovements localCelestialMovements = AstronomyTools.b(paramGregorianCalendar, this.a.g());
    localTextView2.setText(a(localCelestialMovements.a, paramGregorianCalendar));
    localTextView1.setText(a(localCelestialMovements.b, paramGregorianCalendar));
    localTextView4.setText(a(localCelestialMovements.c, paramGregorianCalendar));
    localTextView3.setText(a(localCelestialMovements.d, paramGregorianCalendar));
  }
  
  View a()
  {
    if (this.e == null)
    {
      this.e = LayoutInflater.from(this.c).inflate(2130903096, null);
      ViewTools.a(this.e, this.f);
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
 * Qualified Name:     com.telesoftas.deeper.ui.views.WeatherUiControllerTablet
 * JD-Core Version:    0.7.0.1
 */