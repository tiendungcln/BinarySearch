public class Level_3 {
    // Tìm vị trí chèn
    // Ví dụ:
    // [1,3,5,6]
    // target = 2
    // => 1

    public static int findInsertPosition(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){

            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] < target){
                left = mid + 1;
            }

            if (arr[mid] > target){
                right = mid - 1;
            }

        }

        return left;

    }

    public static void main(String[] args){

        int[] arr = {1, 3, 5, 6};
        int target = 2;

        System.out.println(findInsertPosition(arr, target));

    }

}
