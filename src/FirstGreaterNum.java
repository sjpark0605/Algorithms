public class FirstGreaterNum {

    public int firstGreaterOccurrence(int[] arr, int floor) {
        int l = 0;
        int r = arr.length - 1;

        int result = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] >= floor) {
                result = arr[mid];
                r = mid - 1;
            } else l = mid + 1;
        }

        return result;
    }

}
