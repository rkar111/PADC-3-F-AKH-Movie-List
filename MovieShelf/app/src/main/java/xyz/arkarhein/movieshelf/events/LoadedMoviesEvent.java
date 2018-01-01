package xyz.arkarhein.movieshelf.events;

import java.util.List;

import xyz.arkarhein.movieshelf.data.vo.MoviesVO;

/**
 * Created by Arkar Hein on 1/1/2018.
 */

public class LoadedMoviesEvent {

    private List<MoviesVO> moviesList;

    public LoadedMoviesEvent(List<MoviesVO> moviesList) {
        this.moviesList = moviesList;
    }

    public List<MoviesVO> getMoviesList() {
        return moviesList;
    }

}
