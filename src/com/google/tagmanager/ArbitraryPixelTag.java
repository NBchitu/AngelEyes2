package com.google.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ArbitraryPixelTag
  extends TrackingTag
{
  static final String a = "gtm_" + b + "_unrepeatable";
  private static final String b = FunctionType.R.toString();
  private static final String c = Key.cc.toString();
  private static final String d = Key.c.toString();
  private static final String e = Key.cb.toString();
  private static final Set<String> f = new HashSet();
  private final ArbitraryPixelTag.HitSenderProvider g;
  private final Context h;
  
  public ArbitraryPixelTag(Context paramContext)
  {
    this(paramContext, new ArbitraryPixelTag.1(paramContext));
  }
  
  ArbitraryPixelTag(Context paramContext, ArbitraryPixelTag.HitSenderProvider paramHitSenderProvider)
  {
    super(str, arrayOfString);
    this.g = paramHitSenderProvider;
    this.h = paramContext;
  }
  
  private boolean c(String paramString)
  {
    boolean bool1 = true;
    for (;;)
    {
      try
      {
        boolean bool2 = b(paramString);
        if (bool2) {
          return bool1;
        }
        if (a(paramString)) {
          f.add(paramString);
        } else {
          bool1 = false;
        }
      }
      finally {}
    }
  }
  
  boolean a(String paramString)
  {
    return this.h.getSharedPreferences(a, 0).contains(paramString);
  }
  
  public void b(Map<String, TypeSystem.Value> paramMap)
  {
    String str1;
    if (paramMap.get(e) != null)
    {
      str1 = Types.a((TypeSystem.Value)paramMap.get(e));
      if ((str1 == null) || (!c(str1))) {
        break label46;
      }
    }
    label46:
    do
    {
      return;
      str1 = null;
      break;
      Uri.Builder localBuilder = Uri.parse(Types.a((TypeSystem.Value)paramMap.get(c))).buildUpon();
      TypeSystem.Value localValue = (TypeSystem.Value)paramMap.get(d);
      if (localValue != null)
      {
        Object localObject2 = Types.e(localValue);
        if (!(localObject2 instanceof List))
        {
          Log.a("ArbitraryPixel: additional params not a list: not sending partial hit: " + localBuilder.build().toString());
          return;
        }
        Iterator localIterator1 = ((List)localObject2).iterator();
        while (localIterator1.hasNext())
        {
          Object localObject3 = localIterator1.next();
          if (!(localObject3 instanceof Map))
          {
            Log.a("ArbitraryPixel: additional params contains non-map: not sending partial hit: " + localBuilder.build().toString());
            return;
          }
          Iterator localIterator2 = ((Map)localObject3).entrySet().iterator();
          while (localIterator2.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)localIterator2.next();
            localBuilder.appendQueryParameter(localEntry.getKey().toString(), localEntry.getValue().toString());
          }
        }
      }
      String str2 = localBuilder.build().toString();
      this.g.a().a(str2);
      Log.e("ArbitraryPixel: url = " + str2);
    } while (str1 == null);
    try
    {
      f.add(str1);
      SharedPreferencesUtil.a(this.h, a, str1, "true");
      return;
    }
    finally {}
  }
  
  boolean b(String paramString)
  {
    return f.contains(paramString);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ArbitraryPixelTag
 * JD-Core Version:    0.7.0.1
 */