package com.google.android.gms.common.data;

import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.HashMap;

public class DataHolder$a
{
  private final String[] a;
  private final ArrayList<HashMap<String, Object>> b;
  private final String c;
  private final HashMap<Object, Integer> d;
  private boolean e;
  private String f;
  
  private DataHolder$a(String[] paramArrayOfString, String paramString)
  {
    this.a = ((String[])jx.a(paramArrayOfString));
    this.b = new ArrayList();
    this.c = paramString;
    this.d = new HashMap();
    this.e = false;
    this.f = null;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataHolder.a
 * JD-Core Version:    0.7.0.1
 */