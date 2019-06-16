package in.peopleinteractive.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import in.peopleinteractive.R;
import in.peopleinteractive.adapter.RandomUserAdapter;
import in.peopleinteractive.adapter.RecyclerPresenter;
import in.peopleinteractive.contract.Contract;
import in.peopleinteractive.helper.Utilities;
import in.peopleinteractive.model.pojo.RandomUser;
import in.peopleinteractive.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements Contract.View {
    private Presenter mPresenter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerPresenter recyclerPresenter;
    private RandomUserAdapter randomUserAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        mPresenter = new Presenter(this);
        mPresenter.getDataFromURL(MainActivity.this, "");
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void onGetDataSuccess(String message, List<RandomUser> list) {
        recyclerPresenter = new RecyclerPresenter(MainActivity.this, list);
        randomUserAdapter = new RandomUserAdapter(recyclerPresenter);
        recyclerView.setAdapter(randomUserAdapter);
    }

    @Override
    public void onGetDataFailure(String message) {
        Utilities.toast(message, MainActivity.this);
    }
}
