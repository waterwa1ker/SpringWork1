package forspring;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Bohemian rhapsody";
    }

    @Override
    public void playMusic() {
        System.out.println("Peaceful woman's voice...");
    }
}
