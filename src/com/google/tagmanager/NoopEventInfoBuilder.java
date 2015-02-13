package com.google.tagmanager;

class NoopEventInfoBuilder
  implements EventInfoBuilder
{
  public MacroEvaluationInfoBuilder a()
  {
    return new NoopMacroEvaluationInfoBuilder();
  }
  
  public void b() {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.NoopEventInfoBuilder
 * JD-Core Version:    0.7.0.1
 */