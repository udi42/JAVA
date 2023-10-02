package Program4.prog4;

// MP4Player is a class that implements the AdvancedMediaPlayer interface for playing MP4 files.
public class MP4Player implements AdvancedMediaPlayer {
    // Implementation of the playFile method from the AdvancedMediaPlayer interface.
    @Override
    public void playFile(String filename) {
        // Display a message indicating that an MP4 file is being played along with the filename.
        System.out.println("Playing MP4 " + filename);
    }
}
