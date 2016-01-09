package com.harryjamesuk.interactivestory.model;

/**
 * Created by Harry on 22/03/2015.
 */
public class Choices {

    private String mText1;
    private String mText2;

    private int mPreviousPage;
    private int mNextPage;

    public Choices(int currentPage, String text1, String text2) {
        mPreviousPage = currentPage - 1;
        mText1 = text1;
        mNextPage = currentPage + 1;
        // Don't use currentPage++ here, it doesn't work for some reason :s
        mText2 = text2;
    }

    public String getText1() {
        return mText1;
    }

    public void setText1(String text1) {
        mText1 = text1;
    }

    public String getText2() {
        return mText2;
    }

    public void setText2(String text2) {
        mText2 = text2;
    }

    public int getPreviousPage() {
        return mPreviousPage;
    }

    public void setPreviousPage(int previousPage) {
        mPreviousPage = previousPage;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
