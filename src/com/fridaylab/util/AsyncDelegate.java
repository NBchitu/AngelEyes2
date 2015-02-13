package com.fridaylab.util;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class AsyncDelegate
  extends AsyncTask<Object, Object, Object>
{
  private static final BlockingQueue<String> a = null;
  private boolean b;
  
  static
  {
    if (Build.VERSION.SDK_INT < 11)
    {
      a = new LinkedBlockingQueue();
      a.add("token");
      return;
    }
  }
  
  protected abstract void d();
  
  /* Error */
  protected final Object doInBackground(Object... paramVarArgs)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 41	com/fridaylab/util/AsyncDelegate:b	Z
    //   6: ifeq +102 -> 108
    //   9: getstatic 18	android/os/Build$VERSION:SDK_INT	I
    //   12: bipush 11
    //   14: if_icmpge +94 -> 108
    //   17: getstatic 25	com/fridaylab/util/AsyncDelegate:a	Ljava/util/concurrent/BlockingQueue;
    //   20: invokeinterface 45 1 0
    //   25: checkcast 47	java/lang/String
    //   28: astore 6
    //   30: aload_0
    //   31: invokevirtual 49	com/fridaylab/util/AsyncDelegate:d	()V
    //   34: aload 6
    //   36: ifnull +14 -> 50
    //   39: getstatic 25	com/fridaylab/util/AsyncDelegate:a	Ljava/util/concurrent/BlockingQueue;
    //   42: aload 6
    //   44: invokeinterface 33 2 0
    //   49: pop
    //   50: aconst_null
    //   51: areturn
    //   52: astore 5
    //   54: aconst_null
    //   55: astore 6
    //   57: aload 6
    //   59: ifnull -9 -> 50
    //   62: getstatic 25	com/fridaylab/util/AsyncDelegate:a	Ljava/util/concurrent/BlockingQueue;
    //   65: aload 6
    //   67: invokeinterface 33 2 0
    //   72: pop
    //   73: aconst_null
    //   74: areturn
    //   75: astore_3
    //   76: aload_2
    //   77: ifnull +13 -> 90
    //   80: getstatic 25	com/fridaylab/util/AsyncDelegate:a	Ljava/util/concurrent/BlockingQueue;
    //   83: aload_2
    //   84: invokeinterface 33 2 0
    //   89: pop
    //   90: aload_3
    //   91: athrow
    //   92: astore 9
    //   94: aload 6
    //   96: astore_2
    //   97: aload 9
    //   99: astore_3
    //   100: goto -24 -> 76
    //   103: astore 8
    //   105: goto -48 -> 57
    //   108: aconst_null
    //   109: astore 6
    //   111: goto -81 -> 30
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	AsyncDelegate
    //   0	114	1	paramVarArgs	Object[]
    //   1	96	2	localObject1	Object
    //   75	16	3	localObject2	Object
    //   99	1	3	localObject3	Object
    //   52	1	5	localInterruptedException1	java.lang.InterruptedException
    //   28	82	6	str	String
    //   103	1	8	localInterruptedException2	java.lang.InterruptedException
    //   92	6	9	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   2	30	52	java/lang/InterruptedException
    //   2	30	75	finally
    //   30	34	92	finally
    //   30	34	103	java/lang/InterruptedException
  }
  
  @SuppressLint({"NewApi"})
  public void g()
  {
    this.b = true;
    if (Build.VERSION.SDK_INT >= 11)
    {
      executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Object[0]);
      return;
    }
    execute(new Object[0]);
  }
  
  @SuppressLint({"NewApi"})
  public void h()
  {
    this.b = false;
    if (Build.VERSION.SDK_INT >= 11)
    {
      executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
      return;
    }
    execute(new Object[0]);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.util.AsyncDelegate
 * JD-Core Version:    0.7.0.1
 */