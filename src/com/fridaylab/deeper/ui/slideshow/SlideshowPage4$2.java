package com.fridaylab.deeper.ui.slideshow;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;

class SlideshowPage4$2
  implements View.OnClickListener
{
  SlideshowPage4$2(SlideshowPage4 paramSlideshowPage4) {}
  
  public void onClick(View paramView)
  {
    FragmentActivity localFragmentActivity = this.a.i();
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("https://buydeeper.com/where-to-buy?app=1"));
    localIntent.addFlags(524288);
    this.a.a(localIntent);
    if (localFragmentActivity != null)
    {
      LocalBroadcastManager.a(localFragmentActivity).a(new Intent().setAction("exitOnResume"));
      EasyTracker.a(localFragmentActivity).a(MapBuilder.a("Merchandise", "buy_deeper", null, null).a());
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.slideshow.SlideshowPage4.2
 * JD-Core Version:    0.7.0.1
 */