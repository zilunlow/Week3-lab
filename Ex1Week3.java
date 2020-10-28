import java.util.Scanner;

public class Ex1Week3{
	
	public static void main(String [] nilaiTerima){

		int noInt=10,x;

		//ternary

		// if(noInt==10)
		// 	System.out.println("sama");
		// else
		// 	System.out.println("tak same");

		//ternary 
		
		System.out.println(noInt==10?"same":"tak sama");

		if(noInt==10)
			x=3;
		else
			x=19;

		x=noInt==10 ? 3:19;
		System.out.println("x is "+x);




		// String name;
		// int number;
		// double noDouble;

		// Scanner input=new Scanner(System.in);

		// System.out.println("Emter a number : ");
		// number=input.nextInt();
		// System.out.println("Number is "+ number );

		// input.nextLine();//special for nextLine() if not it will take all the enter before(or above) its or except input.nextLine() is on the first input(cin in c++)
		// System.out.println("Emter a String : ");
		// name=input.nextLine();// or input.nextLine() input for string with spacing //next() is for 1 string only cannot space
		// System.out.println("Name is "+ name );

		// System.out.println("Emter a double : ");
		// noDouble=input.nextDouble();
		// System.out.println("Number is "+ noDouble );

	

		// input.close();

		// int [] tataInt={10,20,30,40};
		// for(int i=0;i<tataInt.length;i++){

		// 	System.out.println(tataInt[i]);
		// }

		// //for-each or advanced

		// for(int t:tataInt){

		// 	System.out.println("for each : "+ t);

		// }


		// int noInt='9';//only 0to 9 can and dk what reason
		// System.out.println("Number int "+noInt);

		//final is constant(const) variable
		// final static char CHARSAYA=53;
		// System.out.println("Char "+CHARSAYA);
		// CHARSAYA=100;
		// System.out.println("Char "+CHARSAYA);


		// int [] tataInt=new int[4];//when array declare it will put default value where is 0

		// for(int i=0;i<tataInt.length;i++){
		// 	System.out.println(tataInt[i]);
		// }

		// int noInt=123;
		// int noInt2=666;
		// double noDouble=123.666;

		// System.out.format("%6d dan %4d", noInt,noInt2);//d is decimal type
		// System.out.format("%4d",noInt2);
		// System.out.format("$%7.1f",noDouble);
		// System.out.printf("\n$%7.1f dan %6d ",noDouble,noInt);//%6d means have 6 space for decimal

		// System.out.println("Nilai 1 : "+nilaiTerima[0]);
		// System.out.println("Nilai 1 : "+nilaiTerima[1]);
		// System.out.println("Nilai 1 : "+nilaiTerima[2]);

		//javac Ex1Week3.java
		//java Ex1Week3 Low Zi Lun --- can be 3 or more but cannot less than 3

		// int sum=0;

		// for(int i=0;i<nilaiTerima.length;i++){
		// 	System.out.println("Nilai "+ nilaiTerima[i]);
		// 	sum+=Integer.parseInt(nilaiTerima[i]);
		// 	System.out.println("Nilai sum : "+sum);
		// }

		//java Ex1Week3 8 6 8
	}

}