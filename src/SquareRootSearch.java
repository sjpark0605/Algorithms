public class SquareRootSearch {

    public int findSquareRoot(int square) {
        int result = -1;
        int l = 0;
        int r = square;

        while (l <= r) {
            int mid = l + (r-l) / 2;

            if (mid * mid == square) return mid;
            else if (mid * mid > square) r = mid - 1;
            else l = mid + 1;
        }

        return result;
    }

}