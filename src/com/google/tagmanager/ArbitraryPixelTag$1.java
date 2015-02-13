package com.google.tagmanager;

import android.content.Context;

class ArbitraryPixelTag$1
  implements ArbitraryPixelTag.HitSenderProvider
{
  ArbitraryPixelTag$1(Context paramContext) {}
  
  public HitSender a()
  {
    return DelayedHitSender.a(this.a);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ArbitraryPixelTag.1
 * JD-Core Version:    0.7.0.1
 */