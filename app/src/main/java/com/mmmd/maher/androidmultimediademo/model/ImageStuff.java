package com.mmmd.maher.androidmultimediademo.model;

import android.net.Uri;

/**
 * Created by maher on 7/2/16.
 */
public class ImageStuff {
    private Uri imageResourceUrl;

    public ImageStuff(Uri imageResourceUrl) {
        this.imageResourceUrl = imageResourceUrl;
    }

    public Uri getImageResourceUrl() {
        return imageResourceUrl;
    }
}
