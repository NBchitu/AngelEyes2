package com.google.analytics.tracking.android;

import java.util.SortedSet;
import java.util.TreeSet;

class GAUsage
{
  private static final GAUsage d = new GAUsage();
  private SortedSet<GAUsage.Field> a = new TreeSet();
  private StringBuilder b = new StringBuilder();
  private boolean c = false;
  
  public static GAUsage a()
  {
    return d;
  }
  
  public void a(GAUsage.Field paramField)
  {
    try
    {
      if (!this.c)
      {
        this.a.add(paramField);
        this.b.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(paramField.ordinal()));
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      this.c = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public String b()
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 6;
      int j = 0;
      while (this.a.size() > 0)
      {
        GAUsage.Field localField = (GAUsage.Field)this.a.first();
        this.a.remove(localField);
        int k = localField.ordinal();
        while (k >= i)
        {
          localStringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(j));
          i += 6;
          j = 0;
        }
        j += (1 << localField.ordinal() % 6);
      }
      if ((j > 0) || (localStringBuilder.length() == 0)) {
        localStringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(j));
      }
      this.a.clear();
      String str = localStringBuilder.toString();
      return str;
    }
    finally {}
  }
  
  public String c()
  {
    try
    {
      if (this.b.length() > 0) {
        this.b.insert(0, ".");
      }
      String str = this.b.toString();
      this.b = new StringBuilder();
      return str;
    }
    finally {}
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.GAUsage
 * JD-Core Version:    0.7.0.1
 */