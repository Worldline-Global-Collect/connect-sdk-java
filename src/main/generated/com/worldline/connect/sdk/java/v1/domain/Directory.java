/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class Directory {

    private List<DirectoryEntry> entries;

    /**
     * List of entries in the directory
     */
    public List<DirectoryEntry> getEntries() {
        return entries;
    }

    /**
     * List of entries in the directory
     */
    public void setEntries(List<DirectoryEntry> value) {
        this.entries = value;
    }
}
