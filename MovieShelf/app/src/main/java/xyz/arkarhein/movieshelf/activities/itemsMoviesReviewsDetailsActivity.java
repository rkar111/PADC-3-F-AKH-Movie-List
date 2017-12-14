package xyz.arkarhein.movieshelf.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.arkarhein.movieshelf.R;
import xyz.arkarhein.movieshelf.adapters.MoviesReviewsAdapter;

/**
 * Created by Arkar Hein on 12/15/2017.
 */

public class itemsMoviesReviewsDetailsActivity extends AppCompatActivity {

    @BindView(R.id.rv_movies_trailers)
    RecyclerView rvMoviesTrailers;

    private MoviesReviewsAdapter nMoviesReviewsAdapter = new MoviesReviewsAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_movies_details);
        ButterKnife.bind(this, this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvMoviesTrailers.setLayoutManager(linearLayoutManager);
        rvMoviesTrailers.setAdapter(nMoviesReviewsAdapter);

    }
}
