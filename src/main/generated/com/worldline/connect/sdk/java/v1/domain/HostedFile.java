/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * File items.
 */
public class HostedFile {

    private String fileName = null;

    private String fileSize = null;

    private String fileType = null;

    private String id = null;

    /**
     * The name of the file.
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * The name of the file.
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * The size of the file in bytes.
     */
    public String getFileSize() {
        return fileSize;
    }

    /**
     * The size of the file in bytes.
     */
    public void setFileSize(String value) {
        this.fileSize = value;
    }

    /**
     * The type of the file.
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * The type of the file.
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * The numeric identifier of the file.
     */
    public String getId() {
        return id;
    }

    /**
     * The numeric identifier of the file.
     */
    public void setId(String value) {
        this.id = value;
    }
}
