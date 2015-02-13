package com.telesoftas.deeper.ui.views;

import android.app.Activity;
import android.location.Location;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import com.telesoftas.deeper.database.LocationData;
import java.util.GregorianCalendar;

public class EvaluationViewAdapter
  extends BaseAdapter
{
  private final GregorianCalendar a;
  private final SparseArray<View> b = new SparseArray();
  private final Activity c;
  private Location d;
  private int e = 4;
  private final boolean f;
  
  public EvaluationViewAdapter(Activity paramActivity, GregorianCalendar paramGregorianCalendar, boolean paramBoolean)
  {
    this.c = paramActivity;
    this.f = paramBoolean;
    this.a = new GregorianCalendar(paramGregorianCalendar.get(1), paramGregorianCalendar.get(2), paramGregorianCalendar.get(5));
    if (!paramBoolean)
    {
      this.a.add(6, -16000);
      return;
    }
    this.e = 7;
    this.a.add(5, -3);
  }
  
  public int a(GregorianCalendar paramGregorianCalendar)
  {
    if (this.f) {
      return 0;
    }
    GregorianCalendar localGregorianCalendar = new GregorianCalendar(paramGregorianCalendar.get(1), paramGregorianCalendar.get(2), paramGregorianCalendar.get(5));
    long l = this.a.getTimeInMillis();
    return (int)a(localGregorianCalendar.getTimeInMillis() - l) / this.e;
  }
  
  public long a(long paramLong)
  {
    return Math.round(paramLong / 86400000.0D);
  }
  
  public GregorianCalendar a(int paramInt)
  {
    GregorianCalendar localGregorianCalendar = (GregorianCalendar)this.a.clone();
    localGregorianCalendar.add(6, paramInt * this.e);
    return localGregorianCalendar;
  }
  
  public void a(LocationData paramLocationData)
  {
    if (paramLocationData != null)
    {
      this.d = new Location(paramLocationData.b());
      this.d.setLatitude(paramLocationData.c());
      this.d.setLongitude(paramLocationData.e());
    }
  }
  
  public boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public int getCount()
  {
    if (this.f) {
      return 1;
    }
    return 2147483647;
  }
  
  public Object getItem(int paramInt)
  {
    return this.b.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if (this.f)
    {
      localObject = new EvaluationTableView(this.c, a(paramInt), this.e, this.d);
      ((EvaluationTableView)localObject).b();
    }
    for (;;)
    {
      ((View)localObject).setLayoutParams(new AbsListView.LayoutParams(-1, paramViewGroup.getHeight()));
      this.b.put(paramInt, localObject);
      if (this.b.get(paramInt + 2) != null) {
        this.b.remove(paramInt + 2);
      }
      if (this.b.get(paramInt - 2) != null) {
        this.b.remove(paramInt - 2);
      }
      return localObject;
      localObject = new EvaluationTablePhoneView(this.c, a(paramInt), this.e, this.d);
      ((EvaluationTablePhoneView)localObject).b();
    }
  }
  
  public boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.EvaluationViewAdapter
 * JD-Core Version:    0.7.0.1
 */