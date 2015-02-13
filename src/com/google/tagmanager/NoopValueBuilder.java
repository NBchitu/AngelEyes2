package com.google.tagmanager;

class NoopValueBuilder
  implements ValueBuilder
{
  public MacroEvaluationInfoBuilder a()
  {
    return new NoopMacroEvaluationInfoBuilder();
  }
  
  public ValueBuilder a(int paramInt)
  {
    return new NoopValueBuilder();
  }
  
  public ValueBuilder b(int paramInt)
  {
    return new NoopValueBuilder();
  }
  
  public ValueBuilder c(int paramInt)
  {
    return new NoopValueBuilder();
  }
  
  public ValueBuilder d(int paramInt)
  {
    return new NoopValueBuilder();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.NoopValueBuilder
 * JD-Core Version:    0.7.0.1
 */