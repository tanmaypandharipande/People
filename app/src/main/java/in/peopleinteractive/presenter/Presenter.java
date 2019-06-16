package in.peopleinteractive.presenter;

import android.content.Context;

import java.util.List;

import in.peopleinteractive.contract.Contract;
import in.peopleinteractive.model.Interactor;
import in.peopleinteractive.model.pojo.RandomUser;

/**
 * Created by tanmay on 16/06/19.
 */

public class Presenter implements Contract.Presenter, Contract.onGetDataListener {

    private Contract.View mGetDataView;
    private Interactor mIntractor;


    public Presenter(Contract.View mGetDataView) {
        this.mGetDataView = mGetDataView;
        mIntractor = new Interactor(this);
    }

    @Override
    public void getDataFromURL(Context context, String url) {
        mIntractor.initVolleyCall(context, "");
    }

    @Override
    public void onSuccess(String message, List<RandomUser> list) {
        mGetDataView.onGetDataSuccess(message, list);
    }

    @Override
    public void onFailure(String message) {
        mGetDataView.onGetDataFailure(message);
    }
}
