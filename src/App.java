import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("Insira um número- ");
        int a = sc.nextInt();
        for(int i = 1; i<=a; i++) {
            String l = "";
            for(int j = 1; j<=i; j++) {
                l = l + i;
            }
            System.out.println(l);
        }
    }
}
