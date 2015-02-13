package com.fridaylab.util;

import com.google.common.base.Supplier;
import java.util.ArrayDeque;
import java.util.List;

public class RecycleBin<T>
  implements Supplier<T>
{
  private final int a = 0;
  private final Supplier<T> b;
  private final ArrayDeque<T> c;
  
  public RecycleBin(Supplier<T> paramSupplier)
  {
    this.b = paramSupplier;
    this.c = new ArrayDeque();
  }
  
  public void a(T paramT)
  {
    if ((this.a <= 0) || (this.a > this.c.size())) {
      this.c.add(paramT);
    }
  }
  
  public void a(List<T> paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      a(paramList.get(j));
    }
    paramList.clear();
  }
  
  public T c()
  {
    if (this.c.isEmpty()) {
      return this.b.c();
    }
    return this.c.removeLast();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.util.RecycleBin
 * JD-Core Version:    0.7.0.1
 */