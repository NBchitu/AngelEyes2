package com.google.tagmanager;

class ContainerOpener$WaitForNonDefaultRefresh
  implements Container.Callback
{
  public ContainerOpener$WaitForNonDefaultRefresh(ContainerOpener paramContainerOpener) {}
  
  public void a(Container paramContainer, Container.RefreshType paramRefreshType) {}
  
  public void a(Container paramContainer, Container.RefreshType paramRefreshType, Container.RefreshFailure paramRefreshFailure)
  {
    if (paramRefreshType == Container.RefreshType.b) {
      ContainerOpener.a(this.a, paramContainer);
    }
  }
  
  public void b(Container paramContainer, Container.RefreshType paramRefreshType)
  {
    ContainerOpener.a(this.a, paramContainer);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ContainerOpener.WaitForNonDefaultRefresh
 * JD-Core Version:    0.7.0.1
 */