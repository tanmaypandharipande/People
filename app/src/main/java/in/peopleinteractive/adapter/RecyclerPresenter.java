package in.peopleinteractive.adapter;

import android.content.Context;

import java.util.List;

import in.peopleinteractive.contract.Contract;
import in.peopleinteractive.model.pojo.RandomUser;

/**
 * Created by tanmay on 16/06/19.
 */

public class RecyclerPresenter {

    private final List<RandomUser> list;
    private Context context;

    public RecyclerPresenter(Context context, List<RandomUser> repositories) {
        this.list = repositories;
        this.context = context;

    }

    public void onBindRepositoryRowViewAtPosition(int position, Contract.RepositoryRowView rowView, RandomUserAdapter randomUserAdapter) {
        rowView.setName(list.get(position).getNameBean().getFirst() + " " + list.get(position).getNameBean().getLast());
        rowView.setDetails(list.get(position).getLocation().getStreet() + " " + list.get(position).getLocation().getState() + " " + list.get(position).getLocation().getCity() + "\n" + list.get(position).getEmail());
        rowView.setImage(context, list.get(position).getPicture().getMedium());
        rowView.setButtonClick(context, list, position, randomUserAdapter);
        rowView.setDeclineButtonClick(context, list, position, randomUserAdapter);

    }

    public int getRepositoriesRowsCount() {
        return list.size();
    }
}

