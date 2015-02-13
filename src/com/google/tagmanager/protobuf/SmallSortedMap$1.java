package com.google.tagmanager.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class SmallSortedMap$1
  extends SmallSortedMap<FieldDescriptorType, Object>
{
  SmallSortedMap$1(int paramInt)
  {
    super(paramInt, null);
  }
  
  public void a()
  {
    if (!b())
    {
      for (int i = 0; i < c(); i++)
      {
        Map.Entry localEntry2 = b(i);
        if (((FieldSet.FieldDescriptorLite)localEntry2.getKey()).d()) {
          localEntry2.setValue(Collections.unmodifiableList((List)localEntry2.getValue()));
        }
      }
      Iterator localIterator = d().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry1 = (Map.Entry)localIterator.next();
        if (((FieldSet.FieldDescriptorLite)localEntry1.getKey()).d()) {
          localEntry1.setValue(Collections.unmodifiableList((List)localEntry1.getValue()));
        }
      }
    }
    super.a();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.SmallSortedMap.1
 * JD-Core Version:    0.7.0.1
 */