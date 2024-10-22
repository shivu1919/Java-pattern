import java.util.Scanner;

public class squarefill {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row = s.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1; j<=row;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
