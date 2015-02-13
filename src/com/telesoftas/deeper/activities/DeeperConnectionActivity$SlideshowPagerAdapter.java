package com.telesoftas.deeper.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.fridaylab.deeper.ui.slideshow.SlideshowPage1;
import com.fridaylab.deeper.ui.slideshow.SlideshowPage2;
import com.fridaylab.deeper.ui.slideshow.SlideshowPage4;
import com.fridaylab.deeper.ui.slideshow.SlideshowPageFragment;

class DeeperConnectionActivity$SlideshowPagerAdapter
  extends FragmentStatePagerAdapter
{
  private final SparseArray<SlideshowPageFragment> a = new SparseArray();
  private final int b;
  private final int c;
  
  public DeeperConnectionActivity$SlideshowPagerAdapter(FragmentManager paramFragmentManager, int paramInt1, int paramInt2)
  {
    super(paramFragmentManager);
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public Fragment a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return SlideshowPage4.a(this.b, this.c);
    case 0: 
      return SlideshowPage1.a(this.b, this.c);
    }
    return SlideshowPage2.a(this.b, this.c);
  }
  
  public Object a(ViewGroup paramViewGroup, int paramInt)
  {
    Object localObject = super.a(paramViewGroup, paramInt);
    this.a.put(paramInt, (SlideshowPageFragment)localObject);
    return localObject;
  }
  
  public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    this.a.remove(paramInt);
    super.a(paramViewGroup, paramInt, paramObject);
  }
  
  public int b()
  {
    return 3;
  }
  
  public SlideshowPageFragment d(int paramInt)
  {
    return (SlideshowPageFragment)this.a.get(paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DeeperConnectionActivity.SlideshowPagerAdapter
 * JD-Core Version:    0.7.0.1
 */