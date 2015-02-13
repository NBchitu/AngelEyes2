package com.telesoftas.deeper.ui.views;

import com.fridaylab.astronomy.AstronomyTools;
import com.fridaylab.util.AsyncDelegate;

public class CalendarView$CalendarAsyncTask
  extends AsyncDelegate
{
  private int[] b;
  
  public CalendarView$CalendarAsyncTask(CalendarView paramCalendarView) {}
  
  protected void d()
  {
    int[] arrayOfInt = new int[42];
    AstronomyTools.a(this.a.a(0, 0), CalendarView.a(this.a), arrayOfInt);
    this.b = arrayOfInt;
  }
  
  protected void onPostExecute(Object paramObject)
  {
    CalendarView.a(this.a, this.b);
    this.a.invalidate();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.CalendarView.CalendarAsyncTask
 * JD-Core Version:    0.7.0.1
 */