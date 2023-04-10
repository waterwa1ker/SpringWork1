package forspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {

    public ClassicalMusic(){}


    @Override
    public List<String> getSong() {
        List<String> songNames = new ArrayList<>();
        songNames.add("first");
        songNames.add("second");
        songNames.add("third");
        return songNames;

    }

    @Override
    public void playMusic() {
        System.out.println("Peaceful woman's voice...");
    }
}
