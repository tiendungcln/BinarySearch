public class Level_1 {
    // Tìm số có tồn tại không
    // [1, 3, 5, 7, 9, 10, 15]
    // + Method 1:
    // Trả về true/false
    // target = 5
    // => true
    // + Method 2:
    // Trả về index
    // target = 5
    // => 2
    public static boolean containsTarget(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){

            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                return true;
            }

            if (arr[mid] < target){
                left = mid + 1;
            }

            if (arr[mid] > target){
                right = mid - 1;
            }

        }

        return false;

    }

    public static int findTargetIndex(int[] arr, int target){

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

        return -1;

    }

    public static void main(String[] args){

        int[] arr = {1, 3, 5, 7, 9, 10, 15};
        int target = 5;

        if (containsTarget(arr, target)){
            System.out.println("Mảng có tồn tại giá trị cần tìm");
        }else{
            System.out.println("Mảng không tồn tại giá trị cần tìm");
        }

        int result = findTargetIndex(arr, target);
        if (result == -1){
            System.out.println("Mảng không có giá trị cần tìm");
        }else{
            System.out.println("Mảng có chứa giá trị cần tìm tại index: " + result);
        }

    }

}
