package com.google.tagmanager.protobuf;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class GeneratedMessageLite
  extends AbstractMessageLite
  implements Serializable
{
  protected GeneratedMessageLite() {}
  
  protected GeneratedMessageLite(GeneratedMessageLite.Builder paramBuilder) {}
  
  public static <ContainingType extends MessageLite, Type> GeneratedMessageLite.GeneratedExtension<ContainingType, Type> a(ContainingType paramContainingType, Type paramType, MessageLite paramMessageLite, Internal.EnumLiteMap<?> paramEnumLiteMap, int paramInt, WireFormat.FieldType paramFieldType, Class paramClass)
  {
    GeneratedMessageLite.GeneratedExtension localGeneratedExtension = new GeneratedMessageLite.GeneratedExtension(paramContainingType, paramType, paramMessageLite, new GeneratedMessageLite.ExtensionDescriptor(paramEnumLiteMap, paramInt, paramFieldType, false, false), paramClass);
    return localGeneratedExtension;
  }
  
  static Object a(Method paramMethod, Object paramObject, Object... paramVarArgs)
  {
    try
    {
      Object localObject = paramMethod.invoke(paramObject, paramVarArgs);
      return localObject;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Throwable localThrowable = localInvocationTargetException.getCause();
      if ((localThrowable instanceof RuntimeException)) {
        throw ((RuntimeException)localThrowable);
      }
      if ((localThrowable instanceof Error)) {
        throw ((Error)localThrowable);
      }
      throw new RuntimeException("Unexpected exception thrown by generated accessor method.", localThrowable);
    }
  }
  
  static Method a(Class paramClass, String paramString, Class... paramVarArgs)
  {
    try
    {
      Method localMethod = paramClass.getMethod(paramString, paramVarArgs);
      return localMethod;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throw new RuntimeException("Generated message class \"" + paramClass.getName() + "\" missing method \"" + paramString + "\".", localNoSuchMethodException);
    }
  }
  
  private static <MessageType extends MessageLite> boolean b(FieldSet<GeneratedMessageLite.ExtensionDescriptor> paramFieldSet, MessageType paramMessageType, CodedInputStream paramCodedInputStream, CodedOutputStream paramCodedOutputStream, ExtensionRegistryLite paramExtensionRegistryLite, int paramInt)
  {
    int i = WireFormat.a(paramInt);
    GeneratedMessageLite.GeneratedExtension localGeneratedExtension = paramExtensionRegistryLite.a(paramMessageType, WireFormat.b(paramInt));
    int j;
    int k;
    if (localGeneratedExtension == null)
    {
      j = 0;
      k = 1;
    }
    while (k != 0)
    {
      return paramCodedInputStream.a(paramInt, paramCodedOutputStream);
      if (i == FieldSet.a(localGeneratedExtension.d.b(), false))
      {
        j = 0;
        k = 0;
      }
      else if ((localGeneratedExtension.d.d) && (localGeneratedExtension.d.c.c()) && (i == FieldSet.a(localGeneratedExtension.d.b(), true)))
      {
        j = 1;
        k = 0;
      }
      else
      {
        k = 1;
        j = 0;
      }
    }
    if (j != 0)
    {
      int n = paramCodedInputStream.c(paramCodedInputStream.s());
      if (localGeneratedExtension.d.b() == WireFormat.FieldType.n) {
        while (paramCodedInputStream.w() > 0)
        {
          int i1 = paramCodedInputStream.n();
          Internal.EnumLite localEnumLite = localGeneratedExtension.d.f().b(i1);
          if (localEnumLite == null) {
            return true;
          }
          paramFieldSet.b(localGeneratedExtension.d, localGeneratedExtension.c(localEnumLite));
        }
      }
      while (paramCodedInputStream.w() > 0)
      {
        Object localObject2 = FieldSet.a(paramCodedInputStream, localGeneratedExtension.d.b(), false);
        paramFieldSet.b(localGeneratedExtension.d, localObject2);
      }
      paramCodedInputStream.d(n);
    }
    Object localObject1;
    for (;;)
    {
      return true;
      switch (GeneratedMessageLite.1.a[localGeneratedExtension.d.c().ordinal()])
      {
      default: 
        localObject1 = FieldSet.a(paramCodedInputStream, localGeneratedExtension.d.b(), false);
        label311:
        if (!localGeneratedExtension.d.d()) {
          break label489;
        }
        paramFieldSet.b(localGeneratedExtension.d, localGeneratedExtension.c(localObject1));
      }
    }
    MessageLite localMessageLite;
    if (!localGeneratedExtension.d.d())
    {
      localMessageLite = (MessageLite)paramFieldSet.b(localGeneratedExtension.d);
      if (localMessageLite == null) {}
    }
    for (MessageLite.Builder localBuilder = localMessageLite.o();; localBuilder = null)
    {
      if (localBuilder == null) {
        localBuilder = localGeneratedExtension.c().p();
      }
      if (localGeneratedExtension.d.b() == WireFormat.FieldType.j) {
        paramCodedInputStream.a(localGeneratedExtension.b(), localBuilder, paramExtensionRegistryLite);
      }
      for (;;)
      {
        localObject1 = localBuilder.h();
        break;
        paramCodedInputStream.a(localBuilder, paramExtensionRegistryLite);
      }
      int m = paramCodedInputStream.n();
      localObject1 = localGeneratedExtension.d.f().b(m);
      if (localObject1 != null) {
        break label311;
      }
      paramCodedOutputStream.p(paramInt);
      paramCodedOutputStream.d(m);
      return true;
      label489:
      paramFieldSet.a(localGeneratedExtension.d, localGeneratedExtension.c(localObject1));
      break;
    }
  }
  
  protected void X() {}
  
  protected boolean a(CodedInputStream paramCodedInputStream, CodedOutputStream paramCodedOutputStream, ExtensionRegistryLite paramExtensionRegistryLite, int paramInt)
  {
    return paramCodedInputStream.a(paramInt, paramCodedOutputStream);
  }
  
  public Parser<? extends MessageLite> c()
  {
    throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.GeneratedMessageLite
 * JD-Core Version:    0.7.0.1
 */