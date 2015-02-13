package com.google.tagmanager;

abstract interface LoadCallback<T>
{
  public abstract void a();
  
  public abstract void a(LoadCallback.Failure paramFailure);
  
  public abstract void a(T paramT);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.LoadCallback
 * JD-Core Version:    0.7.0.1
 */