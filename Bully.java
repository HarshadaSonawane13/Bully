import java.util.*;

public class Bully {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        int[] processes = new int[n];
        for (int i = 0; i < n; i++) processes[i] = i + 1;

        System.out.print("Enter crashed process (0 if none): ");
        int crashed = sc.nextInt();
        System.out.print("Enter initiator process: ");
        int initiator = sc.nextInt();

        System.out.println("Process " + initiator + " starts election...");
        int leader = initiator;
        for (int p : processes)
            if (p > initiator && p != crashed) leader = p;

        System.out.println("Leader elected: " + leader);

        sc.close();  // <-- fixes the yellow alert
    }
}
