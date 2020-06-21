package HumanBeings;

import java.util.List;

public class Musician extends Human {
    private String MusicSchool;
    private String genre;
    private List<String> Songs;

    public Musician(String name, int age, int height, String musicSchool, String genre, List<String> songs) {
        super(name, age, height);
        MusicSchool = musicSchool;
        this.genre = genre;
        Songs = songs;
    }

    @Override
    public int YearLeftTOLive() {
        return ( LifeSpan -getAge());
    }

    public String getMusicSchool() {
        return MusicSchool;
    }

    public void setMusicSchool(String musicSchool) {
        MusicSchool = musicSchool;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getSongs() {
        return Songs;
    }

    public void setSongs(List<String> songs) {
        Songs = songs;
    }
}

