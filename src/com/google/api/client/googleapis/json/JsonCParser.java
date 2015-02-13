package com.google.api.client.googleapis.json;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.JsonParser;
import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

public final class JsonCParser
  extends JsonObjectParser
{
  private final JsonFactory a;
  
  public JsonCParser(JsonFactory paramJsonFactory)
  {
    super(paramJsonFactory);
    this.a = ((JsonFactory)Preconditions.a(paramJsonFactory));
  }
  
  /* Error */
  public static JsonParser a(JsonParser paramJsonParser)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_2
    //   2: anewarray 22	java/lang/String
    //   5: dup
    //   6: iconst_0
    //   7: ldc 24
    //   9: aastore
    //   10: dup
    //   11: iconst_1
    //   12: ldc 26
    //   14: aastore
    //   15: invokestatic 31	com/google/common/collect/Sets:a	([Ljava/lang/Object;)Ljava/util/HashSet;
    //   18: invokevirtual 36	com/google/api/client/json/JsonParser:a	(Ljava/util/Set;)Ljava/lang/String;
    //   21: ifnull +13 -> 34
    //   24: aload_0
    //   25: invokevirtual 40	com/google/api/client/json/JsonParser:d	()Lcom/google/api/client/json/JsonToken;
    //   28: getstatic 45	com/google/api/client/json/JsonToken:d	Lcom/google/api/client/json/JsonToken;
    //   31: if_acmpne +20 -> 51
    //   34: new 47	java/lang/IllegalArgumentException
    //   37: dup
    //   38: ldc 49
    //   40: invokespecial 52	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   43: athrow
    //   44: astore_1
    //   45: aload_0
    //   46: invokevirtual 56	com/google/api/client/json/JsonParser:b	()V
    //   49: aload_1
    //   50: athrow
    //   51: aload_0
    //   52: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	paramJsonParser	JsonParser
    //   44	6	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	34	44	finally
    //   34	44	44	finally
  }
  
  public Object a(InputStream paramInputStream, Charset paramCharset, Type paramType)
  {
    return a(this.a.a(paramInputStream, paramCharset)).a(paramType, true, null);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.json.JsonCParser
 * JD-Core Version:    0.7.0.1
 */