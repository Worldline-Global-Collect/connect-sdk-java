/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class AccountOnFileDisplayHints {

    private List<LabelTemplateElement> labelTemplate;

    private String logo;

    /**
     * Array of attribute keys and their mask
     */
    public List<LabelTemplateElement> getLabelTemplate() {
        return labelTemplate;
    }

    /**
     * Array of attribute keys and their mask
     */
    public void setLabelTemplate(List<LabelTemplateElement> value) {
        this.labelTemplate = value;
    }

    /**
     * Partial URL that you can reference for the image of this payment product. You can use our server-side resize functionality by appending '?size={{width}}x{{height}}' to the full URL, where width and height are specified in pixels. The resized image will always keep its correct aspect ratio.
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Partial URL that you can reference for the image of this payment product. You can use our server-side resize functionality by appending '?size={{width}}x{{height}}' to the full URL, where width and height are specified in pixels. The resized image will always keep its correct aspect ratio.
     */
    public void setLogo(String value) {
        this.logo = value;
    }
}
