package forspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{

    public void init(){
        System.out.println("Initialization...");
    }

    public void destroy(){
        System.out.println("Destroying...");
    }

    @Override
    public List<String> getSong() {
        List<String> songNames = new ArrayList<>();
        songNames.add("Nothing else matter");
        songNames.add("Show me what you got");
        songNames.add("Bullet");
        return songNames;
    }

    @Override
    public void playMusic() {
        System.out.println("Loud guitar's sound...");
    }
}
