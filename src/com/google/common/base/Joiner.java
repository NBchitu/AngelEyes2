package com.google.common.base;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.CheckReturnValue;

public class Joiner
{
  private final String a;
  
  private Joiner(Joiner paramJoiner)
  {
    this.a = paramJoiner.a;
  }
  
  private Joiner(String paramString)
  {
    this.a = ((String)Preconditions.a(paramString));
  }
  
  public static Joiner a(String paramString)
  {
    return new Joiner(paramString);
  }
  
  public <A extends Appendable> A a(A paramA, Iterator<?> paramIterator)
  {
    Preconditions.a(paramA);
    if (paramIterator.hasNext())
    {
      paramA.append(a(paramIterator.next()));
      while (paramIterator.hasNext())
      {
        paramA.append(this.a);
        paramA.append(a(paramIterator.next()));
      }
    }
    return paramA;
  }
  
  CharSequence a(Object paramObject)
  {
    Preconditions.a(paramObject);
    if ((paramObject instanceof CharSequence)) {
      return (CharSequence)paramObject;
    }
    return paramObject.toString();
  }
  
  public final StringBuilder a(StringBuilder paramStringBuilder, Iterable<?> paramIterable)
  {
    return a(paramStringBuilder, paramIterable.iterator());
  }
  
  public final StringBuilder a(StringBuilder paramStringBuilder, Iterator<?> paramIterator)
  {
    try
    {
      a(paramStringBuilder, paramIterator);
      return paramStringBuilder;
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
  
  public final StringBuilder a(StringBuilder paramStringBuilder, Object[] paramArrayOfObject)
  {
    return a(paramStringBuilder, Arrays.asList(paramArrayOfObject));
  }
  
  @CheckReturnValue
  public Joiner b(String paramString)
  {
    Preconditions.a(paramString);
    return new Joiner.1(this, this, paramString);
  }
  
  @CheckReturnValue
  public Joiner.MapJoiner c(String paramString)
  {
    return new Joiner.MapJoiner(this, paramString, null);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.base.Joiner
 * JD-Core Version:    0.7.0.1
 */