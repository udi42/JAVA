package Program4.prog4;

public class Main {
    public static void main(String[] args) {
        int numberOfRepeats = 5; // Number of times to repeat the playback
        for (int i = 0; i < numberOfRepeats; i++) {
            MediaPlayer player = new MP3Player();
            player.play("Test mp3file.mp3");

            // Sleep for a while
            sleep(2000); // Sleep for 2 seconds

            player = new MediaPlayerAdapter(new MP4Player());
            player.play("test mp4file.mp4");
        }
    }
    // Helper method for sleeping
    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
