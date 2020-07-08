package weekSevelObjectOrientedDesign;

import java.util.ArrayList;

public class Q3CD {

	private int id;
	ArrayList<Song> cdSongs = new ArrayList<>();
	
	public Q3CD(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Song> getCdSongs() {
		return cdSongs;
	}

	public void setCdSongs(ArrayList<Song> cdSongs) {
		this.cdSongs = cdSongs;
	}
	
}

class Song{
	String songName;
	int duration;
	
	public Song(String name, int dur) {
		duration = dur;
		songName = name;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [songName=" + songName + ", duration=" + duration + "]";
	}
	
}
