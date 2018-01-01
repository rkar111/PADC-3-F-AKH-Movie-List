package xyz.arkarhein.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import xyz.arkarhein.movieshelf.R;
import xyz.arkarhein.movieshelf.data.vo.MoviesVO;
import xyz.arkarhein.movieshelf.delegates.MoviesActionDelegate;
import xyz.arkarhein.movieshelf.viewholders.MoviesViewHolder;

/**
 * Created by Arkar Hein on 12/8/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesViewHolder> {

    private MoviesActionDelegate nMoviesActionDelegate;

    private List<MoviesVO> mMoviesList;

    public MoviesAdapter(MoviesActionDelegate moviesActionDelegate) {
        nMoviesActionDelegate = moviesActionDelegate;
        mMoviesList = new ArrayList<>();
    }

    @Override
    public MoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View moviesView = inflater.inflate(R.layout.items_movies, parent, false);
        MoviesViewHolder moviesViewHolder = new MoviesViewHolder(moviesView, nMoviesActionDelegate);
        return moviesViewHolder;
    }

    @Override
    public void onBindViewHolder(MoviesViewHolder holder, int position) {
        holder.setMovies(mMoviesList.get(position));
    }

    @Override
    public int getItemCount() {
        return mMoviesList.size();
    }

    public void setMovies(List<MoviesVO> moviesList) {
        mMoviesList = moviesList;
        notifyDataSetChanged();
    }
}
