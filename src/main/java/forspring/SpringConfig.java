package forspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@ComponentScan("forspring")
@PropertySource("musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public JazzMusic getJazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public RockMusic getRockMusic(){
        return new RockMusic();
    }

    @Bean
    public MusicPlayer getMusicPlayer(){
        return new MusicPlayer(List.<Music>of(getClassicalMusic(), getJazzMusic(), getRockMusic()));
    }

}
