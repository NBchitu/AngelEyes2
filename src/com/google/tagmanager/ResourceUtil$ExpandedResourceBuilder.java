package com.google.tagmanager;

import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourceUtil$ExpandedResourceBuilder
{
  private final List<ResourceUtil.ExpandedRule> a = new ArrayList();
  private final List<ResourceUtil.ExpandedFunctionCall> b = new ArrayList();
  private final List<ResourceUtil.ExpandedFunctionCall> c = new ArrayList();
  private final Map<String, List<ResourceUtil.ExpandedFunctionCall>> d = new HashMap();
  private String e = "";
  private int f = 0;
  
  public ResourceUtil.ExpandedResource a()
  {
    return new ResourceUtil.ExpandedResource(this.a, this.d, this.e, this.f, null);
  }
  
  public ExpandedResourceBuilder a(int paramInt)
  {
    this.f = paramInt;
    return this;
  }
  
  public ExpandedResourceBuilder a(ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall)
  {
    String str = Types.a((TypeSystem.Value)paramExpandedFunctionCall.b().get(Key.aD.toString()));
    Object localObject = (List)this.d.get(str);
    if (localObject == null)
    {
      localObject = new ArrayList();
      this.d.put(str, localObject);
    }
    ((List)localObject).add(paramExpandedFunctionCall);
    return this;
  }
  
  public ExpandedResourceBuilder a(ResourceUtil.ExpandedRule paramExpandedRule)
  {
    this.a.add(paramExpandedRule);
    return this;
  }
  
  public ExpandedResourceBuilder a(String paramString)
  {
    this.e = paramString;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ResourceUtil.ExpandedResourceBuilder
 * JD-Core Version:    0.7.0.1
 */