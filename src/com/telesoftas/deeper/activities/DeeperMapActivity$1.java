package com.telesoftas.deeper.activities;

import android.view.View;
import android.widget.ScrollView;
import com.telesoftas.deeper.ui.views.ObservableScrollView.ScrollViewListener;

class DeeperMapActivity$1
  implements ObservableScrollView.ScrollViewListener
{
  DeeperMapActivity$1(DeeperMapActivity paramDeeperMapActivity) {}
  
  public void a(ScrollView paramScrollView, int paramInt1, int paramInt2)
  {
    View localView1 = this.a.findViewById(2131296482);
    View localView2 = this.a.findViewById(2131296484);
    if (paramScrollView.getChildCount() == 0)
    {
      localView1.setVisibility(8);
      localView2.setVisibility(8);
      return;
    }
    int i = paramScrollView.getChildAt(0).getHeight();
    int j = paramScrollView.getScrollY();
    if (i <= paramInt2)
    {
      localView1.setVisibility(8);
      localView2.setVisibility(8);
      return;
    }
    if (j == 0)
    {
      localView1.setVisibility(4);
      localView2.setVisibility(0);
      return;
    }
    if (j + paramInt2 == i)
    {
      localView1.setVisibility(0);
      localView2.setVisibility(4);
      return;
    }
    localView1.setVisibility(0);
    localView2.setVisibility(0);
  }
  
  public void b(ScrollView paramScrollView, int paramInt1, int paramInt2)
  {
    View localView1 = this.a.findViewById(2131296482);
    View localView2 = this.a.findViewById(2131296484);
    int i = paramScrollView.getChildAt(0).getHeight();
    int j = paramScrollView.getHeight();
    if (paramInt2 == 0)
    {
      localView1.setVisibility(4);
      localView2.setVisibility(0);
      return;
    }
    if (j + paramInt2 == i)
    {
      localView1.setVisibility(0);
      localView2.setVisibility(4);
      return;
    }
    localView1.setVisibility(0);
    localView2.setVisibility(0);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DeeperMapActivity.1
 * JD-Core Version:    0.7.0.1
 */