package com.telesoftas.deeper.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.deeper.ui.views.WeatherAdapter;
import com.telesoftas.utilities.ConnectionCheckUtils;
import com.telesoftas.utilities.deeper.SearchBarBuilder;
import com.telesoftas.utilities.location.GeodecodingOperation;
import com.telesoftas.utilities.location.GeodecodingOperation.GeodecodingListener;
import com.telesoftas.utilities.location.LocationHelperSingleton;
import com.telesoftas.utilities.location.LocationListenerInterface;

public class WeatherActivity
  extends TrackedActivity
  implements ViewPager.OnPageChangeListener, View.OnClickListener, GeodecodingOperation.GeodecodingListener, LocationListenerInterface
{
  boolean n = false;
  private View o;
  private TextView p;
  private View q;
  private ImageView r;
  private ImageView s;
  private TextView t;
  private ViewPager u;
  private WeatherAdapter v;
  private Location w;
  private LocationHelperSingleton x;
  
  private void b(String paramString)
  {
    this.p.setText(paramString);
  }
  
  private void c(Location paramLocation)
  {
    if (paramLocation == this.w) {
      this.q.setVisibility(8);
    }
    for (;;)
    {
      this.v.a(paramLocation);
      this.u.setCurrentItem(0);
      return;
      this.q.setVisibility(0);
    }
  }
  
  private void g()
  {
    int i = this.u.getCurrentItem();
    LocationData localLocationData = this.v.a(i);
    Intent localIntent = new Intent(this, DeeperMapActivity.class);
    if (localLocationData != null)
    {
      localIntent.putExtra("started_by", 12);
      localIntent.putExtra("latitude", localLocationData.c());
      localIntent.putExtra("longitude", localLocationData.e());
    }
    startActivityForResult(localIntent, 12);
  }
  
  public void a(int paramInt)
  {
    if (this.n) {
      m().a(MapBuilder.a("Weather", "changed_location", "swipe", null).a());
    }
    LocationData localLocationData = this.v.a(paramInt);
    if (localLocationData != null)
    {
      if (localLocationData.a().length() > 0)
      {
        b(localLocationData.a());
        String str = paramInt + 1 + " / " + this.v.b();
        this.t.setText(str);
      }
    }
    else
    {
      if (paramInt <= 0) {
        break label123;
      }
      this.q.setVisibility(8);
    }
    label123:
    while ((this.v.a(0) == null) || (this.w == null) || ((this.v.a(0).c() == this.w.getLatitude()) && (this.v.a(0).e() == this.w.getLongitude())))
    {
      return;
      b(localLocationData.b());
      break;
    }
    this.q.setVisibility(0);
  }
  
  public void a(int paramInt1, float paramFloat, int paramInt2) {}
  
  @SuppressLint({"NewApi"})
  public void a(Location paramLocation)
  {
    GeodecodingOperation localGeodecodingOperation = new GeodecodingOperation(getApplicationContext(), paramLocation);
    localGeodecodingOperation.a(this);
    if (Build.VERSION.SDK_INT >= 11) {
      localGeodecodingOperation.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }
    for (;;)
    {
      this.x.b(this);
      return;
      localGeodecodingOperation.execute(new String[0]);
    }
  }
  
  public void b(int paramInt)
  {
    if (paramInt == 1) {
      this.n = true;
    }
    while (paramInt != 0) {
      return;
    }
    this.n = false;
  }
  
  public void b(Location paramLocation)
  {
    paramLocation.setProvider(getString(2131427383));
    this.w = paramLocation;
    c(paramLocation);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 101)
    {
      if (ConnectionCheckUtils.a(this)) {
        this.v.d();
      }
    }
    else
    {
      if (paramInt1 == 102)
      {
        if (!ConnectionCheckUtils.b(this)) {
          break label226;
        }
        this.v.d();
      }
      label40:
      if ((paramInt1 == 2) && (paramInt2 == -1) && (paramIntent != null))
      {
        LocationData localLocationData = (LocationData)paramIntent.getExtras().getParcelable("location");
        this.v.d();
        if (localLocationData == null) {
          break label236;
        }
        Log.i("location from list info", localLocationData.b());
        this.u.setCurrentItem(this.v.a(localLocationData));
        m().a(MapBuilder.a("Weather", "changed_location", "saved_list", null).a());
      }
      label128:
      if (paramInt1 != 12) {
        break label247;
      }
      this.v.d();
      if ((paramIntent != null) && (paramIntent.getExtras().getInt("saved") == 1))
      {
        this.u.setCurrentItem(this.v.b());
        m().a(MapBuilder.a("Weather", "add_new_location", "finished", null).a());
      }
      if (paramInt2 != -1) {
        this.u.setCurrentItem(0);
      }
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      this.v.f();
      break;
      label226:
      this.v.f();
      break label40;
      label236:
      this.u.setCurrentItem(0);
      break label128;
      label247:
      if ((paramInt1 == 22) && (paramIntent != null) && (paramIntent.getExtras() != null))
      {
        Location localLocation = (Location)paramIntent.getExtras().getParcelable("result_s");
        c(localLocation);
        b(localLocation.getProvider());
        m().a(MapBuilder.a("Weather", "changed_location", "search", null).a());
      }
    }
  }
  
  public void onBackPressed()
  {
    if ((this.v != null) && (this.v.e()))
    {
      this.v.f();
      return;
    }
    super.onBackPressed();
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.q)
    {
      if ((this.w != null) && (this.w.getLatitude() == 0.0D) && (this.w.getLongitude() == 0.0D))
      {
        this.v = new WeatherAdapter(this, this.H);
        this.u.setAdapter(this.v);
      }
      this.p.setText(getString(2131427383));
      if (this.w != null) {
        c(this.w);
      }
    }
    if (paramView == this.r)
    {
      g();
      m().a(MapBuilder.a("Weather", "add_new_location", "started", null).a());
    }
    if (paramView == this.s)
    {
      Intent localIntent = new Intent(this, LocationsListActivity.class);
      localIntent.putExtra("started_by", 2);
      startActivityForResult(localIntent, 2);
      m().a(MapBuilder.a("Weather", "view_saved_locations", null, null).a());
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ConnectionCheckUtils.b(this);
    ConnectionCheckUtils.a(this);
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    setContentView(2130903092);
    LinearLayout localLinearLayout = (LinearLayout)findViewById(2131296275);
    SearchBarBuilder localSearchBarBuilder = new SearchBarBuilder(this);
    localSearchBarBuilder.h().b().g().e();
    localLinearLayout.addView(localSearchBarBuilder.i());
    this.o = localSearchBarBuilder.i().findViewById(8);
    this.p = ((TextView)this.o.findViewById(2131296344));
    this.q = this.o.findViewById(2131296345);
    this.q.setOnClickListener(this);
    this.p.setText(getString(2131427383));
    this.r = ((ImageView)localSearchBarBuilder.i().findViewById(5));
    this.s = ((ImageView)localSearchBarBuilder.i().findViewById(7));
    getWindow().setSoftInputMode(3);
    this.r.setOnClickListener(this);
    this.s.setOnClickListener(this);
    this.t = ((TextView)findViewById(2131296577));
    this.x = LocationHelperSingleton.a(getApplicationContext());
    this.x.a(this);
    this.u = ((ViewPager)findViewById(2131296576));
    this.u.setOnPageChangeListener(this);
    this.v = new WeatherAdapter(this, this.H);
    this.u.setAdapter(this.v);
    this.u.setCurrentItem(0);
    String str = "1 / " + this.v.b();
    this.t.setText(str);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.WeatherActivity
 * JD-Core Version:    0.7.0.1
 */