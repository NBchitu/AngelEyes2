package com.telesoftas.utilities.weather;

import android.content.Context;
import android.location.Location;
import android.util.SparseIntArray;

public final class WeatherCodeUtils
{
  private static final SparseIntArray a = new SparseIntArray();
  private static final SparseIntArray b = new SparseIntArray();
  
  static
  {
    a();
    b();
  }
  
  public static int a(int paramInt)
  {
    return b.get(paramInt);
  }
  
  public static int a(int paramInt, boolean paramBoolean, Location paramLocation)
  {
    int[] arrayOfInt1 = { 0, 2, 4, 10, 18, 27, 38, 44, 50, 55, 60, 71, 81, 89, 95, 99, 100 };
    int[] arrayOfInt2 = { 2130837733, 2130837747, 2130837752, 2130837748, 2130837749, 2130837750, 2130837751, 2130837753, 2130837730, 2130837754, 2130837755, 2130837756, 2130837757, 2130837758, 2130837759, 2130837760, 2130837731 };
    int[] arrayOfInt3 = { 0, 2, 5, 11, 17, 25, 34, 43, 50, 62, 71, 80, 87, 93, 98, 100 };
    int[] arrayOfInt4 = { 2130837733, 2130837736, 2130837740, 2130837734, 2130837735, 2130837737, 2130837738, 2130837739, 2130837732, 2130837741, 2130837742, 2130837743, 2130837744, 2130837745, 2130837746, 2130837731 };
    int i;
    int[] arrayOfInt5;
    if (paramLocation.getLatitude() >= 0.0D)
    {
      i = 1;
      if (i == 0) {
        break label457;
      }
      if (!paramBoolean) {
        break label447;
      }
      arrayOfInt5 = arrayOfInt3;
    }
    label414:
    for (int j = -1 + arrayOfInt5.length;; j--)
    {
      if (j < 0) {
        break label484;
      }
      if (paramInt >= arrayOfInt5[j])
      {
        return arrayOfInt4[j];
        i = 0;
        break;
        label447:
        arrayOfInt4 = arrayOfInt2;
        arrayOfInt5 = arrayOfInt1;
        break label414;
        label457:
        if (paramBoolean)
        {
          arrayOfInt4 = arrayOfInt2;
          arrayOfInt5 = arrayOfInt1;
          break label414;
        }
        arrayOfInt5 = arrayOfInt3;
        break label414;
      }
    }
    label484:
    return 0;
  }
  
  public static String a(int paramInt, Context paramContext)
  {
    String str = paramContext.getString(2131427340);
    if ((paramInt == 1) || (paramInt == 2)) {
      str = paramContext.getString(2131427421);
    }
    return str;
  }
  
  public static String a(int paramInt, boolean paramBoolean, Context paramContext)
  {
    String str;
    if (paramBoolean)
    {
      str = paramContext.getString(2131427528);
      if (paramInt > 1) {
        str = paramContext.getString(2131427530);
      }
      if (paramInt > 48) {
        str = paramContext.getString(2131427532);
      }
      if (paramInt > 52) {
        str = paramContext.getString(2131427531);
      }
      if (paramInt > 99) {
        str = paramContext.getString(2131427526);
      }
    }
    do
    {
      return str;
      str = paramContext.getString(2131427527);
      if (paramInt > 1) {
        str = paramContext.getString(2131427533);
      }
      if (paramInt > 48) {
        str = paramContext.getString(2131427535);
      }
      if (paramInt > 52) {
        str = paramContext.getString(2131427534);
      }
    } while (paramInt <= 99);
    return paramContext.getString(2131427526);
  }
  
  public static String a(Context paramContext, int paramInt)
  {
    String str = paramContext.getString(a.get(paramInt));
    if (str == null) {
      str = " ";
    }
    return str;
  }
  
  private static void a()
  {
    a.put(113, 2131427341);
    a.put(116, 2131427556);
    a.put(119, 2131427342);
    a.put(122, 2131427554);
    a.put(143, 2131427520);
    a.put(176, 2131427563);
    a.put(179, 2131427565);
    a.put(182, 2131427564);
    a.put(185, 2131427557);
    a.put(200, 2131427627);
    a.put(227, 2131427336);
    a.put(230, 2131427335);
    a.put(248, 2131427429);
    a.put(260, 2131427431);
    a.put(263, 2131427559);
    a.put(266, 2131427471);
    a.put(281, 2131427430);
    a.put(284, 2131427437);
    a.put(293, 2131427560);
    a.put(296, 2131427473);
    a.put(299, 2131427522);
    a.put(302, 2131427521);
    a.put(305, 2131427440);
    a.put(308, 2131427439);
    a.put(311, 2131427472);
    a.put(314, 2131427438);
    a.put(317, 2131427477);
    a.put(320, 2131427444);
    a.put(323, 2131427561);
    a.put(326, 2131427479);
    a.put(329, 2131427562);
    a.put(332, 2131427523);
    a.put(335, 2131427558);
    a.put(338, 2131427446);
    a.put(350, 2131427457);
    a.put(353, 2131427474);
    a.put(356, 2131427441);
    a.put(359, 2131427629);
    a.put(362, 2131427478);
    a.put(365, 2131427445);
    a.put(368, 2131427480);
    a.put(371, 2131427447);
    a.put(374, 2131427476);
    a.put(377, 2131427443);
    a.put(386, 2131427475);
    a.put(389, 2131427442);
    a.put(392, 2131427481);
    a.put(395, 2131427448);
  }
  
  private static void b()
  {
    b.put(113, 2130837702);
    b.put(116, 2130837648);
    b.put(119, 2130837647);
    b.put(122, 2130837647);
    b.put(143, 2130837619);
    b.put(176, 2130837703);
    b.put(179, 2130837698);
    b.put(182, 2130837697);
    b.put(185, 2130837692);
    b.put(200, 2130837701);
    b.put(227, 2130837698);
    b.put(230, 2130837698);
    b.put(248, 2130837619);
    b.put(260, 2130837619);
    b.put(263, 2130837703);
    b.put(266, 2130837703);
    b.put(281, 2130837698);
    b.put(284, 2130837698);
    b.put(293, 2130837703);
    b.put(296, 2130837703);
    b.put(299, 2130837691);
    b.put(302, 2130837691);
    b.put(305, 2130837691);
    b.put(308, 2130837691);
    b.put(311, 2130837692);
    b.put(314, 2130837692);
    b.put(317, 2130837697);
    b.put(320, 2130837697);
    b.put(323, 2130837698);
    b.put(326, 2130837698);
    b.put(329, 2130837698);
    b.put(332, 2130837698);
    b.put(335, 2130837698);
    b.put(338, 2130837698);
    b.put(350, 2130837649);
    b.put(353, 2130837703);
    b.put(356, 2130837691);
    b.put(359, 2130837691);
    b.put(362, 2130837697);
    b.put(365, 2130837697);
    b.put(368, 2130837698);
    b.put(371, 2130837698);
    b.put(374, 2130837649);
    b.put(377, 2130837649);
    b.put(386, 2130837701);
    b.put(389, 2130837701);
    b.put(392, 2130837701);
    b.put(395, 2130837698);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.weather.WeatherCodeUtils
 * JD-Core Version:    0.7.0.1
 */