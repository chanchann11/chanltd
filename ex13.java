public class ex13 {
    public static void main(String[] args) {
        int h=4, r=10, u=6;
        for (int i=0; i<h; i=i++) {
            for (int j=0; j<i; j=j++) {
                System.out.print(" ");
            }
            for (int j=i; j<r; j=j++) {
                System.out.print("*");
            }
            r--;
            System.out.println();
        }
        for (int i=0; i<h; i=i++) {
            for (int j=i; j<2; j=j++) {
                System.out.print(" ");
            }
            for (int j=0; j<u; j=j++) {
                System.out.print("*");
            }
            u+=2;
            System.out.println();
        }
    }
}
