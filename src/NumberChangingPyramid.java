import java.util.Scanner;

public class NumberChangingPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int temp=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println("");
        }
    }
}
