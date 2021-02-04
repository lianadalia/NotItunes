package no.noroff.sean.fakeapi.models;

public class Artist {
    private String artistName;
    private String genre;

    public Artist(String artistName, String genre) {
        this.artistName = artistName;
        this.genre = genre;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}