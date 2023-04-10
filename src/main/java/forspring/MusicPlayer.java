package forspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


@Component
public class MusicPlayer {

    private Music music;
    private Music music2;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music,
                       @Qualifier("rockMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(MusicEnum musicEnum){
        if (musicEnum == MusicEnum.CLASSICAL){
            List<String> songNames = music.getSong();
            Random random = new Random();
            System.out.println(songNames.get(random.nextInt(songNames.size())));
        }
        else if (musicEnum == MusicEnum.ROCK){
            List<String> songNames = music2.getSong();
            Random random = new Random();
            System.out.println(songNames.get(random.nextInt(songNames.size())));
        }
    }
}
