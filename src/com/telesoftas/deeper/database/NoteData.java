package com.telesoftas.deeper.database;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.GregorianCalendar;

public class NoteData
  implements Parcelable
{
  public static final Parcelable.Creator<NoteData> CREATOR = new NoteData.1();
  private String a;
  private GregorianCalendar b;
  private String c;
  
  private NoteData(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    long l = paramParcel.readLong();
    this.b = new GregorianCalendar();
    this.b.setTimeInMillis(l);
    this.c = paramParcel.readString();
  }
  
  public NoteData(GregorianCalendar paramGregorianCalendar, String paramString1, String paramString2)
  {
    a(paramGregorianCalendar);
    b(paramString1);
    a(paramString2);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(GregorianCalendar paramGregorianCalendar)
  {
    this.b = paramGregorianCalendar;
  }
  
  public GregorianCalendar b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int hashCode()
  {
    return (this.a + this.c + this.b.getTimeInMillis()).hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeLong(this.b.getTimeInMillis());
    paramParcel.writeString(this.c);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.database.NoteData
 * JD-Core Version:    0.7.0.1
 */