package com.example.android.miwok;

/**
 * Created by pshre on 1/20/2018.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mMiwokWord;
    private String mDefaultWord;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String miwokWord, String defaultWord, int audioResourceId) {
        this.mMiwokWord = miwokWord;
        this.mDefaultWord = defaultWord;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String miwokWord, String defaultWord, int imageResourceId, int audioResourceId) {
        this.mMiwokWord = miwokWord;
        this.mDefaultWord = defaultWord;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public String getmMiwokWord() {
        return mMiwokWord;
    }

    public String getmDefaultWord() {
        return mDefaultWord;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
