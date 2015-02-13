package com.google.api.services.drive.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class File$ImageMediaMetadata$Location
  extends GenericJson
{
  @Key
  private Double altitude;
  @Key
  private Double latitude;
  @Key
  private Double longitude;
  
  public Double getAltitude()
  {
    return this.altitude;
  }
  
  public Double getLatitude()
  {
    return this.latitude;
  }
  
  public Double getLongitude()
  {
    return this.longitude;
  }
  
  public Location setAltitude(Double paramDouble)
  {
    this.altitude = paramDouble;
    return this;
  }
  
  public Location setLatitude(Double paramDouble)
  {
    this.latitude = paramDouble;
    return this;
  }
  
  public Location setLongitude(Double paramDouble)
  {
    this.longitude = paramDouble;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.model.File.ImageMediaMetadata.Location
 * JD-Core Version:    0.7.0.1
 */