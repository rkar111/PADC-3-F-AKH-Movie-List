package xyz.arkarhein.movieshelf.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.arkarhein.movieshelf.MoviesApp;
import xyz.arkarhein.movieshelf.R;
import xyz.arkarhein.movieshelf.adapters.MoviesAdapter;
import xyz.arkarhein.movieshelf.data.model.MoviesModel;
import xyz.arkarhein.movieshelf.delegates.MoviesActionDelegate;
import xyz.arkarhein.movieshelf.events.LoadedMoviesEvent;

public class MainActivity extends AppCompatActivity implements MoviesActionDelegate {

    @BindView(R.id.rv_movies)
    RecyclerView rvMovies;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.fab)
    FloatingActionButton fab;

    private MoviesAdapter mMoviesAdapter = new MoviesAdapter(this);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, this);

        setSupportActionBar(toolbar);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvMovies.setLayoutManager(linearLayoutManager);
        rvMovies.setAdapter(mMoviesAdapter);

        MoviesModel.getsObjInstance().loadMovies();

    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.fab)
    public void onClickFab(View view) {
        Snackbar.make(view, "Search feature coming soon", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    @Override
    public void onTapMovies() {
        Intent intent = new Intent(getApplicationContext(), ItemsMoviesReviewsDetailsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onTapMovieOverviewsBtn() {

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMoviesLoaded(LoadedMoviesEvent event) {
        Log.d(MoviesApp.LOG_TAG, "onMoviesLoaded" + event.getMoviesList().size());
        mMoviesAdapter.setMovies(event.getMoviesList());
    }

}
