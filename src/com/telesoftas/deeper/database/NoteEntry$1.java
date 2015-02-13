package com.telesoftas.deeper.database;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class NoteEntry$1
  implements Parcelable.Creator<NoteEntry>
{
  public NoteEntry a(Parcel paramParcel)
  {
    return new NoteEntry(paramParcel, null);
  }
  
  public NoteEntry[] a(int paramInt)
  {
    return new NoteEntry[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.database.NoteEntry.1
 * JD-Core Version:    0.7.0.1
 */