package com.telesoftas.deeper.activities;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;

class SettingsDeepersActivity$3
  implements View.OnTouchListener
{
  SettingsDeepersActivity$3(SettingsDeepersActivity paramSettingsDeepersActivity) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      if (SettingsDeepersActivity.c(this.a).getChildCount() <= 1) {
        break label102;
      }
      paramView.setBackgroundResource(2130837806);
    }
    for (;;)
    {
      paramView.setLayoutParams(new LinearLayout.LayoutParams(-1, this.a.getResources().getDimensionPixelOffset(2131230757)));
      ((ImageView)paramView.findViewById(2131296291)).setScaleType(ImageView.ScaleType.CENTER);
      paramView.setPadding(3, 0, 3, 0);
      if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3)) {
        SettingsDeepersActivity.d(this.a);
      }
      return false;
      label102:
      paramView.setBackgroundResource(2130837808);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsDeepersActivity.3
 * JD-Core Version:    0.7.0.1
 */