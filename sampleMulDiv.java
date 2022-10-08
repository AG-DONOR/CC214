public class sampleMulDiv {
	public static void main(String[] args) {
		
		int num1=9, num2=3, mul=0, div=0, mod=0;
		int num3=99;
		
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		mul=num1*num2;
		div=num1/num2;
		mod=num1%num2;
		System.out.println("Multiplication or product = "+mul);
		System.out.println("Division or qoutient = "+div);
		System.out.println("Remainder = "+mod);
		System.out.println("\n");
		System.out.println("Number: "+num3);
		
		num3++;
		System.out.println("Increment number: "+num3);
		num3--;
		System.out.println("Decrement number: "+num3);
	}
}
