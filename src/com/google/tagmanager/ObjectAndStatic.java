package com.google.tagmanager;

class ObjectAndStatic<T>
{
  private final T a;
  private final boolean b;
  
  ObjectAndStatic(T paramT, boolean paramBoolean)
  {
    this.a = paramT;
    this.b = paramBoolean;
  }
  
  public T a()
  {
    return this.a;
  }
  
  public boolean b()
  {
    return this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ObjectAndStatic
 * JD-Core Version:    0.7.0.1
 */