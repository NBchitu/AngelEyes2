package com.google.api.client.http;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class MultipartRelatedContent
  extends AbstractHttpContent
{
  private static final byte[] b = "\r\n".getBytes();
  private static final byte[] c = "Content-Type: ".getBytes();
  private static final byte[] d = "Content-Transfer-Encoding: binary".getBytes();
  private static final byte[] e = "--".getBytes();
  private final Collection<HttpContent> a;
  
  public MultipartRelatedContent(HttpContent paramHttpContent, HttpContent... paramVarArgs)
  {
    super(new HttpMediaType("multipart/related").a("boundary", "END_OF_PART"));
    ArrayList localArrayList = new ArrayList(1 + paramVarArgs.length);
    localArrayList.add(paramHttpContent);
    localArrayList.addAll(Arrays.asList(paramVarArgs));
    this.a = localArrayList;
  }
  
  private static boolean a(String paramString)
  {
    if (paramString == null) {}
    HttpMediaType localHttpMediaType;
    do
    {
      return false;
      localHttpMediaType = new HttpMediaType(paramString);
    } while ((!localHttpMediaType.a().equals("text")) && (!localHttpMediaType.a().equals("application")));
    return true;
  }
  
  public void a(OutputStream paramOutputStream)
  {
    byte[] arrayOfByte1 = h().getBytes();
    paramOutputStream.write(e);
    paramOutputStream.write(arrayOfByte1);
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      HttpContent localHttpContent = (HttpContent)localIterator.next();
      String str = localHttpContent.e();
      if (str != null)
      {
        byte[] arrayOfByte2 = str.getBytes();
        paramOutputStream.write(b);
        paramOutputStream.write(c);
        paramOutputStream.write(arrayOfByte2);
      }
      paramOutputStream.write(b);
      if (!a(str))
      {
        paramOutputStream.write(d);
        paramOutputStream.write(b);
      }
      paramOutputStream.write(b);
      localHttpContent.a(paramOutputStream);
      paramOutputStream.write(b);
      paramOutputStream.write(e);
      paramOutputStream.write(arrayOfByte1);
    }
    paramOutputStream.write(e);
    paramOutputStream.flush();
  }
  
  public long f()
  {
    byte[] arrayOfByte1 = h().getBytes();
    long l1 = 2 * e.length + arrayOfByte1.length;
    Iterator localIterator = this.a.iterator();
    long l3;
    for (long l2 = l1;; l2 += l3 + 3 * b.length + e.length + arrayOfByte1.length)
    {
      HttpContent localHttpContent;
      if (localIterator.hasNext())
      {
        localHttpContent = (HttpContent)localIterator.next();
        l3 = localHttpContent.b();
        if (l3 < 0L) {
          l2 = -1L;
        }
      }
      else
      {
        return l2;
      }
      String str = localHttpContent.e();
      if (str != null)
      {
        byte[] arrayOfByte2 = str.getBytes();
        l2 += b.length + c.length + arrayOfByte2.length;
      }
      if (!a(str)) {
        l2 += d.length + b.length;
      }
    }
  }
  
  public boolean g()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      if (!((HttpContent)localIterator.next()).g()) {
        return false;
      }
    }
    return true;
  }
  
  public String h()
  {
    return c().c("boundary");
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.MultipartRelatedContent
 * JD-Core Version:    0.7.0.1
 */