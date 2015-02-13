package com.google.tagmanager.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class FieldSet<FieldDescriptorType extends FieldSet.FieldDescriptorLite<FieldDescriptorType>>
{
  private static final FieldSet d = new FieldSet(true);
  private final SmallSortedMap<FieldDescriptorType, Object> a;
  private boolean b;
  private boolean c = false;
  
  private FieldSet()
  {
    this.a = SmallSortedMap.a(16);
  }
  
  private FieldSet(boolean paramBoolean)
  {
    this.a = SmallSortedMap.a(0);
    c();
  }
  
  private static int a(WireFormat.FieldType paramFieldType, int paramInt, Object paramObject)
  {
    int i = CodedOutputStream.o(paramInt);
    if ((paramFieldType == WireFormat.FieldType.j) && (!Internal.a((MessageLite)paramObject))) {}
    for (int j = i * 2;; j = i) {
      return j + b(paramFieldType, paramObject);
    }
  }
  
  static int a(WireFormat.FieldType paramFieldType, boolean paramBoolean)
  {
    if (paramBoolean) {
      return 2;
    }
    return paramFieldType.b();
  }
  
  public static <T extends FieldSet.FieldDescriptorLite<T>> FieldSet<T> a()
  {
    return new FieldSet();
  }
  
  public static Object a(CodedInputStream paramCodedInputStream, WireFormat.FieldType paramFieldType, boolean paramBoolean)
  {
    switch (FieldSet.1.b[paramFieldType.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 1: 
      return Double.valueOf(paramCodedInputStream.b());
    case 2: 
      return Float.valueOf(paramCodedInputStream.c());
    case 3: 
      return Long.valueOf(paramCodedInputStream.e());
    case 4: 
      return Long.valueOf(paramCodedInputStream.d());
    case 5: 
      return Integer.valueOf(paramCodedInputStream.f());
    case 6: 
      return Long.valueOf(paramCodedInputStream.g());
    case 7: 
      return Integer.valueOf(paramCodedInputStream.h());
    case 8: 
      return Boolean.valueOf(paramCodedInputStream.i());
    case 9: 
      if (paramBoolean) {
        return paramCodedInputStream.k();
      }
      return paramCodedInputStream.j();
    case 10: 
      return paramCodedInputStream.l();
    case 11: 
      return Integer.valueOf(paramCodedInputStream.m());
    case 12: 
      return Integer.valueOf(paramCodedInputStream.o());
    case 13: 
      return Long.valueOf(paramCodedInputStream.p());
    case 14: 
      return Integer.valueOf(paramCodedInputStream.q());
    case 15: 
      return Long.valueOf(paramCodedInputStream.r());
    case 16: 
      throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
    case 17: 
      throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
    }
    throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
  }
  
  private static void a(CodedOutputStream paramCodedOutputStream, WireFormat.FieldType paramFieldType, int paramInt, Object paramObject)
  {
    if (paramFieldType == WireFormat.FieldType.j)
    {
      if (Internal.a((MessageLite)paramObject))
      {
        paramCodedOutputStream.f(paramInt, 3);
        paramCodedOutputStream.a((MessageLite)paramObject);
        return;
      }
      paramCodedOutputStream.a(paramInt, (MessageLite)paramObject);
      return;
    }
    paramCodedOutputStream.f(paramInt, a(paramFieldType, false));
    a(paramCodedOutputStream, paramFieldType, paramObject);
  }
  
  private static void a(CodedOutputStream paramCodedOutputStream, WireFormat.FieldType paramFieldType, Object paramObject)
  {
    switch (FieldSet.1.b[paramFieldType.ordinal()])
    {
    default: 
      return;
    case 1: 
      paramCodedOutputStream.a(((Double)paramObject).doubleValue());
      return;
    case 2: 
      paramCodedOutputStream.a(((Float)paramObject).floatValue());
      return;
    case 3: 
      paramCodedOutputStream.b(((Long)paramObject).longValue());
      return;
    case 4: 
      paramCodedOutputStream.a(((Long)paramObject).longValue());
      return;
    case 5: 
      paramCodedOutputStream.b(((Integer)paramObject).intValue());
      return;
    case 6: 
      paramCodedOutputStream.c(((Long)paramObject).longValue());
      return;
    case 7: 
      paramCodedOutputStream.c(((Integer)paramObject).intValue());
      return;
    case 8: 
      paramCodedOutputStream.a(((Boolean)paramObject).booleanValue());
      return;
    case 9: 
      paramCodedOutputStream.a((String)paramObject);
      return;
    case 16: 
      paramCodedOutputStream.a((MessageLite)paramObject);
      return;
    case 17: 
      paramCodedOutputStream.b((MessageLite)paramObject);
      return;
    case 10: 
      if ((paramObject instanceof ByteString))
      {
        paramCodedOutputStream.a((ByteString)paramObject);
        return;
      }
      paramCodedOutputStream.b((byte[])paramObject);
      return;
    case 11: 
      paramCodedOutputStream.d(((Integer)paramObject).intValue());
      return;
    case 12: 
      paramCodedOutputStream.f(((Integer)paramObject).intValue());
      return;
    case 13: 
      paramCodedOutputStream.d(((Long)paramObject).longValue());
      return;
    case 14: 
      paramCodedOutputStream.g(((Integer)paramObject).intValue());
      return;
    case 15: 
      paramCodedOutputStream.e(((Long)paramObject).longValue());
      return;
    }
    if ((paramObject instanceof Internal.EnumLite))
    {
      paramCodedOutputStream.e(((Internal.EnumLite)paramObject).a());
      return;
    }
    paramCodedOutputStream.e(((Integer)paramObject).intValue());
  }
  
  public static void a(FieldSet.FieldDescriptorLite<?> paramFieldDescriptorLite, Object paramObject, CodedOutputStream paramCodedOutputStream)
  {
    WireFormat.FieldType localFieldType = paramFieldDescriptorLite.b();
    int i = paramFieldDescriptorLite.a();
    if (paramFieldDescriptorLite.d())
    {
      List localList = (List)paramObject;
      if (paramFieldDescriptorLite.e())
      {
        paramCodedOutputStream.f(i, 2);
        int j = 0;
        Iterator localIterator2 = localList.iterator();
        while (localIterator2.hasNext()) {
          j += b(localFieldType, localIterator2.next());
        }
        paramCodedOutputStream.p(j);
        Iterator localIterator3 = localList.iterator();
        while (localIterator3.hasNext()) {
          a(paramCodedOutputStream, localFieldType, localIterator3.next());
        }
      }
      Iterator localIterator1 = localList.iterator();
      while (localIterator1.hasNext()) {
        a(paramCodedOutputStream, localFieldType, i, localIterator1.next());
      }
    }
    if ((paramObject instanceof LazyField))
    {
      a(paramCodedOutputStream, localFieldType, i, ((LazyField)paramObject).a());
      return;
    }
    a(paramCodedOutputStream, localFieldType, i, paramObject);
  }
  
  private static void a(WireFormat.FieldType paramFieldType, Object paramObject)
  {
    if (paramObject == null) {
      throw new NullPointerException();
    }
    int i = FieldSet.1.a[paramFieldType.a().ordinal()];
    boolean bool1 = false;
    switch (i)
    {
    }
    while (!bool1)
    {
      throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      bool1 = paramObject instanceof Integer;
      continue;
      bool1 = paramObject instanceof Long;
      continue;
      bool1 = paramObject instanceof Float;
      continue;
      bool1 = paramObject instanceof Double;
      continue;
      bool1 = paramObject instanceof Boolean;
      continue;
      bool1 = paramObject instanceof String;
      continue;
      if (!(paramObject instanceof ByteString))
      {
        boolean bool4 = paramObject instanceof byte[];
        bool1 = false;
        if (!bool4) {}
      }
      else
      {
        bool1 = true;
        continue;
        if (!(paramObject instanceof Integer))
        {
          boolean bool3 = paramObject instanceof Internal.EnumLite;
          bool1 = false;
          if (!bool3) {}
        }
        else
        {
          bool1 = true;
          continue;
          if (!(paramObject instanceof MessageLite))
          {
            boolean bool2 = paramObject instanceof LazyField;
            bool1 = false;
            if (!bool2) {}
          }
          else
          {
            bool1 = true;
          }
        }
      }
    }
  }
  
  private boolean a(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    FieldSet.FieldDescriptorLite localFieldDescriptorLite = (FieldSet.FieldDescriptorLite)paramEntry.getKey();
    if (localFieldDescriptorLite.c() == WireFormat.JavaType.i)
    {
      if (localFieldDescriptorLite.d())
      {
        Iterator localIterator = ((List)paramEntry.getValue()).iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (((MessageLite)localIterator.next()).j());
        return false;
      }
      Object localObject = paramEntry.getValue();
      if ((localObject instanceof MessageLite))
      {
        if (!((MessageLite)localObject).j()) {
          return false;
        }
      }
      else
      {
        if ((localObject instanceof LazyField)) {
          return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    return true;
  }
  
  private static int b(WireFormat.FieldType paramFieldType, Object paramObject)
  {
    switch (FieldSet.1.b[paramFieldType.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 1: 
      return CodedOutputStream.b(((Double)paramObject).doubleValue());
    case 2: 
      return CodedOutputStream.b(((Float)paramObject).floatValue());
    case 3: 
      return CodedOutputStream.g(((Long)paramObject).longValue());
    case 4: 
      return CodedOutputStream.f(((Long)paramObject).longValue());
    case 5: 
      return CodedOutputStream.h(((Integer)paramObject).intValue());
    case 6: 
      return CodedOutputStream.h(((Long)paramObject).longValue());
    case 7: 
      return CodedOutputStream.i(((Integer)paramObject).intValue());
    case 8: 
      return CodedOutputStream.b(((Boolean)paramObject).booleanValue());
    case 9: 
      return CodedOutputStream.b((String)paramObject);
    case 16: 
      return CodedOutputStream.c((MessageLite)paramObject);
    case 10: 
      if ((paramObject instanceof ByteString)) {
        return CodedOutputStream.b((ByteString)paramObject);
      }
      return CodedOutputStream.c((byte[])paramObject);
    case 11: 
      return CodedOutputStream.j(((Integer)paramObject).intValue());
    case 12: 
      return CodedOutputStream.l(((Integer)paramObject).intValue());
    case 13: 
      return CodedOutputStream.i(((Long)paramObject).longValue());
    case 14: 
      return CodedOutputStream.m(((Integer)paramObject).intValue());
    case 15: 
      return CodedOutputStream.j(((Long)paramObject).longValue());
    case 17: 
      if ((paramObject instanceof LazyField)) {
        return CodedOutputStream.a((LazyField)paramObject);
      }
      return CodedOutputStream.d((MessageLite)paramObject);
    }
    if ((paramObject instanceof Internal.EnumLite)) {
      return CodedOutputStream.k(((Internal.EnumLite)paramObject).a());
    }
    return CodedOutputStream.k(((Integer)paramObject).intValue());
  }
  
  public static <T extends FieldSet.FieldDescriptorLite<T>> FieldSet<T> b()
  {
    return d;
  }
  
  private void b(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    FieldSet.FieldDescriptorLite localFieldDescriptorLite = (FieldSet.FieldDescriptorLite)paramEntry.getKey();
    Object localObject1 = paramEntry.getValue();
    if ((localObject1 instanceof LazyField)) {
      localObject1 = ((LazyField)localObject1).a();
    }
    if (localFieldDescriptorLite.d())
    {
      Object localObject4 = b(localFieldDescriptorLite);
      if (localObject4 == null)
      {
        this.a.a(localFieldDescriptorLite, new ArrayList((List)localObject1));
        return;
      }
      ((List)localObject4).addAll((List)localObject1);
      return;
    }
    if (localFieldDescriptorLite.c() == WireFormat.JavaType.i)
    {
      Object localObject2 = b(localFieldDescriptorLite);
      if (localObject2 == null)
      {
        this.a.a(localFieldDescriptorLite, localObject1);
        return;
      }
      if ((localObject2 instanceof MutableMessageLite)) {}
      for (Object localObject3 = localFieldDescriptorLite.a((MutableMessageLite)localObject2, (MutableMessageLite)localObject1);; localObject3 = localFieldDescriptorLite.a(((MessageLite)localObject2).o(), (MessageLite)localObject1).h())
      {
        this.a.a(localFieldDescriptorLite, localObject3);
        return;
      }
    }
    this.a.a(localFieldDescriptorLite, localObject1);
  }
  
  public static int c(FieldSet.FieldDescriptorLite<?> paramFieldDescriptorLite, Object paramObject)
  {
    int i = 0;
    WireFormat.FieldType localFieldType = paramFieldDescriptorLite.b();
    int j = paramFieldDescriptorLite.a();
    if (paramFieldDescriptorLite.d())
    {
      if (paramFieldDescriptorLite.e())
      {
        Iterator localIterator2 = ((List)paramObject).iterator();
        while (localIterator2.hasNext()) {
          i += b(localFieldType, localIterator2.next());
        }
        i = i + CodedOutputStream.o(j) + CodedOutputStream.q(i);
      }
      for (;;)
      {
        return i;
        Iterator localIterator1 = ((List)paramObject).iterator();
        while (localIterator1.hasNext()) {
          i += a(localFieldType, j, localIterator1.next());
        }
      }
    }
    return a(localFieldType, j, paramObject);
  }
  
  public void a(FieldDescriptorType paramFieldDescriptorType, Object paramObject)
  {
    if (paramFieldDescriptorType.d())
    {
      if (!(paramObject instanceof List)) {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll((List)paramObject);
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        a(paramFieldDescriptorType.b(), localObject);
      }
      paramObject = localArrayList;
    }
    for (;;)
    {
      if ((paramObject instanceof LazyField)) {
        this.c = true;
      }
      this.a.a(paramFieldDescriptorType, paramObject);
      return;
      a(paramFieldDescriptorType.b(), paramObject);
    }
  }
  
  public void a(FieldSet<FieldDescriptorType> paramFieldSet)
  {
    for (int i = 0; i < paramFieldSet.a.c(); i++) {
      b(paramFieldSet.a.b(i));
    }
    Iterator localIterator = paramFieldSet.a.d().iterator();
    while (localIterator.hasNext()) {
      b((Map.Entry)localIterator.next());
    }
  }
  
  public boolean a(FieldDescriptorType paramFieldDescriptorType)
  {
    if (paramFieldDescriptorType.d()) {
      throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }
    return this.a.get(paramFieldDescriptorType) != null;
  }
  
  public Object b(FieldDescriptorType paramFieldDescriptorType)
  {
    Object localObject = this.a.get(paramFieldDescriptorType);
    if ((localObject instanceof LazyField)) {
      localObject = ((LazyField)localObject).a();
    }
    return localObject;
  }
  
  public void b(FieldDescriptorType paramFieldDescriptorType, Object paramObject)
  {
    if (!paramFieldDescriptorType.d()) {
      throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }
    a(paramFieldDescriptorType.b(), paramObject);
    Object localObject1 = b(paramFieldDescriptorType);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = new ArrayList();
      this.a.a(paramFieldDescriptorType, localObject2);
    }
    for (;;)
    {
      ((List)localObject2).add(paramObject);
      return;
      localObject2 = (List)localObject1;
    }
  }
  
  public void c()
  {
    if (this.b) {
      return;
    }
    this.a.a();
    this.b = true;
  }
  
  public FieldSet<FieldDescriptorType> d()
  {
    FieldSet localFieldSet = a();
    for (int i = 0; i < this.a.c(); i++)
    {
      Map.Entry localEntry2 = this.a.b(i);
      localFieldSet.a((FieldSet.FieldDescriptorLite)localEntry2.getKey(), localEntry2.getValue());
    }
    Iterator localIterator = this.a.d().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator.next();
      localFieldSet.a((FieldSet.FieldDescriptorLite)localEntry1.getKey(), localEntry1.getValue());
    }
    localFieldSet.c = this.c;
    return localFieldSet;
  }
  
  public Iterator<Map.Entry<FieldDescriptorType, Object>> e()
  {
    if (this.c) {
      return new LazyField.LazyIterator(this.a.entrySet().iterator());
    }
    return this.a.entrySet().iterator();
  }
  
  public boolean f()
  {
    for (int i = 0; i < this.a.c(); i++) {
      if (!a(this.a.b(i))) {
        return false;
      }
    }
    Iterator localIterator = this.a.d().iterator();
    while (localIterator.hasNext()) {
      if (!a((Map.Entry)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
  
  public int g()
  {
    int i = 0;
    int j = 0;
    while (i < this.a.c())
    {
      Map.Entry localEntry2 = this.a.b(i);
      j += c((FieldSet.FieldDescriptorLite)localEntry2.getKey(), localEntry2.getValue());
      i++;
    }
    Iterator localIterator = this.a.d().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator.next();
      j += c((FieldSet.FieldDescriptorLite)localEntry1.getKey(), localEntry1.getValue());
    }
    return j;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.FieldSet
 * JD-Core Version:    0.7.0.1
 */