package day03;

public class ArrayTest {
	public static void main(String[] args) {
		//�迭
		int i=0;
		i=10;
				
		int iarray[];	//����
		iarray = new int[3];	//����
		
		int iarray2[] = new int[5];	//����+����
		
		int iarray3[]= {1,2,3,4};
		int iarray4[] = new int[4];
		iarray4[0]=1;
		iarray4[1]=2;
		iarray4[2]=3;
		iarray4[3]=4;
		
		for(i=0;i<iarray3.length;i++) {
			System.out.println(iarray3[i]);
			System.out.println(iarray4[i]);
		}
		
		int iarr[] = new int[10];
		System.out.println("-------------");
		for(int j=0;j<iarr.length;j++) {
			iarr[j]= j+1;
			System.out.println(iarr[j]);
		}
		//for(Ÿ�� ������:�ݺ��Ǵ� �ڷᱸ��
		System.out.println("********");
		for(int value:iarr) {
			System.out.println(value);
		}
	}
}
