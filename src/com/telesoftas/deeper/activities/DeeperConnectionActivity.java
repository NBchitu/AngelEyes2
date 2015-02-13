package com.telesoftas.deeper.activities;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import com.crashlytics.android.Crashlytics;
import com.fridaylab.deeper.ui.ViewTools;
import com.fridaylab.deeper.ui.slideshow.SimpleViewPagerIndicator;
import com.fridaylab.deeper.ui.slideshow.SlideshowPageFragment;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.utilities.deeper.SettingsUtils;
import java.util.concurrent.Callable;

public class DeeperConnectionActivity
  extends TrackedActivity
  implements ViewPager.OnPageChangeListener, Callable<Boolean>
{
  private View n;
  private View o;
  private int p;
  private ViewPager q;
  private DeeperConnectionActivity.SlideshowPagerAdapter r;
  private boolean s = false;
  private boolean t = false;
  private Long u = null;
  private boolean v;
  private final View.OnClickListener w = new DeeperConnectionActivity.1(this);
  private final View.OnClickListener x = new DeeperConnectionActivity.2(this);
  private final View.OnClickListener y = new DeeperConnectionActivity.3(this);
  private final BroadcastReceiver z = new DeeperConnectionActivity.4(this);
  
  private void h()
  {
    startActivity(a(this, false, null));
    finish();
  }
  
  public void a(int paramInt)
  {
    if (paramInt > 1)
    {
      this.o.setVisibility(4);
      localSlideshowPageFragment = this.r.d(1);
      if (localSlideshowPageFragment != null) {
        localSlideshowPageFragment.b(2131296554).setVisibility(0);
      }
    }
    while (paramInt >= 1)
    {
      SlideshowPageFragment localSlideshowPageFragment;
      return;
    }
    this.o.setVisibility(0);
  }
  
  public void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if ((this.s) && (paramInt1 < 1))
    {
      this.o.setVisibility(0);
      localSlideshowPageFragment = this.r.d(1);
      if (localSlideshowPageFragment != null)
      {
        localView = localSlideshowPageFragment.b(2131296554);
        localView.setVisibility(4);
        localView.setOnClickListener(null);
      }
      this.s = false;
    }
    while (paramInt1 <= 1)
    {
      SlideshowPageFragment localSlideshowPageFragment;
      View localView;
      return;
    }
    this.o.setVisibility(4);
  }
  
  public void b(int paramInt)
  {
    if (paramInt != 0)
    {
      SlideshowPageFragment localSlideshowPageFragment5 = this.r.d(this.p);
      if (localSlideshowPageFragment5 != null) {
        localSlideshowPageFragment5.P();
      }
    }
    SlideshowPageFragment localSlideshowPageFragment3;
    do
    {
      int i;
      do
      {
        return;
        i = this.q.getCurrentItem();
        SlideshowPageFragment localSlideshowPageFragment1 = this.r.d(i);
        if (localSlideshowPageFragment1 != null)
        {
          if (i != this.p)
          {
            SlideshowPageFragment localSlideshowPageFragment4 = this.r.d(this.p);
            if (localSlideshowPageFragment4 != null) {
              localSlideshowPageFragment4.Q();
            }
            this.p = i;
          }
          m().a(MapBuilder.a("Merchandise", "slide" + (1 + this.p), null, null).a());
          localSlideshowPageFragment1.b();
        }
        if (i < 1) {
          break;
        }
        this.o.setVisibility(4);
      } while (i != 1);
      localSlideshowPageFragment3 = this.r.d(i);
    } while (localSlideshowPageFragment3 == null);
    this.s = true;
    View localView2 = localSlideshowPageFragment3.b(2131296554);
    localView2.setVisibility(0);
    localView2.setOnClickListener(this.x);
    return;
    this.o.setVisibility(0);
    SlideshowPageFragment localSlideshowPageFragment2 = this.r.d(1);
    if (localSlideshowPageFragment2 != null)
    {
      View localView1 = localSlideshowPageFragment2.b(2131296554);
      localView1.setVisibility(4);
      localView1.setOnClickListener(null);
    }
    this.s = false;
  }
  
  public Boolean g()
  {
    float f1 = getResources().getDisplayMetrics().density;
    this.v = false;
    int i = this.n.getWidth();
    int j = this.n.getHeight();
    if ((i == 0) || (j == 0)) {
      return Boolean.TRUE;
    }
    if (j > i) {}
    for (;;)
    {
      int m = j / 16 - ViewTools.a(40.0F * f1);
      if (m < ViewTools.a(10.0F * f1)) {
        m = 0;
      }
      if (m > ViewTools.a(64.0F * f1)) {}
      for (int i1 = ViewTools.a(64.0F * f1);; i1 = m)
      {
        float f3;
        int i3;
        if (i1 > 0)
        {
          f3 = (j - 2.0F * i1) / (i - 2.0F * i1);
          if (f3 > 1.8F)
          {
            float f5 = 1.75F * (i - i1 * 2);
            i3 = ViewTools.a((j - f5) / 2.0F);
          }
        }
        for (;;)
        {
          this.n.setPadding(i3, i1, i3, i1);
          j -= i3 * 2;
          i -= i1 * 2;
          for (;;)
          {
            this.r = new DeeperConnectionActivity.SlideshowPagerAdapter(f(), j, i);
            this.q.setAdapter(this.r);
            SimpleViewPagerIndicator localSimpleViewPagerIndicator = (SimpleViewPagerIndicator)findViewById(2131296545);
            localSimpleViewPagerIndicator.setViewPager(this.q);
            localSimpleViewPagerIndicator.a();
            localSimpleViewPagerIndicator.setOnPageChangeListener(this);
            SlideshowPageFragment localSlideshowPageFragment = this.r.d(this.p);
            if (localSlideshowPageFragment != null) {
              localSlideshowPageFragment.b();
            }
            m().a(MapBuilder.a("Merchandise", "slide1", null, null).a());
            return Boolean.FALSE;
            if (f3 >= 1.6D) {
              break label402;
            }
            float f4 = 1.6F * (j - i1 * 2);
            int i4 = ViewTools.a((i - f4) / 2.0F);
            int i5 = i1;
            i1 = i4;
            i3 = i5;
            break;
            if (j > 1.8F * i)
            {
              float f2 = 1.6F * i;
              int i2 = ViewTools.a((j - f2) / 2.0F);
              this.n.setPadding(i2, 0, i2, 0);
              j -= i2 * 2;
            }
            else
            {
              this.n.setBackgroundResource(0);
            }
          }
          label402:
          i3 = i1;
        }
      }
      int k = j;
      j = i;
      i = k;
    }
  }
  
  public void onBackPressed()
  {
    if (this.q.getCurrentItem() == 0)
    {
      super.onBackPressed();
      return;
    }
    this.q.setCurrentItem(-1 + this.q.getCurrentItem());
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    boolean bool = SettingsUtils.e(this);
    if (!bool)
    {
      SharedPreferences localSharedPreferences = SettingsUtils.a(this);
      long l = System.currentTimeMillis();
      if (l < 604800000L + localSharedPreferences.getLong("lastSlideshowTimestamp", l - 1209600000L))
      {
        i = 1;
        if (i == 0) {
          localSharedPreferences.edit().putLong("lastSlideshowTimestamp", l).apply();
        }
        if (BluetoothAdapter.getDefaultAdapter() != null) {}
      }
    }
    for (int i = 1;; i = 1)
    {
      if ((bool) || (i != 0))
      {
        Crashlytics.a("AfterSlideShow", false);
        h();
      }
      do
      {
        return;
        i = 0;
        break;
        Crashlytics.a("AfterSlideShow", true);
        setContentView(2130903090);
        this.n = findViewById(2131296340);
        this.v = true;
        ViewTools.a(this.n, this);
        this.q = ((ViewPager)findViewById(2131296544));
        this.o = findViewById(2131296546);
        this.o.setOnClickListener(this.w);
        findViewById(2131296342).setOnClickListener(this.y);
        if (paramBundle == null) {
          break label232;
        }
        this.p = paramBundle.getInt("currentPage");
      } while (this.p < 1);
      this.o.setVisibility(4);
      return;
      label232:
      this.p = 0;
      return;
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    LocalBroadcastManager.a(this).a(this.z);
  }
  
  protected void onResume()
  {
    super.onResume();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("exitOnResume");
    LocalBroadcastManager.a(this).a(this.z, localIntentFilter);
    if (this.t)
    {
      startActivity(a(this, false, null));
      this.t = false;
      this.u = Long.valueOf(System.nanoTime());
    }
    do
    {
      SlideshowPageFragment localSlideshowPageFragment;
      do
      {
        do
        {
          return;
          if (this.u == null) {
            break;
          }
        } while (System.nanoTime() - this.u.longValue() <= 60000000000L);
        finish();
        return;
        if (this.r == null) {
          break;
        }
        localSlideshowPageFragment = this.r.d(this.p);
      } while (localSlideshowPageFragment == null);
      localSlideshowPageFragment.b();
      return;
    } while (this.v);
    ViewTools.a(this.n, this);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putInt("currentPage", this.p);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DeeperConnectionActivity
 * JD-Core Version:    0.7.0.1
 */