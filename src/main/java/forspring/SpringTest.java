package forspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class SpringTest {
    public static void main(String[] args) {
        //example for classical music
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("getMusicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
