package com.google.tagmanager;

class NoopEventInfoDistributor
  implements EventInfoDistributor
{
  public EventInfoBuilder a(String paramString)
  {
    return new NoopEventInfoBuilder();
  }
  
  public boolean a()
  {
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.NoopEventInfoDistributor
 * JD-Core Version:    0.7.0.1
 */