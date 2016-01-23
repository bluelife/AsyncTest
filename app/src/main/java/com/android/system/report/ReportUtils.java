package com.android.system.report;

import android.library.libanalytics.tracker.TrackerImpl;

import java.util.concurrent.ExecutionException;

/**
 * Created by slomka.jin on 2016/1/22.
 */
public class ReportUtils {

    public String reportData() throws ExecutionException, InterruptedException {
        return new TrackerImpl().logTextContent();
    }
}
