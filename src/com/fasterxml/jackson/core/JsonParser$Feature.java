package com.fasterxml.jackson.core;

public enum JsonParser$Feature
{
  private final boolean i;
  
  static
  {
    Feature[] arrayOfFeature = new Feature[8];
    arrayOfFeature[0] = a;
    arrayOfFeature[1] = b;
    arrayOfFeature[2] = c;
    arrayOfFeature[3] = d;
    arrayOfFeature[4] = e;
    arrayOfFeature[5] = f;
    arrayOfFeature[6] = g;
    arrayOfFeature[7] = h;
    j = arrayOfFeature;
  }
  
  private JsonParser$Feature(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public static int a()
  {
    int k = 0;
    for (Feature localFeature : values()) {
      if (localFeature.b()) {
        k |= localFeature.c();
      }
    }
    return k;
  }
  
  public boolean b()
  {
    return this.i;
  }
  
  public int c()
  {
    return 1 << ordinal();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.JsonParser.Feature
 * JD-Core Version:    0.7.0.1
 */