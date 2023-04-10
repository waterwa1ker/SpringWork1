package forspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class JazzMusic implements Music{

    public void init(){
        System.out.println("initialization...");
    }

    public void destroy(){
        System.out.println("destroying...");
    }

    @Override
    public List<String> getSong() {
        List<String> songNames = new ArrayList<>();
        songNames.add("firstJazz");
        songNames.add("secondJazz");
        songNames.add("thirdJazz");
        return songNames;
    }

    @Override
    public void playMusic() {
        System.out.println("Beautiful instrument's play...");
    }
}
