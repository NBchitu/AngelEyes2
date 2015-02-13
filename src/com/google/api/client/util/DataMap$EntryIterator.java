package com.google.api.client.util;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

final class DataMap$EntryIterator
  implements Iterator<Map.Entry<String, Object>>
{
  private int b = -1;
  private FieldInfo c;
  private Object d;
  private boolean e;
  private boolean f;
  private FieldInfo g;
  
  DataMap$EntryIterator(DataMap paramDataMap) {}
  
  public Map.Entry<String, Object> a()
  {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    this.g = this.c;
    Object localObject = this.d;
    this.f = false;
    this.e = false;
    this.c = null;
    this.d = null;
    return new DataMap.Entry(this.a, this.g, localObject);
  }
  
  public boolean hasNext()
  {
    if (!this.f)
    {
      this.f = true;
      for (this.d = null; this.d == null; this.d = this.c.a(this.a.a))
      {
        int i = 1 + this.b;
        this.b = i;
        if (i >= this.a.b.a.size()) {
          break;
        }
        this.c = this.a.b.a((String)this.a.b.a.get(this.b));
      }
    }
    return this.d != null;
  }
  
  public void remove()
  {
    if ((this.g != null) && (!this.e)) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.b(bool);
      this.e = true;
      this.g.a(this.a.a, null);
      return;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.DataMap.EntryIterator
 * JD-Core Version:    0.7.0.1
 */