import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        int sum = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            sum += num;
        }
        System.out.println(sum);
        sc.close();
    }
}
