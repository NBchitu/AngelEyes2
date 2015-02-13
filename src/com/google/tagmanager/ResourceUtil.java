package com.google.tagmanager;

import com.google.analytics.containertag.proto.Serving.FunctionCall;
import com.google.analytics.containertag.proto.Serving.Property;
import com.google.analytics.containertag.proto.Serving.Resource;
import com.google.analytics.containertag.proto.Serving.Rule;
import com.google.analytics.containertag.proto.Serving.ServingValue;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value.Builder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class ResourceUtil
{
  public static TypeSystem.Value.Builder a(TypeSystem.Value paramValue)
  {
    TypeSystem.Value.Builder localBuilder = TypeSystem.Value.J().a(paramValue.e()).a(paramValue.F());
    if (paramValue.I()) {
      localBuilder.b(true);
    }
    return localBuilder;
  }
  
  private static TypeSystem.Value a(int paramInt, Serving.Resource paramResource, TypeSystem.Value[] paramArrayOfValue, Set<Integer> paramSet)
  {
    if (paramSet.contains(Integer.valueOf(paramInt))) {
      a("Value cycle detected.  Current value reference: " + paramInt + "." + "  Previous value references: " + paramSet + ".");
    }
    TypeSystem.Value localValue1 = (TypeSystem.Value)a(paramResource.f(), paramInt, "values");
    if (paramArrayOfValue[paramInt] != null) {
      return paramArrayOfValue[paramInt];
    }
    paramSet.add(Integer.valueOf(paramInt));
    int i = ResourceUtil.1.a[localValue1.e().ordinal()];
    TypeSystem.Value localValue2 = null;
    switch (i)
    {
    }
    for (;;)
    {
      if (localValue2 == null) {
        a("Invalid value: " + localValue1);
      }
      paramArrayOfValue[paramInt] = localValue2;
      paramSet.remove(Integer.valueOf(paramInt));
      return localValue2;
      TypeSystem.Value.Builder localBuilder4 = a(localValue1);
      Iterator localIterator4 = b(localValue1).d().iterator();
      while (localIterator4.hasNext()) {
        localBuilder4.b(a(((Integer)localIterator4.next()).intValue(), paramResource, paramArrayOfValue, paramSet));
      }
      localValue2 = localBuilder4.c();
      continue;
      TypeSystem.Value.Builder localBuilder3 = a(localValue1);
      Serving.ServingValue localServingValue2 = b(localValue1);
      if (localServingValue2.g() != localServingValue2.i()) {
        a("Uneven map keys (" + localServingValue2.g() + ") and map values (" + localServingValue2.i() + ")");
      }
      Iterator localIterator2 = localServingValue2.f().iterator();
      while (localIterator2.hasNext()) {
        localBuilder3.c(a(((Integer)localIterator2.next()).intValue(), paramResource, paramArrayOfValue, paramSet));
      }
      Iterator localIterator3 = localServingValue2.h().iterator();
      while (localIterator3.hasNext()) {
        localBuilder3.d(a(((Integer)localIterator3.next()).intValue(), paramResource, paramArrayOfValue, paramSet));
      }
      localValue2 = localBuilder3.c();
      continue;
      TypeSystem.Value.Builder localBuilder2 = a(localValue1);
      Serving.ServingValue localServingValue1 = b(localValue1);
      if (!localServingValue1.s()) {
        a("Missing macro name reference");
      }
      for (String str = "";; str = Types.a(a(localServingValue1.t(), paramResource, paramArrayOfValue, paramSet)))
      {
        localBuilder2.b(str);
        localValue2 = localBuilder2.c();
        break;
      }
      TypeSystem.Value.Builder localBuilder1 = a(localValue1);
      Iterator localIterator1 = b(localValue1).n().iterator();
      while (localIterator1.hasNext()) {
        localBuilder1.e(a(((Integer)localIterator1.next()).intValue(), paramResource, paramArrayOfValue, paramSet));
      }
      localValue2 = localBuilder1.c();
      continue;
      localValue2 = localValue1;
    }
  }
  
  private static ResourceUtil.ExpandedFunctionCall a(Serving.FunctionCall paramFunctionCall, Serving.Resource paramResource, TypeSystem.Value[] paramArrayOfValue, int paramInt)
  {
    ResourceUtil.ExpandedFunctionCallBuilder localExpandedFunctionCallBuilder = ResourceUtil.ExpandedFunctionCall.a();
    Iterator localIterator = paramFunctionCall.d().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      Serving.Property localProperty = (Serving.Property)a(paramResource.h(), localInteger.intValue(), "properties");
      localExpandedFunctionCallBuilder.a((String)a(paramResource.d(), localProperty.e(), "keys"), (TypeSystem.Value)a(paramArrayOfValue, localProperty.g(), "values"));
    }
    return localExpandedFunctionCallBuilder.a();
  }
  
  public static ResourceUtil.ExpandedResource a(Serving.Resource paramResource)
  {
    int i = 0;
    TypeSystem.Value[] arrayOfValue = new TypeSystem.Value[paramResource.g()];
    for (int j = 0; j < paramResource.g(); j++) {
      a(j, paramResource, arrayOfValue, new HashSet(0));
    }
    ResourceUtil.ExpandedResourceBuilder localExpandedResourceBuilder = ResourceUtil.ExpandedResource.a();
    ArrayList localArrayList1 = new ArrayList();
    for (int k = 0; k < paramResource.r(); k++) {
      localArrayList1.add(a(paramResource.d(k), paramResource, arrayOfValue, k));
    }
    ArrayList localArrayList2 = new ArrayList();
    for (int m = 0; m < paramResource.t(); m++) {
      localArrayList2.add(a(paramResource.e(m), paramResource, arrayOfValue, m));
    }
    ArrayList localArrayList3 = new ArrayList();
    while (i < paramResource.m())
    {
      ResourceUtil.ExpandedFunctionCall localExpandedFunctionCall = a(paramResource.c(i), paramResource, arrayOfValue, i);
      localExpandedResourceBuilder.a(localExpandedFunctionCall);
      localArrayList3.add(localExpandedFunctionCall);
      i++;
    }
    Iterator localIterator = paramResource.u().iterator();
    while (localIterator.hasNext()) {
      localExpandedResourceBuilder.a(a((Serving.Rule)localIterator.next(), localArrayList1, localArrayList3, localArrayList2, paramResource));
    }
    localExpandedResourceBuilder.a(paramResource.G());
    localExpandedResourceBuilder.a(paramResource.R());
    return localExpandedResourceBuilder.a();
  }
  
  private static ResourceUtil.ExpandedRule a(Serving.Rule paramRule, List<ResourceUtil.ExpandedFunctionCall> paramList1, List<ResourceUtil.ExpandedFunctionCall> paramList2, List<ResourceUtil.ExpandedFunctionCall> paramList3, Serving.Resource paramResource)
  {
    ResourceUtil.ExpandedRuleBuilder localExpandedRuleBuilder = ResourceUtil.ExpandedRule.a();
    Iterator localIterator1 = paramRule.d().iterator();
    while (localIterator1.hasNext()) {
      localExpandedRuleBuilder.a((ResourceUtil.ExpandedFunctionCall)paramList3.get(((Integer)localIterator1.next()).intValue()));
    }
    Iterator localIterator2 = paramRule.f().iterator();
    while (localIterator2.hasNext()) {
      localExpandedRuleBuilder.b((ResourceUtil.ExpandedFunctionCall)paramList3.get(((Integer)localIterator2.next()).intValue()));
    }
    Iterator localIterator3 = paramRule.h().iterator();
    while (localIterator3.hasNext()) {
      localExpandedRuleBuilder.c((ResourceUtil.ExpandedFunctionCall)paramList1.get(((Integer)localIterator3.next()).intValue()));
    }
    Iterator localIterator4 = paramRule.n().iterator();
    while (localIterator4.hasNext()) {
      localExpandedRuleBuilder.a(paramResource.a(((Integer)localIterator4.next()).intValue()).g());
    }
    Iterator localIterator5 = paramRule.l().iterator();
    while (localIterator5.hasNext()) {
      localExpandedRuleBuilder.d((ResourceUtil.ExpandedFunctionCall)paramList1.get(((Integer)localIterator5.next()).intValue()));
    }
    Iterator localIterator6 = paramRule.s().iterator();
    while (localIterator6.hasNext()) {
      localExpandedRuleBuilder.b(paramResource.a(((Integer)localIterator6.next()).intValue()).g());
    }
    Iterator localIterator7 = paramRule.u().iterator();
    while (localIterator7.hasNext()) {
      localExpandedRuleBuilder.e((ResourceUtil.ExpandedFunctionCall)paramList2.get(((Integer)localIterator7.next()).intValue()));
    }
    Iterator localIterator8 = paramRule.y().iterator();
    while (localIterator8.hasNext()) {
      localExpandedRuleBuilder.c(paramResource.a(((Integer)localIterator8.next()).intValue()).g());
    }
    Iterator localIterator9 = paramRule.w().iterator();
    while (localIterator9.hasNext()) {
      localExpandedRuleBuilder.f((ResourceUtil.ExpandedFunctionCall)paramList2.get(((Integer)localIterator9.next()).intValue()));
    }
    Iterator localIterator10 = paramRule.A().iterator();
    while (localIterator10.hasNext()) {
      localExpandedRuleBuilder.d(paramResource.a(((Integer)localIterator10.next()).intValue()).g());
    }
    return localExpandedRuleBuilder.a();
  }
  
  private static <T> T a(List<T> paramList, int paramInt, String paramString)
  {
    if ((paramInt < 0) || (paramInt >= paramList.size())) {
      a("Index out of bounds detected: " + paramInt + " in " + paramString);
    }
    return paramList.get(paramInt);
  }
  
  private static <T> T a(T[] paramArrayOfT, int paramInt, String paramString)
  {
    if ((paramInt < 0) || (paramInt >= paramArrayOfT.length)) {
      a("Index out of bounds detected: " + paramInt + " in " + paramString);
    }
    return paramArrayOfT[paramInt];
  }
  
  private static void a(String paramString)
  {
    Log.a(paramString);
    throw new ResourceUtil.InvalidResourceException(paramString);
  }
  
  private static Serving.ServingValue b(TypeSystem.Value paramValue)
  {
    if (!paramValue.a(Serving.ServingValue.b)) {
      a("Expected a ServingValue and didn't get one. Value is: " + paramValue);
    }
    return (Serving.ServingValue)paramValue.b(Serving.ServingValue.b);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ResourceUtil
 * JD-Core Version:    0.7.0.1
 */