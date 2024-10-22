import java.util.Scanner;

public class ReverseNumberTraingle {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int j;
        int col = (row*2)-1;
        for(int i=row;i>=1;i--){
            for(j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }
}


