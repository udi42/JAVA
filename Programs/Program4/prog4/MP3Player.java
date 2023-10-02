package Program4.prog4;

// MP3Player is a class that implements the MediaPlayer interface for playing MP3 files.
public class MP3Player implements MediaPlayer {
    // Implementation of the play method from the MediaPlayer interface.
    @Override
    public void play(String filename) {
        // Display a message indicating that an MP3 file is being played along with the filename.
        System.out.println("Playing MP3 " + filename);
    }
}
