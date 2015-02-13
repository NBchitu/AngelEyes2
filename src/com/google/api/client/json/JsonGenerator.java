package com.google.api.client.json;

import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Types;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedInteger;
import com.google.common.primitives.UnsignedLong;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class JsonGenerator
{
  private void a(boolean paramBoolean, Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == null) {
      return;
    }
    Class localClass = paramObject.getClass();
    if (Data.a(paramObject))
    {
      f();
      return;
    }
    if ((paramObject instanceof String))
    {
      b((String)paramObject);
      return;
    }
    if ((paramObject instanceof Number))
    {
      if (paramBoolean)
      {
        b(paramObject.toString());
        return;
      }
      if ((paramObject instanceof BigDecimal))
      {
        a((BigDecimal)paramObject);
        return;
      }
      if ((paramObject instanceof BigInteger))
      {
        a((BigInteger)paramObject);
        return;
      }
      if ((paramObject instanceof UnsignedInteger))
      {
        a((UnsignedInteger)paramObject);
        return;
      }
      if ((paramObject instanceof UnsignedLong))
      {
        a((UnsignedLong)paramObject);
        return;
      }
      if ((paramObject instanceof Long))
      {
        a(((Long)paramObject).longValue());
        return;
      }
      if ((paramObject instanceof Float))
      {
        float f = ((Number)paramObject).floatValue();
        if ((!Float.isInfinite(f)) && (!Float.isNaN(f))) {}
        for (boolean bool4 = bool1;; bool4 = false)
        {
          Preconditions.a(bool4);
          a(f);
          return;
        }
      }
      if (((paramObject instanceof Integer)) || ((paramObject instanceof Short)) || ((paramObject instanceof Byte)))
      {
        a(((Number)paramObject).intValue());
        return;
      }
      double d = ((Number)paramObject).doubleValue();
      if ((!Double.isInfinite(d)) && (!Double.isNaN(d))) {}
      for (;;)
      {
        Preconditions.a(bool1);
        a(d);
        return;
        bool1 = false;
      }
    }
    if ((paramObject instanceof Boolean))
    {
      a(((Boolean)paramObject).booleanValue());
      return;
    }
    if ((paramObject instanceof DateTime))
    {
      b(((DateTime)paramObject).a());
      return;
    }
    if (((paramObject instanceof Iterable)) || (localClass.isArray()))
    {
      b();
      Iterator localIterator1 = Types.a(paramObject).iterator();
      while (localIterator1.hasNext()) {
        a(paramBoolean, localIterator1.next());
      }
      c();
      return;
    }
    if (localClass.isEnum())
    {
      String str2 = FieldInfo.a((Enum)paramObject).b();
      if (str2 == null)
      {
        f();
        return;
      }
      b(str2);
      return;
    }
    d();
    boolean bool2;
    ClassInfo localClassInfo;
    label435:
    label451:
    Object localObject;
    String str1;
    boolean bool3;
    if (((paramObject instanceof Map)) && (!(paramObject instanceof GenericData)))
    {
      bool2 = bool1;
      if (!bool2) {
        break label530;
      }
      localClassInfo = null;
      Iterator localIterator2 = Data.b(paramObject).entrySet().iterator();
      Map.Entry localEntry;
      do
      {
        if (!localIterator2.hasNext()) {
          break;
        }
        localEntry = (Map.Entry)localIterator2.next();
        localObject = localEntry.getValue();
      } while (localObject == null);
      str1 = (String)localEntry.getKey();
      if (!bool2) {
        break label540;
      }
      bool3 = paramBoolean;
    }
    for (;;)
    {
      a(str1);
      a(bool3, localObject);
      break label451;
      bool2 = false;
      break;
      label530:
      localClassInfo = ClassInfo.a(localClass);
      break label435;
      label540:
      Field localField = localClassInfo.b(str1);
      if ((localField != null) && (localField.getAnnotation(JsonString.class) != null)) {
        bool3 = bool1;
      } else {
        bool3 = false;
      }
    }
    e();
  }
  
  public abstract void a();
  
  public abstract void a(double paramDouble);
  
  public abstract void a(float paramFloat);
  
  public abstract void a(int paramInt);
  
  public abstract void a(long paramLong);
  
  public abstract void a(UnsignedInteger paramUnsignedInteger);
  
  public abstract void a(UnsignedLong paramUnsignedLong);
  
  public final void a(Object paramObject)
  {
    a(false, paramObject);
  }
  
  public abstract void a(String paramString);
  
  public abstract void a(BigDecimal paramBigDecimal);
  
  public abstract void a(BigInteger paramBigInteger);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract void b();
  
  public abstract void b(String paramString);
  
  public abstract void c();
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
  
  public void g() {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.json.JsonGenerator
 * JD-Core Version:    0.7.0.1
 */