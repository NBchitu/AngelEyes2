package com.crashlytics.android;

final class ac
  extends com.crashlytics.android.internal.aa
{
  private final float a;
  
  ac(aa paramaa, float paramFloat)
  {
    this.a = paramFloat;
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: invokestatic 26	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   3: invokevirtual 29	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   6: ldc 31
    //   8: new 33	java/lang/StringBuilder
    //   11: dup
    //   12: ldc 35
    //   14: invokespecial 38	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   17: aload_0
    //   18: getfield 17	com/crashlytics/android/ac:a	F
    //   21: invokevirtual 42	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   24: ldc 44
    //   26: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokeinterface 56 3 0
    //   37: aload_0
    //   38: getfield 17	com/crashlytics/android/ac:a	F
    //   41: fstore_3
    //   42: fload_3
    //   43: fconst_0
    //   44: fcmpl
    //   45: ifle +14 -> 59
    //   48: ldc 57
    //   50: aload_0
    //   51: getfield 17	com/crashlytics/android/ac:a	F
    //   54: fmul
    //   55: f2l
    //   56: invokestatic 63	java/lang/Thread:sleep	(J)V
    //   59: invokestatic 68	com/crashlytics/android/Crashlytics:a	()Lcom/crashlytics/android/Crashlytics;
    //   62: astore 4
    //   64: aload 4
    //   66: invokevirtual 72	com/crashlytics/android/Crashlytics:o	()Lcom/crashlytics/android/v;
    //   69: astore 5
    //   71: aload_0
    //   72: getfield 12	com/crashlytics/android/ac:b	Lcom/crashlytics/android/aa;
    //   75: invokevirtual 77	com/crashlytics/android/aa:a	()Ljava/util/List;
    //   78: astore 6
    //   80: aload 5
    //   82: invokevirtual 82	com/crashlytics/android/v:a	()Z
    //   85: ifne +114 -> 199
    //   88: aload 6
    //   90: invokeinterface 87 1 0
    //   95: ifne +344 -> 439
    //   98: aload 4
    //   100: invokevirtual 90	com/crashlytics/android/Crashlytics:s	()Z
    //   103: ifne +336 -> 439
    //   106: invokestatic 26	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   109: invokevirtual 29	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   112: ldc 31
    //   114: new 33	java/lang/StringBuilder
    //   117: dup
    //   118: ldc 92
    //   120: invokespecial 38	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   123: aload 6
    //   125: invokeinterface 96 1 0
    //   130: invokevirtual 99	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   133: ldc 101
    //   135: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: invokeinterface 56 3 0
    //   146: aload 6
    //   148: invokeinterface 105 1 0
    //   153: astore 18
    //   155: aload 18
    //   157: invokeinterface 110 1 0
    //   162: ifeq +37 -> 199
    //   165: aload 18
    //   167: invokeinterface 114 1 0
    //   172: checkcast 116	com/crashlytics/android/Z
    //   175: invokevirtual 117	com/crashlytics/android/Z:a	()Z
    //   178: pop
    //   179: goto -24 -> 155
    //   182: astore_1
    //   183: invokestatic 26	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   186: invokevirtual 29	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   189: ldc 31
    //   191: ldc 119
    //   193: aload_1
    //   194: invokeinterface 122 4 0
    //   199: aload_0
    //   200: getfield 12	com/crashlytics/android/ac:b	Lcom/crashlytics/android/aa;
    //   203: aconst_null
    //   204: invokestatic 125	com/crashlytics/android/aa:a	(Lcom/crashlytics/android/aa;Ljava/lang/Thread;)Ljava/lang/Thread;
    //   207: pop
    //   208: return
    //   209: astore 20
    //   211: invokestatic 129	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   214: invokevirtual 132	java/lang/Thread:interrupt	()V
    //   217: goto -18 -> 199
    //   220: aload 6
    //   222: invokeinterface 87 1 0
    //   227: ifne -28 -> 199
    //   230: invokestatic 68	com/crashlytics/android/Crashlytics:a	()Lcom/crashlytics/android/Crashlytics;
    //   233: invokevirtual 72	com/crashlytics/android/Crashlytics:o	()Lcom/crashlytics/android/v;
    //   236: invokevirtual 82	com/crashlytics/android/v:a	()Z
    //   239: ifne -40 -> 199
    //   242: invokestatic 26	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   245: invokevirtual 29	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   248: ldc 31
    //   250: new 33	java/lang/StringBuilder
    //   253: dup
    //   254: ldc 134
    //   256: invokespecial 38	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   259: aload 6
    //   261: invokeinterface 96 1 0
    //   266: invokevirtual 99	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   269: ldc 136
    //   271: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   277: invokeinterface 56 3 0
    //   282: aload 6
    //   284: invokeinterface 105 1 0
    //   289: astore 8
    //   291: aload 8
    //   293: invokeinterface 110 1 0
    //   298: ifeq +28 -> 326
    //   301: aload 8
    //   303: invokeinterface 114 1 0
    //   308: checkcast 116	com/crashlytics/android/Z
    //   311: astore 16
    //   313: aload_0
    //   314: getfield 12	com/crashlytics/android/ac:b	Lcom/crashlytics/android/aa;
    //   317: aload 16
    //   319: invokevirtual 139	com/crashlytics/android/aa:a	(Lcom/crashlytics/android/Z;)Z
    //   322: pop
    //   323: goto -32 -> 291
    //   326: aload_0
    //   327: getfield 12	com/crashlytics/android/ac:b	Lcom/crashlytics/android/aa;
    //   330: invokevirtual 77	com/crashlytics/android/aa:a	()Ljava/util/List;
    //   333: astore 6
    //   335: aload 6
    //   337: invokeinterface 87 1 0
    //   342: ifne -122 -> 220
    //   345: invokestatic 142	com/crashlytics/android/aa:b	()[S
    //   348: astore 9
    //   350: iload 7
    //   352: iconst_1
    //   353: iadd
    //   354: istore 10
    //   356: aload 9
    //   358: iload 7
    //   360: iconst_m1
    //   361: invokestatic 142	com/crashlytics/android/aa:b	()[S
    //   364: arraylength
    //   365: iadd
    //   366: invokestatic 148	java/lang/Math:min	(II)I
    //   369: saload
    //   370: i2l
    //   371: lstore 11
    //   373: invokestatic 26	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   376: invokevirtual 29	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   379: ldc 31
    //   381: new 33	java/lang/StringBuilder
    //   384: dup
    //   385: ldc 150
    //   387: invokespecial 38	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   390: lload 11
    //   392: invokevirtual 153	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   395: ldc 155
    //   397: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   400: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   403: invokeinterface 56 3 0
    //   408: lload 11
    //   410: ldc2_w 156
    //   413: lmul
    //   414: lstore 13
    //   416: lload 13
    //   418: invokestatic 63	java/lang/Thread:sleep	(J)V
    //   421: iload 10
    //   423: istore 7
    //   425: goto -205 -> 220
    //   428: astore 15
    //   430: invokestatic 129	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   433: invokevirtual 132	java/lang/Thread:interrupt	()V
    //   436: goto -237 -> 199
    //   439: iconst_0
    //   440: istore 7
    //   442: goto -222 -> 220
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	445	0	this	ac
    //   182	12	1	localException	java.lang.Exception
    //   41	2	3	f	float
    //   62	37	4	localCrashlytics	Crashlytics
    //   69	12	5	localv	v
    //   78	258	6	localList	java.util.List
    //   350	91	7	i	int
    //   289	13	8	localIterator1	java.util.Iterator
    //   348	9	9	arrayOfShort	short[]
    //   354	68	10	j	int
    //   371	38	11	l1	long
    //   414	3	13	l2	long
    //   428	1	15	localInterruptedException1	java.lang.InterruptedException
    //   311	7	16	localZ	Z
    //   153	13	18	localIterator2	java.util.Iterator
    //   209	1	20	localInterruptedException2	java.lang.InterruptedException
    // Exception table:
    //   from	to	target	type
    //   0	42	182	java/lang/Exception
    //   48	59	182	java/lang/Exception
    //   59	155	182	java/lang/Exception
    //   155	179	182	java/lang/Exception
    //   211	217	182	java/lang/Exception
    //   220	291	182	java/lang/Exception
    //   291	323	182	java/lang/Exception
    //   326	350	182	java/lang/Exception
    //   356	408	182	java/lang/Exception
    //   416	421	182	java/lang/Exception
    //   430	436	182	java/lang/Exception
    //   48	59	209	java/lang/InterruptedException
    //   416	421	428	java/lang/InterruptedException
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.ac
 * JD-Core Version:    0.7.0.1
 */