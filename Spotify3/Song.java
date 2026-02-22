public class Song {
    Integer id;
    String songName;

    public Song(Integer id, String songName) {
        this.id = id;
        this.songName = songName;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }


}
