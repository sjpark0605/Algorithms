public class Driver {
    public static void main(String[] args) {
        /*Classic Binary Search*/
        BinarySearch bin = new BinarySearch();
        int[] testArr = {1, 3, 5, 7, 9, 11};
        //System.out.println(bin.binSearch(testArr, 3)); // Should print 1;

        /*Finding integral SQRT of x without SQRT function*/
        SquareRootSearch srs = new SquareRootSearch();
        System.out.println(srs.findSquareRoot(2601)); // Should print 51;
        //System.out.println(srs.findSquareRoot(3)); // Should print -1 since it doesn't have an integer solution;

        /*Finding first number greater than or equal to target*/
        FirstGreaterNum fgm = new FirstGreaterNum();
        int[] fgmArr = {1, 1, 1, 2, 3, 4, 5, 6, 7, 7, 11, 15, 32};
        //System.out.println(fgm.firstGreaterOccurrence(fgmArr, 9)); // Should print 11;

    }
}
