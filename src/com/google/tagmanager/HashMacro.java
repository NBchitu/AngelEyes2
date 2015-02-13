package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

class HashMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.D.toString();
  private static final String b = Key.n.toString();
  private static final String c = Key.e.toString();
  private static final String d = Key.aC.toString();
  
  public HashMacro()
  {
    super(str, arrayOfString);
  }
  
  private byte[] a(String paramString, byte[] paramArrayOfByte)
  {
    MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
    localMessageDigest.update(paramArrayOfByte);
    return localMessageDigest.digest();
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    TypeSystem.Value localValue1 = (TypeSystem.Value)paramMap.get(b);
    if ((localValue1 == null) || (localValue1 == Types.d())) {
      return Types.d();
    }
    String str1 = Types.a(localValue1);
    TypeSystem.Value localValue2 = (TypeSystem.Value)paramMap.get(c);
    String str2;
    TypeSystem.Value localValue3;
    String str3;
    label79:
    byte[] arrayOfByte;
    if (localValue2 == null)
    {
      str2 = "MD5";
      localValue3 = (TypeSystem.Value)paramMap.get(d);
      if (localValue3 != null) {
        break label124;
      }
      str3 = "text";
      if (!"text".equals(str3)) {
        break label134;
      }
      arrayOfByte = str1.getBytes();
    }
    for (;;)
    {
      label134:
      try
      {
        TypeSystem.Value localValue4 = Types.e(Base16.a(a(str2, arrayOfByte)));
        return localValue4;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        label124:
        Log.a("Hash: unknown algorithm: " + str2);
      }
      str2 = Types.a(localValue2);
      break;
      str3 = Types.a(localValue3);
      break label79;
      if ("base16".equals(str3))
      {
        arrayOfByte = Base16.a(str1);
      }
      else
      {
        Log.a("Hash: unknown input format: " + str3);
        return Types.d();
      }
    }
    return Types.d();
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.HashMacro
 * JD-Core Version:    0.7.0.1
 */