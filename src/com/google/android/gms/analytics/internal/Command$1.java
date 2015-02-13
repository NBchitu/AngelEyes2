package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class Command$1
  implements Parcelable.Creator<Command>
{
  public Command a(Parcel paramParcel)
  {
    return new Command(paramParcel);
  }
  
  public Command[] a(int paramInt)
  {
    return new Command[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.Command.1
 * JD-Core Version:    0.7.0.1
 */