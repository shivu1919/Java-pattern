import java.util.Scanner;

public class NumberTraingle {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col = (row*2)-1;
        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
