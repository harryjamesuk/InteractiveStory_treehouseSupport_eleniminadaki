package com.harryjamesuk.interactivestory.model;

/**
 * Created by Harry on 22/03/2015.
 */
public class Page {

    private int mPageId;
    private int mImageId;
    private String mText;
    private Choices mChoices;
    private boolean mIsSingle = false;

    public Page(int pageId, int imageId, String text, Choices choices) {
        mPageId = pageId;
        mImageId = imageId;
        mText = text;
        mChoices = choices;
    }

    public Page(int pageId, int imageId, String text) {
        mPageId = pageId;
        mImageId = imageId;
        mText = text;
        mChoices = null;
        mIsSingle = true;
    }

    public int getPageId() {
        return mPageId;
    }

    public void setPageId(int pageId) {
        mPageId = pageId;
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

    public boolean isSingle() {
        return mIsSingle;
    }

    public void setSingle(boolean isFinal) {
        mIsSingle = isFinal;
    }

}
