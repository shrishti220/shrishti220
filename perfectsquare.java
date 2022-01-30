import java.util.Scanner;
public class perfectsquare {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        boolean is_perfect_square = false;
        for(int i=1;i<n;i++) {
            if (i * i == n) {
                System.out.println("number is perfect square");
                is_perfect_square = true;
            }
        }
        if(is_perfect_square==false){
            System.out.println("not a perfect square");
        }

    }
}
