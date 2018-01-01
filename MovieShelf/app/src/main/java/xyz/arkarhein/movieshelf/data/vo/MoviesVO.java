package xyz.arkarhein.movieshelf.data.vo;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Arkar Hein on 12/20/2017.
 */

public class MoviesVO {

    @SerializedName("vote_count")
    private int voteCount;
    private int id;
    private Boolean video;

    @SerializedName("vote_average")
    private Double voteAverage;
    private String title;
    private Double popularity;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("original_language")
    private String originalLanguage;

    @SerializedName("original_title")
    private String originalTitle;

    @SerializedName("genre_ids")
    private int[] genreId;

    @SerializedName("backdrop_path")
    private String backDropPath;
    private Boolean adult;
    private String overview;

    @SerializedName("release_date")
    private String releaseDate;

    public int getVoteCount() {
        return voteCount;
    }

    public int getId() {
        return id;
    }

    public Boolean getVideo() {
        return video;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public Double getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public int[] getGenreId() {
        return genreId;
    }

    public String getBackDropPath() {
        return backDropPath;
    }

    public Boolean getAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
