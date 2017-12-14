package xyz.arkarhein.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.arkarhein.movieshelf.R;
import xyz.arkarhein.movieshelf.viewholders.MoviesReviewsViewHolder;

/**
 * Created by Arkar Hein on 12/15/2017.
 */

public class MoviesReviewsAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View moviesReviewsView = layoutInflater.inflate(R.layout.movies_trailers_items, parent, false);
        MoviesReviewsViewHolder moviesReviewsViewHolder = new MoviesReviewsViewHolder(moviesReviewsView);
        return moviesReviewsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
