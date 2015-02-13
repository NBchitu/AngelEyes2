package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class CustomFunctionCall
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.n.toString();
  private static final String b = Key.au.toString();
  private static final String c = Key.c.toString();
  private final CustomFunctionCall.CustomEvaluator d;
  
  public CustomFunctionCall(CustomFunctionCall.CustomEvaluator paramCustomEvaluator)
  {
    super(str, arrayOfString);
    this.d = paramCustomEvaluator;
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    String str = Types.a((TypeSystem.Value)paramMap.get(b));
    HashMap localHashMap = new HashMap();
    TypeSystem.Value localValue1 = (TypeSystem.Value)paramMap.get(c);
    if (localValue1 != null)
    {
      Object localObject = Types.e(localValue1);
      if (!(localObject instanceof Map))
      {
        Log.b("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
        return Types.d();
      }
      Iterator localIterator = ((Map)localObject).entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localHashMap.put(localEntry.getKey().toString(), localEntry.getValue());
      }
    }
    try
    {
      TypeSystem.Value localValue2 = Types.e(this.d.a(str, localHashMap));
      return localValue2;
    }
    catch (Exception localException)
    {
      Log.b("Custom macro/tag " + str + " threw exception " + localException.getMessage());
    }
    return Types.d();
  }
  
  public boolean a()
  {
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.CustomFunctionCall
 * JD-Core Version:    0.7.0.1
 */