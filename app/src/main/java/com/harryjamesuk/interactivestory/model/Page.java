package com.harryjamesuk.interactivestory.model;

/**
 * Created by Harry on 22/03/2015.
 */
public class Page {

    private int mImageId;
    private String mText;
    private Choices mChoices;
    private boolean mIsFinal = false;

    public Page(int imageId, String text, Choices choices) {
        mImageId = imageId;
        mText = text;
        mChoices = choices;
    }

    public Page(int imageId, String text) {
        mImageId = imageId;
        mText = text;
        mChoices = null;
        mIsFinal = true;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choices getChoices() {
        return mChoices;
    }

    public void setChoices(Choices choices) {
        mChoices = choices;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

}
