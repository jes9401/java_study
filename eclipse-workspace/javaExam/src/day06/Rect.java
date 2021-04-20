package day06;

public class Rect {
	private int width, height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(obj instanceof Rect) {
			Rect r = (Rect)obj;
			if (r.width==0 || r.height==0 || width==0 || height==0) {
				System.out.println("면적이 0인 경우 비교할 수 없습니다.");
				return false;
			}
			if ((r.width * r.height) == (width * height)) {
				return true;
			} else {
				return false;
			}
		}
		else {
			return false;
		}

	}
}
