package com.telesoftas.utilities;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;

public class ImageUtils
{
  private static Bitmap a(Bitmap paramBitmap, ImageUtils.Dimensions paramDimensions)
  {
    int i;
    int j;
    int k;
    int m;
    float f2;
    float f1;
    if ((paramDimensions != null) && (paramBitmap != null))
    {
      i = paramBitmap.getWidth();
      j = paramBitmap.getHeight();
      k = paramDimensions.a;
      m = paramDimensions.b;
      if (k != -1) {
        break label81;
      }
      f2 = m / j;
      f1 = f2;
    }
    for (;;)
    {
      Matrix localMatrix = new Matrix();
      localMatrix.postScale(f1, f2);
      paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, i, j, localMatrix, true);
      return paramBitmap;
      label81:
      if (m == -1)
      {
        f2 = k / i;
        f1 = f2;
      }
      else
      {
        f1 = k / i;
        f2 = m / j;
      }
    }
  }
  
  public static Bitmap a(Bitmap paramBitmap, ImageUtils.Dimensions paramDimensions, ImageUtils.ScalingLogic paramScalingLogic)
  {
    if ((paramDimensions.b == -1) || (paramDimensions.a == -1)) {
      return a(paramBitmap, paramDimensions);
    }
    Rect localRect1 = a(paramBitmap.getWidth(), paramBitmap.getHeight(), paramDimensions.a, paramDimensions.b, paramScalingLogic);
    Rect localRect2 = b(paramBitmap.getWidth(), paramBitmap.getHeight(), paramDimensions.a, paramDimensions.b, paramScalingLogic);
    Bitmap localBitmap = Bitmap.createBitmap(localRect2.width(), localRect2.height(), Bitmap.Config.ARGB_8888);
    new Canvas(localBitmap).drawBitmap(paramBitmap, localRect1, localRect2, new Paint(2));
    return localBitmap;
  }
  
  private static Rect a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, ImageUtils.ScalingLogic paramScalingLogic)
  {
    if (paramScalingLogic == ImageUtils.ScalingLogic.a)
    {
      float f1 = paramInt1 / paramInt2;
      float f2 = paramInt3 / paramInt4;
      if (f1 > f2)
      {
        int k = (int)(f2 * paramInt2);
        int m = (paramInt1 - k) / 2;
        return new Rect(m, 0, k + m, paramInt2);
      }
      int i = (int)(paramInt1 / f2);
      int j = (paramInt2 - i) / 2;
      return new Rect(0, j, paramInt1, i + j);
    }
    return new Rect(0, 0, paramInt1, paramInt2);
  }
  
  /* Error */
  public static java.lang.String a(java.lang.String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: new 89	android/graphics/BitmapFactory$Options
    //   3: dup
    //   4: invokespecial 90	android/graphics/BitmapFactory$Options:<init>	()V
    //   7: astore_3
    //   8: aload_3
    //   9: iconst_5
    //   10: putfield 93	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   13: aload_0
    //   14: aload_3
    //   15: invokestatic 99	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   18: astore 4
    //   20: aload 4
    //   22: ifnonnull +5 -> 27
    //   25: aconst_null
    //   26: areturn
    //   27: aload 4
    //   29: new 17	com/telesoftas/utilities/ImageUtils$Dimensions
    //   32: dup
    //   33: sipush 200
    //   36: sipush 200
    //   39: invokespecial 102	com/telesoftas/utilities/ImageUtils$Dimensions:<init>	(II)V
    //   42: getstatic 81	com/telesoftas/utilities/ImageUtils$ScalingLogic:a	Lcom/telesoftas/utilities/ImageUtils$ScalingLogic;
    //   45: invokestatic 104	com/telesoftas/utilities/ImageUtils:a	(Landroid/graphics/Bitmap;Lcom/telesoftas/utilities/ImageUtils$Dimensions;Lcom/telesoftas/utilities/ImageUtils$ScalingLogic;)Landroid/graphics/Bitmap;
    //   48: astore 5
    //   50: aload_0
    //   51: invokestatic 109	com/telesoftas/utilities/FileUtils:a	(Ljava/lang/String;)Ljava/lang/String;
    //   54: astore 6
    //   56: new 111	java/io/FileOutputStream
    //   59: dup
    //   60: aload 6
    //   62: iconst_0
    //   63: invokespecial 114	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   66: astore 7
    //   68: aload 5
    //   70: getstatic 120	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   73: bipush 100
    //   75: aload 7
    //   77: invokevirtual 124	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   80: pop
    //   81: aload 7
    //   83: ifnull +13 -> 96
    //   86: aload 7
    //   88: invokevirtual 129	java/io/OutputStream:flush	()V
    //   91: aload 7
    //   93: invokevirtual 132	java/io/OutputStream:close	()V
    //   96: aload 6
    //   98: areturn
    //   99: astore 13
    //   101: aload 13
    //   103: invokestatic 137	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   106: goto -10 -> 96
    //   109: astore 8
    //   111: aconst_null
    //   112: astore 7
    //   114: aload 8
    //   116: invokestatic 137	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   119: aload 7
    //   121: ifnull +75 -> 196
    //   124: aload 7
    //   126: invokevirtual 129	java/io/OutputStream:flush	()V
    //   129: aload 7
    //   131: invokevirtual 132	java/io/OutputStream:close	()V
    //   134: aconst_null
    //   135: astore 6
    //   137: goto -41 -> 96
    //   140: astore 11
    //   142: aload 11
    //   144: invokestatic 137	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   147: aconst_null
    //   148: astore 6
    //   150: goto -54 -> 96
    //   153: astore 9
    //   155: aconst_null
    //   156: astore 7
    //   158: aload 7
    //   160: ifnull +13 -> 173
    //   163: aload 7
    //   165: invokevirtual 129	java/io/OutputStream:flush	()V
    //   168: aload 7
    //   170: invokevirtual 132	java/io/OutputStream:close	()V
    //   173: aload 9
    //   175: athrow
    //   176: astore 10
    //   178: aload 10
    //   180: invokestatic 137	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   183: goto -10 -> 173
    //   186: astore 9
    //   188: goto -30 -> 158
    //   191: astore 8
    //   193: goto -79 -> 114
    //   196: aconst_null
    //   197: astore 6
    //   199: goto -103 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	paramString	java.lang.String
    //   0	202	1	paramInt1	int
    //   0	202	2	paramInt2	int
    //   7	8	3	localOptions	android.graphics.BitmapFactory.Options
    //   18	10	4	localBitmap1	Bitmap
    //   48	21	5	localBitmap2	Bitmap
    //   54	144	6	str	java.lang.String
    //   66	103	7	localFileOutputStream	java.io.FileOutputStream
    //   109	6	8	localIOException1	java.io.IOException
    //   191	1	8	localIOException2	java.io.IOException
    //   153	21	9	localObject1	Object
    //   186	1	9	localObject2	Object
    //   176	3	10	localIOException3	java.io.IOException
    //   140	3	11	localIOException4	java.io.IOException
    //   99	3	13	localIOException5	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   86	96	99	java/io/IOException
    //   56	68	109	java/io/IOException
    //   124	134	140	java/io/IOException
    //   56	68	153	finally
    //   163	173	176	java/io/IOException
    //   68	81	186	finally
    //   114	119	186	finally
    //   68	81	191	java/io/IOException
  }
  
  private static Rect b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, ImageUtils.ScalingLogic paramScalingLogic)
  {
    if (paramScalingLogic == ImageUtils.ScalingLogic.b)
    {
      float f = paramInt1 / paramInt2;
      if (f > paramInt3 / paramInt4) {
        return new Rect(0, 0, paramInt3, (int)(paramInt3 / f));
      }
      return new Rect(0, 0, (int)(f * paramInt4), paramInt4);
    }
    return new Rect(0, 0, paramInt3, paramInt4);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.ImageUtils
 * JD-Core Version:    0.7.0.1
 */