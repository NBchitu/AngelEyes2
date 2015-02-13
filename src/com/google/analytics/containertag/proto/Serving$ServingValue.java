package com.google.analytics.containertag.proto;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import com.google.tagmanager.protobuf.ByteString;
import com.google.tagmanager.protobuf.CodedOutputStream;
import com.google.tagmanager.protobuf.GeneratedMessageLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite.Builder;
import com.google.tagmanager.protobuf.GeneratedMessageLite.GeneratedExtension;
import com.google.tagmanager.protobuf.MutableMessageLite;
import com.google.tagmanager.protobuf.Parser;
import com.google.tagmanager.protobuf.WireFormat.FieldType;
import java.util.Collections;
import java.util.List;

public final class Serving$ServingValue
  extends GeneratedMessageLite
  implements Serving.ServingValueOrBuilder
{
  public static Parser<ServingValue> a = new Serving.ServingValue.1();
  public static final GeneratedMessageLite.GeneratedExtension<TypeSystem.Value, ServingValue> b = GeneratedMessageLite.a(TypeSystem.Value.a(), a(), a(), null, 101, WireFormat.FieldType.k, ServingValue.class);
  private static final ServingValue d;
  private static volatile MutableMessageLite o = null;
  private final ByteString e;
  private int f;
  private List<Integer> g;
  private List<Integer> h;
  private List<Integer> i;
  private int j;
  private List<Integer> k;
  private int l;
  private byte m = -1;
  private int n = -1;
  
  static
  {
    d = new ServingValue(true);
    d.x();
  }
  
  /* Error */
  private Serving$ServingValue(com.google.tagmanager.protobuf.CodedInputStream paramCodedInputStream, com.google.tagmanager.protobuf.ExtensionRegistryLite paramExtensionRegistryLite)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 74	com/google/tagmanager/protobuf/GeneratedMessageLite:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 76	com/google/analytics/containertag/proto/Serving$ServingValue:m	B
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield 78	com/google/analytics/containertag/proto/Serving$ServingValue:n	I
    //   14: aload_0
    //   15: invokespecial 50	com/google/analytics/containertag/proto/Serving$ServingValue:x	()V
    //   18: iconst_0
    //   19: istore_3
    //   20: invokestatic 83	com/google/tagmanager/protobuf/ByteString:i	()Lcom/google/tagmanager/protobuf/ByteString$Output;
    //   23: astore 4
    //   25: aload 4
    //   27: invokestatic 88	com/google/tagmanager/protobuf/CodedOutputStream:a	(Ljava/io/OutputStream;)Lcom/google/tagmanager/protobuf/CodedOutputStream;
    //   30: astore 5
    //   32: iconst_0
    //   33: istore 6
    //   35: iload 6
    //   37: ifne +771 -> 808
    //   40: aload_1
    //   41: invokevirtual 93	com/google/tagmanager/protobuf/CodedInputStream:a	()I
    //   44: istore 14
    //   46: iload 14
    //   48: lookupswitch	default:+100->148, 0:+909->957, 8:+119->167, 10:+267->315, 16:+361->409, 18:+403->451, 24:+478->526, 26:+520->568, 32:+595->643, 40:+616->664, 42:+661->709, 48:+739->787
    //   149: aload_1
    //   150: aload 5
    //   152: aload_2
    //   153: iload 14
    //   155: invokevirtual 96	com/google/analytics/containertag/proto/Serving$ServingValue:a	(Lcom/google/tagmanager/protobuf/CodedInputStream;Lcom/google/tagmanager/protobuf/CodedOutputStream;Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;I)Z
    //   158: ifne -123 -> 35
    //   161: iconst_1
    //   162: istore 6
    //   164: goto -129 -> 35
    //   167: iload_3
    //   168: iconst_1
    //   169: iand
    //   170: iconst_1
    //   171: if_icmpeq +18 -> 189
    //   174: aload_0
    //   175: new 98	java/util/ArrayList
    //   178: dup
    //   179: invokespecial 99	java/util/ArrayList:<init>	()V
    //   182: putfield 101	com/google/analytics/containertag/proto/Serving$ServingValue:g	Ljava/util/List;
    //   185: iload_3
    //   186: iconst_1
    //   187: ior
    //   188: istore_3
    //   189: aload_0
    //   190: getfield 101	com/google/analytics/containertag/proto/Serving$ServingValue:g	Ljava/util/List;
    //   193: aload_1
    //   194: invokevirtual 103	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   197: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   200: invokeinterface 115 2 0
    //   205: pop
    //   206: goto -171 -> 35
    //   209: astore 13
    //   211: aload 13
    //   213: aload_0
    //   214: invokevirtual 118	com/google/tagmanager/protobuf/InvalidProtocolBufferException:a	(Lcom/google/tagmanager/protobuf/MessageLite;)Lcom/google/tagmanager/protobuf/InvalidProtocolBufferException;
    //   217: athrow
    //   218: astore 10
    //   220: iload_3
    //   221: iconst_1
    //   222: iand
    //   223: iconst_1
    //   224: if_icmpne +14 -> 238
    //   227: aload_0
    //   228: aload_0
    //   229: getfield 101	com/google/analytics/containertag/proto/Serving$ServingValue:g	Ljava/util/List;
    //   232: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   235: putfield 101	com/google/analytics/containertag/proto/Serving$ServingValue:g	Ljava/util/List;
    //   238: iload_3
    //   239: iconst_2
    //   240: iand
    //   241: iconst_2
    //   242: if_icmpne +14 -> 256
    //   245: aload_0
    //   246: aload_0
    //   247: getfield 126	com/google/analytics/containertag/proto/Serving$ServingValue:h	Ljava/util/List;
    //   250: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   253: putfield 126	com/google/analytics/containertag/proto/Serving$ServingValue:h	Ljava/util/List;
    //   256: iload_3
    //   257: iconst_4
    //   258: iand
    //   259: iconst_4
    //   260: if_icmpne +14 -> 274
    //   263: aload_0
    //   264: aload_0
    //   265: getfield 128	com/google/analytics/containertag/proto/Serving$ServingValue:i	Ljava/util/List;
    //   268: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   271: putfield 128	com/google/analytics/containertag/proto/Serving$ServingValue:i	Ljava/util/List;
    //   274: iload_3
    //   275: bipush 16
    //   277: iand
    //   278: bipush 16
    //   280: if_icmpne +14 -> 294
    //   283: aload_0
    //   284: aload_0
    //   285: getfield 130	com/google/analytics/containertag/proto/Serving$ServingValue:k	Ljava/util/List;
    //   288: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   291: putfield 130	com/google/analytics/containertag/proto/Serving$ServingValue:k	Ljava/util/List;
    //   294: aload 5
    //   296: invokevirtual 132	com/google/tagmanager/protobuf/CodedOutputStream:a	()V
    //   299: aload_0
    //   300: aload 4
    //   302: invokevirtual 137	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   305: putfield 139	com/google/analytics/containertag/proto/Serving$ServingValue:e	Lcom/google/tagmanager/protobuf/ByteString;
    //   308: aload_0
    //   309: invokevirtual 142	com/google/analytics/containertag/proto/Serving$ServingValue:X	()V
    //   312: aload 10
    //   314: athrow
    //   315: aload_1
    //   316: aload_1
    //   317: invokevirtual 145	com/google/tagmanager/protobuf/CodedInputStream:s	()I
    //   320: invokevirtual 149	com/google/tagmanager/protobuf/CodedInputStream:c	(I)I
    //   323: istore 24
    //   325: iload_3
    //   326: iconst_1
    //   327: iand
    //   328: iconst_1
    //   329: if_icmpeq +25 -> 354
    //   332: aload_1
    //   333: invokevirtual 152	com/google/tagmanager/protobuf/CodedInputStream:w	()I
    //   336: ifle +18 -> 354
    //   339: aload_0
    //   340: new 98	java/util/ArrayList
    //   343: dup
    //   344: invokespecial 99	java/util/ArrayList:<init>	()V
    //   347: putfield 101	com/google/analytics/containertag/proto/Serving$ServingValue:g	Ljava/util/List;
    //   350: iload_3
    //   351: iconst_1
    //   352: ior
    //   353: istore_3
    //   354: aload_1
    //   355: invokevirtual 152	com/google/tagmanager/protobuf/CodedInputStream:w	()I
    //   358: ifle +42 -> 400
    //   361: aload_0
    //   362: getfield 101	com/google/analytics/containertag/proto/Serving$ServingValue:g	Ljava/util/List;
    //   365: aload_1
    //   366: invokevirtual 103	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   369: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   372: invokeinterface 115 2 0
    //   377: pop
    //   378: goto -24 -> 354
    //   381: astore 9
    //   383: new 71	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   386: dup
    //   387: aload 9
    //   389: invokevirtual 156	java/io/IOException:getMessage	()Ljava/lang/String;
    //   392: invokespecial 159	com/google/tagmanager/protobuf/InvalidProtocolBufferException:<init>	(Ljava/lang/String;)V
    //   395: aload_0
    //   396: invokevirtual 118	com/google/tagmanager/protobuf/InvalidProtocolBufferException:a	(Lcom/google/tagmanager/protobuf/MessageLite;)Lcom/google/tagmanager/protobuf/InvalidProtocolBufferException;
    //   399: athrow
    //   400: aload_1
    //   401: iload 24
    //   403: invokevirtual 162	com/google/tagmanager/protobuf/CodedInputStream:d	(I)V
    //   406: goto -371 -> 35
    //   409: iload_3
    //   410: iconst_2
    //   411: iand
    //   412: iconst_2
    //   413: if_icmpeq +18 -> 431
    //   416: aload_0
    //   417: new 98	java/util/ArrayList
    //   420: dup
    //   421: invokespecial 99	java/util/ArrayList:<init>	()V
    //   424: putfield 126	com/google/analytics/containertag/proto/Serving$ServingValue:h	Ljava/util/List;
    //   427: iload_3
    //   428: iconst_2
    //   429: ior
    //   430: istore_3
    //   431: aload_0
    //   432: getfield 126	com/google/analytics/containertag/proto/Serving$ServingValue:h	Ljava/util/List;
    //   435: aload_1
    //   436: invokevirtual 103	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   439: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   442: invokeinterface 115 2 0
    //   447: pop
    //   448: goto -413 -> 35
    //   451: aload_1
    //   452: aload_1
    //   453: invokevirtual 145	com/google/tagmanager/protobuf/CodedInputStream:s	()I
    //   456: invokevirtual 149	com/google/tagmanager/protobuf/CodedInputStream:c	(I)I
    //   459: istore 21
    //   461: iload_3
    //   462: iconst_2
    //   463: iand
    //   464: iconst_2
    //   465: if_icmpeq +25 -> 490
    //   468: aload_1
    //   469: invokevirtual 152	com/google/tagmanager/protobuf/CodedInputStream:w	()I
    //   472: ifle +18 -> 490
    //   475: aload_0
    //   476: new 98	java/util/ArrayList
    //   479: dup
    //   480: invokespecial 99	java/util/ArrayList:<init>	()V
    //   483: putfield 126	com/google/analytics/containertag/proto/Serving$ServingValue:h	Ljava/util/List;
    //   486: iload_3
    //   487: iconst_2
    //   488: ior
    //   489: istore_3
    //   490: aload_1
    //   491: invokevirtual 152	com/google/tagmanager/protobuf/CodedInputStream:w	()I
    //   494: ifle +23 -> 517
    //   497: aload_0
    //   498: getfield 126	com/google/analytics/containertag/proto/Serving$ServingValue:h	Ljava/util/List;
    //   501: aload_1
    //   502: invokevirtual 103	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   505: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   508: invokeinterface 115 2 0
    //   513: pop
    //   514: goto -24 -> 490
    //   517: aload_1
    //   518: iload 21
    //   520: invokevirtual 162	com/google/tagmanager/protobuf/CodedInputStream:d	(I)V
    //   523: goto -488 -> 35
    //   526: iload_3
    //   527: iconst_4
    //   528: iand
    //   529: iconst_4
    //   530: if_icmpeq +18 -> 548
    //   533: aload_0
    //   534: new 98	java/util/ArrayList
    //   537: dup
    //   538: invokespecial 99	java/util/ArrayList:<init>	()V
    //   541: putfield 128	com/google/analytics/containertag/proto/Serving$ServingValue:i	Ljava/util/List;
    //   544: iload_3
    //   545: iconst_4
    //   546: ior
    //   547: istore_3
    //   548: aload_0
    //   549: getfield 128	com/google/analytics/containertag/proto/Serving$ServingValue:i	Ljava/util/List;
    //   552: aload_1
    //   553: invokevirtual 103	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   556: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   559: invokeinterface 115 2 0
    //   564: pop
    //   565: goto -530 -> 35
    //   568: aload_1
    //   569: aload_1
    //   570: invokevirtual 145	com/google/tagmanager/protobuf/CodedInputStream:s	()I
    //   573: invokevirtual 149	com/google/tagmanager/protobuf/CodedInputStream:c	(I)I
    //   576: istore 18
    //   578: iload_3
    //   579: iconst_4
    //   580: iand
    //   581: iconst_4
    //   582: if_icmpeq +25 -> 607
    //   585: aload_1
    //   586: invokevirtual 152	com/google/tagmanager/protobuf/CodedInputStream:w	()I
    //   589: ifle +18 -> 607
    //   592: aload_0
    //   593: new 98	java/util/ArrayList
    //   596: dup
    //   597: invokespecial 99	java/util/ArrayList:<init>	()V
    //   600: putfield 128	com/google/analytics/containertag/proto/Serving$ServingValue:i	Ljava/util/List;
    //   603: iload_3
    //   604: iconst_4
    //   605: ior
    //   606: istore_3
    //   607: aload_1
    //   608: invokevirtual 152	com/google/tagmanager/protobuf/CodedInputStream:w	()I
    //   611: ifle +23 -> 634
    //   614: aload_0
    //   615: getfield 128	com/google/analytics/containertag/proto/Serving$ServingValue:i	Ljava/util/List;
    //   618: aload_1
    //   619: invokevirtual 103	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   622: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   625: invokeinterface 115 2 0
    //   630: pop
    //   631: goto -24 -> 607
    //   634: aload_1
    //   635: iload 18
    //   637: invokevirtual 162	com/google/tagmanager/protobuf/CodedInputStream:d	(I)V
    //   640: goto -605 -> 35
    //   643: aload_0
    //   644: iconst_1
    //   645: aload_0
    //   646: getfield 164	com/google/analytics/containertag/proto/Serving$ServingValue:f	I
    //   649: ior
    //   650: putfield 164	com/google/analytics/containertag/proto/Serving$ServingValue:f	I
    //   653: aload_0
    //   654: aload_1
    //   655: invokevirtual 103	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   658: putfield 166	com/google/analytics/containertag/proto/Serving$ServingValue:j	I
    //   661: goto -626 -> 35
    //   664: iload_3
    //   665: bipush 16
    //   667: iand
    //   668: bipush 16
    //   670: if_icmpeq +19 -> 689
    //   673: aload_0
    //   674: new 98	java/util/ArrayList
    //   677: dup
    //   678: invokespecial 99	java/util/ArrayList:<init>	()V
    //   681: putfield 130	com/google/analytics/containertag/proto/Serving$ServingValue:k	Ljava/util/List;
    //   684: iload_3
    //   685: bipush 16
    //   687: ior
    //   688: istore_3
    //   689: aload_0
    //   690: getfield 130	com/google/analytics/containertag/proto/Serving$ServingValue:k	Ljava/util/List;
    //   693: aload_1
    //   694: invokevirtual 103	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   697: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   700: invokeinterface 115 2 0
    //   705: pop
    //   706: goto -671 -> 35
    //   709: aload_1
    //   710: aload_1
    //   711: invokevirtual 145	com/google/tagmanager/protobuf/CodedInputStream:s	()I
    //   714: invokevirtual 149	com/google/tagmanager/protobuf/CodedInputStream:c	(I)I
    //   717: istore 15
    //   719: iload_3
    //   720: bipush 16
    //   722: iand
    //   723: bipush 16
    //   725: if_icmpeq +26 -> 751
    //   728: aload_1
    //   729: invokevirtual 152	com/google/tagmanager/protobuf/CodedInputStream:w	()I
    //   732: ifle +19 -> 751
    //   735: aload_0
    //   736: new 98	java/util/ArrayList
    //   739: dup
    //   740: invokespecial 99	java/util/ArrayList:<init>	()V
    //   743: putfield 130	com/google/analytics/containertag/proto/Serving$ServingValue:k	Ljava/util/List;
    //   746: iload_3
    //   747: bipush 16
    //   749: ior
    //   750: istore_3
    //   751: aload_1
    //   752: invokevirtual 152	com/google/tagmanager/protobuf/CodedInputStream:w	()I
    //   755: ifle +23 -> 778
    //   758: aload_0
    //   759: getfield 130	com/google/analytics/containertag/proto/Serving$ServingValue:k	Ljava/util/List;
    //   762: aload_1
    //   763: invokevirtual 103	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   766: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   769: invokeinterface 115 2 0
    //   774: pop
    //   775: goto -24 -> 751
    //   778: aload_1
    //   779: iload 15
    //   781: invokevirtual 162	com/google/tagmanager/protobuf/CodedInputStream:d	(I)V
    //   784: goto -749 -> 35
    //   787: aload_0
    //   788: iconst_2
    //   789: aload_0
    //   790: getfield 164	com/google/analytics/containertag/proto/Serving$ServingValue:f	I
    //   793: ior
    //   794: putfield 164	com/google/analytics/containertag/proto/Serving$ServingValue:f	I
    //   797: aload_0
    //   798: aload_1
    //   799: invokevirtual 103	com/google/tagmanager/protobuf/CodedInputStream:f	()I
    //   802: putfield 168	com/google/analytics/containertag/proto/Serving$ServingValue:l	I
    //   805: goto -770 -> 35
    //   808: iload_3
    //   809: iconst_1
    //   810: iand
    //   811: iconst_1
    //   812: if_icmpne +14 -> 826
    //   815: aload_0
    //   816: aload_0
    //   817: getfield 101	com/google/analytics/containertag/proto/Serving$ServingValue:g	Ljava/util/List;
    //   820: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   823: putfield 101	com/google/analytics/containertag/proto/Serving$ServingValue:g	Ljava/util/List;
    //   826: iload_3
    //   827: iconst_2
    //   828: iand
    //   829: iconst_2
    //   830: if_icmpne +14 -> 844
    //   833: aload_0
    //   834: aload_0
    //   835: getfield 126	com/google/analytics/containertag/proto/Serving$ServingValue:h	Ljava/util/List;
    //   838: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   841: putfield 126	com/google/analytics/containertag/proto/Serving$ServingValue:h	Ljava/util/List;
    //   844: iload_3
    //   845: iconst_4
    //   846: iand
    //   847: iconst_4
    //   848: if_icmpne +14 -> 862
    //   851: aload_0
    //   852: aload_0
    //   853: getfield 128	com/google/analytics/containertag/proto/Serving$ServingValue:i	Ljava/util/List;
    //   856: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   859: putfield 128	com/google/analytics/containertag/proto/Serving$ServingValue:i	Ljava/util/List;
    //   862: iload_3
    //   863: bipush 16
    //   865: iand
    //   866: bipush 16
    //   868: if_icmpne +14 -> 882
    //   871: aload_0
    //   872: aload_0
    //   873: getfield 130	com/google/analytics/containertag/proto/Serving$ServingValue:k	Ljava/util/List;
    //   876: invokestatic 124	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   879: putfield 130	com/google/analytics/containertag/proto/Serving$ServingValue:k	Ljava/util/List;
    //   882: aload 5
    //   884: invokevirtual 132	com/google/tagmanager/protobuf/CodedOutputStream:a	()V
    //   887: aload_0
    //   888: aload 4
    //   890: invokevirtual 137	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   893: putfield 139	com/google/analytics/containertag/proto/Serving$ServingValue:e	Lcom/google/tagmanager/protobuf/ByteString;
    //   896: aload_0
    //   897: invokevirtual 142	com/google/analytics/containertag/proto/Serving$ServingValue:X	()V
    //   900: return
    //   901: astore 8
    //   903: aload_0
    //   904: aload 4
    //   906: invokevirtual 137	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   909: putfield 139	com/google/analytics/containertag/proto/Serving$ServingValue:e	Lcom/google/tagmanager/protobuf/ByteString;
    //   912: goto -16 -> 896
    //   915: astore 7
    //   917: aload_0
    //   918: aload 4
    //   920: invokevirtual 137	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   923: putfield 139	com/google/analytics/containertag/proto/Serving$ServingValue:e	Lcom/google/tagmanager/protobuf/ByteString;
    //   926: aload 7
    //   928: athrow
    //   929: astore 12
    //   931: aload_0
    //   932: aload 4
    //   934: invokevirtual 137	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   937: putfield 139	com/google/analytics/containertag/proto/Serving$ServingValue:e	Lcom/google/tagmanager/protobuf/ByteString;
    //   940: goto -632 -> 308
    //   943: astore 11
    //   945: aload_0
    //   946: aload 4
    //   948: invokevirtual 137	com/google/tagmanager/protobuf/ByteString$Output:a	()Lcom/google/tagmanager/protobuf/ByteString;
    //   951: putfield 139	com/google/analytics/containertag/proto/Serving$ServingValue:e	Lcom/google/tagmanager/protobuf/ByteString;
    //   954: aload 11
    //   956: athrow
    //   957: iconst_1
    //   958: istore 6
    //   960: goto -925 -> 35
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	963	0	this	ServingValue
    //   0	963	1	paramCodedInputStream	com.google.tagmanager.protobuf.CodedInputStream
    //   0	963	2	paramExtensionRegistryLite	com.google.tagmanager.protobuf.ExtensionRegistryLite
    //   19	847	3	i1	int
    //   23	924	4	localOutput	com.google.tagmanager.protobuf.ByteString.Output
    //   30	853	5	localCodedOutputStream	CodedOutputStream
    //   33	926	6	i2	int
    //   915	12	7	localObject1	Object
    //   901	1	8	localIOException1	java.io.IOException
    //   381	7	9	localIOException2	java.io.IOException
    //   218	95	10	localObject2	Object
    //   943	12	11	localObject3	Object
    //   929	1	12	localIOException3	java.io.IOException
    //   209	3	13	localInvalidProtocolBufferException	com.google.tagmanager.protobuf.InvalidProtocolBufferException
    //   44	110	14	i3	int
    //   717	63	15	i4	int
    //   576	60	18	i5	int
    //   459	60	21	i6	int
    //   323	79	24	i7	int
    // Exception table:
    //   from	to	target	type
    //   40	46	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   148	161	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   174	185	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   189	206	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   315	325	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   332	350	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   354	378	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   400	406	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   416	427	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   431	448	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   451	461	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   468	486	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   490	514	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   517	523	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   533	544	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   548	565	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   568	578	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   585	603	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   607	631	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   634	640	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   643	661	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   673	684	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   689	706	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   709	719	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   728	746	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   751	775	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   778	784	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   787	805	209	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   40	46	218	finally
    //   148	161	218	finally
    //   174	185	218	finally
    //   189	206	218	finally
    //   211	218	218	finally
    //   315	325	218	finally
    //   332	350	218	finally
    //   354	378	218	finally
    //   383	400	218	finally
    //   400	406	218	finally
    //   416	427	218	finally
    //   431	448	218	finally
    //   451	461	218	finally
    //   468	486	218	finally
    //   490	514	218	finally
    //   517	523	218	finally
    //   533	544	218	finally
    //   548	565	218	finally
    //   568	578	218	finally
    //   585	603	218	finally
    //   607	631	218	finally
    //   634	640	218	finally
    //   643	661	218	finally
    //   673	684	218	finally
    //   689	706	218	finally
    //   709	719	218	finally
    //   728	746	218	finally
    //   751	775	218	finally
    //   778	784	218	finally
    //   787	805	218	finally
    //   40	46	381	java/io/IOException
    //   148	161	381	java/io/IOException
    //   174	185	381	java/io/IOException
    //   189	206	381	java/io/IOException
    //   315	325	381	java/io/IOException
    //   332	350	381	java/io/IOException
    //   354	378	381	java/io/IOException
    //   400	406	381	java/io/IOException
    //   416	427	381	java/io/IOException
    //   431	448	381	java/io/IOException
    //   451	461	381	java/io/IOException
    //   468	486	381	java/io/IOException
    //   490	514	381	java/io/IOException
    //   517	523	381	java/io/IOException
    //   533	544	381	java/io/IOException
    //   548	565	381	java/io/IOException
    //   568	578	381	java/io/IOException
    //   585	603	381	java/io/IOException
    //   607	631	381	java/io/IOException
    //   634	640	381	java/io/IOException
    //   643	661	381	java/io/IOException
    //   673	684	381	java/io/IOException
    //   689	706	381	java/io/IOException
    //   709	719	381	java/io/IOException
    //   728	746	381	java/io/IOException
    //   751	775	381	java/io/IOException
    //   778	784	381	java/io/IOException
    //   787	805	381	java/io/IOException
    //   882	887	901	java/io/IOException
    //   882	887	915	finally
    //   294	299	929	java/io/IOException
    //   294	299	943	finally
  }
  
  private Serving$ServingValue(GeneratedMessageLite.Builder paramBuilder)
  {
    super(paramBuilder);
    this.e = paramBuilder.r();
  }
  
  private Serving$ServingValue(boolean paramBoolean)
  {
    this.e = ByteString.a;
  }
  
  public static Serving.ServingValue.Builder a(ServingValue paramServingValue)
  {
    return u().a(paramServingValue);
  }
  
  public static ServingValue a()
  {
    return d;
  }
  
  public static Serving.ServingValue.Builder u()
  {
    return Serving.ServingValue.Builder.i();
  }
  
  private void x()
  {
    this.g = Collections.emptyList();
    this.h = Collections.emptyList();
    this.i = Collections.emptyList();
    this.j = 0;
    this.k = Collections.emptyList();
    this.l = 0;
  }
  
  public void a(CodedOutputStream paramCodedOutputStream)
  {
    k();
    for (int i1 = 0; i1 < this.g.size(); i1++) {
      paramCodedOutputStream.a(1, ((Integer)this.g.get(i1)).intValue());
    }
    for (int i2 = 0; i2 < this.h.size(); i2++) {
      paramCodedOutputStream.a(2, ((Integer)this.h.get(i2)).intValue());
    }
    for (int i3 = 0; i3 < this.i.size(); i3++) {
      paramCodedOutputStream.a(3, ((Integer)this.i.get(i3)).intValue());
    }
    int i4 = 0x1 & this.f;
    int i5 = 0;
    if (i4 == 1) {
      paramCodedOutputStream.a(4, this.j);
    }
    while (i5 < this.k.size())
    {
      paramCodedOutputStream.a(5, ((Integer)this.k.get(i5)).intValue());
      i5++;
    }
    if ((0x2 & this.f) == 2) {
      paramCodedOutputStream.a(6, this.l);
    }
    paramCodedOutputStream.c(this.e);
  }
  
  public ServingValue b()
  {
    return d;
  }
  
  public Parser<ServingValue> c()
  {
    return a;
  }
  
  public List<Integer> d()
  {
    return this.g;
  }
  
  public int e()
  {
    return this.g.size();
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof ServingValue)) {
      return super.equals(paramObject);
    }
    ServingValue localServingValue = (ServingValue)paramObject;
    int i1;
    label43:
    int i2;
    label66:
    int i3;
    label90:
    int i4;
    label109:
    int i5;
    if (d().equals(localServingValue.d()))
    {
      i1 = 1;
      if ((i1 == 0) || (!f().equals(localServingValue.f()))) {
        break label208;
      }
      i2 = 1;
      if ((i2 == 0) || (!h().equals(localServingValue.h()))) {
        break label214;
      }
      i3 = 1;
      if ((i3 == 0) || (l() != localServingValue.l())) {
        break label220;
      }
      i4 = 1;
      if (l())
      {
        if ((i4 == 0) || (m() != localServingValue.m())) {
          break label226;
        }
        i4 = 1;
      }
      label135:
      if ((i4 == 0) || (!n().equals(localServingValue.n()))) {
        break label232;
      }
      i5 = 1;
      label159:
      if ((i5 == 0) || (s() != localServingValue.s())) {
        break label238;
      }
    }
    label208:
    label214:
    label220:
    label226:
    label232:
    label238:
    for (boolean bool = true;; bool = false)
    {
      if (!s()) {
        break label244;
      }
      if ((bool) && (t() == localServingValue.t())) {
        break;
      }
      return false;
      i1 = 0;
      break label43;
      i2 = 0;
      break label66;
      i3 = 0;
      break label90;
      i4 = 0;
      break label109;
      i4 = 0;
      break label135;
      i5 = 0;
      break label159;
    }
    label244:
    return bool;
  }
  
  public List<Integer> f()
  {
    return this.h;
  }
  
  public int g()
  {
    return this.h.size();
  }
  
  public List<Integer> h()
  {
    return this.i;
  }
  
  public int hashCode()
  {
    if (this.c != 0) {
      return this.c;
    }
    int i1 = 779 + ServingValue.class.hashCode();
    if (e() > 0) {
      i1 = 53 * (1 + i1 * 37) + d().hashCode();
    }
    if (g() > 0) {
      i1 = 53 * (2 + i1 * 37) + f().hashCode();
    }
    if (i() > 0) {
      i1 = 53 * (3 + i1 * 37) + h().hashCode();
    }
    if (l()) {
      i1 = 53 * (4 + i1 * 37) + m();
    }
    if (r() > 0) {
      i1 = 53 * (5 + i1 * 37) + n().hashCode();
    }
    if (s()) {
      i1 = 53 * (6 + i1 * 37) + t();
    }
    int i2 = i1 * 29 + this.e.hashCode();
    this.c = i2;
    return i2;
  }
  
  public int i()
  {
    return this.i.size();
  }
  
  public final boolean j()
  {
    int i1 = this.m;
    if (i1 != -1) {
      return i1 == 1;
    }
    this.m = 1;
    return true;
  }
  
  public int k()
  {
    int i1 = 0;
    int i2 = this.n;
    if (i2 != -1) {
      return i2;
    }
    int i3 = 0;
    int i4 = 0;
    while (i3 < this.g.size())
    {
      i4 += CodedOutputStream.h(((Integer)this.g.get(i3)).intValue());
      i3++;
    }
    int i5 = 0 + i4 + 1 * d().size();
    int i6 = 0;
    int i7 = 0;
    while (i6 < this.h.size())
    {
      i7 += CodedOutputStream.h(((Integer)this.h.get(i6)).intValue());
      i6++;
    }
    int i8 = i5 + i7 + 1 * f().size();
    int i9 = 0;
    int i10 = 0;
    while (i9 < this.i.size())
    {
      i10 += CodedOutputStream.h(((Integer)this.i.get(i9)).intValue());
      i9++;
    }
    int i11 = i8 + i10 + 1 * h().size();
    if ((0x1 & this.f) == 1) {}
    for (int i12 = i11 + CodedOutputStream.d(4, this.j);; i12 = i11)
    {
      int i16;
      for (int i13 = 0; i1 < this.k.size(); i13 = i16)
      {
        i16 = i13 + CodedOutputStream.h(((Integer)this.k.get(i1)).intValue());
        i1++;
      }
      int i14 = i12 + i13 + 1 * n().size();
      if ((0x2 & this.f) == 2) {
        i14 += CodedOutputStream.d(6, this.l);
      }
      int i15 = i14 + this.e.a();
      this.n = i15;
      return i15;
    }
  }
  
  public boolean l()
  {
    return (0x1 & this.f) == 1;
  }
  
  public int m()
  {
    return this.j;
  }
  
  public List<Integer> n()
  {
    return this.k;
  }
  
  public int r()
  {
    return this.k.size();
  }
  
  public boolean s()
  {
    return (0x2 & this.f) == 2;
  }
  
  public int t()
  {
    return this.l;
  }
  
  public Serving.ServingValue.Builder v()
  {
    return u();
  }
  
  public Serving.ServingValue.Builder w()
  {
    return a(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.containertag.proto.Serving.ServingValue
 * JD-Core Version:    0.7.0.1
 */