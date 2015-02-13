package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class ActivityRecognitionResultCreator
  implements Parcelable.Creator<ActivityRecognitionResult>
{
  static void a(ActivityRecognitionResult paramActivityRecognitionResult, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.b(paramParcel, 1, paramActivityRecognitionResult.a, false);
    b.a(paramParcel, 1000, paramActivityRecognitionResult.a());
    b.a(paramParcel, 2, paramActivityRecognitionResult.b);
    b.a(paramParcel, 3, paramActivityRecognitionResult.c);
    b.a(paramParcel, i);
  }
  
  public ActivityRecognitionResult a(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = a.b(paramParcel);
    int j = 0;
    ArrayList localArrayList = null;
    long l2 = l1;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localArrayList = a.c(paramParcel, k, DetectedActivity.CREATOR);
        break;
      case 1000: 
        j = a.f(paramParcel, k);
        break;
      case 2: 
        l2 = a.h(paramParcel, k);
        break;
      case 3: 
        l1 = a.h(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new ActivityRecognitionResult(j, localArrayList, l2, l1);
  }
  
  public ActivityRecognitionResult[] a(int paramInt)
  {
    return new ActivityRecognitionResult[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.ActivityRecognitionResultCreator
 * JD-Core Version:    0.7.0.1
 */