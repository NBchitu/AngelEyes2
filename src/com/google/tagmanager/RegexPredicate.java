package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegexPredicate
  extends StringPredicate
{
  private static final String a = FunctionType.I.toString();
  private static final String b = Key.aB.toString();
  
  public RegexPredicate()
  {
    super(a);
  }
  
  protected boolean a(String paramString1, String paramString2, Map<String, TypeSystem.Value> paramMap)
  {
    if (Types.d((TypeSystem.Value)paramMap.get(b)).booleanValue()) {}
    for (int i = 66;; i = 64) {
      try
      {
        boolean bool = Pattern.compile(paramString2, i).matcher(paramString1).find();
        return bool;
      }
      catch (PatternSyntaxException localPatternSyntaxException)
      {
        return false;
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.RegexPredicate
 * JD-Core Version:    0.7.0.1
 */