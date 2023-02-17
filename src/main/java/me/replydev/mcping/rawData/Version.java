package me.replydev.mcping.rawData;

import com.google.gson.annotations.SerializedName;

public class Version {
    @SerializedName("name")
    private String name;
    @SerializedName("protocol")
    private int protocol;

    public String getName() {
        return this.name;
    }

    public void setName(String a) {
        name = a;
    }
}
