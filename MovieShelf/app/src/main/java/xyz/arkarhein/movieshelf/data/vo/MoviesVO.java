package xyz.arkarhein.movieshelf.data.vo;


import java.util.List;

/**
 * Created by Arkar Hein on 12/20/2017.
 */

public class MoviesVO {

    private String voteCount;
    private String id;
    private Boolean video;
    private String voteAverage;
    private String title;
    private String popularity;
    private String posterPath;
    private String originalLanguage;
    private String originalTitle;
    private List<String> genreId;
    private String backDropPath;
    private Boolean adult;
    private String overview;
    private String releaseDate;

    public String getVoteCount() {
        return voteCount;
    }

    public String getId() {
        return id;
    }

    public Boolean getVideo() {
        return video;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public String getPopularity() {
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

    public List<String> getGenreId() {
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
