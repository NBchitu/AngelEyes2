package com.telesoftas.deeper.ui.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.telesoftas.deeper.DeeperApplication;
import com.telesoftas.deeper.activities.CalendarTabletActivity;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.deeper.ui.views.CalendarView.OnCellSelectedListener;
import com.telesoftas.deeper.ui.views.CalendarViewAdapter;
import com.telesoftas.deeper.ui.views.EvaluationViewAdapter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class CalendarBaseFragment
  extends WrapperFragment
  implements CalendarView.OnCellSelectedListener
{
  protected GregorianCalendar a = new GregorianCalendar();
  private CalendarTabletActivity aj;
  private GestureDetector ak;
  private GestureDetector al;
  protected LocationData b;
  protected ListView c;
  protected ListView d;
  protected CalendarViewAdapter e;
  protected EvaluationViewAdapter f;
  protected View g;
  
  private int Q()
  {
    if (this.aj != null) {
      return this.aj.g();
    }
    return -1;
  }
  
  private void a(ListView paramListView)
  {
    View localView1 = paramListView.getChildAt(0);
    int i = Math.abs(localView1.getTop());
    int j = Math.abs(localView1.getBottom());
    View localView2 = b(paramListView, paramListView.getFirstVisiblePosition());
    if (i >= j) {
      paramListView.smoothScrollBy(localView2.getBottom(), i * 3);
    }
    for (int k = 1 + paramListView.getFirstVisiblePosition();; k = paramListView.getFirstVisiblePosition())
    {
      a(paramListView, k);
      return;
      paramListView.smoothScrollBy(localView2.getTop(), j * 3);
    }
  }
  
  private void a(ListView paramListView, int paramInt)
  {
    if (paramListView == this.c) {
      c(paramInt);
    }
    while ((this.i) || (paramListView != this.d)) {
      return;
    }
    b(this.f.a(paramInt));
  }
  
  private View b(ListView paramListView, int paramInt)
  {
    int i = paramInt - (paramListView.getFirstVisiblePosition() - paramListView.getHeaderViewsCount());
    if ((i < 0) || (i >= paramListView.getChildCount())) {
      return null;
    }
    return paramListView.getChildAt(i);
  }
  
  private void b(GregorianCalendar paramGregorianCalendar)
  {
    if (this.aj != null) {
      this.aj.a(paramGregorianCalendar);
    }
  }
  
  private void c(int paramInt)
  {
    if (this.aj != null) {
      this.aj.c(paramInt);
    }
  }
  
  public GregorianCalendar P()
  {
    if (this.aj != null) {
      return this.aj.h();
    }
    return null;
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.b == null) {
      this.b = ((LocationData)h().getParcelable("location"));
    }
    this.c = ((ListView)this.g.findViewById(2131296336));
    this.d = ((ListView)this.g.findViewById(2131296337));
    this.h = ((DeeperApplication)i().getApplicationContext()).a();
    this.e.a(this.b);
    this.c.setAdapter(this.e);
    this.c.setVerticalFadingEdgeEnabled(false);
    this.f.a(this.b);
    this.d.setAdapter(this.f);
    this.d.setVerticalFadingEdgeEnabled(false);
    this.ak = new GestureDetector(i(), new CalendarBaseFragment.ListViewOnGestureListener(this, this.c));
    this.al = new GestureDetector(i(), new CalendarBaseFragment.ListViewOnGestureListener(this, this.d));
    this.c.setOnTouchListener(new CalendarBaseFragment.ListViewOnTouchListener(this, this.ak));
    this.d.setOnTouchListener(new CalendarBaseFragment.ListViewOnTouchListener(this, this.al));
    return this.g;
  }
  
  protected abstract void a();
  
  public void a(Activity paramActivity)
  {
    this.aj = ((CalendarTabletActivity)paramActivity);
    super.a(paramActivity);
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    this.e.notifyDataSetChanged();
    int i = Q();
    if (i == -1)
    {
      i = this.e.a(this.a);
      c(i);
    }
    if (P() == null) {
      b(this.a);
    }
    this.c.setSelection(i);
    super.a(paramView, paramBundle);
  }
  
  public void a(LocationData paramLocationData)
  {
    this.b = paramLocationData;
    if (this.e != null)
    {
      this.e.a(paramLocationData);
      this.e.notifyDataSetChanged();
    }
    if (this.f != null)
    {
      this.f.a(paramLocationData);
      this.f.notifyDataSetChanged();
    }
  }
  
  protected abstract void a(Calendar paramCalendar);
  
  public void a(GregorianCalendar paramGregorianCalendar)
  {
    a(paramGregorianCalendar);
    if (this.f != null)
    {
      int i = this.f.a(paramGregorianCalendar);
      this.d.setSelection(i);
    }
  }
  
  public void a(GregorianCalendar paramGregorianCalendar, boolean paramBoolean)
  {
    CalendarTabletActivity.n = true;
    GregorianCalendar localGregorianCalendar = (GregorianCalendar)paramGregorianCalendar.clone();
    b(localGregorianCalendar);
    a();
    a(localGregorianCalendar);
  }
  
  public LocationData b()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    if ((this.c != null) && (paramInt != -1)) {
      this.c.setSelection(paramInt);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.CalendarBaseFragment
 * JD-Core Version:    0.7.0.1
 */