package com.google.analytics.containertag.proto;

import com.google.tagmanager.protobuf.ByteString;
import com.google.tagmanager.protobuf.CodedOutputStream;
import com.google.tagmanager.protobuf.GeneratedMessageLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite.Builder;
import com.google.tagmanager.protobuf.MutableMessageLite;
import com.google.tagmanager.protobuf.Parser;

public final class Serving$Property
  extends GeneratedMessageLite
  implements Serving.PropertyOrBuilder
{
  public static Parser<Property> a = new Serving.Property.1();
  private static final Property b;
  private static volatile MutableMessageLite j = null;
  private final ByteString d;
  private int e;
  private int f;
  private int g;
  private byte h = -1;
  private int i = -1;
  
  static
  {
    b = new Property(true);
    b.m();
  }
  
  /* Error */
  private Serving$Property(com.google.tagmanager.protobuf.CodedInputStream paramCodedInputStream, com.google.tagmanager.protobuf.ExtensionRegistryLite paramExtensionRegistryLite)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 47	com/google/tagmanager/protobuf/GeneratedMessageLite:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 49	com/google/analytics/containertag/proto/Serving$Property:h	B
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield 51	com/google/analytics/containertag/proto/Serving$Property:i	I
    //   14: aload_0
    //   15: invokespecial 41	com/google/analytics/containertag/proto/Serving$Property:m	()V
    //   18: invokestatic 56	com/google/tagmanager/protobuf/ByteString:i	()Lcom/google/tagmanager/protobuf/ByteString$Output;
    //   21: astore_3
    //   22: aload_3
    //   23: invokestatic 61	com/google/tagmanager/protobuf/CodedOutputStream:a	(Ljava/io/OutputStream;)Lcom/google/tagmanager/protobuf/CodedOutputStream;
    //   26: astore 4
    //   28: iconst_0
    //   29: istore 5
    //   31: iload 5
    //   33: ifne +158 -> 191
    //   36: aload_1
    //   37: invokevirtual 66	com/google/tagmanager/protobuf/CodedInputStream:a	()I
    //   40: istore 13
    //   42: iload 13
    //   44: lookupswitch	default:+36->80, 0:+217->261, 8:+55->99, 16:+107->151
    //   81: aload_1
    //   82: aload 4
    //   84: aload_2
    //   85: iload 13
    //   87: invokevirtual 69	com/google/analytics/containertag/proto/Serving$Property:a	(Lcom/google/tagmanager/protobuf/CodedInputStream;Lcom/google/tagmanager/protobuf/CodedOutputStream;Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;I)Z
    //   90: ifne -59 -> 31
    //   93: iconst_1
    //   94: istore 5
    //   96: goto -65 -> 31
    //   99: aload_0
    //   100: iconst_1
    //   101: aload_0
    //   102: getfield 71	com/google/analytics/containertag/proto/Serving$Property:e	I
    //   105: ior
    //   106: putfield 71	com/google/analytics/containertag/proto/Serving$Property:e	I
    //   109: aload_0
    //   110: aload_1
    //   111: invokevirtual 73	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   114: putfield 75	com/google/analytics/containertag/proto/Serving$Property:f	I
    //   117: goto -86 -> 31
    //   120: astore 12
    //   122: aload 12
    //   124: aload_0
    //   125: invokevirtual 78	com/google/tagmanager/protobuf/InvalidProtocolBufferException:a	(Lcom/google/tagmanager/protobuf/MessageLite;)Lcom/google/tagmanager/protobuf/InvalidProtocolBufferException;
    //   128: athrow
    //   129: astore 9
    //   131: aload 4
    //   133: invokevirtual 80	com/google/tagmanager/protobuf/CodedOutputStream:a	()V
    //   136: aload_0
    //   137: aload_3
    //   138: invokevirtual 85	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   141: putfield 87	com/google/analytics/containertag/proto/Serving$Property:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   144: aload_0
    //   145: invokevirtual 90	com/google/analytics/containertag/proto/Serving$Property:X	()V
    //   148: aload 9
    //   150: athrow
    //   151: aload_0
    //   152: iconst_2
    //   153: aload_0
    //   154: getfield 71	com/google/analytics/containertag/proto/Serving$Property:e	I
    //   157: ior
    //   158: putfield 71	com/google/analytics/containertag/proto/Serving$Property:e	I
    //   161: aload_0
    //   162: aload_1
    //   163: invokevirtual 73	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   166: putfield 92	com/google/analytics/containertag/proto/Serving$Property:g	I
    //   169: goto -138 -> 31
    //   172: astore 8
    //   174: new 44	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   177: dup
    //   178: aload 8
    //   180: invokevirtual 96	java/io/IOException:getMessage	()Ljava/lang/String;
    //   183: invokespecial 99	com/google/tagmanager/protobuf/InvalidProtocolBufferException:<init>	(Ljava/lang/String;)V
    //   186: aload_0
    //   187: invokevirtual 78	com/google/tagmanager/protobuf/InvalidProtocolBufferException:a	(Lcom/google/tagmanager/protobuf/MessageLite;)Lcom/google/tagmanager/protobuf/InvalidProtocolBufferException;
    //   190: athrow
    //   191: aload 4
    //   193: invokevirtual 80	com/google/tagmanager/protobuf/CodedOutputStream:a	()V
    //   196: aload_0
    //   197: aload_3
    //   198: invokevirtual 85	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   201: putfield 87	com/google/analytics/containertag/proto/Serving$Property:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   204: aload_0
    //   205: invokevirtual 90	com/google/analytics/containertag/proto/Serving$Property:X	()V
    //   208: return
    //   209: astore 7
    //   211: aload_0
    //   212: aload_3
    //   213: invokevirtual 85	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   216: putfield 87	com/google/analytics/containertag/proto/Serving$Property:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   219: goto -15 -> 204
    //   222: astore 6
    //   224: aload_0
    //   225: aload_3
    //   226: invokevirtual 85	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   229: putfield 87	com/google/analytics/containertag/proto/Serving$Property:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   232: aload 6
    //   234: athrow
    //   235: astore 11
    //   237: aload_0
    //   238: aload_3
    //   239: invokevirtual 85	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   242: putfield 87	com/google/analytics/containertag/proto/Serving$Property:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   245: goto -101 -> 144
    //   248: astore 10
    //   250: aload_0
    //   251: aload_3
    //   252: invokevirtual 85	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   255: putfield 87	com/google/analytics/containertag/proto/Serving$Property:d	Lcom/google/tagmanager/protobuf/ByteString;
    //   258: aload 10
    //   260: athrow
    //   261: iconst_1
    //   262: istore 5
    //   264: goto -233 -> 31
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	267	0	this	Property
    //   0	267	1	paramCodedInputStream	com.google.tagmanager.protobuf.CodedInputStream
    //   0	267	2	paramExtensionRegistryLite	com.google.tagmanager.protobuf.ExtensionRegistryLite
    //   21	231	3	localOutput	com.google.tagmanager.protobuf.ByteString.Output
    //   26	166	4	localCodedOutputStream	CodedOutputStream
    //   29	234	5	k	int
    //   222	11	6	localObject1	Object
    //   209	1	7	localIOException1	java.io.IOException
    //   172	7	8	localIOException2	java.io.IOException
    //   129	20	9	localObject2	Object
    //   248	11	10	localObject3	Object
    //   235	1	11	localIOException3	java.io.IOException
    //   120	3	12	localInvalidProtocolBufferException	com.google.tagmanager.protobuf.InvalidProtocolBufferException
    //   40	46	13	m	int
    // Exception table:
    //   from	to	target	type
    //   36	42	120	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   80	93	120	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   99	117	120	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   151	169	120	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   36	42	129	finally
    //   80	93	129	finally
    //   99	117	129	finally
    //   122	129	129	finally
    //   151	169	129	finally
    //   174	191	129	finally
    //   36	42	172	java/io/IOException
    //   80	93	172	java/io/IOException
    //   99	117	172	java/io/IOException
    //   151	169	172	java/io/IOException
    //   191	196	209	java/io/IOException
    //   191	196	222	finally
    //   131	136	235	java/io/IOException
    //   131	136	248	finally
  }
  
  private Serving$Property(GeneratedMessageLite.Builder paramBuilder)
  {
    super(paramBuilder);
    this.d = paramBuilder.r();
  }
  
  private Serving$Property(boolean paramBoolean)
  {
    this.d = ByteString.a;
  }
  
  public static Serving.Property.Builder a(Property paramProperty)
  {
    return h().a(paramProperty);
  }
  
  public static Property a()
  {
    return b;
  }
  
  public static Serving.Property.Builder h()
  {
    return Serving.Property.Builder.l();
  }
  
  private void m()
  {
    this.f = 0;
    this.g = 0;
  }
  
  public void a(CodedOutputStream paramCodedOutputStream)
  {
    k();
    if ((0x1 & this.e) == 1) {
      paramCodedOutputStream.a(1, this.f);
    }
    if ((0x2 & this.e) == 2) {
      paramCodedOutputStream.a(2, this.g);
    }
    paramCodedOutputStream.c(this.d);
  }
  
  public Property b()
  {
    return b;
  }
  
  public Parser<Property> c()
  {
    return a;
  }
  
  public boolean d()
  {
    return (0x1 & this.e) == 1;
  }
  
  public int e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Property)) {
      return super.equals(paramObject);
    }
    Property localProperty = (Property)paramObject;
    int k;
    if (d() == localProperty.d())
    {
      k = 1;
      label38:
      if (d())
      {
        if ((k == 0) || (e() != localProperty.e())) {
          break label110;
        }
        k = 1;
      }
      label62:
      if ((k == 0) || (f() != localProperty.f())) {
        break label115;
      }
    }
    label110:
    label115:
    for (boolean bool = true;; bool = false)
    {
      if (!f()) {
        break label121;
      }
      if ((bool) && (g() == localProperty.g())) {
        break;
      }
      return false;
      k = 0;
      break label38;
      k = 0;
      break label62;
    }
    label121:
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
  
  public int hashCode()
  {
    if (this.c != 0) {
      return this.c;
    }
    int k = 779 + Property.class.hashCode();
    if (d()) {
      k = 53 * (1 + k * 37) + e();
    }
    if (f()) {
      k = 53 * (2 + k * 37) + g();
    }
    int m = k * 29 + this.d.hashCode();
    this.c = m;
    return m;
  }
  
  public Serving.Property.Builder i()
  {
    return h();
  }
  
  public final boolean j()
  {
    int k = this.h;
    if (k != -1) {
      return k == 1;
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
    this.h = 1;
    return true;
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
      n = 0 + CodedOutputStream.d(1, this.f);
    }
    if ((0x2 & this.e) == 2) {
      n += CodedOutputStream.d(2, this.g);
    }
    int i1 = n + this.d.a();
    this.i = i1;
    return i1;
  }
  
  public Serving.Property.Builder l()
  {
    return a(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.containertag.proto.Serving.Property
 * JD-Core Version:    0.7.0.1
 */