package xyz.arkarhein.movieshelf.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.arkarhein.movieshelf.R;
import xyz.arkarhein.movieshelf.delegates.MoviesActionDelegate;

/**
 * Created by Arkar Hein on 12/8/2017.
 */

public class MoviesViewHolder extends RecyclerView.ViewHolder {

    private MoviesActionDelegate nMoviesActionDelegate;

    public MoviesViewHolder(View itemView, MoviesActionDelegate moviesActionDelegate) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        nMoviesActionDelegate = moviesActionDelegate;
    }

    @OnClick(R.id.cv_movies_items)
    public void onTapMoviesItem(View v) {
        nMoviesActionDelegate.onTapMovies();
    }
}
