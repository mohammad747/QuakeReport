package com.hfad.quakereport;

public class Earthquake {


    private double mMag;
    private String mCitySplit1;
    private String mCitySplit2;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    /** Website URL of the earthquake */
    private String mUrl;


    public Earthquake(double mag, String CitySplit1, String CitySplit2, long timeInMilliseconds, String url){

        mMag = mag;

        mCitySplit1 = CitySplit1;

        mCitySplit2 = CitySplit2;

        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;

    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public double getmMag() {
        return mMag;
    }

    public String getmCitySplit1() {
        return mCitySplit1;
    }

    public String getmCitySplit2() {
        return mCitySplit2;
    }

    public String getUrl() {
        return mUrl;
    }
}
