package pracHere;
import java.util.Scanner;

public class PatternPractice {

//	public static void main(String[] args) {
//		System.out.println("Enter the Number: ");
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		for(int i=1;i<=size;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		sc.close();
//
//	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.println("Number of rows you want in this pattern?");         
        int rows = scanner.nextInt();         
        System.out.println("----Pattern is----");         
//        for (int i = 0; i <= rows; i++) 
//        {
//            for (int j = 0; j <= i; j++)
//            {
//                System.out.print(j+"*");
//            }
// 
//            System.out.println();
//        }
//        
        //lower half of the pattern
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = rows; j >= i; j--)
            {
                System.out.print(j+"*");
            }
 
            System.out.println();
        }
 
        scanner.close();
    }

}
