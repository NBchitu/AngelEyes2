package com.telesoftas.deeper.animation;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseIntArray;
import com.google.common.collect.ImmutableList;
import com.telesoftas.hardware.DeeperRawDataPacket;
import java.util.BitSet;

public class RawSignalBuffer
{
  private final int a;
  private Bitmap b;
  private final int[] c;
  private final SparseIntArray d;
  private final BitSet e;
  private final BitSet f;
  private final int[] g = new int[1120];
  private final int[] h = new int[1120];
  private final RectF i;
  private final Rect j;
  private final Paint k;
  private int l;
  private int m;
  private float n;
  
  public RawSignalBuffer(int paramInt)
  {
    this.a = paramInt;
    this.b = Bitmap.createBitmap(paramInt, 1120, Bitmap.Config.ARGB_8888);
    this.c = new int[paramInt];
    this.d = new SparseIntArray(paramInt);
    this.e = new BitSet(paramInt);
    this.f = new BitSet(paramInt);
    this.l = 0;
    this.m = 0;
    this.n = 0.0F;
    this.i = new RectF();
    this.j = new Rect(0, 0, 1, 1);
    this.k = new Paint();
    this.k.setColor(-16777216);
  }
  
  private int a(int paramInt)
  {
    while (paramInt < 0) {
      paramInt += this.a;
    }
    return paramInt % this.a;
  }
  
  private void a(int paramInt, ImmutableList<DeeperRawDataPacket> paramImmutableList, RawSignalBuffer.Renderer paramRenderer)
  {
    int i1 = paramImmutableList.size();
    int i2 = 0;
    int i3 = 1;
    int i4 = 1;
    int i7;
    DeeperRawDataPacket localDeeperRawDataPacket;
    int i8;
    if (i2 < i1)
    {
      i7 = a(paramInt + i2);
      localDeeperRawDataPacket = (DeeperRawDataPacket)paramImmutableList.get(i2);
      i8 = localDeeperRawDataPacket.a();
      if ((this.e.get(i7)) && (this.c[i7] == i8)) {
        if (i2 != 0) {
          break label348;
        }
      }
    }
    label348:
    for (int i10 = 0;; i10 = i4)
    {
      i4 = i10;
      for (int i9 = 0;; i9 = 1)
      {
        i2++;
        i3 = i9;
        break;
        paramRenderer.a(localDeeperRawDataPacket, this.h);
        this.b.setPixels(this.h, 0, 1, i7, 0, 1, 1120);
        if (this.e.get(i7)) {
          this.d.delete(this.c[i7]);
        }
        this.d.put(i8, i7);
        this.e.set(i7);
        this.c[i7] = i8;
      }
      if (i1 > 0)
      {
        if ((i4 != 0) && (paramInt != 0))
        {
          int i6 = a(paramInt - 1);
          this.b.setPixels(this.g, 0, 1, i6, 0, 1, 1120);
          if (this.e.get(i6))
          {
            this.d.delete(this.c[i6]);
            this.e.clear(i6);
          }
        }
        if (i3 != 0)
        {
          int i5 = a(1 + (paramInt + i1));
          if (i5 > 0)
          {
            this.b.setPixels(this.g, 0, 1, i5, 0, 1, 1120);
            if (this.e.get(i5))
            {
              this.d.delete(this.c[i5]);
              this.e.clear(i5);
            }
          }
        }
      }
      return;
    }
  }
  
  private void a(Canvas paramCanvas, RectF paramRectF, int paramInt1, int paramInt2, float paramFloat)
  {
    int i1 = 1120;
    int i2 = a(paramInt1 + paramInt2);
    if (i2 == 0) {
      i2 = this.a;
    }
    int i3 = (int)Math.ceil(1120.0F / paramFloat);
    if (i3 > i1)
    {
      float f2 = paramRectF.top + paramFloat * paramRectF.height();
      this.i.set(paramRectF.left, f2, paramRectF.right, paramRectF.bottom);
      paramCanvas.drawRect(this.i, this.k);
      this.i.bottom = f2;
      this.i.top = paramRectF.top;
      if (i2 > paramInt1) {
        break label286;
      }
      float f1 = (this.a - paramInt1) * paramRectF.width() / paramInt2;
      this.i.right = (f1 + this.i.left);
      this.j.set(paramInt1, 0, this.a, i1);
      paramCanvas.drawBitmap(this.b, this.j, this.i, null);
      this.i.left = this.i.right;
      this.i.right = paramRectF.right;
      this.j.set(0, 0, i2, i1);
      paramCanvas.drawBitmap(this.b, this.j, this.i, null);
    }
    for (;;)
    {
      for (int i4 = 0; i4 < paramInt2; i4++) {
        this.f.set(a(paramInt1 + i4));
      }
      this.i.set(paramRectF);
      i1 = i3;
      break;
      label286:
      this.j.set(paramInt1, 0, i2, i1);
      paramCanvas.drawBitmap(this.b, this.j, this.i, null);
    }
    if (a(paramInt1) > 0) {
      this.f.set(a(paramInt1 - 1));
    }
    if (a(paramInt1 + paramInt2) != 0) {
      this.f.set(a(paramInt1 + paramInt2));
    }
  }
  
  public float a(ImmutableList<DeeperRawDataPacket> paramImmutableList)
  {
    int i1 = paramImmutableList.size();
    int i2 = 0;
    int i3 = -1;
    int i4 = -1;
    int i6;
    if (i2 < i1)
    {
      int i5 = ((DeeperRawDataPacket)paramImmutableList.get(i2)).a();
      i6 = this.d.get(i5, -1);
      if (i4 < 0) {
        if (i6 < 0) {
          break label107;
        }
      }
    }
    for (int i7 = i2;; i7 = i4)
    {
      i2++;
      i4 = i7;
      i3 = i6;
      break;
      if (a(i3 + (i2 - i4)) != i6)
      {
        if (i4 < 0) {
          return 0.0F;
        }
        return 1.0F * (i2 - i4) / this.a;
      }
      label107:
      i6 = i3;
    }
  }
  
  public void a()
  {
    this.f.clear();
    this.l = 0;
    this.m = 0;
  }
  
  public void a(ImmutableList<DeeperRawDataPacket> paramImmutableList, RawSignalBuffer.Renderer paramRenderer, Canvas paramCanvas, RectF paramRectF, float paramFloat)
  {
    int i1 = -1;
    int i2 = paramImmutableList.size();
    int i10;
    int i4;
    if (this.f.isEmpty())
    {
      i10 = 0;
      if (i10 >= i2) {
        break label317;
      }
      int i11 = ((DeeperRawDataPacket)paramImmutableList.get(i10)).a();
      i4 = this.d.get(i11, i1);
      if (i4 >= 0) {
        i1 = i10;
      }
    }
    for (;;)
    {
      if (i4 < 0)
      {
        i4 = 0;
        i1 = 0;
      }
      this.n = paramRectF.right;
      this.l = a(-1 + (i4 - i1));
      if (i4 - i1 == 0) {
        this.l = 0;
      }
      this.m = a(1 + (i4 + i2));
      int i6;
      if (this.m == 1)
      {
        this.m = 0;
        i6 = i1;
      }
      for (;;)
      {
        int i7 = a(i4 - i6);
        a(i7, paramImmutableList, paramRenderer);
        a(paramCanvas, paramRectF, i7, i2, paramFloat);
        return;
        i10++;
        break;
        int i3;
        label200:
        int i8;
        if (this.n > paramRectF.right)
        {
          i3 = 1;
          if (i3 == 0) {
            break label261;
          }
          i8 = a(this.l - i2);
          if (i8 != 0) {
            break label248;
          }
        }
        label248:
        for (int i9 = 0;; i9 = a(i8 - 1))
        {
          this.l = i9;
          i4 = i8;
          i6 = 0;
          break;
          i3 = 0;
          break label200;
        }
        label261:
        i4 = this.m;
        this.m = a(1 + (i2 + this.m));
        int i5 = this.m;
        i6 = 0;
        if (i5 == 1)
        {
          this.m = 0;
          i6 = 0;
          continue;
          i6 = i1;
        }
      }
      label317:
      i4 = i1;
    }
  }
  
  public void b()
  {
    this.e.clear();
    this.f.clear();
    this.d.clear();
    this.l = 0;
    this.m = 0;
  }
  
  public void c()
  {
    if (this.b != null)
    {
      this.b.recycle();
      this.b = null;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.RawSignalBuffer
 * JD-Core Version:    0.7.0.1
 */