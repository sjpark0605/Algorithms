public class BinarySearch {
    public int binSearch(int[] arr, int target) {
        int result = -1;
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + ((r-l)/2);

            if (arr[mid] == target) return mid;

            if (arr[mid] > target) r = mid - 1;
            else l = mid + 1;
        }

        return result;
    }
}
