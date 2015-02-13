package com.google.tagmanager;

class SendHitRateLimiter
  implements RateLimiter
{
  private final long a;
  private final int b;
  private double c;
  private long d;
  private final Object e = new Object();
  
  public SendHitRateLimiter()
  {
    this(60, 2000L);
  }
  
  public SendHitRateLimiter(int paramInt, long paramLong)
  {
    this.b = paramInt;
    this.c = this.b;
    this.a = paramLong;
  }
  
  public boolean a()
  {
    synchronized (this.e)
    {
      long l = System.currentTimeMillis();
      if (this.c < this.b)
      {
        double d1 = (l - this.d) / this.a;
        if (d1 > 0.0D) {
          this.c = Math.min(this.b, d1 + this.c);
        }
      }
      this.d = l;
      if (this.c >= 1.0D)
      {
        this.c -= 1.0D;
        return true;
      }
      Log.b("No more tokens available.");
      return false;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.SendHitRateLimiter
 * JD-Core Version:    0.7.0.1
 */