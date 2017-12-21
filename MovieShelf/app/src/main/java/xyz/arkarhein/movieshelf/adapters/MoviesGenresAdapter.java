package xyz.arkarhein.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.arkarhein.movieshelf.R;
import xyz.arkarhein.movieshelf.viewholders.MoviesGenreViewHolder;

/**
 * Created by Arkar Hein on 12/21/2017.
 */

public class MoviesGenresAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View moviesGenreView = layoutInflater.inflate(R.layout.item_movies_genres, parent, false);
        MoviesGenreViewHolder moviesGenreViewHolder = new MoviesGenreViewHolder(moviesGenreView);
        return moviesGenreViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
