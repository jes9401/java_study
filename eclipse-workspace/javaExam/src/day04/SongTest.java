package day04;

public class SongTest {
	public static void main(String[] args) {
		Song s = new Song();
		s.setTitle("������");
		s.setArtist("������");
		s.setAlbum("Real");
		s.setComposer("�̹μ�");
		s.setYear(2010);
		s.setTrack(3);
//		System.out.println(s.getArtist()+" "+s.getTitle()+" ("+s.getAlbum()+","+s.getYear()+","+s.getTrack()+"�� track,"+s.getComposer()+"�۰�)");
		s.show();
		
//		Song s2= new Song("������","������","Real",2010,3,"�̹μ�");
//		s2.show();
	}
}
