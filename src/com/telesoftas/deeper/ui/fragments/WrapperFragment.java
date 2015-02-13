package com.telesoftas.deeper.ui.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.telesoftas.deeper.DeeperApplication;
import com.telesoftas.deeper.database.DeeperDatabase;

public class WrapperFragment
  extends Fragment
{
  protected DeeperDatabase h;
  protected boolean i;
  
  protected int a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    if ((paramViewGroup instanceof LinearLayout))
    {
      if (paramBoolean)
      {
        paramViewGroup.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 9.0F));
        return 0;
      }
      paramViewGroup.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 7.7F));
      return 0;
    }
    return -1;
  }
  
  public void a(Activity paramActivity)
  {
    this.i = ((DeeperApplication)paramActivity.getApplicationContext()).c();
    this.h = ((DeeperApplication)paramActivity.getApplicationContext()).a();
    super.a(paramActivity);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.WrapperFragment
 * JD-Core Version:    0.7.0.1
 */