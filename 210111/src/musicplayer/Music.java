package musicplayer;

public class Music {
	private String songName;
	private String singer;
	private int playTime;
	private String path;   //노래파일경로
	
	public Music(String songName,String singer,int playTime,String path) {
		this.songName=songName;
		this.singer=singer;
		this.playTime=playTime;
		this.path=path;
	}
	
	public Music(String songName,String singer,int playTime) {
		this.songName=songName;
		this.singer=singer;
		this.playTime=playTime;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	
	
	
	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	@Override
	public String toString() {
		return this.singer+"/"+this.songName+"/"+this.playTime;
	}

}
