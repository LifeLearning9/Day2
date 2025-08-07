import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.trim().split("\\s+"); // Trim and handle multiple spaces which is in note section

        System.out.println(s1.length - 1);

        StringBuilder sb = new StringBuilder(); //stringbuilder is fast and effiicent
        for (int i = s1.length - 1; i >= 0; i--) {
            sb.append(s1[i]);
            if (i != 0) sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
