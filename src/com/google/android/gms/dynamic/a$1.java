package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

class a$1
  implements f<T>
{
  a$1(a parama) {}
  
  public void a(T paramT)
  {
    a.a(this.a, paramT);
    Iterator localIterator = a.a(this.a).iterator();
    while (localIterator.hasNext()) {
      ((a.a)localIterator.next()).a(a.b(this.a));
    }
    a.a(this.a).clear();
    a.a(this.a, null);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.a.1
 * JD-Core Version:    0.7.0.1
 */