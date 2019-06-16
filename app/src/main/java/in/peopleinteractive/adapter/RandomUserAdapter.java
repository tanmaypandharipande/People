package in.peopleinteractive.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import in.peopleinteractive.R;

/**
 * Created by tanmay on 16/06/19.
 */

public class RandomUserAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private final RecyclerPresenter presenter;

    public RandomUserAdapter(RecyclerPresenter repositoriesPresenter) {
        this.presenter = repositoriesPresenter;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        presenter.onBindRepositoryRowViewAtPosition(position, holder, this);
    }

    @Override
    public int getItemCount() {
        return presenter.getRepositoriesRowsCount();
    }
}
