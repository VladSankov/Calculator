import java.util.Scanner;
public class LetsGo {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a: ");
            int a = in.nextInt();
            System.out.print("Input operation: ");
            char oper = in.next().charAt(0);
            System.out.print("Input b: ");
            int b = in.nextInt();
            System.out.print("Answer = ");
            Operation Execute = new Operation();
            Execute.Execute(a,oper,b);
            System.out.println("Input 0 to stop or 1 to continue ");
            int ans = in.nextInt();
            if(ans == 0)
                System.exit(0);
        }
    }
}
