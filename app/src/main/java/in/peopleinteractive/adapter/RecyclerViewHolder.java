package in.peopleinteractive.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import in.peopleinteractive.R;
import in.peopleinteractive.contract.Contract;
import in.peopleinteractive.model.pojo.RandomUser;

/**
 * Created by tanmay on 16/06/19.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements Contract.RepositoryRowView {

    TextView textViewName, textViewDetails;
    ImageView imageView, imageView_connect, imageView_decline;
    View itemView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
        textViewName = itemView.findViewById(R.id.textView);
        textViewDetails = itemView.findViewById(R.id.textView2);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
        imageView_connect = (ImageView) itemView.findViewById(R.id.button_connect);
        imageView_decline = (ImageView) itemView.findViewById(R.id.button_decline);
    }

    @Override
    public void setName(String title) {
        textViewName.setText(title);
    }

    @Override
    public void setDetails(String details) {
        textViewDetails.setText(details);
    }

    @Override
    public void setImage(Context context, String imageURL) {
        Glide.with(context).load(imageURL).apply(RequestOptions.circleCropTransform()).into(imageView);
    }

    @Override
    public void setButtonClick(final Context context, final List<RandomUser> randomUserList, final int position, final RandomUserAdapter randomUserAdapter) {
        imageView_connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(context, R.anim.anim);
                anim.setDuration(800);
                itemView.startAnimation(anim);
                removeAt(position, randomUserAdapter, randomUserList);
            }
        });
    }

    @Override
    public void setDeclineButtonClick(final Context context, final List<RandomUser> randomUserList, final int position, final RandomUserAdapter randomUserAdapter) {
        imageView_decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(context, R.anim.anim_left);
                anim.setDuration(800);
                itemView.startAnimation(anim);
                removeAt(position, randomUserAdapter, randomUserList);
            }
        });
    }

    private void removeAt(int position, RandomUserAdapter randomUserAdapter, List<RandomUser> randomUserList) {
        randomUserList.remove(position);
        randomUserAdapter.notifyItemRemoved(position);
        randomUserAdapter.notifyItemRangeChanged(position, randomUserList.size());
    }
}
