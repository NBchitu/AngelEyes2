package com.telesoftas.utilities;

class ImageManager$ImageQueueManager
  implements Runnable
{
  private ImageManager$ImageQueueManager(ImageManager paramImageManager) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	com/telesoftas/utilities/ImageManager$ImageQueueManager:a	Lcom/telesoftas/utilities/ImageManager;
    //   4: invokestatic 26	com/telesoftas/utilities/ImageManager:a	(Lcom/telesoftas/utilities/ImageManager;)Lcom/telesoftas/utilities/ImageManager$ImageQueue;
    //   7: invokestatic 31	com/telesoftas/utilities/ImageManager$ImageQueue:a	(Lcom/telesoftas/utilities/ImageManager$ImageQueue;)Ljava/util/Stack;
    //   10: invokevirtual 37	java/util/Stack:size	()I
    //   13: ifne +34 -> 47
    //   16: aload_0
    //   17: getfield 12	com/telesoftas/utilities/ImageManager$ImageQueueManager:a	Lcom/telesoftas/utilities/ImageManager;
    //   20: invokestatic 26	com/telesoftas/utilities/ImageManager:a	(Lcom/telesoftas/utilities/ImageManager;)Lcom/telesoftas/utilities/ImageManager$ImageQueue;
    //   23: invokestatic 31	com/telesoftas/utilities/ImageManager$ImageQueue:a	(Lcom/telesoftas/utilities/ImageManager$ImageQueue;)Ljava/util/Stack;
    //   26: astore 10
    //   28: aload 10
    //   30: monitorenter
    //   31: aload_0
    //   32: getfield 12	com/telesoftas/utilities/ImageManager$ImageQueueManager:a	Lcom/telesoftas/utilities/ImageManager;
    //   35: invokestatic 26	com/telesoftas/utilities/ImageManager:a	(Lcom/telesoftas/utilities/ImageManager;)Lcom/telesoftas/utilities/ImageManager$ImageQueue;
    //   38: invokestatic 31	com/telesoftas/utilities/ImageManager$ImageQueue:a	(Lcom/telesoftas/utilities/ImageManager$ImageQueue;)Ljava/util/Stack;
    //   41: invokevirtual 40	java/lang/Object:wait	()V
    //   44: aload 10
    //   46: monitorexit
    //   47: aload_0
    //   48: getfield 12	com/telesoftas/utilities/ImageManager$ImageQueueManager:a	Lcom/telesoftas/utilities/ImageManager;
    //   51: invokestatic 26	com/telesoftas/utilities/ImageManager:a	(Lcom/telesoftas/utilities/ImageManager;)Lcom/telesoftas/utilities/ImageManager$ImageQueue;
    //   54: invokestatic 31	com/telesoftas/utilities/ImageManager$ImageQueue:a	(Lcom/telesoftas/utilities/ImageManager$ImageQueue;)Ljava/util/Stack;
    //   57: invokevirtual 37	java/util/Stack:size	()I
    //   60: ifeq +154 -> 214
    //   63: aload_0
    //   64: getfield 12	com/telesoftas/utilities/ImageManager$ImageQueueManager:a	Lcom/telesoftas/utilities/ImageManager;
    //   67: invokestatic 26	com/telesoftas/utilities/ImageManager:a	(Lcom/telesoftas/utilities/ImageManager;)Lcom/telesoftas/utilities/ImageManager$ImageQueue;
    //   70: invokestatic 31	com/telesoftas/utilities/ImageManager$ImageQueue:a	(Lcom/telesoftas/utilities/ImageManager$ImageQueue;)Ljava/util/Stack;
    //   73: astore_3
    //   74: aload_3
    //   75: monitorenter
    //   76: aload_0
    //   77: getfield 12	com/telesoftas/utilities/ImageManager$ImageQueueManager:a	Lcom/telesoftas/utilities/ImageManager;
    //   80: invokestatic 26	com/telesoftas/utilities/ImageManager:a	(Lcom/telesoftas/utilities/ImageManager;)Lcom/telesoftas/utilities/ImageManager$ImageQueue;
    //   83: invokestatic 31	com/telesoftas/utilities/ImageManager$ImageQueue:a	(Lcom/telesoftas/utilities/ImageManager$ImageQueue;)Ljava/util/Stack;
    //   86: invokevirtual 44	java/util/Stack:pop	()Ljava/lang/Object;
    //   89: checkcast 46	com/telesoftas/utilities/ImageManager$ImageRef
    //   92: astore 5
    //   94: aload_3
    //   95: monitorexit
    //   96: aload_0
    //   97: getfield 12	com/telesoftas/utilities/ImageManager$ImageQueueManager:a	Lcom/telesoftas/utilities/ImageManager;
    //   100: aload 5
    //   102: getfield 49	com/telesoftas/utilities/ImageManager$ImageRef:a	Ljava/lang/String;
    //   105: aload_0
    //   106: getfield 12	com/telesoftas/utilities/ImageManager$ImageQueueManager:a	Lcom/telesoftas/utilities/ImageManager;
    //   109: invokestatic 53	com/telesoftas/utilities/ImageManager:b	(Lcom/telesoftas/utilities/ImageManager;)Z
    //   112: invokestatic 56	com/telesoftas/utilities/ImageManager:a	(Lcom/telesoftas/utilities/ImageManager;Ljava/lang/String;Z)Landroid/graphics/Bitmap;
    //   115: astore 6
    //   117: aload_0
    //   118: getfield 12	com/telesoftas/utilities/ImageManager$ImageQueueManager:a	Lcom/telesoftas/utilities/ImageManager;
    //   121: invokestatic 60	com/telesoftas/utilities/ImageManager:c	(Lcom/telesoftas/utilities/ImageManager;)Ljava/util/HashMap;
    //   124: aload 5
    //   126: getfield 49	com/telesoftas/utilities/ImageManager$ImageRef:a	Ljava/lang/String;
    //   129: new 62	java/lang/ref/SoftReference
    //   132: dup
    //   133: aload 6
    //   135: invokespecial 65	java/lang/ref/SoftReference:<init>	(Ljava/lang/Object;)V
    //   138: invokevirtual 71	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   141: pop
    //   142: aload 5
    //   144: getfield 74	com/telesoftas/utilities/ImageManager$ImageRef:b	Landroid/widget/ImageView;
    //   147: invokevirtual 79	android/widget/ImageView:getTag	()Ljava/lang/Object;
    //   150: astore 8
    //   152: aload 8
    //   154: ifnull +60 -> 214
    //   157: aload 8
    //   159: checkcast 81	java/lang/String
    //   162: aload 5
    //   164: getfield 49	com/telesoftas/utilities/ImageManager$ImageRef:a	Ljava/lang/String;
    //   167: invokevirtual 85	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   170: ifeq +44 -> 214
    //   173: new 87	com/telesoftas/utilities/ImageManager$BitmapDisplayer
    //   176: dup
    //   177: aload_0
    //   178: getfield 12	com/telesoftas/utilities/ImageManager$ImageQueueManager:a	Lcom/telesoftas/utilities/ImageManager;
    //   181: aload 6
    //   183: aload 5
    //   185: getfield 74	com/telesoftas/utilities/ImageManager$ImageRef:b	Landroid/widget/ImageView;
    //   188: aload 5
    //   190: getfield 90	com/telesoftas/utilities/ImageManager$ImageRef:c	I
    //   193: invokespecial 93	com/telesoftas/utilities/ImageManager$BitmapDisplayer:<init>	(Lcom/telesoftas/utilities/ImageManager;Landroid/graphics/Bitmap;Landroid/widget/ImageView;I)V
    //   196: astore 9
    //   198: aload 5
    //   200: getfield 74	com/telesoftas/utilities/ImageManager$ImageRef:b	Landroid/widget/ImageView;
    //   203: invokevirtual 97	android/widget/ImageView:getContext	()Landroid/content/Context;
    //   206: checkcast 99	android/app/Activity
    //   209: aload 9
    //   211: invokevirtual 103	android/app/Activity:runOnUiThread	(Ljava/lang/Runnable;)V
    //   214: invokestatic 109	java/lang/Thread:interrupted	()Z
    //   217: istore_2
    //   218: iload_2
    //   219: ifeq -219 -> 0
    //   222: return
    //   223: astore 11
    //   225: aload 10
    //   227: monitorexit
    //   228: aload 11
    //   230: athrow
    //   231: astore_1
    //   232: return
    //   233: astore 4
    //   235: aload_3
    //   236: monitorexit
    //   237: aload 4
    //   239: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	240	0	this	ImageQueueManager
    //   231	1	1	localInterruptedException	java.lang.InterruptedException
    //   217	2	2	bool	boolean
    //   233	5	4	localObject1	Object
    //   92	107	5	localImageRef	ImageManager.ImageRef
    //   115	67	6	localBitmap	android.graphics.Bitmap
    //   150	8	8	localObject2	Object
    //   196	14	9	localBitmapDisplayer	ImageManager.BitmapDisplayer
    //   223	6	11	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   31	47	223	finally
    //   225	228	223	finally
    //   0	31	231	java/lang/InterruptedException
    //   47	76	231	java/lang/InterruptedException
    //   96	152	231	java/lang/InterruptedException
    //   157	214	231	java/lang/InterruptedException
    //   214	218	231	java/lang/InterruptedException
    //   228	231	231	java/lang/InterruptedException
    //   237	240	231	java/lang/InterruptedException
    //   76	96	233	finally
    //   235	237	233	finally
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.ImageManager.ImageQueueManager
 * JD-Core Version:    0.7.0.1
 */