package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class JoinerMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.F.toString();
  private static final String b = Key.n.toString();
  private static final String c = Key.aF.toString();
  private static final String d = Key.aI.toString();
  private static final String e = Key.ak.toString();
  
  public JoinerMacro()
  {
    super(str, arrayOfString);
  }
  
  private String a(String paramString, JoinerMacro.EscapeType paramEscapeType, Set<Character> paramSet)
  {
    switch (JoinerMacro.1.b[paramEscapeType.ordinal()])
    {
    default: 
      return paramString;
    case 1: 
      try
      {
        String str4 = ValueEscapeUtil.a(paramString);
        return str4;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        Log.a("Joiner: unsupported encoding", localUnsupportedEncodingException);
        return paramString;
      }
    }
    String str1 = paramString.replace("\\", "\\\\");
    Iterator localIterator = paramSet.iterator();
    String str3;
    for (String str2 = str1; localIterator.hasNext(); str2 = str2.replace(str3, "\\" + str3)) {
      str3 = ((Character)localIterator.next()).toString();
    }
    return str2;
  }
  
  private void a(StringBuilder paramStringBuilder, String paramString, JoinerMacro.EscapeType paramEscapeType, Set<Character> paramSet)
  {
    paramStringBuilder.append(a(paramString, paramEscapeType, paramSet));
  }
  
  private void a(Set<Character> paramSet, String paramString)
  {
    for (int i = 0; i < paramString.length(); i++) {
      paramSet.add(Character.valueOf(paramString.charAt(i)));
    }
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    TypeSystem.Value localValue1 = (TypeSystem.Value)paramMap.get(b);
    if (localValue1 == null) {
      return Types.d();
    }
    TypeSystem.Value localValue2 = (TypeSystem.Value)paramMap.get(c);
    String str1;
    String str2;
    label70:
    JoinerMacro.EscapeType localEscapeType1;
    String str5;
    JoinerMacro.EscapeType localEscapeType2;
    Object localObject;
    if (localValue2 != null)
    {
      str1 = Types.a(localValue2);
      TypeSystem.Value localValue3 = (TypeSystem.Value)paramMap.get(d);
      if (localValue3 == null) {
        break label198;
      }
      str2 = Types.a(localValue3);
      localEscapeType1 = JoinerMacro.EscapeType.a;
      TypeSystem.Value localValue4 = (TypeSystem.Value)paramMap.get(e);
      if (localValue4 == null) {
        break label440;
      }
      str5 = Types.a(localValue4);
      if (!"url".equals(str5)) {
        break label205;
      }
      localEscapeType2 = JoinerMacro.EscapeType.b;
      localObject = null;
    }
    for (;;)
    {
      label119:
      StringBuilder localStringBuilder = new StringBuilder();
      int i = JoinerMacro.1.a[localValue1.e().ordinal()];
      int j = 0;
      switch (i)
      {
      default: 
        a(localStringBuilder, Types.a(localValue1), localEscapeType2, (Set)localObject);
      }
      for (;;)
      {
        return Types.e(localStringBuilder.toString());
        str1 = "";
        break;
        label198:
        str2 = "=";
        break label70;
        label205:
        if ("backslash".equals(str5))
        {
          localEscapeType2 = JoinerMacro.EscapeType.c;
          localObject = new HashSet();
          a((Set)localObject, str1);
          a((Set)localObject, str2);
          ((Set)localObject).remove(Character.valueOf('\\'));
          break label119;
        }
        Log.a("Joiner: unsupported escape type: " + str5);
        return Types.d();
        int k = 1;
        Iterator localIterator = localValue1.i().iterator();
        while (localIterator.hasNext())
        {
          TypeSystem.Value localValue5 = (TypeSystem.Value)localIterator.next();
          if (k == 0) {
            localStringBuilder.append(str1);
          }
          a(localStringBuilder, Types.a(localValue5), localEscapeType2, (Set)localObject);
          k = 0;
        }
        while (j < localValue1.n())
        {
          if (j > 0) {
            localStringBuilder.append(str1);
          }
          String str3 = Types.a(localValue1.b(j));
          String str4 = Types.a(localValue1.c(j));
          a(localStringBuilder, str3, localEscapeType2, (Set)localObject);
          localStringBuilder.append(str2);
          a(localStringBuilder, str4, localEscapeType2, (Set)localObject);
          j++;
        }
      }
      label440:
      localEscapeType2 = localEscapeType1;
      localObject = null;
    }
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.JoinerMacro
 * JD-Core Version:    0.7.0.1
 */