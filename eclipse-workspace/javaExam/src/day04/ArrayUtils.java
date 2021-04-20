package day04;

public class ArrayUtils {

	static double[] intToDouble(int[] source) {
		double[] resultArr=new double[source.length];
		for (int i = 0; i < source.length; i++) {
			resultArr[i]=(double)source[i];
		}
		return resultArr;
	}
	static int[] doubleToInt(double[] source) {
		int[] resultArr=new int[source.length];
		for (int i=0;i<source.length;i++) {
			resultArr[i]=(int)source[i];
		}
		return resultArr;
	}
	
	static int[] concat(int[] s1, int[] s2) {
		int k=0;
		int[] resultArr=new int[s1.length+s2.length];
		for (int i=0;i<s1.length;i++) {
			resultArr[i]=s1[i];
		}
		for (int j=s1.length;j<resultArr.length;j++) {
			
			resultArr[j]=s2[k];
			k+=1;
		}
		return resultArr;
	}
	public static void main(String[] args) {
		int [] s1 = {1,2,3};
		int [] s2 = {4,5,6,7,8};
		double [] s3 = {1.0,2.4,3.1,4.5};
		double[] rArr = ArrayUtils.intToDouble(s1);
		for(double value:rArr) {
			System.out.println(value);
		}
		System.out.println("---------------------");
		int [] rArr2 = ArrayUtils.doubleToInt(s3);
		for(int value:rArr2) {
			System.out.println(value);
		}
		System.out.println("---------------------");
		int [] result = ArrayUtils.concat(s1, s2);
		for(int value:result) {
			System.out.println(value);
		}
	}
}
