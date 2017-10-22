package Bon;
//自动转型和强制转型
public class TestCast {
	public static void main(String[] args) {
		byte b=123;
		//byte b2=300; 报错
		//char c=-3; 报错
		char c2='a';
		int i=c2+4;
		System.out.println(i);
		long d01=123123;
		float f=d01;
		System.out.println(f);

		int i2=100;//若i2=-100，则超出范围，转换后值无意义
		char c3=(char)i2;
		System.out.println(c3);

		//类型提升问题
		int a1=3;
		long b1=4;
		int c1=(int)(a1+b1);
		System.out.println(c1);

		double d=5.3;
		float c4=(float)(a1+d);
		System.out.println(c4);

		int money=1000000000;
		int year=20;
		long total=(long)money*year;
		System.out.println(total);//得出负数
		
		//计算一个人70年心跳多少次
		long times=70L*60*24*365*70;
		System.out.println(times);



	}

}
