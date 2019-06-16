package in.peopleinteractive.contract;

import android.content.Context;

import java.util.List;

import in.peopleinteractive.adapter.RandomUserAdapter;
import in.peopleinteractive.model.pojo.RandomUser;

/**
 * Created by tanmay on 16/06/19.
 */

public class Contract {

    public interface View {
        void onGetDataSuccess(String message, List<RandomUser> list);

        void onGetDataFailure(String message);

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

    public interface RepositoryRowView {

        void setName(String title);

        void setDetails(String details);

        void setImage(Context context, String imageURL);

        void setButtonClick(Context context, List<RandomUser> randomUserList, int position, RandomUserAdapter randomUserAdapter);

        void setDeclineButtonClick(Context context, List<RandomUser> randomUserList, int position, RandomUserAdapter randomUserAdapter);
    }

}
