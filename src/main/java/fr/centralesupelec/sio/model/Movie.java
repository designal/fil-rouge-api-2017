package fr.centralesupelec.sio.model;

import java.util.EnumSet;

/**
 * An entity class for a movie.
 */
public class Movie {

    private long id;
    private String title;
    // MovieGenre is an enum, combinations of enums are best handled by EnumSet.
    private EnumSet<MovieGenre> genres;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EnumSet<MovieGenre> getGenres() {
        return genres;
    }

    public void setGenres(EnumSet<MovieGenre> genres) {
        this.genres = genres;
    }

}