package day04;

public class Song {
	private String title, artist, album, composer;
	private int year,track;
	public Song(String artist, String title, String album, int year, int track,String composer){
		this.artist=artist;
		this.title=title;
		this.album=album;
		this.year=year;
		this.track=track;
		this.composer=composer;
	}
	public Song(){}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public void show() {
//		System.out.println(artist+" "+title+" ("+album+","+year+","+track+"¹ø track,"+composer+"ÀÛ°î)");
		System.out.println(getArtist()+" "+getTitle()+" ("+getAlbum()+","+getYear()+","+getTrack()+"¹ø track,"+getComposer()+"ÀÛ°î)");

		
	}
	
}
