public interface PlayList {
    public void addSong(Song song);
    public void removeSong(Song song);
    public void  reorderSong(Song song,Double prevPosition,Double nextPosition);
    public void viewSongs();
}
