package android.library.libanalytics.tracker;

import java.util.concurrent.ExecutionException;

/**
 * Created by slomka.jin on 2016/1/22.
 */
public class TrackerImpl {

    public String logTextContent() throws ExecutionException, InterruptedException {
        return new TrackTask().execute().get();
    }
}
