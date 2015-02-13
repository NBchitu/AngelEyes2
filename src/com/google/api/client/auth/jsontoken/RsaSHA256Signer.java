package com.google.api.client.auth.jsontoken;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Base64;
import com.google.api.client.util.StringUtils;
import java.security.PrivateKey;
import java.security.Signature;

public class RsaSHA256Signer
{
  public static String a(PrivateKey paramPrivateKey, JsonFactory paramJsonFactory, JsonWebSignature.Header paramHeader, JsonWebToken.Payload paramPayload)
  {
    String str = Base64.a(paramJsonFactory.c(paramHeader)) + "." + Base64.a(paramJsonFactory.c(paramPayload));
    byte[] arrayOfByte1 = StringUtils.a(str);
    Signature localSignature = Signature.getInstance("SHA256withRSA");
    localSignature.initSign(paramPrivateKey);
    localSignature.update(arrayOfByte1);
    byte[] arrayOfByte2 = localSignature.sign();
    return str + "." + Base64.a(arrayOfByte2);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.jsontoken.RsaSHA256Signer
 * JD-Core Version:    0.7.0.1
 */