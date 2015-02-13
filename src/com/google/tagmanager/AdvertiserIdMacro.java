package com.google.tagmanager;

import android.content.Context;
import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class AdvertiserIdMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.a.toString();
  private final Context b;
  
  public AdvertiserIdMacro(Context paramContext)
  {
    super(a, new String[0]);
    this.b = paramContext;
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    return Types.d();
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.AdvertiserIdMacro
 * JD-Core Version:    0.7.0.1
 */