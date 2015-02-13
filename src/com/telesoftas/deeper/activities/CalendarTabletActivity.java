package com.telesoftas.deeper.activities;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.crashlytics.android.Crashlytics;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.deeper.ui.fragments.CalendarBaseFragment;
import com.telesoftas.deeper.ui.fragments.CalendarPhoneFragment;
import com.telesoftas.deeper.ui.fragments.CalendarTabletFragment;
import com.telesoftas.deeper.ui.views.CalendarTabletPagerAdapter;
import com.telesoftas.utilities.ConnectionCheckUtils;
import com.telesoftas.utilities.deeper.SearchBarBuilder;
import com.telesoftas.utilities.location.LocationHelperSingleton;
import com.telesoftas.utilities.location.LocationListenerInterface;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class CalendarTabletActivity
  extends TrackedActivity
  implements ViewPager.OnPageChangeListener, View.OnClickListener, LocationListenerInterface
{
  public static boolean n;
  private CalendarTabletPagerAdapter A;
  private final List<Fragment> B = new ArrayList();
  private int C = -1;
  private GregorianCalendar J;
  private List<LocationData> K = new ArrayList();
  private LocationData L;
  private Location M;
  public boolean o = false;
  boolean p = false;
  private ImageView q;
  private ImageView r;
  private View s;
  private TextView t;
  private View u;
  private DeeperDatabase v;
  private TextView w;
  private int x = 0;
  private ViewPager y;
  private LocationHelperSingleton z;
  
  private void a(LocationData paramLocationData)
  {
    for (int i = 0; i < this.B.size(); i++) {
      if ((((LocationData)this.K.get(i)).c() == paramLocationData.c()) && (((LocationData)this.K.get(i)).e() == paramLocationData.e())) {
        this.y.setCurrentItem(i);
      }
    }
  }
  
  private void a(List<Fragment> paramList, LocationData paramLocationData, int paramInt)
  {
    if (this.H) {}
    for (Object localObject = new CalendarTabletFragment();; localObject = new CalendarPhoneFragment())
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("location", paramLocationData);
      ((CalendarBaseFragment)localObject).g(localBundle);
      paramList.add(localObject);
      return;
    }
  }
  
  private void b(Location paramLocation)
  {
    if (paramLocation == this.M)
    {
      this.u.setVisibility(8);
      if (paramLocation != null) {
        break label105;
      }
    }
    label105:
    for (this.L = new LocationData(getString(2131427383), " ", -666.0D, -3, -666.0D);; this.L = new LocationData(-2, "", paramLocation.getProvider(), paramLocation.getLatitude(), 1, paramLocation.getLongitude()))
    {
      this.K.set(0, this.L);
      ((CalendarBaseFragment)this.A.a(0)).a(this.L);
      if (this.x != 0) {
        break label136;
      }
      f(0);
      return;
      this.u.setVisibility(0);
      break;
    }
    label136:
    this.y.setCurrentItem(0);
  }
  
  private void e(int paramInt)
  {
    this.y.setCurrentItem(paramInt);
    String str = paramInt + 1 + " / " + this.K.size();
    this.w.setText(str);
  }
  
  private void f(int paramInt)
  {
    g(paramInt);
    this.x = paramInt;
    this.A.c();
    String str = paramInt + 1 + " / " + this.K.size();
    this.w.setText(str);
    a(((CalendarBaseFragment)this.A.a(0)).P());
    if (paramInt == 0)
    {
      LocationData localLocationData = ((CalendarBaseFragment)this.A.a(paramInt)).b();
      if ((localLocationData == null) || (localLocationData.c() == -666.0D)) {
        ((CalendarBaseFragment)this.A.a(paramInt)).a(this.L);
      }
    }
    if (this.H) {
      ((CalendarTabletFragment)this.A.a(paramInt)).a();
    }
    for (;;)
    {
      ((CalendarBaseFragment)this.A.a(paramInt)).a(this.J);
      ((CalendarBaseFragment)this.A.a(paramInt)).b(this.C);
      return;
      if (this.o) {
        ((CalendarPhoneFragment)this.A.a(paramInt)).a();
      } else {
        ((CalendarPhoneFragment)this.A.a(paramInt)).Q();
      }
    }
  }
  
  private void g(int paramInt)
  {
    if ((((LocationData)this.K.get(paramInt)).b() != null) && (paramInt <= this.K.size()))
    {
      str = ((LocationData)this.K.get(paramInt)).a();
      if (str.length() >= 1) {}
    }
    for (String str = ((LocationData)this.K.get(paramInt)).b();; str = ((LocationData)this.K.get(paramInt)).c() + " " + ((LocationData)this.K.get(paramInt)).e())
    {
      this.t.setText(str);
      return;
    }
  }
  
  private boolean j()
  {
    if (!this.H) {
      try
      {
        boolean bool = ((CalendarPhoneFragment)this.A.a(this.x)).R();
        return bool;
      }
      catch (Exception localException)
      {
        Crashlytics.a(localException);
        return true;
      }
    }
    return true;
  }
  
  private void k()
  {
    this.L = new LocationData(getString(2131427383), " ", -666.0D, -3, -666.0D);
    l();
    f(0);
  }
  
  private void l()
  {
    this.K = this.v.d(1);
    this.K.add(0, this.L);
    this.B.clear();
    for (int i = 0; i < this.K.size(); i++) {
      a(this.B, (LocationData)this.K.get(i), i);
    }
    this.A = new CalendarTabletPagerAdapter(f(), this.B);
    this.A.c();
    this.y.setAdapter(this.A);
    this.y.invalidate();
  }
  
  private void n()
  {
    this.z = LocationHelperSingleton.a(getApplicationContext());
    this.z.a(this);
  }
  
  private void o()
  {
    Intent localIntent = new Intent(this, LocationsListActivity.class);
    localIntent.putExtra("started_by", 3);
    startActivityForResult(localIntent, 6);
  }
  
  private void p()
  {
    LocationData localLocationData = (LocationData)this.K.get(0);
    Intent localIntent = new Intent(this, DeeperMapActivity.class);
    if (localLocationData != null)
    {
      localIntent.putExtra("started_by", 13);
      localIntent.putExtra("latitude", localLocationData.c());
      localIntent.putExtra("longitude", localLocationData.e());
    }
    startActivityForResult(localIntent, 13);
  }
  
  public void a(int paramInt)
  {
    if (this.p) {
      m().a(MapBuilder.a("Calendar", "changed_location", "swipe", null).a());
    }
    f(paramInt);
    if (paramInt > 0) {
      this.u.setVisibility(8);
    }
    for (;;)
    {
      return;
      try
      {
        LocationData localLocationData = (LocationData)this.K.get(0);
        double d1 = localLocationData.c();
        double d2 = this.M.getLatitude();
        double d3 = localLocationData.e();
        double d4 = this.M.getLongitude();
        if ((d1 != d2) || (d3 != d4))
        {
          this.u.setVisibility(0);
          return;
        }
      }
      catch (Exception localException)
      {
        Crashlytics.a(localException);
      }
    }
  }
  
  public void a(int paramInt1, float paramFloat, int paramInt2) {}
  
  public void a(Location paramLocation)
  {
    this.z.b(this);
    if (ConnectionCheckUtils.b(this))
    {
      paramLocation.setProvider(getString(2131427383));
      this.M = paramLocation;
      b(paramLocation);
    }
  }
  
  public void a(GregorianCalendar paramGregorianCalendar)
  {
    this.J = paramGregorianCalendar;
  }
  
  public void b(int paramInt)
  {
    if (paramInt == 1) {
      this.p = true;
    }
    while (paramInt != 0) {
      return;
    }
    this.p = false;
  }
  
  public void c(int paramInt)
  {
    this.C = paramInt;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    i();
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public int g()
  {
    return this.C;
  }
  
  public GregorianCalendar h()
  {
    return this.J;
  }
  
  public void i()
  {
    View localView = getCurrentFocus();
    if (localView == null) {}
    IBinder localIBinder;
    InputMethodManager localInputMethodManager;
    do
    {
      do
      {
        return;
        localIBinder = localView.getWindowToken();
      } while (localIBinder == null);
      localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    } while (localInputMethodManager == null);
    localInputMethodManager.hideSoftInputFromWindow(localIBinder, 0);
    this.s.setVisibility(0);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 6) && (paramInt2 == -1)) {
      if (paramIntent != null)
      {
        Bundle localBundle = paramIntent.getExtras();
        LocationData localLocationData = (LocationData)localBundle.getParcelable("location");
        if (localLocationData != null)
        {
          a(localLocationData);
          m().a(MapBuilder.a("Calendar", "changed_location", "saved_list", null).a());
        }
        if (localBundle.getBoolean("deleted"))
        {
          l();
          e(0);
        }
      }
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      if ((paramInt1 == 13) && (paramInt2 == -1))
      {
        l();
        if (paramIntent.getExtras().getInt("saved") == 1)
        {
          e(-1 + this.K.size());
          m().a(MapBuilder.a("Calendar", "add_new_location", "finished", null).a());
        }
        else
        {
          e(this.x);
        }
      }
      else if ((paramInt1 == 22) && (paramIntent != null) && (paramIntent.getExtras() != null))
      {
        b((Location)paramIntent.getExtras().getParcelable("result_s"));
        m().a(MapBuilder.a("Calendar", "changed_location", "search", null).a());
      }
    }
  }
  
  public void onBackPressed()
  {
    if (j())
    {
      if (this.z != null) {
        this.z.b(this);
      }
      super.onBackPressed();
    }
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.u)
    {
      this.t.setText(getString(2131427383));
      a(((CalendarBaseFragment)this.A.a(0)).P());
      b(this.M);
    }
    int i = paramView.getId();
    if (i == 5)
    {
      p();
      m().a(MapBuilder.a("Calendar", "add_new_location", "started", null).a());
    }
    while (i != 7) {
      return;
    }
    o();
    m().a(MapBuilder.a("Calendar", "view_saved_locations", null, null).a());
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ConnectionCheckUtils.b(this);
    ConnectionCheckUtils.a(this);
    n = false;
    setContentView(2130903041);
    LinearLayout localLinearLayout = (LinearLayout)findViewById(2131296275);
    SearchBarBuilder localSearchBarBuilder = new SearchBarBuilder(this);
    localSearchBarBuilder.h().b().g().e();
    localLinearLayout.addView(localSearchBarBuilder.i());
    this.q = ((ImageView)localSearchBarBuilder.i().findViewById(7));
    this.q.setOnClickListener(this);
    this.r = ((ImageView)localSearchBarBuilder.i().findViewById(5));
    this.r.setOnClickListener(this);
    getWindow().setSoftInputMode(3);
    this.s = localSearchBarBuilder.i().findViewById(8);
    this.t = ((TextView)this.s.findViewById(2131296344));
    this.u = this.s.findViewById(2131296345);
    this.u.setOnClickListener(this);
    this.y = ((ViewPager)findViewById(2131296276));
    this.y.setOnPageChangeListener(this);
    this.y.setOffscreenPageLimit(5);
    this.y.setHorizontalFadingEdgeEnabled(false);
    this.y.setFadingEdgeLength(0);
    this.w = ((TextView)findViewById(2131296277));
    this.v = this.F;
    k();
  }
  
  protected void onResume()
  {
    if (this.L.d() == -3) {
      n();
    }
    super.onResume();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.CalendarTabletActivity
 * JD-Core Version:    0.7.0.1
 */