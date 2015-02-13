package com.google.tagmanager;

import java.util.Map;

class Container$FunctionCallMacroHandlerAdapter
  implements CustomFunctionCall.CustomEvaluator
{
  private Container$FunctionCallMacroHandlerAdapter(Container paramContainer) {}
  
  public Object a(String paramString, Map<String, Object> paramMap)
  {
    Container.FunctionCallMacroHandler localFunctionCallMacroHandler = this.a.b(paramString);
    if (localFunctionCallMacroHandler == null) {
      return null;
    }
    return localFunctionCallMacroHandler.a(paramString, paramMap);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Container.FunctionCallMacroHandlerAdapter
 * JD-Core Version:    0.7.0.1
 */