package xyz.arkarhein.movieshelf.data.model;

import xyz.arkarhein.movieshelf.network.HttpUrlConnectionDataAgent;
import xyz.arkarhein.movieshelf.network.MoviesDataAgent;

/**
 * Created by Arkar Hein on 1/1/2018.
 */

public class MoviesModel {

    private static MoviesModel sObjInstance;

    private MoviesDataAgent mMoviesDataAgent;

    private MoviesModel() {
        mMoviesDataAgent = HttpUrlConnectionDataAgent.getsObjInstance();
    }

    public static MoviesModel getsObjInstance() {
        if (sObjInstance == null) {
            sObjInstance = new MoviesModel();
        }
        return sObjInstance;
    }

    public void loadMovies() {
        mMoviesDataAgent.loadMovies();
    }

}
