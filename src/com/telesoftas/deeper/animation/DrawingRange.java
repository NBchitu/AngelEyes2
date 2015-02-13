package com.telesoftas.deeper.animation;

public class DrawingRange
{
  private final int a;
  private int b;
  private int c;
  
  public DrawingRange(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = Math.min(paramInt2, paramInt3);
    this.c = Math.max(paramInt2, paramInt3);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    if (paramInt < this.b) {
      this.b = paramInt;
    }
    while (paramInt <= this.c) {
      return;
    }
    this.c = paramInt;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public int d()
  {
    return 1 + (this.c - this.b);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.DrawingRange
 * JD-Core Version:    0.7.0.1
 */