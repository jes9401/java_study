package day04;

public class SongTest {
	public static void main(String[] args) {
		Song s = new Song();
		s.setTitle("좋은날");
		s.setArtist("아이유");
		s.setAlbum("Real");
		s.setComposer("이민수");
		s.setYear(2010);
		s.setTrack(3);
//		System.out.println(s.getArtist()+" "+s.getTitle()+" ("+s.getAlbum()+","+s.getYear()+","+s.getTrack()+"번 track,"+s.getComposer()+"작곡)");
		s.show();
		
//		Song s2= new Song("아이유","좋은날","Real",2010,3,"이민수");
//		s2.show();
	}
}
