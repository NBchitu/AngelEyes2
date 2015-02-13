package com.google.tagmanager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class DataLayer
{
  public static final Object a = new Object();
  private final ConcurrentHashMap<DataLayer.Listener, Integer> b = new ConcurrentHashMap();
  private final Map<Object, Object> c = new HashMap();
  private final ReentrantLock d = new ReentrantLock();
  private final LinkedList<Map<Object, Object>> e = new LinkedList();
  
  public Object a(String paramString)
  {
    for (;;)
    {
      int j;
      Object localObject3;
      synchronized (this.c)
      {
        Map localMap2 = this.c;
        String[] arrayOfString = paramString.split("\\.");
        int i = arrayOfString.length;
        localObject2 = localMap2;
        j = 0;
        if (j < i)
        {
          String str = arrayOfString[j];
          if (!(localObject2 instanceof Map)) {
            return null;
          }
          localObject3 = ((Map)localObject2).get(str);
          if (localObject3 == null) {
            return null;
          }
        }
        else
        {
          return localObject2;
        }
      }
      j++;
      Object localObject2 = localObject3;
    }
  }
  
  void a(DataLayer.Listener paramListener)
  {
    this.b.put(paramListener, Integer.valueOf(0));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.DataLayer
 * JD-Core Version:    0.7.0.1
 */