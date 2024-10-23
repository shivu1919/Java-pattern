import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = s.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=i-1;j>=1;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=rows;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
