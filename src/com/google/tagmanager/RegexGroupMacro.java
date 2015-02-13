package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegexGroupMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.H.toString();
  private static final String b = Key.n.toString();
  private static final String c = Key.o.toString();
  private static final String d = Key.aB.toString();
  private static final String e = Key.av.toString();
  
  public RegexGroupMacro()
  {
    super(str, arrayOfString);
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    TypeSystem.Value localValue1 = (TypeSystem.Value)paramMap.get(b);
    TypeSystem.Value localValue2 = (TypeSystem.Value)paramMap.get(c);
    if ((localValue1 == null) || (localValue1 == Types.d()) || (localValue2 == null) || (localValue2 == Types.d())) {
      return Types.d();
    }
    int i = 64;
    if (Types.d((TypeSystem.Value)paramMap.get(d)).booleanValue()) {
      i = 66;
    }
    TypeSystem.Value localValue3 = (TypeSystem.Value)paramMap.get(e);
    int j;
    if (localValue3 != null)
    {
      Long localLong = Types.c(localValue3);
      if (localLong == Types.a()) {
        return Types.d();
      }
      j = localLong.intValue();
      if (j < 0) {
        return Types.d();
      }
    }
    else
    {
      j = 1;
    }
    try
    {
      String str1 = Types.a(localValue1);
      Matcher localMatcher = Pattern.compile(Types.a(localValue2), i).matcher(str1);
      boolean bool = localMatcher.find();
      String str2 = null;
      if (bool)
      {
        int k = localMatcher.groupCount();
        str2 = null;
        if (k >= j) {
          str2 = localMatcher.group(j);
        }
      }
      if (str2 == null) {
        return Types.d();
      }
      TypeSystem.Value localValue4 = Types.e(str2);
      return localValue4;
    }
    catch (PatternSyntaxException localPatternSyntaxException) {}
    return Types.d();
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.RegexGroupMacro
 * JD-Core Version:    0.7.0.1
 */