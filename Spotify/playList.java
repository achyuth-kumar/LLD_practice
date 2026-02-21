public interface playList {
    public void addSong(String songName);
    public void removeSong(String songName);
    public void reorderSong(String songName,Double prevPosition,Double nextPosition);
    public void viewSongs();
}
