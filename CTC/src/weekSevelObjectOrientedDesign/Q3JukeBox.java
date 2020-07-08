package weekSevelObjectOrientedDesign;

import java.util.Set;

public class Q3JukeBox {

	private Q3CdPlayer cdPlayer;
	private Q3User user;
	private Set<Q3CD> cdCollection;
	private TrackSelector ts;
	
	public Q3JukeBox(Q3CdPlayer cdPlayer, Q3User user, Set<Q3CD> cdCollection, TrackSelector ts) {
		super();
		this.cdPlayer = cdPlayer;
		this.user = user;
		this.cdCollection = cdCollection;
		this.ts = ts;
	}
	
	public Song getCurrentTrack() { return ts.getCurrentSong();	}
	public void processOneUser(Q3User u) { this.user = u;	}
	
}

class TrackSelector{
	private Song currentSong;
	public TrackSelector(Song s) { currentSong=s; }
	public void setTrack(Song s) { currentSong = s;	}
	public Song getCurrentSong() { return currentSong;	}
}
