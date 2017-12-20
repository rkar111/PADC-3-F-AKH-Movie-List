package xyz.arkarhein.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.arkarhein.movieshelf.R;
import xyz.arkarhein.movieshelf.delegates.MoviesActionDelegate;
import xyz.arkarhein.movieshelf.viewholders.MoviesViewHolder;

/**
 * Created by Arkar Hein on 12/8/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter {

    private MoviesActionDelegate nMoviesActionDelegate;

    public MoviesAdapter(MoviesActionDelegate moviesActionDelegate) {
        nMoviesActionDelegate = moviesActionDelegate;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View moviesView = inflater.inflate(R.layout.items_movies, parent, false);
        MoviesViewHolder moviesViewHolder = new MoviesViewHolder(moviesView, nMoviesActionDelegate);
        return moviesViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
