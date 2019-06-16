package in.peopleinteractive.helper.network;

import com.google.gson.JsonObject;

/**
 * Created by tanmay on 16/06/19.
 */

public interface ServerJSONObjectCallback {
    void onSuccess(JsonObject result);
}
