package com.telesoftas.utilities;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.widget.ImageView;
import com.crashlytics.android.Crashlytics;
import java.io.File;
import java.lang.ref.SoftReference;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Stack;

public class ImageManager
{
  private long a;
  private DateFormat b;
  private HashMap<String, SoftReference<Bitmap>> c = new HashMap();
  private File d;
  private ImageManager.ImageQueue e = new ImageManager.ImageQueue(this, null);
  private Thread f = new Thread(new ImageManager.ImageQueueManager(this, null));
  private boolean g;
  
  public ImageManager(Context paramContext, long paramLong, boolean paramBoolean)
  {
    this.g = paramBoolean;
    this.a = paramLong;
    this.b = new SimpleDateFormat("EEE',' dd MMM yyyy HH:mm:ss zzz");
    this.f.setPriority(4);
    if (Environment.getExternalStorageState().equals("mounted")) {}
    for (this.d = new File(Environment.getExternalStorageDirectory(), "data/codehenge");; this.d = paramContext.getCacheDir())
    {
      if (!this.d.exists()) {
        this.d.mkdirs();
      }
      return;
    }
  }
  
  private Bitmap a(String paramString)
  {
    return BitmapFactory.decodeFile(FileUtils.a(paramString));
  }
  
  private Bitmap a(String paramString, boolean paramBoolean)
  {
    if (!paramBoolean) {}
    Object localObject;
    for (;;)
    {
      try
      {
        URLConnection localURLConnection = new URL(paramString).openConnection();
        String str1 = String.valueOf(paramString.hashCode());
        File localFile = new File(this.d, str1);
        Bitmap localBitmap1;
        long l2;
        if (paramBoolean)
        {
          localBitmap1 = a(paramString);
          long l1 = System.currentTimeMillis();
          if (localBitmap1 == null) {
            continue;
          }
          l2 = localFile.lastModified();
          if (l1 - l2 < this.a) {
            return localBitmap1;
          }
        }
        else
        {
          localBitmap1 = BitmapFactory.decodeFile(localFile.getPath());
          continue;
        }
        if (!paramBoolean)
        {
          String str2 = localURLConnection.getHeaderField("Last-Modified");
          if (this.b.parse(str2).getTime() <= l2) {
            return localBitmap1;
          }
        }
        if (paramBoolean)
        {
          localObject = a(paramString);
          if (paramBoolean) {
            break;
          }
          a((Bitmap)localObject, localFile);
          break;
        }
        Bitmap localBitmap2 = BitmapFactory.decodeStream(localURLConnection.getInputStream());
        localObject = localBitmap2;
        continue;
        localURLConnection = null;
      }
      catch (Exception localException)
      {
        Crashlytics.a(localException);
        return null;
      }
    }
    return localObject;
  }
  
  /* Error */
  private void a(Bitmap paramBitmap, File paramFile)
  {
    // Byte code:
    //   0: new 185	java/io/FileOutputStream
    //   3: dup
    //   4: aload_2
    //   5: invokespecial 188	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   8: astore_3
    //   9: aload_1
    //   10: getstatic 194	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   13: bipush 80
    //   15: aload_3
    //   16: invokevirtual 200	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   19: pop
    //   20: aload_3
    //   21: ifnull +7 -> 28
    //   24: aload_3
    //   25: invokevirtual 203	java/io/FileOutputStream:close	()V
    //   28: return
    //   29: astore 9
    //   31: aload 9
    //   33: invokestatic 182	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   36: return
    //   37: astore 4
    //   39: aconst_null
    //   40: astore_3
    //   41: aload 4
    //   43: invokestatic 182	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   46: aload_3
    //   47: ifnull -19 -> 28
    //   50: aload_3
    //   51: invokevirtual 203	java/io/FileOutputStream:close	()V
    //   54: return
    //   55: astore 7
    //   57: aload 7
    //   59: invokestatic 182	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   62: return
    //   63: astore 5
    //   65: aconst_null
    //   66: astore_3
    //   67: aload_3
    //   68: ifnull +7 -> 75
    //   71: aload_3
    //   72: invokevirtual 203	java/io/FileOutputStream:close	()V
    //   75: aload 5
    //   77: athrow
    //   78: astore 6
    //   80: aload 6
    //   82: invokestatic 182	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   85: goto -10 -> 75
    //   88: astore 5
    //   90: goto -23 -> 67
    //   93: astore 4
    //   95: goto -54 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	ImageManager
    //   0	98	1	paramBitmap	Bitmap
    //   0	98	2	paramFile	File
    //   8	64	3	localFileOutputStream	java.io.FileOutputStream
    //   37	5	4	localException1	Exception
    //   93	1	4	localException2	Exception
    //   63	13	5	localObject1	Object
    //   88	1	5	localObject2	Object
    //   78	3	6	localException3	Exception
    //   55	3	7	localException4	Exception
    //   29	3	9	localException5	Exception
    // Exception table:
    //   from	to	target	type
    //   24	28	29	java/lang/Exception
    //   0	9	37	java/lang/Exception
    //   50	54	55	java/lang/Exception
    //   0	9	63	finally
    //   71	75	78	java/lang/Exception
    //   9	20	88	finally
    //   41	46	88	finally
    //   9	20	93	java/lang/Exception
  }
  
  private void b(String paramString, ImageView paramImageView, int paramInt)
  {
    this.e.a(paramImageView);
    ImageManager.ImageRef localImageRef = new ImageManager.ImageRef(this, paramString, paramImageView, paramInt);
    synchronized (ImageManager.ImageQueue.a(this.e))
    {
      ImageManager.ImageQueue.a(this.e).push(localImageRef);
      ImageManager.ImageQueue.a(this.e).notifyAll();
      if (this.f.getState() == Thread.State.NEW) {
        this.f.start();
      }
      return;
    }
  }
  
  public void a(String paramString, ImageView paramImageView, int paramInt)
  {
    b(paramString, paramImageView, paramInt);
    if (paramInt == -1) {
      return;
    }
    paramImageView.setImageResource(paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.ImageManager
 * JD-Core Version:    0.7.0.1
 */