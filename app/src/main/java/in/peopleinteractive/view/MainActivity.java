package in.peopleinteractive.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import in.peopleinteractive.R;
import in.peopleinteractive.contract.Contract;
import in.peopleinteractive.model.pojo.RandomUser;

public class MainActivity extends AppCompatActivity implements Contract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onGetDataSuccess(String message, List<RandomUser> list) {

    }

    @Override
    public void onGetDataFailure(String message) {

    }

    @Override
    public void onRecyclerClick(int position, List<RandomUser> scanList, View view, Context context) {

    }
}
