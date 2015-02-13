package com.telesoftas.deeper.database;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class NoteData$1
  implements Parcelable.Creator<NoteData>
{
  public NoteData a(Parcel paramParcel)
  {
    return new NoteData(paramParcel, null);
  }
  
  public NoteData[] a(int paramInt)
  {
    return new NoteData[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.database.NoteData.1
 * JD-Core Version:    0.7.0.1
 */