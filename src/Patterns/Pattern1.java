package Patterns;

public class Pattern1 {

    public static void rightPyramid(int n) {
        System.out.println("Right Pyramid");
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println(" ");
        }
    }

    public static void invertedRightPyramid(int n) {
        System.out.println("Inverted Right Pyramid");
        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                if (j <= i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println(" ");
        }
    }

    public static void pyramid(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    System.out.print("*");
                    if (j >= n) {
                        for (int k = 1; k <= n - i; k++)
                            System.out.print("*");
                    }
                } else System.out.print(" ");
            }
            System.out.println("");
        }

    }

    public static void optimizePyramid(int n) {
        System.out.println("Half Butterfly");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (n * 2) - 1; j++) {
                if (j >= n - i && j <= n + i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void invertedPyramid(int n) {
        System.out.println("Inverted Pyramid");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n * 2) - 1; j++) {
                if (j >= i && j <= (2 * n) - i) System.out.print("#");
                else System.out.print("_");
            }
            System.out.println("");
        }
    }

    public static void hollowInvertedPyramid(int n) {
        System.out.println("hollowInvertedPyramid");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n * 2) - 1; j++) {
                if (i == 1) {
                    System.out.print("*");
                    continue;
                }

                if (i == j || j == (2 * n) - i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void printV(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j == i || j == (2 * n) - i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] arg) {
        Pattern1.printV(5);
    }
}
