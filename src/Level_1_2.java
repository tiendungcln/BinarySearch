public class Level_1_2 {
    // Đếm số lần lặp while

    public static void traceBinarySearch(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){

            int mid = left + (right - left) / 2;

            System.out.println(
                    "Left = " + left +
                            " Mid = " + mid +
                            " Right = " + right
            );

            if (arr[mid] == target){
                break;
            }

            if (arr[mid] < target){
                left = mid + 1;

            }

            if (arr[mid] > target){
                right = mid - 1;
            }

        }

    }

    public static void main(String[] args){

        int[] arr = {1, 3, 5, 7, 9, 10, 15};
        int target = 5;

        traceBinarySearch(arr, target);

    }

}
