package com.telesoftas.deeper.ui.views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class CalendarTabletPagerAdapter
  extends FragmentStatePagerAdapter
{
  private List<Fragment> a = new ArrayList();
  
  public CalendarTabletPagerAdapter(FragmentManager paramFragmentManager, List<Fragment> paramList)
  {
    super(paramFragmentManager);
    this.a = paramList;
  }
  
  public Fragment a(int paramInt)
  {
    return (Fragment)this.a.get(paramInt);
  }
  
  public int b()
  {
    return this.a.size();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.CalendarTabletPagerAdapter
 * JD-Core Version:    0.7.0.1
 */