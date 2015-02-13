package com.google.tagmanager;

import com.google.analytics.containertag.proto.Serving.Resource;

class Container$3
  implements LoadCallback<Serving.Resource>
{
  Container$3(Container paramContainer, Clock paramClock) {}
  
  private Container.RefreshFailure b(LoadCallback.Failure paramFailure)
  {
    switch (Container.4.a[paramFailure.ordinal()])
    {
    default: 
      return Container.RefreshFailure.f;
    case 1: 
      return Container.RefreshFailure.c;
    case 2: 
      return Container.RefreshFailure.d;
    }
    return Container.RefreshFailure.e;
  }
  
  public void a()
  {
    Container.a(this.b, Container.RefreshType.b);
  }
  
  public void a(Serving.Resource paramResource)
  {
    Container localContainer = this.b;
    if (paramResource != null) {}
    for (;;)
    {
      try
      {
        Container.a(this.b, paramResource, false);
        Container.a(this.b, this.a.a());
        Log.e("setting refresh time to current time: " + Container.a(this.b));
        if (!Container.c(this.b)) {
          Container.a(this.b, paramResource);
        }
        this.b.a(43200000L);
        Container.b(this.b, Container.RefreshType.b);
        return;
      }
      finally {}
      if (Container.b(this.b) == null)
      {
        a(LoadCallback.Failure.c);
        return;
      }
      Serving.Resource localResource = Container.b(this.b);
      paramResource = localResource;
    }
  }
  
  public void a(LoadCallback.Failure paramFailure)
  {
    this.b.a(3600000L);
    Container.a(this.b, Container.RefreshType.b, b(paramFailure));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Container.3
 * JD-Core Version:    0.7.0.1
 */