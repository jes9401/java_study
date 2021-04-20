package day02;

import java.util.*;

public class IfExam04 {
	/*
	 * 복싱체급은 몸무게가 50.80kg 이하를 "플라이급", 61.23kg 이하 "라이트급", 72.57kg 이하 "미들급", 88.45kg
	 * 이하 "크루저급", 그 이상을 "헤비급"이라고 하자. 몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오. 입력예 : 87.3
	 * 
	 * 출력예 : 크루저급
	 */
	static void weightDiscrimination(float weight) {
		String result;
		if (weight > 88.45) {
			result = "헤비급";
		} else if (weight > 72.57) {
			result = "크루저급";
		} else if (weight > 61.23) {
			result = "미들급";
		} else if (weight > 50.80) {
			result = "라이트급";
		} else {
			result = "플라이급";
		}
		System.out.println(result);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몸무게 : ");
		float weight = scanner.nextFloat();
		weightDiscrimination(weight);

	}

}
