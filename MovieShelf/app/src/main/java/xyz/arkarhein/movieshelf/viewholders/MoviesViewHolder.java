package xyz.arkarhein.movieshelf.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.arkarhein.movieshelf.R;
import xyz.arkarhein.movieshelf.data.vo.MoviesVO;
import xyz.arkarhein.movieshelf.delegates.MoviesActionDelegate;

/**
 * Created by Arkar Hein on 12/8/2017.
 */

public class MoviesViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_movie_name)
    TextView tvMovieName;

    @BindView(R.id.tv_movie_rating)
    TextView tvMovieRating;

    @BindView(R.id.iv_poster)
    ImageView ivPoster;


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

    public void setMovies(MoviesVO movies) {
        tvMovieName.setText(movies.getTitle());
        tvMovieRating.setText(movies.getVoteAverage().toString());

        if (movies.getPosterPath() != null) {
            ivPoster.setVisibility(View.VISIBLE);
            Glide.with(ivPoster.getContext())
                    .load("http://image.tmdb.org/t/p/original" + movies.getPosterPath())
                    .into(ivPoster);
        } else {
            ivPoster.setVisibility(View.GONE);
        }


    }
}
