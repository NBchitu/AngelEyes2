package com.google.analytics.containertag.common;

public enum FunctionType
{
  private final String at;
  
  static
  {
    A = new FunctionType("DEVICE_ID", 26, "_did");
    B = new FunctionType("ENCODE", 27, "_enc");
    C = new FunctionType("GTM_VERSION", 28, "_gtmv");
    D = new FunctionType("HASH", 29, "_hsh");
    E = new FunctionType("INSTALL_REFERRER", 30, "_ir");
    F = new FunctionType("JOINER", 31, "_jn");
    G = new FunctionType("MOBILE_ADWORDS_UNIQUE_ID", 32, "_awid");
    H = new FunctionType("REGEX_GROUP", 33, "_reg");
    I = new FunctionType("REGEX", 34, "_re");
    J = new FunctionType("STARTS_WITH", 35, "_sw");
    K = new FunctionType("ENDS_WITH", 36, "_ew");
    L = new FunctionType("CONTAINS", 37, "_cn");
    M = new FunctionType("EQUALS", 38, "_eq");
    N = new FunctionType("LESS_THAN", 39, "_lt");
    O = new FunctionType("LESS_EQUALS", 40, "_le");
    P = new FunctionType("GREATER_THAN", 41, "_gt");
    Q = new FunctionType("GREATER_EQUALS", 42, "_ge");
    R = new FunctionType("ARBITRARY_PIXEL", 43, "_img");
    S = new FunctionType("ARBITRARY_HTML", 44, "_html");
    T = new FunctionType("GOOGLE_TAG_MANAGER", 45, "_gtm");
    U = new FunctionType("GOOGLE_ANALYTICS", 46, "_ga");
    V = new FunctionType("ADWORDS_CONVERSION", 47, "_awct");
    W = new FunctionType("SMART_PIXEL", 48, "_sp");
    X = new FunctionType("FLOODLIGHT_COUNTER", 49, "_flc");
    Y = new FunctionType("FLOODLIGHT_SALES", 50, "_fls");
    Z = new FunctionType("BIZO_INSIGHT", 51, "_bzi");
    aa = new FunctionType("QUANTCAST_MEASUREMENT", 52, "_qcm");
    ab = new FunctionType("TARGUS_ADVISOR", 53, "_ta");
    ac = new FunctionType("MEDIAPLEX_ROI", 54, "_mpr");
    ad = new FunctionType("COMSCORE_MEASUREMENT", 55, "_csm");
    ae = new FunctionType("TURN_CONVERSION", 56, "_tc");
    af = new FunctionType("TURN_DATA_COLLECTION", 57, "_tdc");
    ag = new FunctionType("MEDIA6DEGREES_UNIVERSAL_PIXEL", 58, "_m6d");
    ah = new FunctionType("UNIVERSAL_ANALYTICS", 59, "_ua");
    ai = new FunctionType("MEDIAPLEX_MCT", 60, "_mpm");
    aj = new FunctionType("VISUAL_DNA_CONVERSION", 61, "_vdc");
    ak = new FunctionType("GOOGLE_AFFILIATE_NETWORK", 62, "_gan");
    al = new FunctionType("MARIN_SOFTWARE", 63, "_ms");
    am = new FunctionType("ADROLL_SMART_PIXEL", 64, "_asp");
    an = new FunctionType("CONFIGURATION_VALUE", 65, "_cv");
    ao = new FunctionType("CRITEO", 66, "_crt");
    ap = new FunctionType("TRUSTED_STORES", 67, "_ts");
    aq = new FunctionType("CLICK_TALE_STANDARD", 68, "_cts");
    ar = new FunctionType("ALL_LINK_CLICKS", 69, "_alc");
    as = new FunctionType("ALL_FORM_SUBMISSIONS", 70, "_afs");
    FunctionType[] arrayOfFunctionType = new FunctionType[71];
    arrayOfFunctionType[0] = a;
    arrayOfFunctionType[1] = b;
    arrayOfFunctionType[2] = c;
    arrayOfFunctionType[3] = d;
    arrayOfFunctionType[4] = e;
    arrayOfFunctionType[5] = f;
    arrayOfFunctionType[6] = g;
    arrayOfFunctionType[7] = h;
    arrayOfFunctionType[8] = i;
    arrayOfFunctionType[9] = j;
    arrayOfFunctionType[10] = k;
    arrayOfFunctionType[11] = l;
    arrayOfFunctionType[12] = m;
    arrayOfFunctionType[13] = n;
    arrayOfFunctionType[14] = o;
    arrayOfFunctionType[15] = p;
    arrayOfFunctionType[16] = q;
    arrayOfFunctionType[17] = r;
    arrayOfFunctionType[18] = s;
    arrayOfFunctionType[19] = t;
    arrayOfFunctionType[20] = u;
    arrayOfFunctionType[21] = v;
    arrayOfFunctionType[22] = w;
    arrayOfFunctionType[23] = x;
    arrayOfFunctionType[24] = y;
    arrayOfFunctionType[25] = z;
    arrayOfFunctionType[26] = A;
    arrayOfFunctionType[27] = B;
    arrayOfFunctionType[28] = C;
    arrayOfFunctionType[29] = D;
    arrayOfFunctionType[30] = E;
    arrayOfFunctionType[31] = F;
    arrayOfFunctionType[32] = G;
    arrayOfFunctionType[33] = H;
    arrayOfFunctionType[34] = I;
    arrayOfFunctionType[35] = J;
    arrayOfFunctionType[36] = K;
    arrayOfFunctionType[37] = L;
    arrayOfFunctionType[38] = M;
    arrayOfFunctionType[39] = N;
    arrayOfFunctionType[40] = O;
    arrayOfFunctionType[41] = P;
    arrayOfFunctionType[42] = Q;
    arrayOfFunctionType[43] = R;
    arrayOfFunctionType[44] = S;
    arrayOfFunctionType[45] = T;
    arrayOfFunctionType[46] = U;
    arrayOfFunctionType[47] = V;
    arrayOfFunctionType[48] = W;
    arrayOfFunctionType[49] = X;
    arrayOfFunctionType[50] = Y;
    arrayOfFunctionType[51] = Z;
    arrayOfFunctionType[52] = aa;
    arrayOfFunctionType[53] = ab;
    arrayOfFunctionType[54] = ac;
    arrayOfFunctionType[55] = ad;
    arrayOfFunctionType[56] = ae;
    arrayOfFunctionType[57] = af;
    arrayOfFunctionType[58] = ag;
    arrayOfFunctionType[59] = ah;
    arrayOfFunctionType[60] = ai;
    arrayOfFunctionType[61] = aj;
    arrayOfFunctionType[62] = ak;
    arrayOfFunctionType[63] = al;
    arrayOfFunctionType[64] = am;
    arrayOfFunctionType[65] = an;
    arrayOfFunctionType[66] = ao;
    arrayOfFunctionType[67] = ap;
    arrayOfFunctionType[68] = aq;
    arrayOfFunctionType[69] = ar;
    arrayOfFunctionType[70] = as;
    au = arrayOfFunctionType;
  }
  
  private FunctionType(String paramString)
  {
    this.at = paramString;
  }
  
  public String toString()
  {
    return this.at;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.containertag.common.FunctionType
 * JD-Core Version:    0.7.0.1
 */