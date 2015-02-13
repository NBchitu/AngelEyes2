package com.google.tagmanager.proto;

import com.google.analytics.containertag.proto.Serving.Resource;
import com.google.tagmanager.protobuf.ByteString;
import com.google.tagmanager.protobuf.CodedOutputStream;
import com.google.tagmanager.protobuf.ExtensionRegistryLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite.Builder;
import com.google.tagmanager.protobuf.Internal;
import com.google.tagmanager.protobuf.MutableMessageLite;
import com.google.tagmanager.protobuf.Parser;
import java.io.InputStream;

public final class Resource$ResourceWithMetadata
  extends GeneratedMessageLite
  implements Resource.ResourceWithMetadataOrBuilder
{
  public static Parser<ResourceWithMetadata> a = new Resource.ResourceWithMetadata.1();
  private static final ResourceWithMetadata b;
  private static volatile MutableMessageLite j = null;
  private final ByteString d;
  private int e;
  private long f;
  private Serving.Resource g;
  private byte h = -1;
  private int i = -1;
  
  static
  {
    b = new ResourceWithMetadata(true);
    b.m();
  }
  
  /* Error */
  private Resource$ResourceWithMetadata(com.google.tagmanager.protobuf.CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 49	com/google/tagmanager/protobuf/GeneratedMessageLite:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 51	com/google/tagmanager/proto/Resource$ResourceWithMetadata:h	B
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield 53	com/google/tagmanager/proto/Resource$ResourceWithMetadata:i	I
    //   14: aload_0
    //   15: invokespecial 43	com/google/tagmanager/proto/Resource$ResourceWithMetadata:m	()V
    //   18: invokestatic 58	com/google/tagmanager/protobuf/ByteString:i	()Lcom/google/tagmanager/protobuf/ByteString$Output;
    //   21: astore_3
    //   22: aload_3
    //   23: invokestatic 63	com/google/tagmanager/protobuf/CodedOutputStream:a	(Ljava/io/OutputStream;)Lcom/google/tagmanager/protobuf/CodedOutputStream;
    //   26: astore 4
    //   28: iconst_0
    //   29: istore 5
    //   31: iload 5
    //   33: ifne +166 -> 199
    //   36: aload_1
    //   37: invokevirtual 68	com/google/tagmanager/protobuf/CodedInputStream:a	()I
    //   40: istore 13
    //   42: iload 13
    //   44: lookupswitch	default:+36->80, 0:+292->336, 8:+55->99, 18:+80->124
    //   81: aload_1
    //   82: aload 4
    //   84: aload_2
    //   85: iload 13
    //   87: invokevirtual 71	com/google/tagmanager/proto/Resource$ResourceWithMetadata:a	(Lcom/google/tagmanager/protobuf/CodedInputStream;Lcom/google/tagmanager/protobuf/CodedOutputStream;Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;I)Z
    //   90: ifne +235 -> 325
    //   93: iconst_1
    //   94: istore 16
    //   96: goto +233 -> 329
    //   99: aload_0
    //   100: iconst_1
    //   101: aload_0
    //   102: getfield 73	com/google/tagmanager/proto/Resource$ResourceWithMetadata:e	I
    //   105: ior
    //   106: putfield 73	com/google/tagmanager/proto/Resource$ResourceWithMetadata:e	I
    //   109: aload_0
    //   110: aload_1
    //   111: invokevirtual 76	com/google/tagmanager/protobuf/CodedInputStream:e	()J
    //   114: putfield 78	com/google/tagmanager/proto/Resource$ResourceWithMetadata:f	J
    //   117: iload 5
    //   119: istore 16
    //   121: goto +208 -> 329
    //   124: iconst_2
    //   125: aload_0
    //   126: getfield 73	com/google/tagmanager/proto/Resource$ResourceWithMetadata:e	I
    //   129: iand
    //   130: iconst_2
    //   131: if_icmpne +188 -> 319
    //   134: aload_0
    //   135: getfield 80	com/google/tagmanager/proto/Resource$ResourceWithMetadata:g	Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   138: invokevirtual 86	com/google/analytics/containertag/proto/Serving$Resource:U	()Lcom/google/analytics/containertag/proto/Serving$Resource$Builder;
    //   141: astore 14
    //   143: aload_0
    //   144: aload_1
    //   145: getstatic 87	com/google/analytics/containertag/proto/Serving$Resource:a	Lcom/google/tagmanager/protobuf/Parser;
    //   148: aload_2
    //   149: invokevirtual 90	com/google/tagmanager/protobuf/CodedInputStream:a	(Lcom/google/tagmanager/protobuf/Parser;Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;)Lcom/google/tagmanager/protobuf/MessageLite;
    //   152: checkcast 82	com/google/analytics/containertag/proto/Serving$Resource
    //   155: putfield 80	com/google/tagmanager/proto/Resource$ResourceWithMetadata:g	Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   158: aload 14
    //   160: ifnull +22 -> 182
    //   163: aload 14
    //   165: aload_0
    //   166: getfield 80	com/google/tagmanager/proto/Resource$ResourceWithMetadata:g	Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   169: invokevirtual 95	com/google/analytics/containertag/proto/Serving$Resource$Builder:a	(Lcom/google/analytics/containertag/proto/Serving$Resource;)Lcom/google/analytics/containertag/proto/Serving$Resource$Builder;
    //   172: pop
    //   173: aload_0
    //   174: aload 14
    //   176: invokevirtual 98	com/google/analytics/containertag/proto/Serving$Resource$Builder:d	()Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   179: putfield 80	com/google/tagmanager/proto/Resource$ResourceWithMetadata:g	Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   182: aload_0
    //   183: iconst_2
    //   184: aload_0
    //   185: getfield 73	com/google/tagmanager/proto/Resource$ResourceWithMetadata:e	I
    //   188: ior
    //   189: putfield 73	com/google/tagmanager/proto/Resource$ResourceWithMetadata:e	I
    //   192: iload 5
    //   194: istore 16
    //   196: goto +133 -> 329
    //   199: aload 4
    //   201: invokevirtual 100	com/google/tagmanager/protobuf/CodedOutputStream:a	()V
    //   204: aload_0
    //   205: aload_3
    //   206: invokevirtual 105	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   209: putfield 107	com/google/tagmanager/proto/Resource$ResourceWithMetadata:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   212: aload_0
    //   213: invokevirtual 110	com/google/tagmanager/proto/Resource$ResourceWithMetadata:X	()V
    //   216: return
    //   217: astore 7
    //   219: aload_0
    //   220: aload_3
    //   221: invokevirtual 105	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   224: putfield 107	com/google/tagmanager/proto/Resource$ResourceWithMetadata:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   227: goto -15 -> 212
    //   230: astore 6
    //   232: aload_0
    //   233: aload_3
    //   234: invokevirtual 105	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   237: putfield 107	com/google/tagmanager/proto/Resource$ResourceWithMetadata:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   240: aload 6
    //   242: athrow
    //   243: astore 12
    //   245: aload 12
    //   247: aload_0
    //   248: invokevirtual 113	com/google/tagmanager/protobuf/InvalidProtocolBufferException:a	(Lcom/google/tagmanager/protobuf/MessageLite;)Lcom/google/tagmanager/protobuf/InvalidProtocolBufferException;
    //   251: athrow
    //   252: astore 9
    //   254: aload 4
    //   256: invokevirtual 100	com/google/tagmanager/protobuf/CodedOutputStream:a	()V
    //   259: aload_0
    //   260: aload_3
    //   261: invokevirtual 105	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   264: putfield 107	com/google/tagmanager/proto/Resource$ResourceWithMetadata:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   267: aload_0
    //   268: invokevirtual 110	com/google/tagmanager/proto/Resource$ResourceWithMetadata:X	()V
    //   271: aload 9
    //   273: athrow
    //   274: astore 8
    //   276: new 46	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   279: dup
    //   280: aload 8
    //   282: invokevirtual 117	java/io/IOException:getMessage	()Ljava/lang/String;
    //   285: invokespecial 120	com/google/tagmanager/protobuf/InvalidProtocolBufferException:<init>	(Ljava/lang/String;)V
    //   288: aload_0
    //   289: invokevirtual 113	com/google/tagmanager/protobuf/InvalidProtocolBufferException:a	(Lcom/google/tagmanager/protobuf/MessageLite;)Lcom/google/tagmanager/protobuf/InvalidProtocolBufferException;
    //   292: athrow
    //   293: astore 11
    //   295: aload_0
    //   296: aload_3
    //   297: invokevirtual 105	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   300: putfield 107	com/google/tagmanager/proto/Resource$ResourceWithMetadata:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   303: goto -36 -> 267
    //   306: astore 10
    //   308: aload_0
    //   309: aload_3
    //   310: invokevirtual 105	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   313: putfield 107	com/google/tagmanager/proto/Resource$ResourceWithMetadata:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   316: aload 10
    //   318: athrow
    //   319: aconst_null
    //   320: astore 14
    //   322: goto -179 -> 143
    //   325: iload 5
    //   327: istore 16
    //   329: iload 16
    //   331: istore 5
    //   333: goto -302 -> 31
    //   336: iconst_1
    //   337: istore 16
    //   339: goto -10 -> 329
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	342	0	this	ResourceWithMetadata
    //   0	342	1	paramCodedInputStream	com.google.tagmanager.protobuf.CodedInputStream
    //   0	342	2	paramExtensionRegistryLite	ExtensionRegistryLite
    //   21	289	3	localOutput	com.google.tagmanager.protobuf.ByteString.Output
    //   26	229	4	localCodedOutputStream	CodedOutputStream
    //   29	303	5	k	int
    //   230	11	6	localObject1	Object
    //   217	1	7	localIOException1	java.io.IOException
    //   274	7	8	localIOException2	java.io.IOException
    //   252	20	9	localObject2	Object
    //   306	11	10	localObject3	Object
    //   293	1	11	localIOException3	java.io.IOException
    //   243	3	12	localInvalidProtocolBufferException	com.google.tagmanager.protobuf.InvalidProtocolBufferException
    //   40	46	13	m	int
    //   141	180	14	localBuilder	com.google.analytics.containertag.proto.Serving.Resource.Builder
    //   94	244	16	n	int
    // Exception table:
    //   from	to	target	type
    //   199	204	217	java/io/IOException
    //   199	204	230	finally
    //   36	42	243	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   80	93	243	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   99	117	243	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   124	143	243	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   143	158	243	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   163	182	243	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   182	192	243	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   36	42	252	finally
    //   80	93	252	finally
    //   99	117	252	finally
    //   124	143	252	finally
    //   143	158	252	finally
    //   163	182	252	finally
    //   182	192	252	finally
    //   245	252	252	finally
    //   276	293	252	finally
    //   36	42	274	java/io/IOException
    //   80	93	274	java/io/IOException
    //   99	117	274	java/io/IOException
    //   124	143	274	java/io/IOException
    //   143	158	274	java/io/IOException
    //   163	182	274	java/io/IOException
    //   182	192	274	java/io/IOException
    //   254	259	293	java/io/IOException
    //   254	259	306	finally
  }
  
  private Resource$ResourceWithMetadata(GeneratedMessageLite.Builder paramBuilder)
  {
    super(paramBuilder);
    this.d = paramBuilder.r();
  }
  
  private Resource$ResourceWithMetadata(boolean paramBoolean)
  {
    this.d = ByteString.a;
  }
  
  public static Resource.ResourceWithMetadata.Builder a(ResourceWithMetadata paramResourceWithMetadata)
  {
    return h().a(paramResourceWithMetadata);
  }
  
  public static ResourceWithMetadata a()
  {
    return b;
  }
  
  public static ResourceWithMetadata a(InputStream paramInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    return (ResourceWithMetadata)a.c(paramInputStream, paramExtensionRegistryLite);
  }
  
  public static Resource.ResourceWithMetadata.Builder h()
  {
    return Resource.ResourceWithMetadata.Builder.m();
  }
  
  private void m()
  {
    this.f = 0L;
    this.g = Serving.Resource.a();
  }
  
  public void a(CodedOutputStream paramCodedOutputStream)
  {
    k();
    if ((0x1 & this.e) == 1) {
      paramCodedOutputStream.a(1, this.f);
    }
    if ((0x2 & this.e) == 2) {
      paramCodedOutputStream.b(2, this.g);
    }
    paramCodedOutputStream.c(this.d);
  }
  
  public ResourceWithMetadata b()
  {
    return b;
  }
  
  public Parser<ResourceWithMetadata> c()
  {
    return a;
  }
  
  public boolean d()
  {
    return (0x1 & this.e) == 1;
  }
  
  public long e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof ResourceWithMetadata)) {
      return super.equals(paramObject);
    }
    ResourceWithMetadata localResourceWithMetadata = (ResourceWithMetadata)paramObject;
    int k;
    if (d() == localResourceWithMetadata.d())
    {
      k = 1;
      label38:
      if (d())
      {
        if ((k == 0) || (e() != localResourceWithMetadata.e())) {
          break label114;
        }
        k = 1;
      }
      label63:
      if ((k == 0) || (f() != localResourceWithMetadata.f())) {
        break label119;
      }
    }
    label114:
    label119:
    for (boolean bool = true;; bool = false)
    {
      if (!f()) {
        break label125;
      }
      if ((bool) && (g().equals(localResourceWithMetadata.g()))) {
        break;
      }
      return false;
      k = 0;
      break label38;
      k = 0;
      break label63;
    }
    label125:
    return bool;
  }
  
  public boolean f()
  {
    return (0x2 & this.e) == 2;
  }
  
  public Serving.Resource g()
  {
    return this.g;
  }
  
  public int hashCode()
  {
    if (this.c != 0) {
      return this.c;
    }
    int k = 779 + ResourceWithMetadata.class.hashCode();
    if (d()) {
      k = 53 * (1 + k * 37) + Internal.a(e());
    }
    if (f()) {
      k = 53 * (2 + k * 37) + g().hashCode();
    }
    int m = k * 29 + this.d.hashCode();
    this.c = m;
    return m;
  }
  
  public Resource.ResourceWithMetadata.Builder i()
  {
    return h();
  }
  
  public final boolean j()
  {
    int k = 1;
    int m = this.h;
    if (m != -1)
    {
      if (m == k) {}
      for (;;)
      {
        return k;
        k = 0;
      }
    }
    if (!d())
    {
      this.h = 0;
      return false;
    }
    if (!f())
    {
      this.h = 0;
      return false;
    }
    if (!g().j())
    {
      this.h = 0;
      return false;
    }
    this.h = k;
    return k;
  }
  
  public int k()
  {
    int k = this.i;
    if (k != -1) {
      return k;
    }
    int m = 0x1 & this.e;
    int n = 0;
    if (m == 1) {
      n = 0 + CodedOutputStream.b(1, this.f);
    }
    if ((0x2 & this.e) == 2) {
      n += CodedOutputStream.d(2, this.g);
    }
    int i1 = n + this.d.a();
    this.i = i1;
    return i1;
  }
  
  public Resource.ResourceWithMetadata.Builder l()
  {
    return a(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.proto.Resource.ResourceWithMetadata
 * JD-Core Version:    0.7.0.1
 */