import java.util.List;

public class Queue {
	List<SongEntry> song_entries;
	Integer current_song;
	public SongEntry GetNext() {return null;}
	public SongEntry GetPrevious() {return null;}
	public SongEntry GetSong() {return null;}
	public SongEntry GetSong(int pos) {return null;}
	public void AddSong(SongEntry song) {}
	public void Remove(Integer pos) {}
	public void Reorder(Integer a, Integer b) {}
	public void Clear() {}
}
