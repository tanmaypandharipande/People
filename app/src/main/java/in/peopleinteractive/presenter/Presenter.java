package in.peopleinteractive.presenter;

import android.content.Context;

import java.util.List;

import in.peopleinteractive.contract.Contract;
import in.peopleinteractive.model.pojo.RandomUser;

/**
 * Created by tanmay on 16/06/19.
 */

public class Presenter implements Contract.Presenter, Contract.onGetDataListener {
    @Override
    public void getDataFromURL(Context context, String url) {

    }

    @Override
    public void onSuccess(String message, List<RandomUser> list) {

    }

    @Override
    public void onFailure(String message) {

    }
}
