package com.fasterxml.jackson.core;

public enum JsonFactory$Feature
{
  private final boolean c;
  
  static
  {
    Feature[] arrayOfFeature = new Feature[2];
    arrayOfFeature[0] = a;
    arrayOfFeature[1] = b;
    d = arrayOfFeature;
  }
  
  private JsonFactory$Feature(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public static int a()
  {
    int i = 0;
    for (Feature localFeature : values()) {
      if (localFeature.b()) {
        i |= localFeature.c();
      }
    }
    return i;
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public int c()
  {
    return 1 << ordinal();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.JsonFactory.Feature
 * JD-Core Version:    0.7.0.1
 */