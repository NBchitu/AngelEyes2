package com.telesoftas.deeper.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.deeper.ui.views.CalendarView;
import com.telesoftas.deeper.ui.views.CalendarViewAdapter;
import com.telesoftas.deeper.ui.views.EvaluationViewAdapter;
import com.telesoftas.utilities.CalendarUtils;
import java.util.Calendar;

public class CalendarTabletFragment
  extends CalendarBaseFragment
{
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.g = paramLayoutInflater.inflate(2130903054, null);
    this.e = new CalendarViewAdapter(i(), this, true, this.h, true);
    this.f = new EvaluationViewAdapter(i(), this.a, true);
    return super.a(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void a()
  {
    if (P() != null)
    {
      EasyTracker.a(i()).a(MapBuilder.a("Calendar", "review_date", "fishing", CalendarUtils.c(P())).a());
      this.f = new EvaluationViewAdapter(i(), P(), true);
      this.f.a(this.b);
      this.d.setAdapter(this.f);
    }
  }
  
  protected void a(Calendar paramCalendar)
  {
    if (this.e != null)
    {
      this.e.b(paramCalendar);
      for (int i = 0; i < this.c.getChildCount(); i++) {
        ((CalendarView)((ViewGroup)((ViewGroup)this.c.getChildAt(i)).getChildAt(1)).getChildAt(0)).setSelectedDay(paramCalendar);
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.CalendarTabletFragment
 * JD-Core Version:    0.7.0.1
 */