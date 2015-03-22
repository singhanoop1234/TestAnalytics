package com.testanalytics;

import android.content.Context;

/**
 * Created by ANOOP SINGH on 3/22/2015.
 */
public class TestAnalytics {
    private static TestAnalytics ourInstance;
    private Context mContext;
    private TestAnalytics(Context pContext) {
        mContext = pContext;
    }
    public static TestAnalytics getInstance(Context pContext) {
        if(ourInstance == null){
            ourInstance = new TestAnalytics(pContext);
        }
        return ourInstance;
    }



}
