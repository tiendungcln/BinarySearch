public class Level_1_1 {
    // -- Sử dụng thuật toán đệ quy --
    // - Chi tiết đệ quy:
    // + Dùng method để tự gọi chính nó chứ không dùng for hay while
    // + Phải có điều kiện dừng
    // Tìm số có tồn tại không
    // [1, 3, 5, 7, 9, 10, 15]
    // + Method 1:
    // Trả về true/false
    // target = 7
    // => true
    // + Method 2:
    // Trả về index
    // target = 5
    // => 2

    public static boolean containsTarget(int[] arr, int left, int right, int target){

        if (left <= right){

            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                return true;
            }

            if (arr[mid] < target){
                return containsTarget(arr, mid + 1, right, target);
            }

            if (arr[mid] > target){
                return containsTarget(arr, left, mid - 1, target);
            }

        }

        return false;

    }

    public static int findTargetIndex(int[] arr, int left, int right, int target){

        if (left <= right){

            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] < target){
                return findTargetIndex(arr, mid + 1, right, target);
            }

            if (arr[mid] > target){
                return findTargetIndex(arr, left, mid - 1, target);
            }

        }

        return -1;

    }

    public static void main(String[] args){

        int[] arr = {1, 3, 5, 7, 9, 10, 15};
        int target = 5;
        int r = arr.length - 1;

        boolean result = containsTarget(arr, 0, r, target);
        if (result){
            System.out.println("Mảng có tồn tại giá trị cần tìm");
        }else{
            System.out.println("Mảng không tồn tại giá trị cần tìm");
        }

        int resultIndex = findTargetIndex(arr, 0, r, target);
        if (resultIndex == -1){
            System.out.println("Mảng không có giá trị cần tìm");
        }else{
            System.out.println("Mảng có chứa giá trị cần tìm tại index: " + resultIndex);
        }

    }

}
