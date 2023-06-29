package PatternProgram;

public class Heart {

	public static void main(String[] args) {
		int rows = 6;
        int columns = 7;

        // Upper part of the heart
        for (int i = rows / 2; i <= rows; i += 2) {
            for (int j = 1; j < rows - i; j += 2) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part of the heart
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
	}


