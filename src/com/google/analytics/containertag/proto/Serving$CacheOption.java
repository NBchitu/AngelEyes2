package com.google.analytics.containertag.proto;

import com.google.tagmanager.protobuf.ByteString;
import com.google.tagmanager.protobuf.CodedOutputStream;
import com.google.tagmanager.protobuf.GeneratedMessageLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite.Builder;
import com.google.tagmanager.protobuf.Internal;
import com.google.tagmanager.protobuf.MutableMessageLite;
import com.google.tagmanager.protobuf.Parser;

public final class Serving$CacheOption
  extends GeneratedMessageLite
  implements Serving.CacheOptionOrBuilder
{
  public static Parser<CacheOption> a = new Serving.CacheOption.1();
  private static final CacheOption b;
  private static volatile MutableMessageLite k = null;
  private final ByteString d;
  private int e;
  private Serving.CacheOption.CacheLevel f;
  private int g;
  private int h;
  private byte i = -1;
  private int j = -1;
  
  static
  {
    b = new CacheOption(true);
    b.r();
  }
  
  /* Error */
  private Serving$CacheOption(com.google.tagmanager.protobuf.CodedInputStream paramCodedInputStream, com.google.tagmanager.protobuf.ExtensionRegistryLite paramExtensionRegistryLite)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 49	com/google/tagmanager/protobuf/GeneratedMessageLite:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 51	com/google/analytics/containertag/proto/Serving$CacheOption:i	B
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield 53	com/google/analytics/containertag/proto/Serving$CacheOption:j	I
    //   14: aload_0
    //   15: invokespecial 43	com/google/analytics/containertag/proto/Serving$CacheOption:r	()V
    //   18: invokestatic 58	com/google/tagmanager/protobuf/ByteString:i	()Lcom/google/tagmanager/protobuf/ByteString$Output;
    //   21: astore_3
    //   22: aload_3
    //   23: invokestatic 63	com/google/tagmanager/protobuf/CodedOutputStream:a	(Ljava/io/OutputStream;)Lcom/google/tagmanager/protobuf/CodedOutputStream;
    //   26: astore 4
    //   28: iconst_0
    //   29: istore 5
    //   31: iload 5
    //   33: ifne +220 -> 253
    //   36: aload_1
    //   37: invokevirtual 68	com/google/tagmanager/protobuf/CodedInputStream:a	()I
    //   40: istore 13
    //   42: iload 13
    //   44: lookupswitch	default:+44->88, 0:+279->323, 8:+63->107, 16:+167->211, 24:+188->232
    //   89: aload_1
    //   90: aload 4
    //   92: aload_2
    //   93: iload 13
    //   95: invokevirtual 71	com/google/analytics/containertag/proto/Serving$CacheOption:a	(Lcom/google/tagmanager/protobuf/CodedInputStream;Lcom/google/tagmanager/protobuf/CodedOutputStream;Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;I)Z
    //   98: ifne -67 -> 31
    //   101: iconst_1
    //   102: istore 5
    //   104: goto -73 -> 31
    //   107: aload_1
    //   108: invokevirtual 74	com/google/tagmanager/protobuf/CodedInputStream:n	()I
    //   111: istore 14
    //   113: iload 14
    //   115: invokestatic 79	com/google/analytics/containertag/proto/Serving$CacheOption$CacheLevel:a	(I)Lcom/google/analytics/containertag/proto/Serving$CacheOption$CacheLevel;
    //   118: astore 15
    //   120: aload 15
    //   122: ifnonnull +51 -> 173
    //   125: aload 4
    //   127: iload 13
    //   129: invokevirtual 83	com/google/tagmanager/protobuf/CodedOutputStream:p	(I)V
    //   132: aload 4
    //   134: iload 14
    //   136: invokevirtual 83	com/google/tagmanager/protobuf/CodedOutputStream:p	(I)V
    //   139: goto -108 -> 31
    //   142: astore 12
    //   144: aload 12
    //   146: aload_0
    //   147: invokevirtual 86	com/google/tagmanager/protobuf/InvalidProtocolBufferException:a	(Lcom/google/tagmanager/protobuf/MessageLite;)Lcom/google/tagmanager/protobuf/InvalidProtocolBufferException;
    //   150: athrow
    //   151: astore 9
    //   153: aload 4
    //   155: invokevirtual 88	com/google/tagmanager/protobuf/CodedOutputStream:a	()V
    //   158: aload_0
    //   159: aload_3
    //   160: invokevirtual 93	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   163: putfield 95	com/google/analytics/containertag/proto/Serving$CacheOption:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   166: aload_0
    //   167: invokevirtual 98	com/google/analytics/containertag/proto/Serving$CacheOption:X	()V
    //   170: aload 9
    //   172: athrow
    //   173: aload_0
    //   174: iconst_1
    //   175: aload_0
    //   176: getfield 100	com/google/analytics/containertag/proto/Serving$CacheOption:e	I
    //   179: ior
    //   180: putfield 100	com/google/analytics/containertag/proto/Serving$CacheOption:e	I
    //   183: aload_0
    //   184: aload 15
    //   186: putfield 102	com/google/analytics/containertag/proto/Serving$CacheOption:f	Lcom/google/analytics/containertag/proto/Serving$CacheOption$CacheLevel;
    //   189: goto -158 -> 31
    //   192: astore 8
    //   194: new 46	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   197: dup
    //   198: aload 8
    //   200: invokevirtual 106	java/io/IOException:getMessage	()Ljava/lang/String;
    //   203: invokespecial 109	com/google/tagmanager/protobuf/InvalidProtocolBufferException:<init>	(Ljava/lang/String;)V
    //   206: aload_0
    //   207: invokevirtual 86	com/google/tagmanager/protobuf/InvalidProtocolBufferException:a	(Lcom/google/tagmanager/protobuf/MessageLite;)Lcom/google/tagmanager/protobuf/InvalidProtocolBufferException;
    //   210: athrow
    //   211: aload_0
    //   212: iconst_2
    //   213: aload_0
    //   214: getfield 100	com/google/analytics/containertag/proto/Serving$CacheOption:e	I
    //   217: ior
    //   218: putfield 100	com/google/analytics/containertag/proto/Serving$CacheOption:e	I
    //   221: aload_0
    //   222: aload_1
    //   223: invokevirtual 111	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   226: putfield 113	com/google/analytics/containertag/proto/Serving$CacheOption:g	I
    //   229: goto -198 -> 31
    //   232: aload_0
    //   233: iconst_4
    //   234: aload_0
    //   235: getfield 100	com/google/analytics/containertag/proto/Serving$CacheOption:e	I
    //   238: ior
    //   239: putfield 100	com/google/analytics/containertag/proto/Serving$CacheOption:e	I
    //   242: aload_0
    //   243: aload_1
    //   244: invokevirtual 111	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   247: putfield 115	com/google/analytics/containertag/proto/Serving$CacheOption:h	I
    //   250: goto -219 -> 31
    //   253: aload 4
    //   255: invokevirtual 88	com/google/tagmanager/protobuf/CodedOutputStream:a	()V
    //   258: aload_0
    //   259: aload_3
    //   260: invokevirtual 93	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   263: putfield 95	com/google/analytics/containertag/proto/Serving$CacheOption:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   266: aload_0
    //   267: invokevirtual 98	com/google/analytics/containertag/proto/Serving$CacheOption:X	()V
    //   270: return
    //   271: astore 7
    //   273: aload_0
    //   274: aload_3
    //   275: invokevirtual 93	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   278: putfield 95	com/google/analytics/containertag/proto/Serving$CacheOption:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   281: goto -15 -> 266
    //   284: astore 6
    //   286: aload_0
    //   287: aload_3
    //   288: invokevirtual 93	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   291: putfield 95	com/google/analytics/containertag/proto/Serving$CacheOption:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   294: aload 6
    //   296: athrow
    //   297: astore 11
    //   299: aload_0
    //   300: aload_3
    //   301: invokevirtual 93	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   304: putfield 95	com/google/analytics/containertag/proto/Serving$CacheOption:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   307: goto -141 -> 166
    //   310: astore 10
    //   312: aload_0
    //   313: aload_3
    //   314: invokevirtual 93	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   317: putfield 95	com/google/analytics/containertag/proto/Serving$CacheOption:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   320: aload 10
    //   322: athrow
    //   323: iconst_1
    //   324: istore 5
    //   326: goto -295 -> 31
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	329	0	this	CacheOption
    //   0	329	1	paramCodedInputStream	com.google.tagmanager.protobuf.CodedInputStream
    //   0	329	2	paramExtensionRegistryLite	com.google.tagmanager.protobuf.ExtensionRegistryLite
    //   21	293	3	localOutput	com.google.tagmanager.protobuf.ByteString.Output
    //   26	228	4	localCodedOutputStream	CodedOutputStream
    //   29	296	5	m	int
    //   284	11	6	localObject1	Object
    //   271	1	7	localIOException1	java.io.IOException
    //   192	7	8	localIOException2	java.io.IOException
    //   151	20	9	localObject2	Object
    //   310	11	10	localObject3	Object
    //   297	1	11	localIOException3	java.io.IOException
    //   142	3	12	localInvalidProtocolBufferException	com.google.tagmanager.protobuf.InvalidProtocolBufferException
    //   40	88	13	n	int
    //   111	24	14	i1	int
    //   118	67	15	localCacheLevel	Serving.CacheOption.CacheLevel
    // Exception table:
    //   from	to	target	type
    //   36	42	142	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   88	101	142	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   107	120	142	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   125	139	142	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   173	189	142	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   211	229	142	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   232	250	142	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   36	42	151	finally
    //   88	101	151	finally
    //   107	120	151	finally
    //   125	139	151	finally
    //   144	151	151	finally
    //   173	189	151	finally
    //   194	211	151	finally
    //   211	229	151	finally
    //   232	250	151	finally
    //   36	42	192	java/io/IOException
    //   88	101	192	java/io/IOException
    //   107	120	192	java/io/IOException
    //   125	139	192	java/io/IOException
    //   173	189	192	java/io/IOException
    //   211	229	192	java/io/IOException
    //   232	250	192	java/io/IOException
    //   253	258	271	java/io/IOException
    //   253	258	284	finally
    //   153	158	297	java/io/IOException
    //   153	158	310	finally
  }
  
  private Serving$CacheOption(GeneratedMessageLite.Builder paramBuilder)
  {
    super(paramBuilder);
    this.d = paramBuilder.r();
  }
  
  private Serving$CacheOption(boolean paramBoolean)
  {
    this.d = ByteString.a;
  }
  
  public static Serving.CacheOption.Builder a(CacheOption paramCacheOption)
  {
    return l().a(paramCacheOption);
  }
  
  public static CacheOption a()
  {
    return b;
  }
  
  public static Serving.CacheOption.Builder l()
  {
    return Serving.CacheOption.Builder.i();
  }
  
  private void r()
  {
    this.f = Serving.CacheOption.CacheLevel.a;
    this.g = 0;
    this.h = 0;
  }
  
  public void a(CodedOutputStream paramCodedOutputStream)
  {
    k();
    if ((0x1 & this.e) == 1) {
      paramCodedOutputStream.c(1, this.f.a());
    }
    if ((0x2 & this.e) == 2) {
      paramCodedOutputStream.a(2, this.g);
    }
    if ((0x4 & this.e) == 4) {
      paramCodedOutputStream.a(3, this.h);
    }
    paramCodedOutputStream.c(this.d);
  }
  
  public CacheOption b()
  {
    return b;
  }
  
  public Parser<CacheOption> c()
  {
    return a;
  }
  
  public boolean d()
  {
    return (0x1 & this.e) == 1;
  }
  
  public Serving.CacheOption.CacheLevel e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof CacheOption)) {
      return super.equals(paramObject);
    }
    CacheOption localCacheOption = (CacheOption)paramObject;
    int m;
    label38:
    label62:
    int n;
    if (d() == localCacheOption.d())
    {
      m = 1;
      if (d())
      {
        if ((m == 0) || (e() != localCacheOption.e())) {
          break label155;
        }
        m = 1;
      }
      if ((m == 0) || (f() != localCacheOption.f())) {
        break label160;
      }
      n = 1;
      label80:
      if (f())
      {
        if ((n == 0) || (g() != localCacheOption.g())) {
          break label166;
        }
        n = 1;
      }
      label106:
      if ((n == 0) || (h() != localCacheOption.h())) {
        break label172;
      }
    }
    label155:
    label160:
    label166:
    label172:
    for (boolean bool = true;; bool = false)
    {
      if (!h()) {
        break label178;
      }
      if ((bool) && (i() == localCacheOption.i())) {
        break;
      }
      return false;
      m = 0;
      break label38;
      m = 0;
      break label62;
      n = 0;
      break label80;
      n = 0;
      break label106;
    }
    label178:
    return bool;
  }
  
  public boolean f()
  {
    return (0x2 & this.e) == 2;
  }
  
  public int g()
  {
    return this.g;
  }
  
  public boolean h()
  {
    return (0x4 & this.e) == 4;
  }
  
  public int hashCode()
  {
    if (this.c != 0) {
      return this.c;
    }
    int m = 779 + CacheOption.class.hashCode();
    if (d()) {
      m = 53 * (1 + m * 37) + Internal.a(e());
    }
    if (f()) {
      m = 53 * (2 + m * 37) + g();
    }
    if (h()) {
      m = 53 * (3 + m * 37) + i();
    }
    int n = m * 29 + this.d.hashCode();
    this.c = n;
    return n;
  }
  
  public int i()
  {
    return this.h;
  }
  
  public final boolean j()
  {
    int m = this.i;
    if (m != -1) {
      return m == 1;
    }
    this.i = 1;
    return true;
  }
  
  public int k()
  {
    int m = this.j;
    if (m != -1) {
      return m;
    }
    int n = 0x1 & this.e;
    int i1 = 0;
    if (n == 1) {
      i1 = 0 + CodedOutputStream.e(1, this.f.a());
    }
    if ((0x2 & this.e) == 2) {
      i1 += CodedOutputStream.d(2, this.g);
    }
    if ((0x4 & this.e) == 4) {
      i1 += CodedOutputStream.d(3, this.h);
    }
    int i2 = i1 + this.d.a();
    this.j = i2;
    return i2;
  }
  
  public Serving.CacheOption.Builder m()
  {
    return l();
  }
  
  public Serving.CacheOption.Builder n()
  {
    return a(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.containertag.proto.Serving.CacheOption
 * JD-Core Version:    0.7.0.1
 */