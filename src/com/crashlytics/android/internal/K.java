package com.crashlytics.android.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

final class K
{
  private final X a;
  private final ah b;
  private aK c;
  private final aj d;
  private final int e;
  private List<ak> f = new CopyOnWriteArrayList();
  
  K(X paramX, ah paramah, aj paramaj)
  {
    this(paramX, paramah, paramaj, 100);
  }
  
  private K(X paramX, ah paramah, aj paramaj, int paramInt)
  {
    this.a = paramX;
    this.d = paramaj;
    this.b = paramah;
    this.b.a();
    this.e = 100;
  }
  
  private void a(String paramString)
  {
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      ak localak = (ak)localIterator.next();
      try
      {
        localak.c();
      }
      catch (Exception localException)
      {
        v.a().b().a("Crashlytics", "One of the roll over listeners threw an exception", localException);
      }
    }
  }
  
  private static long b(String paramString)
  {
    String[] arrayOfString = paramString.split("_");
    if (arrayOfString.length != 3) {
      return 0L;
    }
    try
    {
      long l = Long.valueOf(arrayOfString[2]).longValue();
      return l;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return 0L;
  }
  
  private int e()
  {
    if (this.c == null) {
      return 8000;
    }
    return this.c.c;
  }
  
  final void a(V paramV)
  {
    byte[] arrayOfByte = this.a.a(paramV);
    int i = arrayOfByte.length;
    if (!this.d.a(i, e()))
    {
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(this.d.a());
      arrayOfObject[1] = Integer.valueOf(i);
      arrayOfObject[2] = Integer.valueOf(e());
      ab.a(4, String.format(localLocale, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", arrayOfObject));
      a();
    }
    this.d.a(arrayOfByte);
  }
  
  final void a(aK paramaK)
  {
    this.c = paramaK;
  }
  
  final void a(ak paramak)
  {
    if (paramak != null) {
      this.f.add(paramak);
    }
  }
  
  final void a(List<File> paramList)
  {
    this.d.a(paramList);
  }
  
  final boolean a()
  {
    boolean bool = true;
    String str;
    if (!this.d.b())
    {
      UUID localUUID = UUID.randomUUID();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("sa");
      localStringBuilder.append("_");
      localStringBuilder.append(localUUID.toString());
      localStringBuilder.append("_");
      localStringBuilder.append(this.b.a());
      localStringBuilder.append(".tap");
      str = localStringBuilder.toString();
      this.d.a(str);
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[bool];
      arrayOfObject[0] = str;
      ab.a(4, String.format(localLocale, "generated new to-send analytics file %s", arrayOfObject));
      this.b.a();
    }
    for (;;)
    {
      a(str);
      return bool;
      str = null;
      bool = false;
    }
  }
  
  final List<File> b()
  {
    return this.d.a(1);
  }
  
  final void c()
  {
    this.d.a(this.d.c());
    this.d.d();
  }
  
  final void d()
  {
    List localList = this.d.c();
    if (localList.size() <= this.e) {
      return;
    }
    int i = localList.size() - this.e;
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(localList.size());
    arrayOfObject[1] = Integer.valueOf(this.e);
    arrayOfObject[2] = Integer.valueOf(i);
    ab.c(String.format(localLocale, "Found %d files in session analytics roll over directory, this is greater than %d, deleting %d oldest files", arrayOfObject));
    TreeSet localTreeSet = new TreeSet(new L(this));
    Iterator localIterator1 = localList.iterator();
    while (localIterator1.hasNext())
    {
      File localFile = (File)localIterator1.next();
      localTreeSet.add(new M(this, localFile, b(localFile.getName())));
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator2 = localTreeSet.iterator();
    do
    {
      if (!localIterator2.hasNext()) {
        break;
      }
      localArrayList.add(((M)localIterator2.next()).a);
    } while (localArrayList.size() != i);
    this.d.a(localArrayList);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.internal.K
 * JD-Core Version:    0.7.0.1
 */