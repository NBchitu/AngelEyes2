package com.google.tagmanager;

class HitSendingThreadImpl$1
  implements Runnable
{
  HitSendingThreadImpl$1(HitSendingThreadImpl paramHitSendingThreadImpl, HitSendingThread paramHitSendingThread, long paramLong, String paramString) {}
  
  public void run()
  {
    if (HitSendingThreadImpl.a(this.d) == null)
    {
      ServiceManagerImpl localServiceManagerImpl = ServiceManagerImpl.b();
      localServiceManagerImpl.a(HitSendingThreadImpl.b(this.d), this.a);
      HitSendingThreadImpl.a(this.d, localServiceManagerImpl.c());
    }
    HitSendingThreadImpl.a(this.d).a(this.b, this.c);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.HitSendingThreadImpl.1
 * JD-Core Version:    0.7.0.1
 */