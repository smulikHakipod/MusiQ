public class Queue {
	List<SongEntry> song_entries;
	Integer current_song;
	public SongEntry GetNext() {}
	public SongEntry GetPrevious() {}
	public SongEntry GetSong() {}
	public SongEntry GetSong(int pos) {}
	public void AddSong(SongEntry song) {}
	public void Remove(Integer pos) {}
	public void Reorder(Integer a, Integer b) {}
	public void Clear() {}
}
