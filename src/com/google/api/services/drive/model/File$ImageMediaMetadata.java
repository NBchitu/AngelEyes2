package com.google.api.services.drive.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class File$ImageMediaMetadata
  extends GenericJson
{
  @Key
  private Float aperture;
  @Key
  private String cameraMake;
  @Key
  private String cameraModel;
  @Key
  private String date;
  @Key
  private Float exposureTime;
  @Key
  private Boolean flashUsed;
  @Key
  private Float focalLength;
  @Key
  private Integer height;
  @Key
  private Integer isoSpeed;
  @Key
  private File.ImageMediaMetadata.Location location;
  @Key
  private Integer rotation;
  @Key
  private Integer width;
  
  public Float getAperture()
  {
    return this.aperture;
  }
  
  public String getCameraMake()
  {
    return this.cameraMake;
  }
  
  public String getCameraModel()
  {
    return this.cameraModel;
  }
  
  public String getDate()
  {
    return this.date;
  }
  
  public Float getExposureTime()
  {
    return this.exposureTime;
  }
  
  public Boolean getFlashUsed()
  {
    return this.flashUsed;
  }
  
  public Float getFocalLength()
  {
    return this.focalLength;
  }
  
  public Integer getHeight()
  {
    return this.height;
  }
  
  public Integer getIsoSpeed()
  {
    return this.isoSpeed;
  }
  
  public File.ImageMediaMetadata.Location getLocation()
  {
    return this.location;
  }
  
  public Integer getRotation()
  {
    return this.rotation;
  }
  
  public Integer getWidth()
  {
    return this.width;
  }
  
  public ImageMediaMetadata setAperture(Float paramFloat)
  {
    this.aperture = paramFloat;
    return this;
  }
  
  public ImageMediaMetadata setCameraMake(String paramString)
  {
    this.cameraMake = paramString;
    return this;
  }
  
  public ImageMediaMetadata setCameraModel(String paramString)
  {
    this.cameraModel = paramString;
    return this;
  }
  
  public ImageMediaMetadata setDate(String paramString)
  {
    this.date = paramString;
    return this;
  }
  
  public ImageMediaMetadata setExposureTime(Float paramFloat)
  {
    this.exposureTime = paramFloat;
    return this;
  }
  
  public ImageMediaMetadata setFlashUsed(Boolean paramBoolean)
  {
    this.flashUsed = paramBoolean;
    return this;
  }
  
  public ImageMediaMetadata setFocalLength(Float paramFloat)
  {
    this.focalLength = paramFloat;
    return this;
  }
  
  public ImageMediaMetadata setHeight(Integer paramInteger)
  {
    this.height = paramInteger;
    return this;
  }
  
  public ImageMediaMetadata setIsoSpeed(Integer paramInteger)
  {
    this.isoSpeed = paramInteger;
    return this;
  }
  
  public ImageMediaMetadata setLocation(File.ImageMediaMetadata.Location paramLocation)
  {
    this.location = paramLocation;
    return this;
  }
  
  public ImageMediaMetadata setRotation(Integer paramInteger)
  {
    this.rotation = paramInteger;
    return this;
  }
  
  public ImageMediaMetadata setWidth(Integer paramInteger)
  {
    this.width = paramInteger;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.model.File.ImageMediaMetadata
 * JD-Core Version:    0.7.0.1
 */