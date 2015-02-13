package com.fridaylab.deeper.communication;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.SharedPreferences;
import com.fridaylab.util.AsyncDelegate;
import com.fridaylab.util.Flog;
import java.io.IOException;
import java.util.HashSet;

public class DeeperLink$Connector
  extends AsyncDelegate
  implements Runnable
{
  private final long b = 30000000000L;
  private BluetoothConnection c;
  private BluetoothSocket d;
  private final int e;
  private final boolean f;
  private volatile boolean g;
  private boolean h;
  private int i;
  private boolean j;
  private long k;
  private boolean l = false;
  private int m = 0;
  private final HashSet<String> n = new HashSet();
  
  public DeeperLink$Connector(DeeperLink paramDeeperLink, int paramInt, boolean paramBoolean)
  {
    if (DeeperLink.g(paramDeeperLink).getSharedPreferences("btmonitoring", 0).getLong(DeeperLink.h(paramDeeperLink), 0L) > System.currentTimeMillis() - 300000L) {
      paramInt = Math.max(paramInt, 3);
    }
    this.e = paramInt;
    this.f = paramBoolean;
    this.g = false;
    this.i = 0;
    this.j = false;
    this.k = (System.nanoTime() - 15000000000L);
  }
  
  private void f()
  {
    this.d = null;
    BluetoothDevice localBluetoothDevice = DeeperLink.i(this.a).getRemoteDevice(DeeperLink.h(this.a));
    try
    {
      this.d = localBluetoothDevice.createRfcommSocketToServiceRecord(DeeperLink.k());
      return;
    }
    catch (IOException localIOException)
    {
      Flog.a("Socket::create() failed", localIOException);
    }
  }
  
  public BluetoothConnection a()
  {
    return this.c;
  }
  
  public void b()
  {
    this.g = true;
  }
  
  public boolean c()
  {
    return this.f;
  }
  
  /* Error */
  public void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 138	com/fridaylab/deeper/communication/DeeperLink$Connector:f	()V
    //   4: aload_0
    //   5: getfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   8: ifnonnull +174 -> 182
    //   11: iconst_0
    //   12: istore 7
    //   14: goto +1266 -> 1280
    //   17: iload 8
    //   19: iload 7
    //   21: if_icmpgt +773 -> 794
    //   24: aload_0
    //   25: iconst_0
    //   26: putfield 140	com/fridaylab/deeper/communication/DeeperLink$Connector:h	Z
    //   29: iload 8
    //   31: iconst_1
    //   32: if_icmpeq +415 -> 447
    //   35: aload_0
    //   36: getfield 94	com/fridaylab/deeper/communication/DeeperLink$Connector:j	Z
    //   39: ifeq +1235 -> 1274
    //   42: aload_0
    //   43: iconst_0
    //   44: putfield 94	com/fridaylab/deeper/communication/DeeperLink$Connector:j	Z
    //   47: aload_0
    //   48: getfield 48	com/fridaylab/deeper/communication/DeeperLink$Connector:n	Ljava/util/HashSet;
    //   51: invokevirtual 143	java/util/HashSet:clear	()V
    //   54: aload_0
    //   55: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   58: invokestatic 108	com/fridaylab/deeper/communication/DeeperLink:i	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/bluetooth/BluetoothAdapter;
    //   61: invokevirtual 146	android/bluetooth/BluetoothAdapter:disable	()Z
    //   64: pop
    //   65: aload_0
    //   66: invokestatic 97	java/lang/System:nanoTime	()J
    //   69: putfield 101	com/fridaylab/deeper/communication/DeeperLink$Connector:k	J
    //   72: iconst_1
    //   73: istore 9
    //   75: iload 8
    //   77: iconst_5
    //   78: invokestatic 149	java/lang/Math:min	(II)I
    //   81: istore 10
    //   83: iload 10
    //   85: sipush 1000
    //   88: imul
    //   89: istore 11
    //   91: iconst_0
    //   92: istore 12
    //   94: iload 9
    //   96: istore 13
    //   98: iconst_0
    //   99: istore 14
    //   101: aload_0
    //   102: getfield 90	com/fridaylab/deeper/communication/DeeperLink$Connector:g	Z
    //   105: ifne +1181 -> 1286
    //   108: aload_0
    //   109: invokevirtual 152	com/fridaylab/deeper/communication/DeeperLink$Connector:isCancelled	()Z
    //   112: ifne +1174 -> 1286
    //   115: iload 14
    //   117: bipush 75
    //   119: imul
    //   120: iload 11
    //   122: if_icmplt +6 -> 128
    //   125: goto +1161 -> 1286
    //   128: iload 14
    //   130: iconst_1
    //   131: iadd
    //   132: istore 21
    //   134: ldc2_w 153
    //   137: invokestatic 160	java/lang/Thread:sleep	(J)V
    //   140: iload 13
    //   142: ifeq +49 -> 191
    //   145: aload_0
    //   146: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   149: invokestatic 108	com/fridaylab/deeper/communication/DeeperLink:i	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/bluetooth/BluetoothAdapter;
    //   152: invokevirtual 163	android/bluetooth/BluetoothAdapter:isEnabled	()Z
    //   155: ifne +1112 -> 1267
    //   158: aload_0
    //   159: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   162: invokestatic 108	com/fridaylab/deeper/communication/DeeperLink:i	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/bluetooth/BluetoothAdapter;
    //   165: invokevirtual 166	android/bluetooth/BluetoothAdapter:enable	()Z
    //   168: pop
    //   169: iload 21
    //   171: istore 14
    //   173: iconst_1
    //   174: istore 12
    //   176: iconst_0
    //   177: istore 13
    //   179: goto -78 -> 101
    //   182: aload_0
    //   183: getfield 86	com/fridaylab/deeper/communication/DeeperLink$Connector:e	I
    //   186: istore 7
    //   188: goto +1092 -> 1280
    //   191: iload 12
    //   193: ifeq +1074 -> 1267
    //   196: aload_0
    //   197: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   200: invokestatic 108	com/fridaylab/deeper/communication/DeeperLink:i	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/bluetooth/BluetoothAdapter;
    //   203: invokevirtual 163	android/bluetooth/BluetoothAdapter:isEnabled	()Z
    //   206: ifeq +1061 -> 1267
    //   209: aload_0
    //   210: invokevirtual 152	com/fridaylab/deeper/communication/DeeperLink$Connector:isCancelled	()Z
    //   213: ifne +22 -> 235
    //   216: iconst_1
    //   217: istore 23
    //   219: aload_0
    //   220: iload 23
    //   222: putfield 41	com/fridaylab/deeper/communication/DeeperLink$Connector:l	Z
    //   225: iload 21
    //   227: istore 14
    //   229: iconst_0
    //   230: istore 12
    //   232: goto -131 -> 101
    //   235: iconst_0
    //   236: istore 23
    //   238: goto -19 -> 219
    //   241: astore 15
    //   243: aload_0
    //   244: getfield 133	com/fridaylab/deeper/communication/DeeperLink$Connector:c	Lcom/fridaylab/deeper/communication/BluetoothConnection;
    //   247: ifnonnull +22 -> 269
    //   250: aload_0
    //   251: getfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   254: ifnull +15 -> 269
    //   257: aload_0
    //   258: getfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   261: invokevirtual 171	android/bluetooth/BluetoothSocket:close	()V
    //   264: aload_0
    //   265: aconst_null
    //   266: putfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   269: aload_0
    //   270: getfield 133	com/fridaylab/deeper/communication/DeeperLink$Connector:c	Lcom/fridaylab/deeper/communication/BluetoothConnection;
    //   273: ifnonnull +84 -> 357
    //   276: ldc 173
    //   278: astore 16
    //   280: aload_0
    //   281: getfield 48	com/fridaylab/deeper/communication/DeeperLink$Connector:n	Ljava/util/HashSet;
    //   284: invokevirtual 177	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   287: astore 17
    //   289: aload 17
    //   291: invokeinterface 182 1 0
    //   296: ifeq +68 -> 364
    //   299: aload 17
    //   301: invokeinterface 186 1 0
    //   306: checkcast 188	java/lang/String
    //   309: astore 19
    //   311: aload_0
    //   312: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   315: invokestatic 53	com/fridaylab/deeper/communication/DeeperLink:g	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/content/Context;
    //   318: invokestatic 193	com/google/analytics/tracking/android/EasyTracker:a	(Landroid/content/Context;)Lcom/google/analytics/tracking/android/EasyTracker;
    //   321: ldc 195
    //   323: aload 16
    //   325: aload 19
    //   327: aconst_null
    //   328: invokestatic 200	com/google/analytics/tracking/android/MapBuilder:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/analytics/tracking/android/MapBuilder;
    //   331: invokevirtual 203	com/google/analytics/tracking/android/MapBuilder:a	()Ljava/util/Map;
    //   334: invokevirtual 206	com/google/analytics/tracking/android/EasyTracker:a	(Ljava/util/Map;)V
    //   337: goto -48 -> 289
    //   340: astore 20
    //   342: aload 20
    //   344: invokestatic 211	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   347: ldc 213
    //   349: aload 20
    //   351: invokestatic 130	com/fridaylab/util/Flog:a	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   354: goto -85 -> 269
    //   357: ldc 215
    //   359: astore 16
    //   361: goto -81 -> 280
    //   364: aload_0
    //   365: getfield 41	com/fridaylab/deeper/communication/DeeperLink$Connector:l	Z
    //   368: ifeq +52 -> 420
    //   371: aload_0
    //   372: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   375: invokestatic 53	com/fridaylab/deeper/communication/DeeperLink:g	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/content/Context;
    //   378: invokestatic 193	com/google/analytics/tracking/android/EasyTracker:a	(Landroid/content/Context;)Lcom/google/analytics/tracking/android/EasyTracker;
    //   381: ldc 195
    //   383: new 217	java/lang/StringBuilder
    //   386: dup
    //   387: invokespecial 218	java/lang/StringBuilder:<init>	()V
    //   390: aload 16
    //   392: invokevirtual 222	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   395: ldc 224
    //   397: invokevirtual 222	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   400: invokevirtual 228	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   403: aload_0
    //   404: getfield 43	com/fridaylab/deeper/communication/DeeperLink$Connector:m	I
    //   407: invokestatic 233	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   410: aconst_null
    //   411: invokestatic 200	com/google/analytics/tracking/android/MapBuilder:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/analytics/tracking/android/MapBuilder;
    //   414: invokevirtual 203	com/google/analytics/tracking/android/MapBuilder:a	()Ljava/util/Map;
    //   417: invokevirtual 206	com/google/analytics/tracking/android/EasyTracker:a	(Ljava/util/Map;)V
    //   420: aload_0
    //   421: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   424: getfield 236	com/fridaylab/deeper/communication/DeeperLink:c	Lcom/fridaylab/deeper/communication/CommunicationHandler;
    //   427: aload_0
    //   428: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   431: invokestatic 239	com/fridaylab/deeper/communication/DeeperLink:k	(Lcom/fridaylab/deeper/communication/DeeperLink;)Ljava/lang/Runnable;
    //   434: invokevirtual 245	com/fridaylab/deeper/communication/CommunicationHandler:post	(Ljava/lang/Runnable;)Z
    //   437: pop
    //   438: return
    //   439: aload_0
    //   440: aload_0
    //   441: getfield 90	com/fridaylab/deeper/communication/DeeperLink$Connector:g	Z
    //   444: putfield 140	com/fridaylab/deeper/communication/DeeperLink$Connector:h	Z
    //   447: aload_0
    //   448: invokevirtual 152	com/fridaylab/deeper/communication/DeeperLink$Connector:isCancelled	()Z
    //   451: istore 24
    //   453: iload 24
    //   455: ifeq +199 -> 654
    //   458: aload_0
    //   459: getfield 133	com/fridaylab/deeper/communication/DeeperLink$Connector:c	Lcom/fridaylab/deeper/communication/BluetoothConnection;
    //   462: ifnonnull +22 -> 484
    //   465: aload_0
    //   466: getfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   469: ifnull +15 -> 484
    //   472: aload_0
    //   473: getfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   476: invokevirtual 171	android/bluetooth/BluetoothSocket:close	()V
    //   479: aload_0
    //   480: aconst_null
    //   481: putfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   484: aload_0
    //   485: getfield 133	com/fridaylab/deeper/communication/DeeperLink$Connector:c	Lcom/fridaylab/deeper/communication/BluetoothConnection;
    //   488: ifnonnull +84 -> 572
    //   491: ldc 173
    //   493: astore 35
    //   495: aload_0
    //   496: getfield 48	com/fridaylab/deeper/communication/DeeperLink$Connector:n	Ljava/util/HashSet;
    //   499: invokevirtual 177	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   502: astore 36
    //   504: aload 36
    //   506: invokeinterface 182 1 0
    //   511: ifeq +68 -> 579
    //   514: aload 36
    //   516: invokeinterface 186 1 0
    //   521: checkcast 188	java/lang/String
    //   524: astore 38
    //   526: aload_0
    //   527: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   530: invokestatic 53	com/fridaylab/deeper/communication/DeeperLink:g	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/content/Context;
    //   533: invokestatic 193	com/google/analytics/tracking/android/EasyTracker:a	(Landroid/content/Context;)Lcom/google/analytics/tracking/android/EasyTracker;
    //   536: ldc 195
    //   538: aload 35
    //   540: aload 38
    //   542: aconst_null
    //   543: invokestatic 200	com/google/analytics/tracking/android/MapBuilder:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/analytics/tracking/android/MapBuilder;
    //   546: invokevirtual 203	com/google/analytics/tracking/android/MapBuilder:a	()Ljava/util/Map;
    //   549: invokevirtual 206	com/google/analytics/tracking/android/EasyTracker:a	(Ljava/util/Map;)V
    //   552: goto -48 -> 504
    //   555: astore 39
    //   557: aload 39
    //   559: invokestatic 211	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   562: ldc 213
    //   564: aload 39
    //   566: invokestatic 130	com/fridaylab/util/Flog:a	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   569: goto -85 -> 484
    //   572: ldc 215
    //   574: astore 35
    //   576: goto -81 -> 495
    //   579: aload_0
    //   580: getfield 41	com/fridaylab/deeper/communication/DeeperLink$Connector:l	Z
    //   583: ifeq +52 -> 635
    //   586: aload_0
    //   587: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   590: invokestatic 53	com/fridaylab/deeper/communication/DeeperLink:g	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/content/Context;
    //   593: invokestatic 193	com/google/analytics/tracking/android/EasyTracker:a	(Landroid/content/Context;)Lcom/google/analytics/tracking/android/EasyTracker;
    //   596: ldc 195
    //   598: new 217	java/lang/StringBuilder
    //   601: dup
    //   602: invokespecial 218	java/lang/StringBuilder:<init>	()V
    //   605: aload 35
    //   607: invokevirtual 222	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   610: ldc 224
    //   612: invokevirtual 222	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   615: invokevirtual 228	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   618: aload_0
    //   619: getfield 43	com/fridaylab/deeper/communication/DeeperLink$Connector:m	I
    //   622: invokestatic 233	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   625: aconst_null
    //   626: invokestatic 200	com/google/analytics/tracking/android/MapBuilder:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/analytics/tracking/android/MapBuilder;
    //   629: invokevirtual 203	com/google/analytics/tracking/android/MapBuilder:a	()Ljava/util/Map;
    //   632: invokevirtual 206	com/google/analytics/tracking/android/EasyTracker:a	(Ljava/util/Map;)V
    //   635: aload_0
    //   636: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   639: getfield 236	com/fridaylab/deeper/communication/DeeperLink:c	Lcom/fridaylab/deeper/communication/CommunicationHandler;
    //   642: aload_0
    //   643: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   646: invokestatic 239	com/fridaylab/deeper/communication/DeeperLink:k	(Lcom/fridaylab/deeper/communication/DeeperLink;)Ljava/lang/Runnable;
    //   649: invokevirtual 245	com/fridaylab/deeper/communication/CommunicationHandler:post	(Ljava/lang/Runnable;)Z
    //   652: pop
    //   653: return
    //   654: aload_0
    //   655: getfield 41	com/fridaylab/deeper/communication/DeeperLink$Connector:l	Z
    //   658: ifeq +13 -> 671
    //   661: aload_0
    //   662: iconst_1
    //   663: aload_0
    //   664: getfield 43	com/fridaylab/deeper/communication/DeeperLink$Connector:m	I
    //   667: iadd
    //   668: putfield 43	com/fridaylab/deeper/communication/DeeperLink$Connector:m	I
    //   671: aload_0
    //   672: iload 8
    //   674: putfield 92	com/fridaylab/deeper/communication/DeeperLink$Connector:i	I
    //   677: aload_0
    //   678: getfield 140	com/fridaylab/deeper/communication/DeeperLink$Connector:h	Z
    //   681: ifne +10 -> 691
    //   684: aload_0
    //   685: getfield 88	com/fridaylab/deeper/communication/DeeperLink$Connector:f	Z
    //   688: ifne +203 -> 891
    //   691: getstatic 250	com/fridaylab/deeper/communication/CommunicationProtocol$ConnectionState:e	Lcom/fridaylab/deeper/communication/CommunicationProtocol$ConnectionState;
    //   694: astore 28
    //   696: aload_0
    //   697: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   700: aload 28
    //   702: aload_0
    //   703: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   706: invokestatic 64	com/fridaylab/deeper/communication/DeeperLink:h	(Lcom/fridaylab/deeper/communication/DeeperLink;)Ljava/lang/String;
    //   709: invokestatic 255	com/fridaylab/deeper/communication/DeeperModel:b	(Ljava/lang/String;)Lcom/fridaylab/deeper/communication/DeeperModel;
    //   712: invokevirtual 258	com/fridaylab/deeper/communication/DeeperLink:b	(Lcom/fridaylab/deeper/communication/CommunicationProtocol$ConnectionState;Lcom/fridaylab/deeper/communication/DeeperModel;)V
    //   715: aload_0
    //   716: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   719: invokestatic 108	com/fridaylab/deeper/communication/DeeperLink:i	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/bluetooth/BluetoothAdapter;
    //   722: invokevirtual 261	android/bluetooth/BluetoothAdapter:cancelDiscovery	()Z
    //   725: pop
    //   726: aload_0
    //   727: getfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   730: invokevirtual 264	android/bluetooth/BluetoothSocket:connect	()V
    //   733: getstatic 268	com/fridaylab/util/ByteLogger:a	Z
    //   736: ifeq +16 -> 752
    //   739: invokestatic 270	com/fridaylab/util/ByteLogger:a	()V
    //   742: aload_0
    //   743: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   746: invokestatic 53	com/fridaylab/deeper/communication/DeeperLink:g	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/content/Context;
    //   749: invokestatic 273	com/fridaylab/util/ByteLogger:a	(Landroid/content/Context;)V
    //   752: ldc2_w 274
    //   755: invokestatic 160	java/lang/Thread:sleep	(J)V
    //   758: aload_0
    //   759: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   762: invokestatic 278	com/fridaylab/deeper/communication/DeeperLink:j	(Lcom/fridaylab/deeper/communication/DeeperLink;)Lcom/fridaylab/deeper/communication/DeeperChannel;
    //   765: invokevirtual 281	com/fridaylab/deeper/communication/DeeperChannel:a	()V
    //   768: aload_0
    //   769: new 283	com/fridaylab/deeper/communication/BluetoothConnection
    //   772: dup
    //   773: aload_0
    //   774: getfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   777: aload_0
    //   778: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   781: invokespecial 286	com/fridaylab/deeper/communication/BluetoothConnection:<init>	(Landroid/bluetooth/BluetoothSocket;Lcom/fridaylab/deeper/communication/BluetoothConnection$Listener;)V
    //   784: putfield 133	com/fridaylab/deeper/communication/DeeperLink$Connector:c	Lcom/fridaylab/deeper/communication/BluetoothConnection;
    //   787: aload_0
    //   788: getfield 133	com/fridaylab/deeper/communication/DeeperLink$Connector:c	Lcom/fridaylab/deeper/communication/BluetoothConnection;
    //   791: invokevirtual 289	com/fridaylab/deeper/communication/BluetoothConnection:start	()V
    //   794: aload_0
    //   795: getfield 133	com/fridaylab/deeper/communication/DeeperLink$Connector:c	Lcom/fridaylab/deeper/communication/BluetoothConnection;
    //   798: ifnonnull +22 -> 820
    //   801: aload_0
    //   802: getfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   805: ifnull +15 -> 820
    //   808: aload_0
    //   809: getfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   812: invokevirtual 171	android/bluetooth/BluetoothSocket:close	()V
    //   815: aload_0
    //   816: aconst_null
    //   817: putfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   820: aload_0
    //   821: getfield 133	com/fridaylab/deeper/communication/DeeperLink$Connector:c	Lcom/fridaylab/deeper/communication/BluetoothConnection;
    //   824: ifnonnull +170 -> 994
    //   827: ldc 173
    //   829: astore 30
    //   831: aload_0
    //   832: getfield 48	com/fridaylab/deeper/communication/DeeperLink$Connector:n	Ljava/util/HashSet;
    //   835: invokevirtual 177	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   838: astore 31
    //   840: aload 31
    //   842: invokeinterface 182 1 0
    //   847: ifeq +154 -> 1001
    //   850: aload 31
    //   852: invokeinterface 186 1 0
    //   857: checkcast 188	java/lang/String
    //   860: astore 33
    //   862: aload_0
    //   863: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   866: invokestatic 53	com/fridaylab/deeper/communication/DeeperLink:g	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/content/Context;
    //   869: invokestatic 193	com/google/analytics/tracking/android/EasyTracker:a	(Landroid/content/Context;)Lcom/google/analytics/tracking/android/EasyTracker;
    //   872: ldc 195
    //   874: aload 30
    //   876: aload 33
    //   878: aconst_null
    //   879: invokestatic 200	com/google/analytics/tracking/android/MapBuilder:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/analytics/tracking/android/MapBuilder;
    //   882: invokevirtual 203	com/google/analytics/tracking/android/MapBuilder:a	()Ljava/util/Map;
    //   885: invokevirtual 206	com/google/analytics/tracking/android/EasyTracker:a	(Ljava/util/Map;)V
    //   888: goto -48 -> 840
    //   891: getstatic 291	com/fridaylab/deeper/communication/CommunicationProtocol$ConnectionState:h	Lcom/fridaylab/deeper/communication/CommunicationProtocol$ConnectionState;
    //   894: astore 28
    //   896: goto -200 -> 696
    //   899: astore 25
    //   901: aload_0
    //   902: iconst_0
    //   903: putfield 90	com/fridaylab/deeper/communication/DeeperLink$Connector:g	Z
    //   906: aload_0
    //   907: getfield 48	com/fridaylab/deeper/communication/DeeperLink$Connector:n	Ljava/util/HashSet;
    //   910: aload 25
    //   912: invokevirtual 294	java/io/IOException:getMessage	()Ljava/lang/String;
    //   915: invokevirtual 298	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   918: pop
    //   919: getstatic 303	android/os/Build$VERSION:SDK_INT	I
    //   922: bipush 16
    //   924: if_icmpgt +41 -> 965
    //   927: aload 25
    //   929: invokevirtual 294	java/io/IOException:getMessage	()Ljava/lang/String;
    //   932: ldc_w 305
    //   935: invokestatic 311	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   938: ifeq +27 -> 965
    //   941: invokestatic 97	java/lang/System:nanoTime	()J
    //   944: aload_0
    //   945: getfield 101	com/fridaylab/deeper/communication/DeeperLink$Connector:k	J
    //   948: lsub
    //   949: ldc2_w 36
    //   952: lcmp
    //   953: ifle +18 -> 971
    //   956: iconst_1
    //   957: istore 27
    //   959: aload_0
    //   960: iload 27
    //   962: putfield 94	com/fridaylab/deeper/communication/DeeperLink$Connector:j	Z
    //   965: iinc 8 1
    //   968: goto -951 -> 17
    //   971: iconst_0
    //   972: istore 27
    //   974: goto -15 -> 959
    //   977: astore 34
    //   979: aload 34
    //   981: invokestatic 211	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   984: ldc 213
    //   986: aload 34
    //   988: invokestatic 130	com/fridaylab/util/Flog:a	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   991: goto -171 -> 820
    //   994: ldc 215
    //   996: astore 30
    //   998: goto -167 -> 831
    //   1001: aload_0
    //   1002: getfield 41	com/fridaylab/deeper/communication/DeeperLink$Connector:l	Z
    //   1005: ifeq +52 -> 1057
    //   1008: aload_0
    //   1009: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   1012: invokestatic 53	com/fridaylab/deeper/communication/DeeperLink:g	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/content/Context;
    //   1015: invokestatic 193	com/google/analytics/tracking/android/EasyTracker:a	(Landroid/content/Context;)Lcom/google/analytics/tracking/android/EasyTracker;
    //   1018: ldc 195
    //   1020: new 217	java/lang/StringBuilder
    //   1023: dup
    //   1024: invokespecial 218	java/lang/StringBuilder:<init>	()V
    //   1027: aload 30
    //   1029: invokevirtual 222	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1032: ldc 224
    //   1034: invokevirtual 222	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1037: invokevirtual 228	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1040: aload_0
    //   1041: getfield 43	com/fridaylab/deeper/communication/DeeperLink$Connector:m	I
    //   1044: invokestatic 233	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   1047: aconst_null
    //   1048: invokestatic 200	com/google/analytics/tracking/android/MapBuilder:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/analytics/tracking/android/MapBuilder;
    //   1051: invokevirtual 203	com/google/analytics/tracking/android/MapBuilder:a	()Ljava/util/Map;
    //   1054: invokevirtual 206	com/google/analytics/tracking/android/EasyTracker:a	(Ljava/util/Map;)V
    //   1057: aload_0
    //   1058: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   1061: getfield 236	com/fridaylab/deeper/communication/DeeperLink:c	Lcom/fridaylab/deeper/communication/CommunicationHandler;
    //   1064: aload_0
    //   1065: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   1068: invokestatic 239	com/fridaylab/deeper/communication/DeeperLink:k	(Lcom/fridaylab/deeper/communication/DeeperLink;)Ljava/lang/Runnable;
    //   1071: invokevirtual 245	com/fridaylab/deeper/communication/CommunicationHandler:post	(Ljava/lang/Runnable;)Z
    //   1074: pop
    //   1075: return
    //   1076: astore_1
    //   1077: aload_0
    //   1078: getfield 133	com/fridaylab/deeper/communication/DeeperLink$Connector:c	Lcom/fridaylab/deeper/communication/BluetoothConnection;
    //   1081: ifnonnull +22 -> 1103
    //   1084: aload_0
    //   1085: getfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   1088: ifnull +15 -> 1103
    //   1091: aload_0
    //   1092: getfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   1095: invokevirtual 171	android/bluetooth/BluetoothSocket:close	()V
    //   1098: aload_0
    //   1099: aconst_null
    //   1100: putfield 105	com/fridaylab/deeper/communication/DeeperLink$Connector:d	Landroid/bluetooth/BluetoothSocket;
    //   1103: aload_0
    //   1104: getfield 133	com/fridaylab/deeper/communication/DeeperLink$Connector:c	Lcom/fridaylab/deeper/communication/BluetoothConnection;
    //   1107: ifnonnull +79 -> 1186
    //   1110: ldc 173
    //   1112: astore_2
    //   1113: aload_0
    //   1114: getfield 48	com/fridaylab/deeper/communication/DeeperLink$Connector:n	Ljava/util/HashSet;
    //   1117: invokevirtual 177	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   1120: astore_3
    //   1121: aload_3
    //   1122: invokeinterface 182 1 0
    //   1127: ifeq +65 -> 1192
    //   1130: aload_3
    //   1131: invokeinterface 186 1 0
    //   1136: checkcast 188	java/lang/String
    //   1139: astore 5
    //   1141: aload_0
    //   1142: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   1145: invokestatic 53	com/fridaylab/deeper/communication/DeeperLink:g	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/content/Context;
    //   1148: invokestatic 193	com/google/analytics/tracking/android/EasyTracker:a	(Landroid/content/Context;)Lcom/google/analytics/tracking/android/EasyTracker;
    //   1151: ldc 195
    //   1153: aload_2
    //   1154: aload 5
    //   1156: aconst_null
    //   1157: invokestatic 200	com/google/analytics/tracking/android/MapBuilder:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/analytics/tracking/android/MapBuilder;
    //   1160: invokevirtual 203	com/google/analytics/tracking/android/MapBuilder:a	()Ljava/util/Map;
    //   1163: invokevirtual 206	com/google/analytics/tracking/android/EasyTracker:a	(Ljava/util/Map;)V
    //   1166: goto -45 -> 1121
    //   1169: astore 6
    //   1171: aload 6
    //   1173: invokestatic 211	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   1176: ldc 213
    //   1178: aload 6
    //   1180: invokestatic 130	com/fridaylab/util/Flog:a	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   1183: goto -80 -> 1103
    //   1186: ldc 215
    //   1188: astore_2
    //   1189: goto -76 -> 1113
    //   1192: aload_0
    //   1193: getfield 41	com/fridaylab/deeper/communication/DeeperLink$Connector:l	Z
    //   1196: ifeq +51 -> 1247
    //   1199: aload_0
    //   1200: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   1203: invokestatic 53	com/fridaylab/deeper/communication/DeeperLink:g	(Lcom/fridaylab/deeper/communication/DeeperLink;)Landroid/content/Context;
    //   1206: invokestatic 193	com/google/analytics/tracking/android/EasyTracker:a	(Landroid/content/Context;)Lcom/google/analytics/tracking/android/EasyTracker;
    //   1209: ldc 195
    //   1211: new 217	java/lang/StringBuilder
    //   1214: dup
    //   1215: invokespecial 218	java/lang/StringBuilder:<init>	()V
    //   1218: aload_2
    //   1219: invokevirtual 222	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1222: ldc 224
    //   1224: invokevirtual 222	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1227: invokevirtual 228	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1230: aload_0
    //   1231: getfield 43	com/fridaylab/deeper/communication/DeeperLink$Connector:m	I
    //   1234: invokestatic 233	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   1237: aconst_null
    //   1238: invokestatic 200	com/google/analytics/tracking/android/MapBuilder:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/analytics/tracking/android/MapBuilder;
    //   1241: invokevirtual 203	com/google/analytics/tracking/android/MapBuilder:a	()Ljava/util/Map;
    //   1244: invokevirtual 206	com/google/analytics/tracking/android/EasyTracker:a	(Ljava/util/Map;)V
    //   1247: aload_0
    //   1248: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   1251: getfield 236	com/fridaylab/deeper/communication/DeeperLink:c	Lcom/fridaylab/deeper/communication/CommunicationHandler;
    //   1254: aload_0
    //   1255: getfield 32	com/fridaylab/deeper/communication/DeeperLink$Connector:a	Lcom/fridaylab/deeper/communication/DeeperLink;
    //   1258: invokestatic 239	com/fridaylab/deeper/communication/DeeperLink:k	(Lcom/fridaylab/deeper/communication/DeeperLink;)Ljava/lang/Runnable;
    //   1261: invokevirtual 245	com/fridaylab/deeper/communication/CommunicationHandler:post	(Ljava/lang/Runnable;)Z
    //   1264: pop
    //   1265: aload_1
    //   1266: athrow
    //   1267: iload 21
    //   1269: istore 14
    //   1271: goto -1170 -> 101
    //   1274: iconst_0
    //   1275: istore 9
    //   1277: goto -1202 -> 75
    //   1280: iconst_1
    //   1281: istore 8
    //   1283: goto -1266 -> 17
    //   1286: iload 13
    //   1288: ifne -1160 -> 128
    //   1291: iload 12
    //   1293: ifeq -854 -> 439
    //   1296: goto -1168 -> 128
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1299	0	this	Connector
    //   1076	190	1	localObject	java.lang.Object
    //   1112	107	2	str1	String
    //   1120	11	3	localIterator1	java.util.Iterator
    //   1139	16	5	str2	String
    //   1169	10	6	localIOException1	IOException
    //   12	175	7	i1	int
    //   17	1265	8	i2	int
    //   73	1203	9	i3	int
    //   81	8	10	i4	int
    //   89	34	11	i5	int
    //   92	1200	12	i6	int
    //   96	1191	13	i7	int
    //   99	1171	14	i8	int
    //   241	1	15	localInterruptedException	java.lang.InterruptedException
    //   278	113	16	str3	String
    //   287	13	17	localIterator2	java.util.Iterator
    //   309	17	19	str4	String
    //   340	10	20	localIOException2	IOException
    //   132	1136	21	i9	int
    //   217	20	23	bool1	boolean
    //   451	3	24	bool2	boolean
    //   899	29	25	localIOException3	IOException
    //   957	16	27	bool3	boolean
    //   694	201	28	localConnectionState	CommunicationProtocol.ConnectionState
    //   829	199	30	str5	String
    //   838	13	31	localIterator3	java.util.Iterator
    //   860	17	33	str6	String
    //   977	10	34	localIOException4	IOException
    //   493	113	35	str7	String
    //   502	13	36	localIterator4	java.util.Iterator
    //   524	17	38	str8	String
    //   555	10	39	localIOException5	IOException
    // Exception table:
    //   from	to	target	type
    //   101	115	241	java/lang/InterruptedException
    //   134	140	241	java/lang/InterruptedException
    //   145	169	241	java/lang/InterruptedException
    //   196	216	241	java/lang/InterruptedException
    //   219	225	241	java/lang/InterruptedException
    //   257	269	340	java/io/IOException
    //   472	484	555	java/io/IOException
    //   677	691	899	java/io/IOException
    //   691	696	899	java/io/IOException
    //   696	752	899	java/io/IOException
    //   752	794	899	java/io/IOException
    //   891	896	899	java/io/IOException
    //   808	820	977	java/io/IOException
    //   0	11	1076	finally
    //   24	29	1076	finally
    //   35	72	1076	finally
    //   75	83	1076	finally
    //   101	115	1076	finally
    //   134	140	1076	finally
    //   145	169	1076	finally
    //   182	188	1076	finally
    //   196	216	1076	finally
    //   219	225	1076	finally
    //   439	447	1076	finally
    //   447	453	1076	finally
    //   654	671	1076	finally
    //   671	677	1076	finally
    //   677	691	1076	finally
    //   691	696	1076	finally
    //   696	752	1076	finally
    //   752	794	1076	finally
    //   891	896	1076	finally
    //   901	956	1076	finally
    //   959	965	1076	finally
    //   1091	1103	1169	java/io/IOException
  }
  
  public int e()
  {
    return this.i;
  }
  
  public void run()
  {
    g();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperLink.Connector
 * JD-Core Version:    0.7.0.1
 */