package xyz.arkarhein.movieshelf.network.responces;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import xyz.arkarhein.movieshelf.data.vo.MoviesVO;

/**
 * Created by Arkar Hein on 1/1/2018.
 */

public class GetMoviesResponces {
    private int code;
    private String message;
    private String page;
    private String apiVersion;

    @SerializedName("popular-movies")
    private List<MoviesVO> popularMovies;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getPage() {
        return page;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public List<MoviesVO> getPopularMovies() {
        return popularMovies;
    }
}
