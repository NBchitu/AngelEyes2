package com.google.tagmanager.protobuf;

import java.util.Collection;
import java.util.Iterator;

public abstract class AbstractMessageLite$Builder<BuilderType extends Builder>
  implements MessageLite.Builder
{
  protected static UninitializedMessageException a(MessageLite paramMessageLite)
  {
    return new UninitializedMessageException(paramMessageLite);
  }
  
  private static void a(Iterable<?> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext()) {
      if (localIterator.next() == null) {
        throw new NullPointerException();
      }
    }
  }
  
  protected static <T> void a(Iterable<T> paramIterable, Collection<? super T> paramCollection)
  {
    if ((paramIterable instanceof LazyStringList))
    {
      a(((LazyStringList)paramIterable).a());
      paramCollection.addAll((Collection)paramIterable);
    }
    for (;;)
    {
      return;
      if ((paramIterable instanceof Collection))
      {
        a(paramIterable);
        paramCollection.addAll((Collection)paramIterable);
        return;
      }
      Iterator localIterator = paramIterable.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        if (localObject == null) {
          throw new NullPointerException();
        }
        paramCollection.add(localObject);
      }
    }
  }
  
  public abstract BuilderType b(CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite);
  
  public abstract BuilderType g();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.AbstractMessageLite.Builder
 * JD-Core Version:    0.7.0.1
 */