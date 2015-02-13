package com.google.tagmanager;

class ContainerOpener$WaitForFresh
  implements Container.Callback
{
  private final long b;
  
  public ContainerOpener$WaitForFresh(ContainerOpener paramContainerOpener, long paramLong)
  {
    this.b = paramLong;
  }
  
  private boolean a()
  {
    return this.b < ContainerOpener.a(this.a).a();
  }
  
  public void a(Container paramContainer, Container.RefreshType paramRefreshType) {}
  
  public void a(Container paramContainer, Container.RefreshType paramRefreshType, Container.RefreshFailure paramRefreshFailure)
  {
    if (paramRefreshType == Container.RefreshType.b) {
      ContainerOpener.a(this.a, paramContainer);
    }
  }
  
  public void b(Container paramContainer, Container.RefreshType paramRefreshType)
  {
    if ((paramRefreshType == Container.RefreshType.b) || (a())) {
      ContainerOpener.a(this.a, paramContainer);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ContainerOpener.WaitForFresh
 * JD-Core Version:    0.7.0.1
 */