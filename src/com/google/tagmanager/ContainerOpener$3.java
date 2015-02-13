package com.google.tagmanager;

import java.util.TimerTask;

class ContainerOpener$3
  extends TimerTask
{
  ContainerOpener$3(ContainerOpener paramContainerOpener) {}
  
  public void run()
  {
    Log.c("Timer expired.");
    ContainerOpener.a(this.a, ContainerOpener.a(this.a));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ContainerOpener.3
 * JD-Core Version:    0.7.0.1
 */