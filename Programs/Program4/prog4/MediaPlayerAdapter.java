package Program4.prog4;

// MediaPlayerAdapter is a class that adapts an AdvancedMediaPlayer to work with the MediaPlayer interface.
public class MediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    // Constructor for MediaPlayerAdapter that takes an AdvancedMediaPlayer as a parameter.
    public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    // Implementation of the play method from the MediaPlayer interface.
    @Override
    public void play(String filename) {
        // Display a message indicating that MediaPlayerAdapter is being used.
        System.out.println("Using MediaPlayerAdapter");

        // Call the playFile method of the encapsulated AdvancedMediaPlayer.
        advancedMediaPlayer.playFile(filename);
    }
}
