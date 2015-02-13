package com.google.api.client.googleapis.media;

import com.google.api.client.http.ExponentialBackOffPolicy;

class MediaUploadExponentialBackOffPolicy
  extends ExponentialBackOffPolicy
{
  private final MediaHttpUploader b;
  
  MediaUploadExponentialBackOffPolicy(MediaHttpUploader paramMediaHttpUploader)
  {
    this.b = paramMediaHttpUploader;
  }
  
  public long a()
  {
    this.b.a();
    return super.a();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.media.MediaUploadExponentialBackOffPolicy
 * JD-Core Version:    0.7.0.1
 */