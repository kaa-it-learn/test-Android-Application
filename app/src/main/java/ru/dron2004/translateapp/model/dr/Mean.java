
package ru.dron2004.translateapp.model.dr;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mean {

    @SerializedName("text")
    @Expose
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
