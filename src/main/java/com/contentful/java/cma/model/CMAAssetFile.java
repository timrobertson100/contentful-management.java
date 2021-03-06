package com.contentful.java.cma.model;

/**
 * Description of a file on the asset system of Contentful.
 */
public class CMAAssetFile {
  /**
   * Read only structure, detailing the content of the asset uploaded.
   */
  public static class Details {
    /**
     * Optional readonly structure, filled with information by Contentful, if the asset is an image.
     */
    public static class ImageMeta {
      Long width;
      Long height;

      /**
       * @return width of the image in pixel.
       */
      public Long getWidth() {
        return width;
      }

      /**
       * @return height of the image in pixel.
       */
      public Long getHeight() {
        return height;
      }
    }

    Long size;
    ImageMeta imageMeta;

    /**
     * @return size of the asset in bytes.
     */
    public Long getSize() {
      return size;
    }

    /**
     * @return image meta information, if present.
     */
    public ImageMeta getImageMeta() {
      return imageMeta;
    }
  }

  String contentType;
  Details details;
  String url;
  String upload;
  String fileName;
  CMALink uploadFrom;

  /**
   * Return the public accessible url of this asset.
   * <p>
   * This url only exists, if the asset is uploaded and processed
   * {@link com.contentful.java.cma.ModuleAssets#process(CMAAsset, String)}.
   *
   * @return the string representing a url without the protocol.
   */
  public String getUrl() {
    return url;
  }

  /**
   * @return a url the asset will get downloaded from Contentful from.
   */
  public String getUploadUrl() {
    return upload;
  }

  /**
   * Set a public accessible url to be used for processing the binary data from.
   *
   * @return the calling instance for chaining.
   */
  public CMAAssetFile setUploadUrl(String upload) {
    this.upload = upload;
    return this;
  }

  /**
   * @return a link to the upload from {@link com.contentful.java.cma.ModuleUploads}
   */
  public CMALink getUploadFrom() {
    return uploadFrom;
  }

  /**
   * Set a link to a Contentful Upload entry, to be used for processing the binary data from.
   *
   * @return the calling instance for chaining.
   * @see com.contentful.java.cma.ModuleUploads
   */
  public CMAAssetFile setUploadFrom(CMALink uploadFrom) {
    this.uploadFrom = uploadFrom;
    return this;
  }

  /**
   * @return the details of the file uploaded.
   */
  public Details getDetails() {
    return details;
  }

  /**
   * @return the name of the file used.
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * Set a filename to be used for identifying the file.
   *
   * @param fileName the name of the file.
   * @return this instance, for ease of chaining.
   */
  public CMAAssetFile setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get the content type stored here.
   *
   * @return a content type description.
   * @see com.contentful.java.cma.Constants#DEFAULT_CONTENT_TYPE
   * @see com.contentful.java.cma.Constants#OCTET_STREAM_CONTENT_TYPE
   */
  public String getContentType() {
    return contentType;
  }

  /**
   * Set what content type is stored in this asset.
   *
   * @param contentType the content type used for this file.
   * @return the calling instance for easy chaining.
   * @see com.contentful.java.cma.Constants#DEFAULT_CONTENT_TYPE
   * @see com.contentful.java.cma.Constants#OCTET_STREAM_CONTENT_TYPE
   */
  public CMAAssetFile setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
}
