package forspring;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Nothing else matter";
    }

    @Override
    public void playMusic() {
        System.out.println("Loud guitar's sound...");
    }
}
