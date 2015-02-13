package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class Joiner$MapJoiner
{
  private final Joiner a;
  private final String b;
  
  private Joiner$MapJoiner(Joiner paramJoiner, String paramString)
  {
    this.a = paramJoiner;
    this.b = ((String)Preconditions.a(paramString));
  }
  
  public <A extends Appendable> A a(A paramA, Iterator<? extends Map.Entry<?, ?>> paramIterator)
  {
    Preconditions.a(paramA);
    if (paramIterator.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)paramIterator.next();
      paramA.append(this.a.a(localEntry1.getKey()));
      paramA.append(this.b);
      paramA.append(this.a.a(localEntry1.getValue()));
      while (paramIterator.hasNext())
      {
        paramA.append(Joiner.a(this.a));
        Map.Entry localEntry2 = (Map.Entry)paramIterator.next();
        paramA.append(this.a.a(localEntry2.getKey()));
        paramA.append(this.b);
        paramA.append(this.a.a(localEntry2.getValue()));
      }
    }
    return paramA;
  }
  
  public StringBuilder a(StringBuilder paramStringBuilder, Iterable<? extends Map.Entry<?, ?>> paramIterable)
  {
    return a(paramStringBuilder, paramIterable.iterator());
  }
  
  public StringBuilder a(StringBuilder paramStringBuilder, Iterator<? extends Map.Entry<?, ?>> paramIterator)
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
  
  public StringBuilder a(StringBuilder paramStringBuilder, Map<?, ?> paramMap)
  {
    return a(paramStringBuilder, paramMap.entrySet());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.base.Joiner.MapJoiner
 * JD-Core Version:    0.7.0.1
 */