package xyz.arkarhein.movieshelf.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.arkarhein.movieshelf.R;
import xyz.arkarhein.movieshelf.adapters.MoviesGenresAdapter;
import xyz.arkarhein.movieshelf.adapters.MoviesReviewsAdapter;

/**
 * Created by Arkar Hein on 12/15/2017.
 */

public class ItemsMoviesReviewsDetailsActivity extends AppCompatActivity {

    @BindView(R.id.rv_movies_trailers)
    RecyclerView rvMoviesTrailers;

    @BindView(R.id.rv_movie_genre)
    RecyclerView rvMoviesGenres;

    private MoviesReviewsAdapter nMoviesReviewsAdapter = new MoviesReviewsAdapter();

    private MoviesGenresAdapter nMoviesGenresAdapter = new MoviesGenresAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        setContentView(R.layout.items_movies_details);
        ButterKnife.bind(this, this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvMoviesTrailers.setLayoutManager(linearLayoutManager);
        rvMoviesTrailers.setAdapter(nMoviesReviewsAdapter);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvMoviesGenres.setLayoutManager(linearLayoutManager1);
        rvMoviesGenres.setAdapter(nMoviesGenresAdapter);

    }
}
