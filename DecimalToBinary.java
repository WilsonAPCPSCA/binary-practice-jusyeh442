import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the number you would like to convert in binary: ");
		int num = in.nextInt();
		convertBinary(num);

	}

	public static void convertBinary (int num) {
		int originalNum = num;
		String binaryNum = "";
		int exponent = (int)Math.floor(Math.log(num) / Math.log(2));
		while (num > 0) {
			for (int i = exponent; i >= 0; i--) {
				if (num - (int)Math.pow(2, i) >= 0) {
					binaryNum += 1;
					num = num - (int)Math.pow(2, i);
				} else {
					binaryNum += 0;
				}	
				if (i%4 == 0 && i != 0) {
					binaryNum += " ";
				}
			}
		}
		System.out.println("The number " + originalNum + " is equivalent to " + binaryNum + " in binary.");
	}

}
