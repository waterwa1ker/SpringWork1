package forspring;

public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "Random jazz song";
    }

    @Override
    public void playMusic() {
        System.out.println("Beautiful instrument's play...");
    }
}
