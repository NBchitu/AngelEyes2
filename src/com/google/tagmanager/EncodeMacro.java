package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class EncodeMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.B.toString();
  private static final String b = Key.n.toString();
  private static final String c = Key.aY.toString();
  private static final String d = Key.aC.toString();
  private static final String e = Key.bg.toString();
  
  public EncodeMacro()
  {
    super(str, arrayOfString);
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    TypeSystem.Value localValue1 = (TypeSystem.Value)paramMap.get(b);
    if ((localValue1 == null) || (localValue1 == Types.d())) {
      return Types.d();
    }
    String str1 = Types.a(localValue1);
    TypeSystem.Value localValue2 = (TypeSystem.Value)paramMap.get(d);
    String str2;
    TypeSystem.Value localValue3;
    String str3;
    if (localValue2 == null)
    {
      str2 = "text";
      localValue3 = (TypeSystem.Value)paramMap.get(e);
      if (localValue3 != null) {
        break label178;
      }
      str3 = "base16";
      label79:
      ((TypeSystem.Value)paramMap.get(d));
      TypeSystem.Value localValue4 = (TypeSystem.Value)paramMap.get(c);
      if ((localValue4 == null) || (!Types.d(localValue4).booleanValue())) {
        break label366;
      }
    }
    label178:
    label339:
    label366:
    for (int i = 1;; i = 0)
    {
      for (;;)
      {
        byte[] arrayOfByte1;
        String str4;
        try
        {
          if ("text".equals(str2))
          {
            byte[] arrayOfByte2 = str1.getBytes();
            arrayOfByte1 = arrayOfByte2;
            if (!"base16".equals(str3)) {
              break label293;
            }
            str4 = Base16.a(arrayOfByte1);
            return Types.e(str4);
            str2 = Types.a(localValue2);
            break;
            str3 = Types.a(localValue3);
            break label79;
          }
          if ("base16".equals(str2))
          {
            arrayOfByte1 = Base16.a(str1);
            continue;
          }
          if ("base64".equals(str2))
          {
            arrayOfByte1 = Base64Encoder.a(str1, i);
            continue;
          }
          if ("base64url".equals(str2))
          {
            arrayOfByte1 = Base64Encoder.a(str1, i | 0x2);
            continue;
          }
          Log.a("Encode: unknown input format: " + str2);
          TypeSystem.Value localValue5 = Types.d();
          return localValue5;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          Log.a("Encode: invalid input:");
          return Types.d();
        }
        if ("base64".equals(str3))
        {
          str4 = Base64Encoder.a(arrayOfByte1, i);
        }
        else
        {
          if (!"base64url".equals(str3)) {
            break label339;
          }
          str4 = Base64Encoder.a(arrayOfByte1, i | 0x2);
        }
      }
      Log.a("Encode: unknown output format: " + str3);
      return Types.d();
    }
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.EncodeMacro
 * JD-Core Version:    0.7.0.1
 */