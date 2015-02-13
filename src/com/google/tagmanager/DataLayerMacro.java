package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class DataLayerMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.i.toString();
  private static final String b = Key.aS.toString();
  private static final String c = Key.ab.toString();
  private final DataLayer d;
  
  public DataLayerMacro(DataLayer paramDataLayer)
  {
    super(str, arrayOfString);
    this.d = paramDataLayer;
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    Object localObject = this.d.a(Types.a((TypeSystem.Value)paramMap.get(b)));
    if (localObject == null)
    {
      TypeSystem.Value localValue = (TypeSystem.Value)paramMap.get(c);
      if (localValue != null) {
        return localValue;
      }
      return Types.d();
    }
    return Types.e(localObject);
  }
  
  public boolean a()
  {
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.DataLayerMacro
 * JD-Core Version:    0.7.0.1
 */