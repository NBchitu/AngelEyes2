package com.telesoftas.utilities;

import android.os.AsyncTask;
import android.os.Environment;
import android.os.Parcel;
import android.util.Log;
import android.widget.ProgressBar;
import com.crashlytics.android.Crashlytics;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.Drive.Files;
import com.google.api.services.drive.Drive.Files.Delete;
import com.google.api.services.drive.Drive.Files.Insert;
import com.google.api.services.drive.Drive.Files.List;
import com.google.api.services.drive.model.FileList;
import com.google.api.services.drive.model.ParentReference;
import com.telesoftas.deeper.activities.ImportExportActivity;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.deeper.database.NoteData;
import com.telesoftas.deeper.database.NoteEntry;
import com.telesoftas.deeper.database.PhotoData;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GoogleDriveSyncTask
  extends AsyncTask<Void, Integer, Void>
{
  protected ImportExportActivity a;
  protected String b;
  protected String c;
  private final int d;
  private final int e;
  
  public GoogleDriveSyncTask(ImportExportActivity paramImportExportActivity, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    this.a = paramImportExportActivity;
    this.b = paramString2;
    this.c = paramString1;
    this.e = paramInt2;
    this.d = paramInt1;
  }
  
  /* Error */
  private void a()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: invokespecial 33	com/telesoftas/utilities/GoogleDriveSyncTask:c	()Ljava/lang/String;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +4 -> 12
    //   11: return
    //   12: new 35	com/google/api/client/googleapis/auth/oauth2/GoogleCredential
    //   15: dup
    //   16: invokespecial 36	com/google/api/client/googleapis/auth/oauth2/GoogleCredential:<init>	()V
    //   19: astore_3
    //   20: aload_3
    //   21: aload_2
    //   22: invokevirtual 39	com/google/api/client/googleapis/auth/oauth2/GoogleCredential:c	(Ljava/lang/String;)Lcom/google/api/client/googleapis/auth/oauth2/GoogleCredential;
    //   25: pop
    //   26: iload_1
    //   27: anewarray 41	java/lang/Integer
    //   30: astore 5
    //   32: aload 5
    //   34: iconst_0
    //   35: iload_1
    //   36: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   39: aastore
    //   40: aload_0
    //   41: aload 5
    //   43: invokevirtual 49	com/telesoftas/utilities/GoogleDriveSyncTask:publishProgress	([Ljava/lang/Object;)V
    //   46: new 51	com/google/api/services/drive/Drive$Builder
    //   49: dup
    //   50: new 53	com/google/api/client/http/javanet/NetHttpTransport
    //   53: dup
    //   54: invokespecial 54	com/google/api/client/http/javanet/NetHttpTransport:<init>	()V
    //   57: new 56	com/google/api/client/json/jackson2/JacksonFactory
    //   60: dup
    //   61: invokespecial 57	com/google/api/client/json/jackson2/JacksonFactory:<init>	()V
    //   64: aload_3
    //   65: invokespecial 60	com/google/api/services/drive/Drive$Builder:<init>	(Lcom/google/api/client/http/HttpTransport;Lcom/google/api/client/json/JsonFactory;Lcom/google/api/client/http/HttpRequestInitializer;)V
    //   68: ldc 62
    //   70: invokevirtual 66	com/google/api/services/drive/Drive$Builder:i	(Ljava/lang/String;)Lcom/google/api/services/drive/Drive$Builder;
    //   73: new 68	com/google/api/services/drive/DriveRequestInitializer
    //   76: dup
    //   77: invokespecial 69	com/google/api/services/drive/DriveRequestInitializer:<init>	()V
    //   80: invokevirtual 72	com/google/api/services/drive/Drive$Builder:a	(Lcom/google/api/services/drive/DriveRequestInitializer;)Lcom/google/api/services/drive/Drive$Builder;
    //   83: invokevirtual 76	com/google/api/services/drive/Drive$Builder:j	()Lcom/google/api/services/drive/Drive;
    //   86: astore 11
    //   88: aload_0
    //   89: getfield 26	com/telesoftas/utilities/GoogleDriveSyncTask:e	I
    //   92: iconst_2
    //   93: if_icmpne +47 -> 140
    //   96: aload_0
    //   97: invokespecial 78	com/telesoftas/utilities/GoogleDriveSyncTask:b	()V
    //   100: aload_0
    //   101: aload 11
    //   103: invokespecial 81	com/telesoftas/utilities/GoogleDriveSyncTask:a	(Lcom/google/api/services/drive/Drive;)Z
    //   106: istore 13
    //   108: iload 13
    //   110: istore_1
    //   111: ldc 83
    //   113: aload_2
    //   114: invokevirtual 89	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   117: ifne +11 -> 128
    //   120: aload_0
    //   121: getfield 20	com/telesoftas/utilities/GoogleDriveSyncTask:a	Lcom/telesoftas/deeper/activities/ImportExportActivity;
    //   124: aload_2
    //   125: invokestatic 94	com/google/android/gms/auth/GoogleAuthUtil:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   128: iload_1
    //   129: ifeq -118 -> 11
    //   132: aload_0
    //   133: getfield 20	com/telesoftas/utilities/GoogleDriveSyncTask:a	Lcom/telesoftas/deeper/activities/ImportExportActivity;
    //   136: invokevirtual 99	com/telesoftas/deeper/activities/ImportExportActivity:finish	()V
    //   139: return
    //   140: aload_0
    //   141: getfield 26	com/telesoftas/utilities/GoogleDriveSyncTask:e	I
    //   144: iload_1
    //   145: if_icmpne -34 -> 111
    //   148: aload_0
    //   149: aload 11
    //   151: invokespecial 101	com/telesoftas/utilities/GoogleDriveSyncTask:b	(Lcom/google/api/services/drive/Drive;)Z
    //   154: istore 12
    //   156: iload 12
    //   158: istore_1
    //   159: goto -48 -> 111
    //   162: astore 9
    //   164: ldc 103
    //   166: new 105	java/lang/StringBuilder
    //   169: dup
    //   170: invokespecial 106	java/lang/StringBuilder:<init>	()V
    //   173: ldc 108
    //   175: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: aload 9
    //   180: invokevirtual 115	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   183: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   189: invokestatic 123	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   192: pop
    //   193: aload_0
    //   194: getfield 20	com/telesoftas/utilities/GoogleDriveSyncTask:a	Lcom/telesoftas/deeper/activities/ImportExportActivity;
    //   197: ldc 124
    //   199: invokevirtual 127	com/telesoftas/deeper/activities/ImportExportActivity:b	(I)V
    //   202: ldc 83
    //   204: aload_2
    //   205: invokevirtual 89	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   208: ifne -197 -> 11
    //   211: aload_0
    //   212: getfield 20	com/telesoftas/utilities/GoogleDriveSyncTask:a	Lcom/telesoftas/deeper/activities/ImportExportActivity;
    //   215: aload_2
    //   216: invokestatic 94	com/google/android/gms/auth/GoogleAuthUtil:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   219: return
    //   220: astore 6
    //   222: iload_1
    //   223: istore 7
    //   225: aload 6
    //   227: astore 8
    //   229: ldc 83
    //   231: aload_2
    //   232: invokevirtual 89	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   235: ifne +11 -> 246
    //   238: aload_0
    //   239: getfield 20	com/telesoftas/utilities/GoogleDriveSyncTask:a	Lcom/telesoftas/deeper/activities/ImportExportActivity;
    //   242: aload_2
    //   243: invokestatic 94	com/google/android/gms/auth/GoogleAuthUtil:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   246: iload 7
    //   248: ifeq +10 -> 258
    //   251: aload_0
    //   252: getfield 20	com/telesoftas/utilities/GoogleDriveSyncTask:a	Lcom/telesoftas/deeper/activities/ImportExportActivity;
    //   255: invokevirtual 99	com/telesoftas/deeper/activities/ImportExportActivity:finish	()V
    //   258: aload 8
    //   260: athrow
    //   261: astore 8
    //   263: iconst_0
    //   264: istore 7
    //   266: goto -37 -> 229
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	269	0	this	GoogleDriveSyncTask
    //   1	222	1	i	int
    //   6	237	2	str	String
    //   19	46	3	localGoogleCredential	com.google.api.client.googleapis.auth.oauth2.GoogleCredential
    //   30	12	5	arrayOfInteger	Integer[]
    //   220	6	6	localObject1	Object
    //   223	42	7	j	int
    //   227	32	8	localObject2	Object
    //   261	1	8	localObject3	Object
    //   162	17	9	localException	Exception
    //   86	64	11	localDrive	Drive
    //   154	3	12	k	int
    //   106	3	13	m	int
    // Exception table:
    //   from	to	target	type
    //   46	108	162	java/lang/Exception
    //   140	156	162	java/lang/Exception
    //   46	108	220	finally
    //   140	156	220	finally
    //   164	202	261	finally
  }
  
  private void a(int paramInt)
  {
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(-paramInt);
    publishProgress(arrayOfInteger);
  }
  
  private boolean a(Drive paramDrive)
  {
    int i = 7;
    FileList localFileList = (FileList)paramDrive.i().a().a("title='Deeper Application Backup' and mimeType='application/vnd.google-apps.folder'").d();
    if (localFileList.size() > 0)
    {
      Iterator localIterator3 = localFileList.a().iterator();
      while (localIterator3.hasNext())
      {
        com.google.api.services.drive.model.File localFile3 = (com.google.api.services.drive.model.File)localIterator3.next();
        paramDrive.i().a(localFile3.a()).d();
      }
    }
    Integer[] arrayOfInteger1 = new Integer[1];
    arrayOfInteger1[0] = Integer.valueOf(2);
    publishProgress(arrayOfInteger1);
    com.google.api.services.drive.model.File localFile1 = new com.google.api.services.drive.model.File();
    localFile1.b("Deeper Application Backup");
    localFile1.c("Deeper Application Backup");
    localFile1.a("application/vnd.google-apps.folder");
    com.google.api.services.drive.model.File localFile2 = (com.google.api.services.drive.model.File)paramDrive.i().a(localFile1).d();
    Integer[] arrayOfInteger2 = new Integer[1];
    arrayOfInteger2[0] = Integer.valueOf(3);
    publishProgress(arrayOfInteger2);
    ParentReference localParentReference = new ParentReference();
    localParentReference.a(Boolean.valueOf(false));
    localParentReference.a(localFile2.a());
    ArrayList localArrayList1 = new ArrayList();
    localArrayList1.add(localParentReference);
    GoogleDriveSyncUtils.a(new java.io.File(this.a.getFilesDir(), "../shared_prefs/prefs.xml"), "SettingsBackup1", paramDrive, localArrayList1, "application/*");
    Integer[] arrayOfInteger3 = new Integer[1];
    arrayOfInteger3[0] = Integer.valueOf(4);
    publishProgress(arrayOfInteger3);
    GoogleDriveSyncUtils.a(new java.io.File(this.a.getFilesDir(), "../shared_prefs/facebook-session.xml"), "SettingsBackup2", paramDrive, localArrayList1, "application/*");
    Integer[] arrayOfInteger4 = new Integer[1];
    arrayOfInteger4[0] = Integer.valueOf(5);
    publishProgress(arrayOfInteger4);
    DeeperDatabase localDeeperDatabase = new DeeperDatabase(this.a);
    ArrayList localArrayList2 = localDeeperDatabase.a();
    Parcel localParcel1 = Parcel.obtain();
    localParcel1.writeTypedList(localArrayList2);
    GoogleDriveSyncUtils.a(localParcel1.marshall(), "NotesBackup", paramDrive, localArrayList1);
    Integer[] arrayOfInteger5 = new Integer[1];
    arrayOfInteger5[0] = Integer.valueOf(6);
    publishProgress(arrayOfInteger5);
    ArrayList localArrayList3 = localDeeperDatabase.c();
    Parcel localParcel2 = Parcel.obtain();
    localParcel2.writeTypedList(localArrayList3);
    GoogleDriveSyncUtils.a(localParcel2.marshall(), "LocationsBackup", paramDrive, localArrayList1);
    Integer[] arrayOfInteger6 = new Integer[1];
    arrayOfInteger6[0] = Integer.valueOf(i);
    publishProgress(arrayOfInteger6);
    Iterator localIterator1 = localArrayList2.iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((NoteEntry)localIterator1.next()).c().iterator();
      while (localIterator2.hasNext())
      {
        String str = ((PhotoData)localIterator2.next()).a();
        GoogleDriveSyncUtils.a(new java.io.File(str), str.substring(1 + str.lastIndexOf("/")), paramDrive, localArrayList1, "image/jpeg");
        i++;
        Integer[] arrayOfInteger7 = new Integer[1];
        arrayOfInteger7[0] = Integer.valueOf(i);
        publishProgress(arrayOfInteger7);
      }
    }
    return true;
  }
  
  private void b()
  {
    Iterator localIterator = new DeeperDatabase(this.a).a().iterator();
    int i = 7;
    while (localIterator.hasNext()) {
      i += ((NoteEntry)localIterator.next()).c().size();
    }
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(-i);
    publishProgress(arrayOfInteger);
  }
  
  private boolean b(Drive paramDrive)
  {
    int i = 1;
    FileList localFileList1 = (FileList)paramDrive.i().a().a("title='Deeper Application Backup' and mimeType='application/vnd.google-apps.folder'").d();
    Integer[] arrayOfInteger1 = new Integer[i];
    arrayOfInteger1[0] = Integer.valueOf(2);
    publishProgress(arrayOfInteger1);
    com.google.api.services.drive.model.File localFile1;
    DeeperDatabase localDeeperDatabase;
    FileList localFileList2;
    NoteEntry localNoteEntry;
    int i4;
    if (localFileList1.a().size() == i)
    {
      localFile1 = (com.google.api.services.drive.model.File)localFileList1.a().get(0);
      localDeeperDatabase = new DeeperDatabase(this.a);
      localFileList2 = (FileList)paramDrive.i().a().a("mimeType = 'image/jpeg' and '" + localFile1.a() + "' in parents").d();
      a(11 + localFileList2.a().size());
      Integer[] arrayOfInteger2 = new Integer[i];
      arrayOfInteger2[0] = Integer.valueOf(3);
      publishProgress(arrayOfInteger2);
      FileList localFileList3 = (FileList)paramDrive.i().a().a("title='SettingsBackup1' and '" + localFile1.a() + "' in parents").d();
      Integer[] arrayOfInteger3 = new Integer[i];
      arrayOfInteger3[0] = Integer.valueOf(4);
      publishProgress(arrayOfInteger3);
      if (localFileList3.a().size() == i)
      {
        InputStream localInputStream5 = GoogleDriveSyncUtils.a(paramDrive, (com.google.api.services.drive.model.File)localFileList3.a().get(0));
        GoogleDriveSyncUtils.a(this.a, localInputStream5, "prefs");
      }
      Integer[] arrayOfInteger4 = new Integer[i];
      arrayOfInteger4[0] = Integer.valueOf(5);
      publishProgress(arrayOfInteger4);
      FileList localFileList4 = (FileList)paramDrive.i().a().a("title='SettingsBackup2' and '" + localFile1.a() + "' in parents").d();
      Integer[] arrayOfInteger5 = new Integer[i];
      arrayOfInteger5[0] = Integer.valueOf(6);
      publishProgress(arrayOfInteger5);
      if (localFileList4.a().size() == i)
      {
        InputStream localInputStream4 = GoogleDriveSyncUtils.a(paramDrive, (com.google.api.services.drive.model.File)localFileList4.a().get(0));
        GoogleDriveSyncUtils.a(this.a, localInputStream4, "facebook-session");
      }
      Integer[] arrayOfInteger6 = new Integer[i];
      arrayOfInteger6[0] = Integer.valueOf(7);
      publishProgress(arrayOfInteger6);
      FileList localFileList5 = (FileList)paramDrive.i().a().a("title='NotesBackup' and '" + localFile1.a() + "' in parents").d();
      Integer[] arrayOfInteger7 = new Integer[i];
      arrayOfInteger7[0] = Integer.valueOf(8);
      publishProgress(arrayOfInteger7);
      if (localFileList5.a().size() == i)
      {
        InputStream localInputStream3 = GoogleDriveSyncUtils.a(paramDrive, (com.google.api.services.drive.model.File)localFileList5.a().get(0));
        Parcel localParcel2 = Parcel.obtain();
        byte[] arrayOfByte3 = ByteUtils.a(localInputStream3);
        localParcel2.unmarshall(arrayOfByte3, 0, arrayOfByte3.length);
        localParcel2.setDataPosition(0);
        ArrayList localArrayList3 = new ArrayList();
        localParcel2.readTypedList(localArrayList3, NoteEntry.CREATOR);
        ArrayList localArrayList4 = localDeeperDatabase.a();
        Iterator localIterator3 = localArrayList3.iterator();
        if (localIterator3.hasNext())
        {
          localNoteEntry = (NoteEntry)localIterator3.next();
          int i3 = localNoteEntry.a().hashCode();
          Iterator localIterator4 = localArrayList4.iterator();
          i4 = 0;
          label646:
          if (localIterator4.hasNext()) {
            if (((NoteEntry)localIterator4.next()).a().hashCode() != i3) {
              break label1256;
            }
          }
        }
      }
    }
    label929:
    label1249:
    label1256:
    for (int i5 = i;; i5 = i4)
    {
      i4 = i5;
      break label646;
      if (i4 != 0) {
        break;
      }
      localDeeperDatabase.a(localNoteEntry, i, i);
      break;
      Integer[] arrayOfInteger8 = new Integer[i];
      arrayOfInteger8[0] = Integer.valueOf(9);
      publishProgress(arrayOfInteger8);
      FileList localFileList6 = (FileList)paramDrive.i().a().a("title='LocationsBackup' and '" + localFile1.a() + "' in parents").d();
      Integer[] arrayOfInteger9 = new Integer[i];
      arrayOfInteger9[0] = Integer.valueOf(10);
      publishProgress(arrayOfInteger9);
      LocationData localLocationData;
      int i1;
      if (localFileList6.a().size() == i)
      {
        InputStream localInputStream2 = GoogleDriveSyncUtils.a(paramDrive, (com.google.api.services.drive.model.File)localFileList6.a().get(0));
        Parcel localParcel1 = Parcel.obtain();
        byte[] arrayOfByte2 = ByteUtils.a(localInputStream2);
        localParcel1.unmarshall(arrayOfByte2, 0, arrayOfByte2.length);
        localParcel1.setDataPosition(0);
        ArrayList localArrayList1 = new ArrayList();
        localParcel1.readTypedList(localArrayList1, LocationData.CREATOR);
        ArrayList localArrayList2 = localDeeperDatabase.c();
        Iterator localIterator1 = localArrayList1.iterator();
        if (localIterator1.hasNext())
        {
          localLocationData = (LocationData)localIterator1.next();
          int n = localLocationData.hashCode();
          Iterator localIterator2 = localArrayList2.iterator();
          i1 = 0;
          if (localIterator2.hasNext()) {
            if (((LocationData)localIterator2.next()).hashCode() != n) {
              break label1249;
            }
          }
        }
      }
      for (int i2 = i;; i2 = i1)
      {
        i1 = i2;
        break label929;
        if (i1 != 0) {
          break;
        }
        localDeeperDatabase.a(localLocationData);
        break;
        Integer[] arrayOfInteger10 = new Integer[i];
        arrayOfInteger10[0] = Integer.valueOf(11);
        publishProgress(arrayOfInteger10);
        List localList = localFileList2.a();
        int j = 0;
        int k = 11;
        while (j < localList.size())
        {
          com.google.api.services.drive.model.File localFile2 = (com.google.api.services.drive.model.File)localList.get(j);
          InputStream localInputStream1 = GoogleDriveSyncUtils.a(paramDrive, localFile2);
          String str = this.a.getExternalFilesDir(Environment.DIRECTORY_PICTURES) + "/" + localFile2.b();
          try
          {
            localFileOutputStream1 = new FileOutputStream(str);
            try
            {
              byte[] arrayOfByte1 = new byte[10240];
              for (;;)
              {
                int m = localInputStream1.read(arrayOfByte1);
                if (m == -1) {
                  break;
                }
                localFileOutputStream1.write(arrayOfByte1, 0, m);
              }
              if (localInputStream1 == null) {
                break label1152;
              }
            }
            finally
            {
              localFileOutputStream2 = localFileOutputStream1;
            }
          }
          finally
          {
            for (;;)
            {
              FileOutputStream localFileOutputStream1;
              Integer[] arrayOfInteger11;
              boolean bool;
              FileOutputStream localFileOutputStream2 = null;
            }
          }
          localInputStream1.close();
          if (localFileOutputStream2 != null) {
            localFileOutputStream2.close();
          }
          throw localObject1;
          if (localInputStream1 != null) {
            localInputStream1.close();
          }
          if (localFileOutputStream1 != null) {
            localFileOutputStream1.close();
          }
          ImageUtils.a(str, 200, 200);
          k++;
          arrayOfInteger11 = new Integer[i];
          arrayOfInteger11[0] = Integer.valueOf(k);
          publishProgress(arrayOfInteger11);
          j++;
          continue;
          this.a.b(2131427416);
          bool = false;
        }
        return bool;
      }
    }
  }
  
  private String c()
  {
    try
    {
      String str = GoogleAuthUtil.a(this.a, this.c, this.b);
      return str;
    }
    catch (GooglePlayServicesAvailabilityException localGooglePlayServicesAvailabilityException)
    {
      this.a.a(localGooglePlayServicesAvailabilityException.a());
      return null;
    }
    catch (UserRecoverableAuthException localUserRecoverableAuthException)
    {
      for (;;)
      {
        Log.e("gglDriveSy", "userRecoverableAuthExeption");
        this.a.startActivityForResult(localUserRecoverableAuthException.b(), this.d);
      }
    }
    catch (GoogleAuthException localGoogleAuthException)
    {
      for (;;)
      {
        Log.e("gglDriveSy", "unrecoverable error");
        a("Unrecoverable error " + localGoogleAuthException.getMessage(), localGoogleAuthException);
      }
    }
  }
  
  protected Void a(Void... paramVarArgs)
  {
    try
    {
      a();
      return null;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Crashlytics.a(localException);
        this.a.b(2131427415);
      }
    }
  }
  
  protected void a(String paramString, Exception paramException)
  {
    this.a.b(paramString);
  }
  
  protected void a(Integer... paramVarArgs)
  {
    if (paramVarArgs[0].intValue() < 0) {
      this.a.n.setMax(-paramVarArgs[0].intValue());
    }
    for (;;)
    {
      super.onProgressUpdate(paramVarArgs);
      return;
      this.a.n.setProgress(paramVarArgs[(-1 + paramVarArgs.length)].intValue());
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.GoogleDriveSyncTask
 * JD-Core Version:    0.7.0.1
 */