public class Main {

    public static void main(String[] args) {

        /*
        Not finished, I'll come back to this when I have time.
        Otherwise, if any one wants to continue practicing by the time I'm not done with what I'm doing,
        Please kindly check out Kunal Solve any Pattern with this Trick on YouTube to master patterns.
         */

        /**
         * Write code for various patterns
         * Step 1: no. of lines = no. of rows = no. of times outer loop will run
         *
         * Look at the pattern, see how many lines you have in the pattern,
         * the outer for loop will run according those lines which is the row, for every pattern
         *
         * Step 2: How many columns are there with each row.
         * Identify for every row number,
         * how many columns are there
         * Types of elements in column example star
         *
         * Step 3: What do you want to print? Type of element e.g. star
         * Try to find the formula relating rows and columns
        */
//        System.out.println("Pattern 1: Square");
//        pattern1(5);
//        System.out.println("Pattern 2: Right angle");
//        pattern2(4);
//        System.out.println("Pattern 3: Inverted-Right angle");
//        pattern3(4); // enter 4 as arg
//        System.out.println("Pattern 4: Printed numbers-Right angle");
//        pattern4(5);
        System.out.println("Pattern 5: Arrow");
//        pattern5();
    }

    static void pattern1(int n) { // Square
        /* n is number of rows
         */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }


    static void pattern2(int n) { // Right angle triangle
        for (int row = 1; row <= n; row++) {
            // for every row, run the col (step 2)
            for (int col =1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one line is printed, we need to add a newline
            System.out.println();
        }
    }


    static void pattern3(int n) { // Upside-Down/Inverted Right angle
        for (int row = 0; row <= n; row++) { // row is 1 and is <= n
            /* NB the following:
             * Firstly the outer loop prints 1 element, and then the inner loop prints all it's column elements in the first row
             * This happens until the last row and the elements of the column are printed...
             * That is until row is == n
             *
             * *Also note that in the inner loop where col<=n-row+1, this means that number - row that is increasing/incrementing,
             * but it has to be <= n and add one
             *
             */
            for (int col = 1; col <= n-row+1; col++) {
//            for (int col = 0; col <= n-row; col++) { // another formula
                // int col = 1; col <= n+1-row; col++ is another way to write this
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    static void pattern4(int n) { // Right angle with columns printed/numbers
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


    static void pattern5(int n) { // Arrow, Right & Inverted-Right angeles together

        for (int row = 0; row < 2 * n; row++) { // n is going to be 4 or 5
            int totalColsInRow = 456;
            for (int cols = 0; cols < totalColsInRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}