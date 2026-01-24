package homeworks.session16;

import java.time.Duration;
import java.util.Objects;

public class Song {
    private String name;
    private String artist;
    private Duration duration;

    public Song(String artist, Duration duration, String name) {
        this.artist = artist;
        this.duration = duration;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Song song)) return false;
        return Objects.equals(name, song.name) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, artist);
    }
}

class MainSong{
    static void main(String[] args) {
        Song s1 = new Song("Florin Salam", Duration.ofMinutes(5).plusSeconds(2), "Ia-ma-n brate viata mea LIVE");
        Song s2 = new Song("Florin Salam", Duration.ofMinutes(5).plusSeconds(10), "Ia-ma-n brate viata mea LIVE");

        System.out.println(s1.equals(s2));
        if (s1.hashCode() == s2.hashCode())
            System.out.println(s1.hashCode());
        else System.out.println("The hashCode is not the same");
    }
}