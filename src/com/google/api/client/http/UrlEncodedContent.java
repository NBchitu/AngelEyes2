package com.google.api.client.http;

import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.Types;
import com.google.api.client.util.escape.CharEscapers;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UrlEncodedContent
  extends AbstractHttpContent
{
  private Object a;
  
  public UrlEncodedContent(Object paramObject)
  {
    super(new HttpMediaType("application/x-www-form-urlencoded").a(Charsets.c));
    a(paramObject);
  }
  
  private static boolean a(boolean paramBoolean, Writer paramWriter, String paramString, Object paramObject)
  {
    if ((paramObject == null) || (Data.a(paramObject))) {
      return paramBoolean;
    }
    if (paramBoolean)
    {
      paramBoolean = false;
      label19:
      paramWriter.write(paramString);
      if (!(paramObject instanceof Enum)) {
        break label81;
      }
    }
    label81:
    for (String str1 = FieldInfo.a((Enum)paramObject).b();; str1 = paramObject.toString())
    {
      String str2 = CharEscapers.a(str1);
      if (str2.length() == 0) {
        break;
      }
      paramWriter.write("=");
      paramWriter.write(str2);
      return paramBoolean;
      paramWriter.write("&");
      break label19;
    }
  }
  
  public UrlEncodedContent a(Object paramObject)
  {
    this.a = Preconditions.a(paramObject);
    return this;
  }
  
  public void a(OutputStream paramOutputStream)
  {
    BufferedWriter localBufferedWriter = new BufferedWriter(new OutputStreamWriter(paramOutputStream, d()));
    Iterator localIterator1 = Data.b(this.a).entrySet().iterator();
    boolean bool1 = true;
    Object localObject;
    String str;
    boolean bool2;
    if (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      localObject = localEntry.getValue();
      if (localObject == null) {
        break label186;
      }
      str = CharEscapers.a((String)localEntry.getKey());
      Class localClass = localObject.getClass();
      if (((localObject instanceof Iterable)) || (localClass.isArray()))
      {
        Iterator localIterator2 = Types.a(localObject).iterator();
        while (localIterator2.hasNext()) {
          bool1 = a(bool1, localBufferedWriter, str, localIterator2.next());
        }
        bool2 = bool1;
      }
    }
    for (;;)
    {
      bool1 = bool2;
      break;
      bool2 = a(bool1, localBufferedWriter, str, localObject);
      continue;
      localBufferedWriter.flush();
      return;
      label186:
      bool2 = bool1;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.UrlEncodedContent
 * JD-Core Version:    0.7.0.1
 */