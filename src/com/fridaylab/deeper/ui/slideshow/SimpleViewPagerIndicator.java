package com.fridaylab.deeper.ui.slideshow;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class SimpleViewPagerIndicator
  extends LinearLayout
  implements ViewPager.OnPageChangeListener
{
  private final Context a;
  private ViewPager b;
  private ViewPager.OnPageChangeListener c;
  private LinearLayout d;
  private List<ImageView> e;
  
  public SimpleViewPagerIndicator(Context paramContext)
  {
    super(paramContext);
    this.a = paramContext;
    b();
  }
  
  public SimpleViewPagerIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext;
    b();
  }
  
  private void b()
  {
    LayoutInflater localLayoutInflater = (LayoutInflater)this.a.getSystemService("layout_inflater");
    if (localLayoutInflater != null)
    {
      localLayoutInflater.inflate(2130903091, this);
      this.d = ((LinearLayout)findViewById(2131296574));
      this.e = new ArrayList();
    }
  }
  
  private void setCurrentItem(int paramInt)
  {
    if ((this.b != null) && (this.b.getAdapter() != null))
    {
      int i = this.b.getAdapter().b();
      int j = 0;
      if (j < i)
      {
        ImageView localImageView = (ImageView)this.e.get(j);
        if (localImageView != null)
        {
          if (j != paramInt) {
            break label73;
          }
          localImageView.setImageResource(2130837550);
        }
        for (;;)
        {
          j++;
          break;
          label73:
          localImageView.setImageResource(2130837551);
        }
      }
    }
  }
  
  public void a()
  {
    if ((this.b != null) && (this.b.getAdapter() != null))
    {
      this.d.removeAllViews();
      this.e.removeAll(this.e);
      int i = 0;
      if (i < this.b.getAdapter().b())
      {
        ImageView localImageView = new ImageView(this.a);
        if (i == this.b.getCurrentItem()) {
          localImageView.setImageResource(2130837550);
        }
        for (;;)
        {
          localImageView.setTag(Integer.valueOf(i));
          this.e.add(localImageView);
          this.d.addView(localImageView);
          i++;
          break;
          localImageView.setImageResource(2130837551);
        }
      }
    }
  }
  
  public void a(int paramInt)
  {
    setCurrentItem(paramInt);
    if (this.c != null) {
      this.c.a(paramInt);
    }
  }
  
  public void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (this.c != null) {
      this.c.a(paramInt1, paramFloat, paramInt2);
    }
  }
  
  public void b(int paramInt)
  {
    if (this.c != null) {
      this.c.b(paramInt);
    }
  }
  
  public ViewPager.OnPageChangeListener getOnPageChangeListener()
  {
    return this.c;
  }
  
  public ViewPager getViewPager()
  {
    return this.b;
  }
  
  public void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    this.c = paramOnPageChangeListener;
  }
  
  public void setViewPager(ViewPager paramViewPager)
  {
    this.b = paramViewPager;
    this.b.setOnPageChangeListener(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.slideshow.SimpleViewPagerIndicator
 * JD-Core Version:    0.7.0.1
 */