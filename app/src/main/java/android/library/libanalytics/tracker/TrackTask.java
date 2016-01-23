package android.library.libanalytics.tracker;

import android.os.AsyncTask;

/**
 * Created by slomka.jin on 2016/1/22.
 */
public class TrackTask extends AsyncTask<Void,Integer,String> {
    private android.os.Handler handler;
    @Override
    protected String doInBackground(Void... voids) {
        return "done";
    }
}
