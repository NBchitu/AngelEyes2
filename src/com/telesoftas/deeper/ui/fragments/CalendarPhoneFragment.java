package com.telesoftas.deeper.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ViewSwitcher;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.deeper.activities.CalendarTabletActivity;
import com.telesoftas.deeper.ui.views.CalendarView;
import com.telesoftas.deeper.ui.views.CalendarViewAdapter;
import com.telesoftas.deeper.ui.views.EvaluationViewAdapter;
import com.telesoftas.utilities.CalendarUtils;
import java.util.Calendar;

public class CalendarPhoneFragment
  extends CalendarBaseFragment
{
  private ViewSwitcher aj;
  
  private void a(boolean paramBoolean)
  {
    if (i() == null) {
      return;
    }
    ((CalendarTabletActivity)i()).o = paramBoolean;
  }
  
  public void Q()
  {
    if ((this.aj != null) && (S()))
    {
      this.aj.showPrevious();
      a(false);
    }
  }
  
  public boolean R()
  {
    if ((this.aj != null) && (S()))
    {
      this.aj.showPrevious();
      a(false);
      return false;
    }
    return true;
  }
  
  public boolean S()
  {
    return this.aj.getCurrentView() == this.d.getParent();
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.g = paramLayoutInflater.inflate(2130903053, null);
    this.aj = ((ViewSwitcher)this.g.findViewById(2131296335));
    this.e = new CalendarViewAdapter(i(), this, true, this.h, false);
    this.f = new EvaluationViewAdapter(i(), this.a, false);
    return super.a(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void a()
  {
    if ((this.aj != null) && (!S()) && (P() != null))
    {
      this.f = new EvaluationViewAdapter(i(), P(), false);
      this.f.a(this.b);
      this.d.setAdapter(this.f);
      this.aj.showNext();
      a(true);
      Long localLong = CalendarUtils.c(P());
      EasyTracker.a(i()).a(MapBuilder.a("Calendar", "review_date", "fishing", localLong).a());
    }
  }
  
  protected void a(Calendar paramCalendar)
  {
    if (this.e != null)
    {
      this.e.b(paramCalendar);
      for (int i = 0; i < this.c.getChildCount(); i++) {
        ((CalendarView)((ViewGroup)((ViewGroup)this.c.getChildAt(i)).getChildAt(2)).getChildAt(0)).setSelectedDay(paramCalendar);
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.CalendarPhoneFragment
 * JD-Core Version:    0.7.0.1
 */