package com.fridaylab.util;

public abstract class AsyncRequest<T extends AsyncRequest<T>>
  extends AsyncDelegate
{
  private final AsyncRequest.OnCompleteListener<T> a;
  
  public AsyncRequest(AsyncRequest.OnCompleteListener<T> paramOnCompleteListener)
  {
    this.a = paramOnCompleteListener;
  }
  
  protected abstract T f();
  
  protected void onPostExecute(Object paramObject)
  {
    super.onPostExecute(paramObject);
    if (this.a != null) {
      this.a.a(f());
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.util.AsyncRequest
 * JD-Core Version:    0.7.0.1
 */