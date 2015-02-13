package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class FunctionCallImplementation
{
  private final Set<String> a;
  private final String b;
  
  public FunctionCallImplementation(String paramString, String... paramVarArgs)
  {
    this.b = paramString;
    this.a = new HashSet(paramVarArgs.length);
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramVarArgs[j];
      this.a.add(str);
    }
  }
  
  public abstract TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap);
  
  public abstract boolean a();
  
  boolean a(Set<String> paramSet)
  {
    return paramSet.containsAll(this.a);
  }
  
  public String d()
  {
    return this.b;
  }
  
  public Set<String> e()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.FunctionCallImplementation
 * JD-Core Version:    0.7.0.1
 */