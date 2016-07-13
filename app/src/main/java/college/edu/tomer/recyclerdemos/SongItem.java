package college.edu.tomer.recyclerdemos;

/**
 * Created by master on 13/07/16.
 */
public class SongItem {
    private String title;
    private String description;
    private String lyrics;
    private int imageResID;

    public SongItem(String title, String description, String lyrics, int imageResID) {
        this.title = title;
        this.description = description;
        this.lyrics = lyrics;
        this.imageResID = imageResID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public int getImageResID() {
        return imageResID;
    }

    public void setImageResID(int imageResID) {
        this.imageResID = imageResID;
    }

}
