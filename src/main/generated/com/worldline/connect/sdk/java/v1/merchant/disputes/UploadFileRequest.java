/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.disputes;

import com.worldline.connect.sdk.java.communication.MultipartFormDataObject;
import com.worldline.connect.sdk.java.communication.MultipartFormDataRequest;
import com.worldline.connect.sdk.java.domain.UploadableFile;

/**
 * Multipart/form-data parameters for
 * <a href="https://apireference.connect.worldline-solutions.com/fileserviceapi/v1/en_US/java/disputes/uploadFile.html">Upload File</a>
 */
public class UploadFileRequest implements MultipartFormDataRequest {

    private UploadableFile file;

    /**
     * The file that you will upload as evidence to support a dispute.
     */
    public UploadableFile getFile() {
        return file;
    }

    /**
     * The file that you will upload as evidence to support a dispute.
     */
    public void setFile(UploadableFile value) {
        this.file = value;
    }

    @Override
    public MultipartFormDataObject toMultipartFormDataObject() {
        MultipartFormDataObject result = new MultipartFormDataObject();
        if (file != null) {
            result.addFile("file", file);
        }
        return result;
    }
}
