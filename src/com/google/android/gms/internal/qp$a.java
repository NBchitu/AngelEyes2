package com.google.android.gms.internal;

import java.io.IOException;

public class qp$a
  extends IOException
{
  qp$a(int paramInt1, int paramInt2)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + paramInt1 + " limit " + paramInt2 + ").");
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.qp.a
 * JD-Core Version:    0.7.0.1
 */