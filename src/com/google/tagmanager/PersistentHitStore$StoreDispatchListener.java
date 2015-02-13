package com.google.tagmanager;

class PersistentHitStore$StoreDispatchListener
  implements SimpleNetworkDispatcher.DispatchListener
{
  PersistentHitStore$StoreDispatchListener(PersistentHitStore paramPersistentHitStore) {}
  
  public void a(Hit paramHit)
  {
    PersistentHitStore.a(this.a, paramHit.a());
  }
  
  public void b(Hit paramHit)
  {
    PersistentHitStore.a(this.a, paramHit.a());
    Log.e("Permanent failure dispatching hitId: " + paramHit.a());
  }
  
  public void c(Hit paramHit)
  {
    long l = paramHit.b();
    if (l == 0L) {
      PersistentHitStore.a(this.a, paramHit.a(), PersistentHitStore.a(this.a).a());
    }
    while (l + 14400000L >= PersistentHitStore.a(this.a).a()) {
      return;
    }
    PersistentHitStore.a(this.a, paramHit.a());
    Log.e("Giving up on failed hitId: " + paramHit.a());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.PersistentHitStore.StoreDispatchListener
 * JD-Core Version:    0.7.0.1
 */