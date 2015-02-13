package com.google.tagmanager.protobuf;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GeneratedMessageLite$GeneratedExtension<ContainingType extends MessageLite, Type>
{
  final ContainingType a;
  final Type b;
  final MessageLite c;
  final GeneratedMessageLite.ExtensionDescriptor d;
  final Class e;
  final Method f;
  
  GeneratedMessageLite$GeneratedExtension(ContainingType paramContainingType, Type paramType, MessageLite paramMessageLite, GeneratedMessageLite.ExtensionDescriptor paramExtensionDescriptor, Class paramClass)
  {
    if (paramContainingType == null) {
      throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }
    if ((paramExtensionDescriptor.b() == WireFormat.FieldType.k) && (paramMessageLite == null)) {
      throw new IllegalArgumentException("Null messageDefaultInstance");
    }
    this.a = paramContainingType;
    this.b = paramType;
    this.c = paramMessageLite;
    this.d = paramExtensionDescriptor;
    this.e = paramClass;
    if (Internal.EnumLite.class.isAssignableFrom(paramClass))
    {
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Integer.TYPE;
      this.f = GeneratedMessageLite.a(paramClass, "valueOf", arrayOfClass);
      return;
    }
    this.f = null;
  }
  
  public ContainingType a()
  {
    return this.a;
  }
  
  Object a(Object paramObject)
  {
    if (this.d.d())
    {
      if (this.d.c() == WireFormat.JavaType.h)
      {
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = ((List)paramObject).iterator();
        while (localIterator.hasNext()) {
          localArrayList.add(b(localIterator.next()));
        }
        paramObject = localArrayList;
      }
      return paramObject;
    }
    return b(paramObject);
  }
  
  public int b()
  {
    return this.d.a();
  }
  
  Object b(Object paramObject)
  {
    if (this.d.c() == WireFormat.JavaType.h)
    {
      Method localMethod = this.f;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ((Integer)paramObject);
      paramObject = GeneratedMessageLite.a(localMethod, null, arrayOfObject);
    }
    return paramObject;
  }
  
  public MessageLite c()
  {
    return this.c;
  }
  
  Object c(Object paramObject)
  {
    if (this.d.c() == WireFormat.JavaType.h) {
      paramObject = Integer.valueOf(((Internal.EnumLite)paramObject).a());
    }
    return paramObject;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.GeneratedMessageLite.GeneratedExtension
 * JD-Core Version:    0.7.0.1
 */