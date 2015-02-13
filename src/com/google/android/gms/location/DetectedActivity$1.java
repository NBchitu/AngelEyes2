package com.google.android.gms.location;

import java.util.Comparator;

final class DetectedActivity$1
  implements Comparator<DetectedActivity>
{
  public int a(DetectedActivity paramDetectedActivity1, DetectedActivity paramDetectedActivity2)
  {
    int i = Integer.valueOf(paramDetectedActivity2.b()).compareTo(Integer.valueOf(paramDetectedActivity1.b()));
    if (i == 0) {
      i = Integer.valueOf(paramDetectedActivity1.a()).compareTo(Integer.valueOf(paramDetectedActivity2.a()));
    }
    return i;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.DetectedActivity.1
 * JD-Core Version:    0.7.0.1
 */