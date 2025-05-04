public class NumberPattern {
    public static void main(String[] args) {
        pattern4(4);
        pattern5(5);
        pattern6(5);
    }
    static void pattern4(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n ){
        for (int row = 0; row < 2 *n; row++) {
            int totalColsInRow =  row > n ? 2 *n -row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int row = 0; row < 2 *n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
