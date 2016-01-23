package com.android.system.report;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import java.util.concurrent.ExecutionException;


/**
 * Created by slomka.jin on 2016/1/22.
 */
public class ReportSDK extends Thread {

    private Activity context;

    public ReportSDK(Activity context){
        this.context=context;
    }
    @Override
    public void run() {
        context.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ReportUtils reportUtils=new ReportUtils();
                try {
                    String report=reportUtils.reportData();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });



    }
}
