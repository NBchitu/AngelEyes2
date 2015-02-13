package com.telesoftas.deeper.ui.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.telesoftas.deeper.activities.LogActivity;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.deeper.ui.views.CalendarView.OnCellSelectedListener;
import com.telesoftas.deeper.ui.views.CalendarViewAdapter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarFragment
  extends WrapperFragment
  implements CalendarView.OnCellSelectedListener
{
  public CalendarView.OnCellSelectedListener a;
  public boolean b = false;
  private CalendarViewAdapter c;
  private ListView d;
  private GregorianCalendar e;
  private LocationData f;
  
  private void P()
  {
    LinearLayout localLinearLayout1 = (LinearLayout)this.d.getChildAt(0);
    int i = Math.abs(localLinearLayout1.getTop());
    int j = Math.abs(localLinearLayout1.getBottom());
    LinearLayout localLinearLayout2 = (LinearLayout)a(this.d, this.d.getFirstVisiblePosition());
    if (i >= j) {
      this.d.smoothScrollBy(localLinearLayout2.getBottom(), i * 3);
    }
    for (int k = 1 + this.d.getFirstVisiblePosition();; k = this.d.getFirstVisiblePosition())
    {
      b(k);
      return;
      this.d.smoothScrollBy(localLinearLayout2.getTop(), j * 3);
    }
  }
  
  private View a(ListView paramListView, int paramInt)
  {
    int i = paramInt - (paramListView.getFirstVisiblePosition() - paramListView.getHeaderViewsCount());
    if ((i < 0) || (i >= paramListView.getChildCount())) {
      return null;
    }
    return paramListView.getChildAt(i);
  }
  
  private LocationData a(LocationData paramLocationData)
  {
    if ((paramLocationData != null) && (paramLocationData.c() != -666.0D) && (paramLocationData.e() != -666.0D)) {
      return paramLocationData;
    }
    return this.f;
  }
  
  private void b()
  {
    FragmentActivity localFragmentActivity = i();
    if ((localFragmentActivity instanceof LogActivity)) {
      this.c = ((LogActivity)localFragmentActivity).j();
    }
  }
  
  private void b(int paramInt)
  {
    this.e = this.c.b(paramInt);
    this.c.a(this.e);
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    a(paramViewGroup, false);
    if (paramBundle != null)
    {
      this.e = ((GregorianCalendar)paramBundle.getSerializable("current_date"));
      this.b = paramBundle.getBoolean("pointed");
      this.f = ((LocationData)paramBundle.getParcelable("current_location"));
    }
    Bundle localBundle = h();
    this.b = ((Boolean)localBundle.get("pointed")).booleanValue();
    this.f = a((LocationData)localBundle.getParcelable("location"));
    b();
    this.d = new ListView(i());
    this.d.setDivider(null);
    this.d.setVerticalFadingEdgeEnabled(false);
    com.telesoftas.deeper.activities.CalendarTabletActivity.n = false;
    if (this.c != null)
    {
      this.c.a(this.f);
      this.c.a(this);
      this.d.setAdapter(this.c);
      if (this.e == null) {
        this.e = new GregorianCalendar();
      }
      if ((this.c.a() == null) || (!this.b)) {
        break label253;
      }
      a(this.c.a());
    }
    for (;;)
    {
      GestureDetector localGestureDetector = new GestureDetector(i(), new CalendarFragment.MyOnGestureListener(this));
      this.d.setOnTouchListener(new CalendarFragment.1(this, localGestureDetector));
      return this.d;
      label253:
      a(this.e);
    }
  }
  
  public void a()
  {
    this.c.notifyDataSetChanged();
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    try
    {
      this.a = ((CalendarView.OnCellSelectedListener)paramActivity);
      return;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new ClassCastException(paramActivity.toString() + " must implement OnCellSelectedListener");
    }
  }
  
  public void a(Calendar paramCalendar)
  {
    if (this.c != null)
    {
      int i = this.c.a(paramCalendar);
      this.d.setSelection(i);
    }
  }
  
  public void a(GregorianCalendar paramGregorianCalendar, boolean paramBoolean)
  {
    com.telesoftas.deeper.activities.CalendarTabletActivity.n = true;
  }
  
  public void e(Bundle paramBundle)
  {
    paramBundle.putSerializable("current_date", this.e);
    paramBundle.putBoolean("pointed", this.b);
    paramBundle.putParcelable("current_location", this.f);
    super.e(paramBundle);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.CalendarFragment
 * JD-Core Version:    0.7.0.1
 */