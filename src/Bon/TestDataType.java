package Bon;
import javax.print.attribute.standard.PrinterLocation;

public class TestDataType {
	public static void main(String[] args) {
		int a=10;
		//byte b=20;
		System.out.println(a);
		//System.out.println(b);
		int a2=010;//8进制
		int a3=0xf;//16进制
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(Integer.toBinaryString(a));//将10进制数转化为2进制数
		System.out.println(Integer.toOctalString(a));//将10进制数转化为8进制数
		System.out.println(Integer.toHexString(a));//将10进制数转化为16进制数
		
		long a7=1234566789000237899L;
		System.out.println(a7);


	}

}
