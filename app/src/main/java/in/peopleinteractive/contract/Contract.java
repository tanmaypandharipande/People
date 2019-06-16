package in.peopleinteractive.contract;

import android.content.Context;

import java.util.List;

import in.peopleinteractive.model.pojo.RandomUser;

/**
 * Created by tanmay on 16/06/19.
 */

public class Contract {

    public interface View {
        void onGetDataSuccess(String message, List<RandomUser> list);

        void onGetDataFailure(String message);

        void onRecyclerClick(int position, List<RandomUser> scanList, android.view.View view, Context context);
    }

    public interface Presenter {
        void getDataFromURL(Context context, String url);
    }

    public interface Interactor {
        void initVolleyCall(Context context, String url);

    }

    public interface onGetDataListener {
        void onSuccess(String message, List<RandomUser> list);

        void onFailure(String message);
    }

}
