package com.example.emobilis.customlist;

/**
 * Created by emobilis on 7/25/18.
 */

public class Custom {
    int images;
    String names,descption;

    public Custom(int images, String names, String descption) {
        this.images = images;
        this.names = names;
        this.descption = descption;
    }

    public int getImages() {
        return images;
    }

    public String getNames() {
        return names;
    }

    public String getDescption() {
        return descption;
    }
}
