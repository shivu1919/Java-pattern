import java.util.Scanner;

public class reverselefthalfpyaramid {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row = s.nextInt();
        for(int i=row;i>=1;i--){
            for(int j=1; j<=row;j++){
                if (i+j<=row) {
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }

            System.out.println("");
        }
    }
}
