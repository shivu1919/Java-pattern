import java.util.Scanner;

public class Zero_One_Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int temp=1;
        int rows=s.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");

                }
               else{
                    System.out.print("0 ");

                }


            }
            System.out.println();
        }
    }
}
