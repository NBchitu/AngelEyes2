package com.telesoftas.services;

import android.content.Context;
import com.crashlytics.android.Crashlytics;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayDeque;
import java.util.Iterator;

public class SignalStream
{
  public static float a = -1.0F;
  private final ArrayDeque<SignalBundle> b = new ArrayDeque();
  private final ArrayDeque<Signal> c = new ArrayDeque(64);
  private final Object d = new Object();
  
  private static float a(Context paramContext, ImmutableList<Signal> paramImmutableList)
  {
    Iterator localIterator = paramImmutableList.iterator();
    for (float f = 0.0F; localIterator.hasNext(); f += ((Signal)localIterator.next()).a(paramContext)) {}
    return f;
  }
  
  private float a(Context paramContext, SignalBundle paramSignalBundle)
  {
    Object localObject = paramSignalBundle.c();
    if ((localObject instanceof Float)) {
      return ((Float)localObject).floatValue();
    }
    float f = a(paramContext, paramSignalBundle.b());
    paramSignalBundle.a(Float.valueOf(f));
    return f;
  }
  
  public ImmutableList<Signal> a(Context paramContext, float paramFloat)
  {
    ImmutableList.Builder localBuilder;
    for (;;)
    {
      ArrayDeque localArrayDeque;
      float f2;
      SignalBundle localSignalBundle;
      synchronized (this.d)
      {
        ImmutableList localImmutableList1 = ImmutableList.a(this.c);
        float f1 = a(paramContext, localImmutableList1);
        localArrayDeque = new ArrayDeque();
        localArrayDeque.push(localImmutableList1);
        Iterator localIterator1 = this.b.iterator();
        f2 = f1;
        if (localIterator1.hasNext())
        {
          localSignalBundle = (SignalBundle)localIterator1.next();
          if ((f2 < paramFloat) || (paramFloat <= 0.0F)) {}
        }
        else
        {
          localBuilder = new ImmutableList.Builder();
          Iterator localIterator2 = localArrayDeque.iterator();
          if (!localIterator2.hasNext()) {
            break;
          }
          localBuilder.b((ImmutableList)localIterator2.next());
        }
      }
      f2 += a(paramContext, localSignalBundle);
      localArrayDeque.push(localSignalBundle.b());
    }
    ImmutableList localImmutableList2 = localBuilder.a();
    return localImmutableList2;
  }
  
  void a(Signal paramSignal, float paramFloat)
  {
    for (;;)
    {
      synchronized (this.d)
      {
        this.c.addLast(paramSignal);
        if (this.c.size() == 64)
        {
          SignalBundle localSignalBundle1 = new SignalBundle(ImmutableList.a(this.c), paramSignal.k());
          this.c.clear();
          this.b.addFirst(localSignalBundle1);
        }
        long l = System.nanoTime() - (6.E+010F * paramFloat);
        int i = -10 + this.b.size();
        Iterator localIterator = this.b.iterator();
        j = 0;
        if (!localIterator.hasNext()) {
          break label231;
        }
        SignalBundle localSignalBundle2 = (SignalBundle)localIterator.next();
        if (j >= i)
        {
          break label231;
          if (k < j)
          {
            this.b.removeLast();
            k++;
            continue;
          }
        }
        else
        {
          if (localSignalBundle2.a() >= l) {
            break label224;
          }
          n = j + 1;
          break label237;
        }
        int m = this.b.size();
        Crashlytics.a("history_bundles", m);
        if (m > 0) {
          Crashlytics.a("history_timespan", System.nanoTime() - ((SignalBundle)this.b.getLast()).a());
        }
        return;
      }
      label224:
      int n = j;
      break label237;
      label231:
      int k = 0;
      continue;
      label237:
      int j = n;
    }
  }
  
  public boolean a()
  {
    for (;;)
    {
      synchronized (this.d)
      {
        if ((this.b.isEmpty()) && (this.c.isEmpty()))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public void b()
  {
    synchronized (this.d)
    {
      this.b.clear();
      this.c.clear();
      return;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.services.SignalStream
 * JD-Core Version:    0.7.0.1
 */