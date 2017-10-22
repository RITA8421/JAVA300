package Bon;

public class TestCharType {

	public static void main(String[] args) {
		//char c1='a';
		char c2='b';
		char c3='\'';
		char c4='\t';
		//System.out.print(c1);
		System.out.print(c2);
		System.out.println(c4);
		System.out.println(c3);

		char c5='a';//对应97，字符可直接当做数用
		int i =c5 + 2;//97+2=99
		char c6=(char)i;//强制转型
		System.out.println(c6);

		//循环打印a-z
		for(int z=0;z<26;z++){
			char temp=(char)(c5+z);
			System.out.print(temp);

		}
		
		//字符串
		String str="abcdefghijklmnopqrstuvwxyz";
		System.out.println("\n"+str);

		boolean b=true;
		if(b){
			System.out.println("true");
		}

	}

}
