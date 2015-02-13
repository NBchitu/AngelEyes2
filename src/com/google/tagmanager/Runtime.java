package com.google.tagmanager;

import android.content.Context;
import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value.Builder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Runtime
{
  private static final ObjectAndStatic<TypeSystem.Value> a = new ObjectAndStatic(Types.d(), true);
  private final ResourceUtil.ExpandedResource b;
  private final EventInfoDistributor c;
  private final Map<String, FunctionCallImplementation> d;
  private final Map<String, FunctionCallImplementation> e;
  private final Map<String, FunctionCallImplementation> f;
  private final Cache<ResourceUtil.ExpandedFunctionCall, ObjectAndStatic<TypeSystem.Value>> g;
  private final Cache<String, ObjectAndStatic<TypeSystem.Value>> h;
  private final Set<ResourceUtil.ExpandedRule> i;
  private final Map<String, Runtime.MacroInfo> j;
  private volatile String k;
  
  public Runtime(Context paramContext, ResourceUtil.ExpandedResource paramExpandedResource, DataLayer paramDataLayer, CustomFunctionCall.CustomEvaluator paramCustomEvaluator1, CustomFunctionCall.CustomEvaluator paramCustomEvaluator2, EventInfoDistributor paramEventInfoDistributor)
  {
    if (paramExpandedResource == null) {
      throw new NullPointerException("resource cannot be null");
    }
    this.b = paramExpandedResource;
    this.i = new HashSet(paramExpandedResource.b());
    this.c = paramEventInfoDistributor;
    Runtime.1 local1 = new Runtime.1(this);
    this.g = new CacheFactory().a(1048576, local1);
    Runtime.2 local2 = new Runtime.2(this);
    this.h = new CacheFactory().a(1048576, local2);
    this.d = new HashMap();
    b(new ArbitraryPixelTag(paramContext));
    b(new CustomFunctionCall(paramCustomEvaluator2));
    b(new UniversalAnalyticsTag(paramContext, paramDataLayer));
    this.e = new HashMap();
    c(new ContainsPredicate());
    c(new EndsWithPredicate());
    c(new EqualsPredicate());
    c(new GreaterEqualsPredicate());
    c(new GreaterThanPredicate());
    c(new LessEqualsPredicate());
    c(new LessThanPredicate());
    c(new RegexPredicate());
    c(new StartsWithPredicate());
    this.f = new HashMap();
    a(new AdvertiserIdMacro(paramContext));
    a(new AdvertisingTrackingEnabledMacro());
    a(new AdwordsClickReferrerMacro(paramContext));
    a(new AppIdMacro(paramContext));
    a(new AppNameMacro(paramContext));
    a(new AppVersionMacro(paramContext));
    a(new ConstantMacro());
    a(new CustomFunctionCall(paramCustomEvaluator1));
    a(new DataLayerMacro(paramDataLayer));
    a(new DeviceIdMacro(paramContext));
    a(new DeviceNameMacro());
    a(new EncodeMacro());
    a(new EventMacro(this));
    a(new GtmVersionMacro());
    a(new HashMacro());
    a(new InstallReferrerMacro(paramContext));
    a(new JoinerMacro());
    a(new LanguageMacro());
    a(new MobileAdwordsUniqueIdMacro(paramContext));
    a(new OsVersionMacro());
    a(new PlatformMacro());
    a(new RandomMacro());
    a(new RegexGroupMacro());
    a(new ResolutionMacro(paramContext));
    a(new RuntimeVersionMacro());
    a(new SdkVersionMacro());
    a(new TimeMacro());
    this.j = new HashMap();
    Iterator localIterator1 = this.i.iterator();
    while (localIterator1.hasNext())
    {
      ResourceUtil.ExpandedRule localExpandedRule = (ResourceUtil.ExpandedRule)localIterator1.next();
      if (paramEventInfoDistributor.a())
      {
        a(localExpandedRule.f(), localExpandedRule.g(), "add macro");
        a(localExpandedRule.k(), localExpandedRule.h(), "remove macro");
        a(localExpandedRule.d(), localExpandedRule.i(), "add tag");
        a(localExpandedRule.e(), localExpandedRule.j(), "remove tag");
      }
      for (int m = 0; m < localExpandedRule.f().size(); m++)
      {
        ResourceUtil.ExpandedFunctionCall localExpandedFunctionCall3 = (ResourceUtil.ExpandedFunctionCall)localExpandedRule.f().get(m);
        String str2 = "Unknown";
        if ((paramEventInfoDistributor.a()) && (m < localExpandedRule.g().size())) {
          str2 = (String)localExpandedRule.g().get(m);
        }
        Runtime.MacroInfo localMacroInfo2 = a(this.j, a(localExpandedFunctionCall3));
        localMacroInfo2.a(localExpandedRule);
        localMacroInfo2.a(localExpandedRule, localExpandedFunctionCall3);
        localMacroInfo2.a(localExpandedRule, str2);
      }
      for (int n = 0; n < localExpandedRule.k().size(); n++)
      {
        ResourceUtil.ExpandedFunctionCall localExpandedFunctionCall2 = (ResourceUtil.ExpandedFunctionCall)localExpandedRule.k().get(n);
        String str1 = "Unknown";
        if ((paramEventInfoDistributor.a()) && (n < localExpandedRule.h().size())) {
          str1 = (String)localExpandedRule.h().get(n);
        }
        Runtime.MacroInfo localMacroInfo1 = a(this.j, a(localExpandedFunctionCall2));
        localMacroInfo1.a(localExpandedRule);
        localMacroInfo1.b(localExpandedRule, localExpandedFunctionCall2);
        localMacroInfo1.b(localExpandedRule, str1);
      }
    }
    Iterator localIterator2 = this.b.e().entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator2.next();
      Iterator localIterator3 = ((List)localEntry.getValue()).iterator();
      while (localIterator3.hasNext())
      {
        ResourceUtil.ExpandedFunctionCall localExpandedFunctionCall1 = (ResourceUtil.ExpandedFunctionCall)localIterator3.next();
        if (!Types.d((TypeSystem.Value)localExpandedFunctionCall1.b().get(Key.aX.toString())).booleanValue()) {
          a(this.j, (String)localEntry.getKey()).a(localExpandedFunctionCall1);
        }
      }
    }
  }
  
  private ObjectAndStatic<TypeSystem.Value> a(TypeSystem.Value paramValue, Set<String> paramSet, ValueBuilder paramValueBuilder)
  {
    if (!paramValue.I()) {
      return new ObjectAndStatic(paramValue, true);
    }
    switch (Runtime.5.a[paramValue.e().ordinal()])
    {
    default: 
      Log.a("Unknown type: " + paramValue.e());
      return a;
    case 1: 
      TypeSystem.Value.Builder localBuilder3 = ResourceUtil.a(paramValue);
      for (int i1 = 0; i1 < paramValue.l(); i1++)
      {
        ObjectAndStatic localObjectAndStatic5 = a(paramValue.a(i1), paramSet, paramValueBuilder.a(i1));
        if (localObjectAndStatic5 == a) {
          return a;
        }
        localBuilder3.b((TypeSystem.Value)localObjectAndStatic5.a());
      }
      return new ObjectAndStatic(localBuilder3.c(), false);
    case 2: 
      TypeSystem.Value.Builder localBuilder2 = ResourceUtil.a(paramValue);
      if (paramValue.n() != paramValue.s())
      {
        Log.a("Invalid serving value: " + paramValue.toString());
        return a;
      }
      for (int n = 0; n < paramValue.n(); n++)
      {
        ObjectAndStatic localObjectAndStatic3 = a(paramValue.b(n), paramSet, paramValueBuilder.b(n));
        ObjectAndStatic localObjectAndStatic4 = a(paramValue.c(n), paramSet, paramValueBuilder.c(n));
        if ((localObjectAndStatic3 == a) || (localObjectAndStatic4 == a)) {
          return a;
        }
        localBuilder2.c((TypeSystem.Value)localObjectAndStatic3.a());
        localBuilder2.d((TypeSystem.Value)localObjectAndStatic4.a());
      }
      return new ObjectAndStatic(localBuilder2.c(), false);
    case 3: 
      if (paramSet.contains(paramValue.u()))
      {
        Log.a("Macro cycle detected.  Current macro reference: " + paramValue.u() + "." + "  Previous macro references: " + paramSet.toString() + ".");
        return a;
      }
      paramSet.add(paramValue.u());
      ObjectAndStatic localObjectAndStatic2 = ValueEscapeUtil.a(a(paramValue.u(), paramSet, paramValueBuilder.a()), paramValue.F());
      paramSet.remove(paramValue.u());
      return localObjectAndStatic2;
    }
    TypeSystem.Value.Builder localBuilder1 = ResourceUtil.a(paramValue);
    for (int m = 0; m < paramValue.E(); m++)
    {
      ObjectAndStatic localObjectAndStatic1 = a(paramValue.d(m), paramSet, paramValueBuilder.d(m));
      if (localObjectAndStatic1 == a) {
        return a;
      }
      localBuilder1.e((TypeSystem.Value)localObjectAndStatic1.a());
    }
    return new ObjectAndStatic(localBuilder1.c(), false);
  }
  
  private ObjectAndStatic<TypeSystem.Value> a(String paramString, Set<String> paramSet, MacroEvaluationInfoBuilder paramMacroEvaluationInfoBuilder)
  {
    ObjectAndStatic localObjectAndStatic1 = (ObjectAndStatic)this.h.a(paramString);
    if ((localObjectAndStatic1 != null) && (!this.c.a())) {}
    label299:
    label316:
    for (;;)
    {
      return localObjectAndStatic1;
      Runtime.MacroInfo localMacroInfo = (Runtime.MacroInfo)this.j.get(paramString);
      if (localMacroInfo == null)
      {
        Log.a("Invalid macro: " + paramString);
        return a;
      }
      ObjectAndStatic localObjectAndStatic2 = a(paramString, localMacroInfo.a(), localMacroInfo.b(), localMacroInfo.c(), localMacroInfo.e(), localMacroInfo.d(), paramSet, paramMacroEvaluationInfoBuilder.b());
      if (((Set)localObjectAndStatic2.a()).isEmpty()) {}
      for (ResourceUtil.ExpandedFunctionCall localExpandedFunctionCall = localMacroInfo.f(); localExpandedFunctionCall == null; localExpandedFunctionCall = (ResourceUtil.ExpandedFunctionCall)((Set)localObjectAndStatic2.a()).iterator().next())
      {
        return a;
        if (((Set)localObjectAndStatic2.a()).size() > 1) {
          Log.b("Multiple macros active for macroName " + paramString);
        }
      }
      ObjectAndStatic localObjectAndStatic3 = a(this.f, localExpandedFunctionCall, paramSet, paramMacroEvaluationInfoBuilder.a());
      boolean bool;
      if ((localObjectAndStatic2.b()) && (localObjectAndStatic3.b()))
      {
        bool = true;
        if (localObjectAndStatic3 != a) {
          break label299;
        }
      }
      for (localObjectAndStatic1 = a;; localObjectAndStatic1 = new ObjectAndStatic(localObjectAndStatic3.a(), bool))
      {
        if (!localObjectAndStatic1.b()) {
          break label316;
        }
        this.h.a(paramString, localObjectAndStatic1);
        return localObjectAndStatic1;
        bool = false;
        break;
      }
    }
  }
  
  private ObjectAndStatic<TypeSystem.Value> a(Map<String, FunctionCallImplementation> paramMap, ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall, Set<String> paramSet, ResolvedFunctionCallBuilder paramResolvedFunctionCallBuilder)
  {
    boolean bool1 = true;
    TypeSystem.Value localValue = (TypeSystem.Value)paramExpandedFunctionCall.b().get(Key.at.toString());
    ObjectAndStatic localObjectAndStatic1;
    if (localValue == null)
    {
      Log.a("No function id in properties");
      localObjectAndStatic1 = a;
    }
    String str;
    FunctionCallImplementation localFunctionCallImplementation;
    do
    {
      return localObjectAndStatic1;
      str = localValue.x();
      localFunctionCallImplementation = (FunctionCallImplementation)paramMap.get(str);
      if (localFunctionCallImplementation == null)
      {
        Log.a(str + " has no backing implementation.");
        return a;
      }
      localObjectAndStatic1 = (ObjectAndStatic)this.g.a(paramExpandedFunctionCall);
    } while ((localObjectAndStatic1 != null) && (!this.c.a()));
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramExpandedFunctionCall.b().entrySet().iterator();
    boolean bool2 = bool1;
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ResolvedPropertyBuilder localResolvedPropertyBuilder = paramResolvedFunctionCallBuilder.a((String)localEntry.getKey());
      ObjectAndStatic localObjectAndStatic3 = a((TypeSystem.Value)localEntry.getValue(), paramSet, localResolvedPropertyBuilder.a((TypeSystem.Value)localEntry.getValue()));
      if (localObjectAndStatic3 == a) {
        return a;
      }
      if (localObjectAndStatic3.b()) {
        paramExpandedFunctionCall.a((String)localEntry.getKey(), (TypeSystem.Value)localObjectAndStatic3.a());
      }
      for (boolean bool3 = bool2;; bool3 = false)
      {
        localHashMap.put(localEntry.getKey(), localObjectAndStatic3.a());
        bool2 = bool3;
        break;
      }
    }
    if (!localFunctionCallImplementation.a(localHashMap.keySet()))
    {
      Log.a("Incorrect keys for function " + str + " required " + localFunctionCallImplementation.e() + " had " + localHashMap.keySet());
      return a;
    }
    if ((bool2) && (localFunctionCallImplementation.a())) {}
    for (;;)
    {
      ObjectAndStatic localObjectAndStatic2 = new ObjectAndStatic(localFunctionCallImplementation.a(localHashMap), bool1);
      if (bool1) {
        this.g.a(paramExpandedFunctionCall, localObjectAndStatic2);
      }
      paramResolvedFunctionCallBuilder.a((TypeSystem.Value)localObjectAndStatic2.a());
      return localObjectAndStatic2;
      bool1 = false;
    }
  }
  
  private ObjectAndStatic<Set<ResourceUtil.ExpandedFunctionCall>> a(Set<ResourceUtil.ExpandedRule> paramSet, Set<String> paramSet1, Runtime.AddRemoveSetPopulator paramAddRemoveSetPopulator, RuleEvaluationStepInfoBuilder paramRuleEvaluationStepInfoBuilder)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    Iterator localIterator = paramSet.iterator();
    boolean bool1 = true;
    if (localIterator.hasNext())
    {
      ResourceUtil.ExpandedRule localExpandedRule = (ResourceUtil.ExpandedRule)localIterator.next();
      ResolvedRuleBuilder localResolvedRuleBuilder = paramRuleEvaluationStepInfoBuilder.a();
      ObjectAndStatic localObjectAndStatic = a(localExpandedRule, paramSet1, localResolvedRuleBuilder);
      if (((Boolean)localObjectAndStatic.a()).booleanValue()) {
        paramAddRemoveSetPopulator.a(localExpandedRule, localHashSet1, localHashSet2, localResolvedRuleBuilder);
      }
      if ((bool1) && (localObjectAndStatic.b())) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        bool1 = bool2;
        break;
      }
    }
    localHashSet1.removeAll(localHashSet2);
    paramRuleEvaluationStepInfoBuilder.a(localHashSet1);
    return new ObjectAndStatic(localHashSet1, bool1);
  }
  
  private static Runtime.MacroInfo a(Map<String, Runtime.MacroInfo> paramMap, String paramString)
  {
    Runtime.MacroInfo localMacroInfo = (Runtime.MacroInfo)paramMap.get(paramString);
    if (localMacroInfo == null)
    {
      localMacroInfo = new Runtime.MacroInfo();
      paramMap.put(paramString, localMacroInfo);
    }
    return localMacroInfo;
  }
  
  private static String a(ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall)
  {
    return Types.a((TypeSystem.Value)paramExpandedFunctionCall.b().get(Key.aD.toString()));
  }
  
  private static void a(List<ResourceUtil.ExpandedFunctionCall> paramList, List<String> paramList1, String paramString)
  {
    if (paramList.size() != paramList1.size()) {
      Log.c("Invalid resource: imbalance of rule names of functions for " + paramString + " operation. Using default rule name instead");
    }
  }
  
  private static void a(Map<String, FunctionCallImplementation> paramMap, FunctionCallImplementation paramFunctionCallImplementation)
  {
    if (paramMap.containsKey(paramFunctionCallImplementation.d())) {
      throw new IllegalArgumentException("Duplicate function type name: " + paramFunctionCallImplementation.d());
    }
    paramMap.put(paramFunctionCallImplementation.d(), paramFunctionCallImplementation);
  }
  
  ObjectAndStatic<Boolean> a(ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall, Set<String> paramSet, ResolvedFunctionCallBuilder paramResolvedFunctionCallBuilder)
  {
    ObjectAndStatic localObjectAndStatic = a(this.e, paramExpandedFunctionCall, paramSet, paramResolvedFunctionCallBuilder);
    Boolean localBoolean = Types.d((TypeSystem.Value)localObjectAndStatic.a());
    paramResolvedFunctionCallBuilder.a(Types.e(localBoolean));
    return new ObjectAndStatic(localBoolean, localObjectAndStatic.b());
  }
  
  ObjectAndStatic<Boolean> a(ResourceUtil.ExpandedRule paramExpandedRule, Set<String> paramSet, ResolvedRuleBuilder paramResolvedRuleBuilder)
  {
    Iterator localIterator1 = paramExpandedRule.c().iterator();
    boolean bool1 = true;
    if (localIterator1.hasNext())
    {
      ObjectAndStatic localObjectAndStatic2 = a((ResourceUtil.ExpandedFunctionCall)localIterator1.next(), paramSet, paramResolvedRuleBuilder.a());
      if (((Boolean)localObjectAndStatic2.a()).booleanValue())
      {
        paramResolvedRuleBuilder.a(Types.e(Boolean.valueOf(false)));
        return new ObjectAndStatic(Boolean.valueOf(false), localObjectAndStatic2.b());
      }
      if ((bool1) && (localObjectAndStatic2.b())) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        bool1 = bool2;
        break;
      }
    }
    Iterator localIterator2 = paramExpandedRule.b().iterator();
    while (localIterator2.hasNext())
    {
      ObjectAndStatic localObjectAndStatic1 = a((ResourceUtil.ExpandedFunctionCall)localIterator2.next(), paramSet, paramResolvedRuleBuilder.b());
      if (!((Boolean)localObjectAndStatic1.a()).booleanValue())
      {
        paramResolvedRuleBuilder.a(Types.e(Boolean.valueOf(false)));
        return new ObjectAndStatic(Boolean.valueOf(false), localObjectAndStatic1.b());
      }
      if ((bool1) && (localObjectAndStatic1.b())) {
        bool1 = true;
      } else {
        bool1 = false;
      }
    }
    paramResolvedRuleBuilder.a(Types.e(Boolean.valueOf(true)));
    return new ObjectAndStatic(Boolean.valueOf(true), bool1);
  }
  
  public ObjectAndStatic<TypeSystem.Value> a(String paramString)
  {
    EventInfoBuilder localEventInfoBuilder = this.c.a(paramString);
    ObjectAndStatic localObjectAndStatic = a(paramString, new HashSet(), localEventInfoBuilder.a());
    localEventInfoBuilder.b();
    return localObjectAndStatic;
  }
  
  ObjectAndStatic<Set<ResourceUtil.ExpandedFunctionCall>> a(String paramString, Set<ResourceUtil.ExpandedRule> paramSet, Map<ResourceUtil.ExpandedRule, List<ResourceUtil.ExpandedFunctionCall>> paramMap1, Map<ResourceUtil.ExpandedRule, List<String>> paramMap2, Map<ResourceUtil.ExpandedRule, List<ResourceUtil.ExpandedFunctionCall>> paramMap3, Map<ResourceUtil.ExpandedRule, List<String>> paramMap4, Set<String> paramSet1, RuleEvaluationStepInfoBuilder paramRuleEvaluationStepInfoBuilder)
  {
    return a(paramSet, paramSet1, new Runtime.3(this, paramMap1, paramMap2, paramMap3, paramMap4), paramRuleEvaluationStepInfoBuilder);
  }
  
  String a()
  {
    try
    {
      String str = this.k;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  void a(FunctionCallImplementation paramFunctionCallImplementation)
  {
    a(this.f, paramFunctionCallImplementation);
  }
  
  void b(FunctionCallImplementation paramFunctionCallImplementation)
  {
    a(this.d, paramFunctionCallImplementation);
  }
  
  void c(FunctionCallImplementation paramFunctionCallImplementation)
  {
    a(this.e, paramFunctionCallImplementation);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Runtime
 * JD-Core Version:    0.7.0.1
 */