package com.telesoftas.utilities;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.crashlytics.android.Crashlytics;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.Drive.Files;
import com.google.api.services.drive.Drive.Files.Insert;
import com.google.api.services.drive.model.ParentReference;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class GoogleDriveSyncUtils
{
  public static InputStream a(Drive paramDrive, com.google.api.services.drive.model.File paramFile)
  {
    String str = paramFile.c();
    Object localObject = null;
    if (str != null)
    {
      int i = paramFile.c().length();
      localObject = null;
      if (i <= 0) {}
    }
    try
    {
      InputStream localInputStream = paramDrive.d().a(new GenericUrl(paramFile.c())).n().g();
      localObject = localInputStream;
      return localObject;
    }
    catch (IOException localIOException)
    {
      Crashlytics.a(localIOException);
    }
    return null;
  }
  
  public static void a(java.io.File paramFile, String paramString1, Drive paramDrive, ArrayList<ParentReference> paramArrayList, String paramString2)
  {
    if (paramFile.exists())
    {
      com.google.api.services.drive.model.File localFile = new com.google.api.services.drive.model.File();
      localFile.b(paramString1);
      localFile.c(paramString1);
      localFile.a(paramString2);
      localFile.a(paramArrayList);
      FileContent localFileContent = new FileContent(paramString2, paramFile);
      paramDrive.i().a(localFile, localFileContent).d();
    }
  }
  
  public static void a(byte[] paramArrayOfByte, String paramString, Drive paramDrive, ArrayList<ParentReference> paramArrayList)
  {
    com.google.api.services.drive.model.File localFile = new com.google.api.services.drive.model.File();
    localFile.b(paramString);
    localFile.c(paramString);
    localFile.a("application/*");
    localFile.a(paramArrayList);
    ByteArrayContent localByteArrayContent = new ByteArrayContent("application/*", paramArrayOfByte);
    paramDrive.i().a(localFile, localByteArrayContent).d();
  }
  
  public static boolean a(Context paramContext, InputStream paramInputStream, String paramString)
  {
    for (;;)
    {
      try
      {
        localEditor = paramContext.getSharedPreferences(paramString, 0).edit();
        localEditor.clear();
        localNode = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(paramInputStream).getDocumentElement().getFirstChild();
        if (localNode == null) {
          continue;
        }
        if (localNode.getNodeType() == 1)
        {
          localElement = (Element)localNode;
          str1 = localElement.getNodeName();
          str2 = localElement.getAttribute("name");
          if (!str1.equals("string")) {
            continue;
          }
          localEditor.putString(str2, localElement.getTextContent());
        }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        Node localNode;
        Crashlytics.a(localFileNotFoundException);
        return false;
        if (!str1.equals("int")) {
          continue;
        }
        localEditor.putInt(str2, Integer.parseInt(localElement.getAttribute("value")));
        continue;
      }
      catch (ParserConfigurationException localParserConfigurationException)
      {
        Element localElement;
        String str1;
        String str2;
        Crashlytics.a(localParserConfigurationException);
        continue;
        if (!str1.equals("long")) {
          continue;
        }
        localEditor.putLong(str2, Long.parseLong(localElement.getAttribute("value")));
        continue;
      }
      catch (SAXException localSAXException)
      {
        SharedPreferences.Editor localEditor;
        Crashlytics.a(localSAXException);
        continue;
        localEditor.apply();
        return true;
      }
      catch (IOException localIOException)
      {
        Crashlytics.a(localIOException);
        continue;
      }
      localNode = localNode.getNextSibling();
      continue;
      if (!str1.equals("boolean")) {
        continue;
      }
      localEditor.putBoolean(str2, localElement.getAttribute("value").equals("true"));
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.GoogleDriveSyncUtils
 * JD-Core Version:    0.7.0.1
 */