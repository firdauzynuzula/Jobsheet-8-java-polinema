import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);


        System.out.print("Masukkan angka: ");
        int N = sc.nextInt();


        // int N = 5;
        for (int iOuter=1 ; iOuter<=N ; iOuter++) {
            for (int i=1 ; i<=N ; i++) {
                if (i >= 2 && i <= N-1 && iOuter >=2 && iOuter <= N-1) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print(" ");
                System.out.print(N);
            }
            System.out.println("");

            sc.close();
        }   
    }
}
