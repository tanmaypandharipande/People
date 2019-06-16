package in.peopleinteractive.model;

import android.app.ProgressDialog;
import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import in.peopleinteractive.R;
import in.peopleinteractive.contract.Contract;
import in.peopleinteractive.helper.Utilities;
import in.peopleinteractive.helper.network.ServerErrorCallback;
import in.peopleinteractive.helper.network.ServerJSONObjectCallback;
import in.peopleinteractive.model.pojo.RandomUser;
import in.peopleinteractive.model.service.ApiService;

/**
 * Created by tanmay on 16/06/19.
 */

public class Interactor implements Contract.Interactor {
    private Contract.onGetDataListener mOnGetDatalistener;

    public Interactor(Contract.onGetDataListener mOnGetDatalistener) {
        this.mOnGetDatalistener = mOnGetDatalistener;
    }

    @Override
    public void initVolleyCall(Context context, String url) {
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        final List<RandomUser> randomUserList = new ArrayList<>();
        final ProgressDialog progressDialog = Utilities.showProgressDialog(context, context.getString(R.string.please_wait), context.getString(R.string.loading));
        progressDialog.show();
        new ApiService().getData(context, requestQueue, new ServerJSONObjectCallback() {
            @Override
            public void onSuccess(JsonObject result) {
                JsonArray array = result.getAsJsonArray("results");
                Gson gson = new Gson();
                for (int i = 0; i < array.size(); i++) {
                    String object = String.valueOf(array.get(i));
                    RandomUser scan = gson.fromJson(object, RandomUser.class);
                    randomUserList.add(scan);
                }
                progressDialog.dismiss();
                mOnGetDatalistener.onSuccess("Success", randomUserList);
            }
        }, null, new ServerErrorCallback() {
            @Override
            public void onFailure(VolleyError error) {
                progressDialog.dismiss();
                mOnGetDatalistener.onFailure("Failure");
            }
        });
    }
}
