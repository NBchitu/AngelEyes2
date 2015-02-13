package com.google.analytics.containertag.proto;

import com.google.tagmanager.protobuf.ByteString;
import com.google.tagmanager.protobuf.CodedOutputStream;
import com.google.tagmanager.protobuf.ExtensionRegistryLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite.Builder;
import com.google.tagmanager.protobuf.MutableMessageLite;
import com.google.tagmanager.protobuf.Parser;
import java.io.InputStream;

public final class Serving$OptionalResource
  extends GeneratedMessageLite
  implements Serving.OptionalResourceOrBuilder
{
  public static Parser<OptionalResource> a = new Serving.OptionalResource.1();
  private static final OptionalResource b;
  private static volatile MutableMessageLite i = null;
  private final ByteString d;
  private int e;
  private Serving.Resource f;
  private byte g = -1;
  private int h = -1;
  
  static
  {
    b = new OptionalResource(true);
    b.i();
  }
  
  /* Error */
  private Serving$OptionalResource(com.google.tagmanager.protobuf.CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 46	com/google/tagmanager/protobuf/GeneratedMessageLite:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 48	com/google/analytics/containertag/proto/Serving$OptionalResource:g	B
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield 50	com/google/analytics/containertag/proto/Serving$OptionalResource:h	I
    //   14: aload_0
    //   15: invokespecial 40	com/google/analytics/containertag/proto/Serving$OptionalResource:i	()V
    //   18: invokestatic 55	com/google/tagmanager/protobuf/ByteString:i	()Lcom/google/tagmanager/protobuf/ByteString$Output;
    //   21: astore_3
    //   22: aload_3
    //   23: invokestatic 60	com/google/tagmanager/protobuf/CodedOutputStream:a	(Ljava/io/OutputStream;)Lcom/google/tagmanager/protobuf/CodedOutputStream;
    //   26: astore 4
    //   28: iconst_0
    //   29: istore 5
    //   31: iload 5
    //   33: ifne +133 -> 166
    //   36: aload_1
    //   37: invokevirtual 65	com/google/tagmanager/protobuf/CodedInputStream:a	()I
    //   40: istore 13
    //   42: iload 13
    //   44: lookupswitch	default:+28->72, 0:+259->303, 18:+47->91
    //   73: aload_1
    //   74: aload 4
    //   76: aload_2
    //   77: iload 13
    //   79: invokevirtual 68	com/google/analytics/containertag/proto/Serving$OptionalResource:a	(Lcom/google/tagmanager/protobuf/CodedInputStream;Lcom/google/tagmanager/protobuf/CodedOutputStream;Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;I)Z
    //   82: ifne +210 -> 292
    //   85: iconst_1
    //   86: istore 16
    //   88: goto +208 -> 296
    //   91: iconst_1
    //   92: aload_0
    //   93: getfield 70	com/google/analytics/containertag/proto/Serving$OptionalResource:e	I
    //   96: iand
    //   97: iconst_1
    //   98: if_icmpne +188 -> 286
    //   101: aload_0
    //   102: getfield 72	com/google/analytics/containertag/proto/Serving$OptionalResource:f	Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   105: invokevirtual 78	com/google/analytics/containertag/proto/Serving$Resource:U	()Lcom/google/analytics/containertag/proto/Serving$Resource$Builder;
    //   108: astore 14
    //   110: aload_0
    //   111: aload_1
    //   112: getstatic 79	com/google/analytics/containertag/proto/Serving$Resource:a	Lcom/google/tagmanager/protobuf/Parser;
    //   115: aload_2
    //   116: invokevirtual 82	com/google/tagmanager/protobuf/CodedInputStream:a	(Lcom/google/tagmanager/protobuf/Parser;Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;)Lcom/google/tagmanager/protobuf/MessageLite;
    //   119: checkcast 74	com/google/analytics/containertag/proto/Serving$Resource
    //   122: putfield 72	com/google/analytics/containertag/proto/Serving$OptionalResource:f	Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   125: aload 14
    //   127: ifnull +22 -> 149
    //   130: aload 14
    //   132: aload_0
    //   133: getfield 72	com/google/analytics/containertag/proto/Serving$OptionalResource:f	Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   136: invokevirtual 87	com/google/analytics/containertag/proto/Serving$Resource$Builder:a	(Lcom/google/analytics/containertag/proto/Serving$Resource;)Lcom/google/analytics/containertag/proto/Serving$Resource$Builder;
    //   139: pop
    //   140: aload_0
    //   141: aload 14
    //   143: invokevirtual 90	com/google/analytics/containertag/proto/Serving$Resource$Builder:d	()Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   146: putfield 72	com/google/analytics/containertag/proto/Serving$OptionalResource:f	Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   149: aload_0
    //   150: iconst_1
    //   151: aload_0
    //   152: getfield 70	com/google/analytics/containertag/proto/Serving$OptionalResource:e	I
    //   155: ior
    //   156: putfield 70	com/google/analytics/containertag/proto/Serving$OptionalResource:e	I
    //   159: iload 5
    //   161: istore 16
    //   163: goto +133 -> 296
    //   166: aload 4
    //   168: invokevirtual 92	com/google/tagmanager/protobuf/CodedOutputStream:a	()V
    //   171: aload_0
    //   172: aload_3
    //   173: invokevirtual 97	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   176: putfield 99	com/google/analytics/containertag/proto/Serving$OptionalResource:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   179: aload_0
    //   180: invokevirtual 102	com/google/analytics/containertag/proto/Serving$OptionalResource:X	()V
    //   183: return
    //   184: astore 7
    //   186: aload_0
    //   187: aload_3
    //   188: invokevirtual 97	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   191: putfield 99	com/google/analytics/containertag/proto/Serving$OptionalResource:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   194: goto -15 -> 179
    //   197: astore 6
    //   199: aload_0
    //   200: aload_3
    //   201: invokevirtual 97	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   204: putfield 99	com/google/analytics/containertag/proto/Serving$OptionalResource:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   207: aload 6
    //   209: athrow
    //   210: astore 12
    //   212: aload 12
    //   214: aload_0
    //   215: invokevirtual 105	com/google/tagmanager/protobuf/InvalidProtocolBufferException:a	(Lcom/google/tagmanager/protobuf/MessageLite;)Lcom/google/tagmanager/protobuf/InvalidProtocolBufferException;
    //   218: athrow
    //   219: astore 9
    //   221: aload 4
    //   223: invokevirtual 92	com/google/tagmanager/protobuf/CodedOutputStream:a	()V
    //   226: aload_0
    //   227: aload_3
    //   228: invokevirtual 97	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   231: putfield 99	com/google/analytics/containertag/proto/Serving$OptionalResource:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   234: aload_0
    //   235: invokevirtual 102	com/google/analytics/containertag/proto/Serving$OptionalResource:X	()V
    //   238: aload 9
    //   240: athrow
    //   241: astore 8
    //   243: new 43	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   246: dup
    //   247: aload 8
    //   249: invokevirtual 109	java/io/IOException:getMessage	()Ljava/lang/String;
    //   252: invokespecial 112	com/google/tagmanager/protobuf/InvalidProtocolBufferException:<init>	(Ljava/lang/String;)V
    //   255: aload_0
    //   256: invokevirtual 105	com/google/tagmanager/protobuf/InvalidProtocolBufferException:a	(Lcom/google/tagmanager/protobuf/MessageLite;)Lcom/google/tagmanager/protobuf/InvalidProtocolBufferException;
    //   259: athrow
    //   260: astore 11
    //   262: aload_0
    //   263: aload_3
    //   264: invokevirtual 97	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   267: putfield 99	com/google/analytics/containertag/proto/Serving$OptionalResource:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   270: goto -36 -> 234
    //   273: astore 10
    //   275: aload_0
    //   276: aload_3
    //   277: invokevirtual 97	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   280: putfield 99	com/google/analytics/containertag/proto/Serving$OptionalResource:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   283: aload 10
    //   285: athrow
    //   286: aconst_null
    //   287: astore 14
    //   289: goto -179 -> 110
    //   292: iload 5
    //   294: istore 16
    //   296: iload 16
    //   298: istore 5
    //   300: goto -269 -> 31
    //   303: iconst_1
    //   304: istore 16
    //   306: goto -10 -> 296
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	309	0	this	OptionalResource
    //   0	309	1	paramCodedInputStream	com.google.tagmanager.protobuf.CodedInputStream
    //   0	309	2	paramExtensionRegistryLite	ExtensionRegistryLite
    //   21	256	3	localOutput	com.google.tagmanager.protobuf.ByteString.Output
    //   26	196	4	localCodedOutputStream	CodedOutputStream
    //   29	270	5	j	int
    //   197	11	6	localObject1	Object
    //   184	1	7	localIOException1	java.io.IOException
    //   241	7	8	localIOException2	java.io.IOException
    //   219	20	9	localObject2	Object
    //   273	11	10	localObject3	Object
    //   260	1	11	localIOException3	java.io.IOException
    //   210	3	12	localInvalidProtocolBufferException	com.google.tagmanager.protobuf.InvalidProtocolBufferException
    //   40	38	13	k	int
    //   108	180	14	localBuilder	Serving.Resource.Builder
    //   86	219	16	m	int
    // Exception table:
    //   from	to	target	type
    //   166	171	184	java/io/IOException
    //   166	171	197	finally
    //   36	42	210	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   72	85	210	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   91	110	210	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   110	125	210	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   130	149	210	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   149	159	210	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   36	42	219	finally
    //   72	85	219	finally
    //   91	110	219	finally
    //   110	125	219	finally
    //   130	149	219	finally
    //   149	159	219	finally
    //   212	219	219	finally
    //   243	260	219	finally
    //   36	42	241	java/io/IOException
    //   72	85	241	java/io/IOException
    //   91	110	241	java/io/IOException
    //   110	125	241	java/io/IOException
    //   130	149	241	java/io/IOException
    //   149	159	241	java/io/IOException
    //   221	226	260	java/io/IOException
    //   221	226	273	finally
  }
  
  private Serving$OptionalResource(GeneratedMessageLite.Builder paramBuilder)
  {
    super(paramBuilder);
    this.d = paramBuilder.r();
  }
  
  private Serving$OptionalResource(boolean paramBoolean)
  {
    this.d = ByteString.a;
  }
  
  public static Serving.OptionalResource.Builder a(OptionalResource paramOptionalResource)
  {
    return f().a(paramOptionalResource);
  }
  
  public static OptionalResource a()
  {
    return b;
  }
  
  public static OptionalResource a(InputStream paramInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    return (OptionalResource)a.c(paramInputStream, paramExtensionRegistryLite);
  }
  
  public static Serving.OptionalResource.Builder f()
  {
    return Serving.OptionalResource.Builder.l();
  }
  
  private void i()
  {
    this.f = Serving.Resource.a();
  }
  
  public void a(CodedOutputStream paramCodedOutputStream)
  {
    k();
    if ((0x1 & this.e) == 1) {
      paramCodedOutputStream.b(2, this.f);
    }
    paramCodedOutputStream.c(this.d);
  }
  
  public OptionalResource b()
  {
    return b;
  }
  
  public Parser<OptionalResource> c()
  {
    return a;
  }
  
  public boolean d()
  {
    return (0x1 & this.e) == 1;
  }
  
  public Serving.Resource e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof OptionalResource)) {
      return super.equals(paramObject);
    }
    OptionalResource localOptionalResource = (OptionalResource)paramObject;
    if (d() == localOptionalResource.d()) {}
    for (boolean bool = true;; bool = false)
    {
      if (!d()) {
        return bool;
      }
      if ((bool) && (e().equals(localOptionalResource.e()))) {
        break;
      }
      return false;
    }
    return bool;
  }
  
  public Serving.OptionalResource.Builder g()
  {
    return f();
  }
  
  public Serving.OptionalResource.Builder h()
  {
    return a(this);
  }
  
  public int hashCode()
  {
    if (this.c != 0) {
      return this.c;
    }
    int j = 779 + OptionalResource.class.hashCode();
    if (d()) {
      j = 53 * (2 + j * 37) + e().hashCode();
    }
    int k = j * 29 + this.d.hashCode();
    this.c = k;
    return k;
  }
  
  public final boolean j()
  {
    int j = this.g;
    if (j != -1) {
      return j == 1;
    }
    if ((d()) && (!e().j()))
    {
      this.g = 0;
      return false;
    }
    this.g = 1;
    return true;
  }
  
  public int k()
  {
    int j = this.h;
    if (j != -1) {
      return j;
    }
    int k = 0x1 & this.e;
    int m = 0;
    if (k == 1) {
      m = 0 + CodedOutputStream.d(2, this.f);
    }
    int n = m + this.d.a();
    this.h = n;
    return n;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.containertag.proto.Serving.OptionalResource
 * JD-Core Version:    0.7.0.1
 */