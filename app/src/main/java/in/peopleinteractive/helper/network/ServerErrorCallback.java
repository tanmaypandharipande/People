package in.peopleinteractive.helper.network;

import com.android.volley.VolleyError;

/**
 * Created by tanmay on 16/06/19.
 */

public interface ServerErrorCallback {
    void onFailure(VolleyError error);
}
