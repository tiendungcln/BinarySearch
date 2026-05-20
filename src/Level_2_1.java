public class Level_2_1 {
    // Tìm last occurrence
    // Ví dụ:
    // [1,2,2,2,5]
    // target = 2
    // => 3

    public static int findLastOccurrence(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;
        int answer = -1;

        while (left <= right){

            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                answer = mid;
                left = mid + 1;
            }

            if (arr[mid] < target){
                left = mid + 1;
            }

            if (arr[mid] > target){
                right = mid - 1;
            }

        }

        return answer;

    }

    public static void main(String[] args){

        int[] arr = {1, 2, 2, 2, 5 };
        int target = 2;

        System.out.println(findLastOccurrence(arr, target));

    }

}
