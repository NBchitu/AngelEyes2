package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

class DataLayer$2
  implements DataLayer.c.a
{
  DataLayer$2(DataLayer paramDataLayer) {}
  
  public void a(List<DataLayer.a> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      DataLayer.a locala = (DataLayer.a)localIterator.next();
      DataLayer.a(this.a, this.a.a(locala.a, locala.b));
    }
    DataLayer.a(this.a).countDown();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.DataLayer.2
 * JD-Core Version:    0.7.0.1
 */