package weekSevelObjectOrientedDesign;

import java.util.Queue;

public class Q3CdPlayer {
	
	private PlayList playList;
	private Q3CD cd;
	
	public Q3CdPlayer(Q3CD cd, PlayList pl) {
		this.cd = cd;
		this.playList = pl;
	}

	public PlayList getPlayList() {
		return playList;
	}

	public void setPlayList(PlayList playList) {
		this.playList = playList;
	}

	public Q3CD getCd() {
		return cd;
	}

	public void setCd(Q3CD cd) {
		this.cd = cd;
	}
	
	public void playTrack(Song s) { 
		System.out.println("Playing s"+s);
	}

}

class PlayList {
	Song curTrack;
	Queue<Song> playListQueue;
	
	public PlayList(Song s, Queue<Song> q) {
		curTrack = s;
		playListQueue = q;
	}
	
	public Song getNextSong() {
		return playListQueue.peek();
	}
	
	public void addSongToPlayList(Song s) {
		playListQueue.add(s);
	}
}