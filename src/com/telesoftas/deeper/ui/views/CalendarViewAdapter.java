package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.location.Location;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.deeper.database.LocationData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarViewAdapter
  extends BaseAdapter
{
  private final Context a;
  private final LayoutInflater b;
  private final ArrayList<CalendarView.OnCellSelectedListener> c = new ArrayList();
  private boolean d = false;
  private final DeeperDatabase e;
  private final SparseArray<View> f = new SparseArray();
  private final SparseArray<CalendarView> g = new SparseArray();
  private Location h;
  private CalendarView i;
  private final GregorianCalendar j = new GregorianCalendar(1900, 0, 1);
  private GregorianCalendar k;
  private boolean l = false;
  private Calendar m = null;
  
  public CalendarViewAdapter(Context paramContext, CalendarView.OnCellSelectedListener paramOnCellSelectedListener, boolean paramBoolean1, DeeperDatabase paramDeeperDatabase, boolean paramBoolean2)
  {
    this.a = paramContext;
    this.c.add(paramOnCellSelectedListener);
    this.b = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    this.d = paramBoolean1;
    this.e = paramDeeperDatabase;
    this.l = paramBoolean2;
  }
  
  private boolean a(Calendar paramCalendar1, Calendar paramCalendar2)
  {
    return (paramCalendar1.get(1) == paramCalendar2.get(1)) && (paramCalendar1.get(2) == paramCalendar2.get(2));
  }
  
  public int a(Calendar paramCalendar)
  {
    return 12 * paramCalendar.get(1) + paramCalendar.get(2) - (12 * this.j.get(1) + this.j.get(2));
  }
  
  public View a(int paramInt)
  {
    return (View)this.g.get(paramInt);
  }
  
  public Calendar a()
  {
    return this.k;
  }
  
  public void a(LocationData paramLocationData)
  {
    if (paramLocationData != null)
    {
      this.h = new Location(paramLocationData.b());
      this.h.setLatitude(paramLocationData.c());
      this.h.setLongitude(paramLocationData.e());
    }
  }
  
  public void a(CalendarView.OnCellSelectedListener paramOnCellSelectedListener)
  {
    this.c.add(paramOnCellSelectedListener);
  }
  
  public void a(GregorianCalendar paramGregorianCalendar)
  {
    this.k = paramGregorianCalendar;
  }
  
  public boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public GregorianCalendar b(int paramInt)
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar(this.j.get(1), this.j.get(2), this.j.get(5));
    localGregorianCalendar.add(2, paramInt);
    return localGregorianCalendar;
  }
  
  public void b(Calendar paramCalendar)
  {
    this.m = paramCalendar;
  }
  
  public int getCount()
  {
    return 2147483647;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    LinearLayout.LayoutParams localLayoutParams;
    LinearLayout localLinearLayout;
    TextView localTextView;
    GregorianCalendar localGregorianCalendar1;
    int n;
    int i2;
    if (this.l)
    {
      localView = this.b.inflate(2130903044, null);
      localLayoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0F);
      localLinearLayout = (LinearLayout)localView.findViewById(2131296286);
      localTextView = (TextView)localView.findViewById(2131296285);
      localGregorianCalendar1 = new GregorianCalendar();
      this.k = new GregorianCalendar();
      n = this.j.get(1);
      i1 = this.j.get(2);
      i2 = paramInt;
      label98:
      if (i2 == 0) {
        break label143;
      }
      if (i1 != 11) {
        break label137;
      }
      n++;
    }
    label137:
    for (int i1 = 0;; i1++)
    {
      i2--;
      break label98;
      localView = this.b.inflate(2130903042, null);
      break;
    }
    label143:
    this.k.set(5, 1);
    this.k.set(1, n);
    this.k.set(2, i1);
    localGregorianCalendar1.get(1);
    int i3 = this.k.get(2);
    String str = new java.text.DateFormatSymbols().getMonths()[i3];
    if ((this.k.get(1) == localGregorianCalendar1.get(1)) && (this.k.get(2) == localGregorianCalendar1.get(2))) {}
    for (int i4 = localGregorianCalendar1.get(5);; i4 = 0)
    {
      boolean bool = this.d;
      ArrayList localArrayList = null;
      if (!bool) {
        localArrayList = this.e.b(this.k);
      }
      this.i = new CalendarView(this.a, this.k, localArrayList, i4, this.d, this.h);
      this.i.a();
      localView.setTag(2131296286, this.i);
      for (int i5 = 0; i5 < this.c.size(); i5++) {
        this.i.setOnCellSelectedListener((CalendarView.OnCellSelectedListener)this.c.get(i5));
      }
    }
    localTextView.setText(str + " " + this.k.get(1));
    localLinearLayout.addView(this.i, localLayoutParams);
    if (this.l)
    {
      localView.setLayoutParams(new AbsListView.LayoutParams(-1, paramViewGroup.getHeight() / 2));
      this.f.put(paramInt, localView);
      this.g.put(paramInt, this.i);
      if (this.f.get(paramInt + 2) != null)
      {
        this.f.remove(paramInt + 2);
        this.g.remove(paramInt + 2);
      }
      if (this.f.get(paramInt - 2) != null)
      {
        this.f.remove(paramInt - 2);
        this.g.remove(paramInt - 2);
      }
      if ((this.m == null) || (!a(this.k, this.m))) {
        break label585;
      }
      this.i.setSelectedDay(this.m);
    }
    label585:
    GregorianCalendar localGregorianCalendar2;
    do
    {
      return localView;
      localView.setLayoutParams(new AbsListView.LayoutParams(-1, paramViewGroup.getHeight()));
      break;
      localGregorianCalendar2 = new GregorianCalendar();
    } while ((this.m != null) || (!a(this.k, localGregorianCalendar2)));
    this.i.setSelectedDay(localGregorianCalendar2);
    return localView;
  }
  
  public boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.CalendarViewAdapter
 * JD-Core Version:    0.7.0.1
 */