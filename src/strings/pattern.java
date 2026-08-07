package strings;

public class pattern{
    /*   * * * *
    /*   * * *
    /*   * *
    /*   *
     */
    static void main() {
        int rowLength = 4;
        int colLength = 4;
        for (int row = 1; row <=rowLength; row++) {
            for (int col = 1; col <=colLength ; col++) {
                System.out.print("* ");
            }
            System.out.println(
            );
            colLength--;
        }
    }
}
