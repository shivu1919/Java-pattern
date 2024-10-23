import java.util.Scanner;

public class PalindromTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = s.nextInt();
        for(int i=1;i<=rows;i++){
            for(int k = 1; k<=rows-i;k++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }

            for(int x=2;x<=i;x++){
                System.out.print(x+" ");
            }

            System.out.println();
        }
    }
}
