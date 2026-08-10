public interface PlayList {
    public void addSong(Song song);
    public void removeSong(Song song);
    public void reorderSong(Double prevPosition,Double nextPosition,Song song);
    public void viewSongs();
}
