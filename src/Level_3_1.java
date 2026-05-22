public class Level_3_1 {
    // Tìm phần tử gần nhất
    // Ví dụ:
    // target = 8
    // => 7 hoặc 9

    public static int findClosestToTarget(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){

            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                return arr[mid];
            }

            if (arr[mid] < target){
                left = mid + 1;
            }

            if (arr[mid] > target){
                right = mid - 1;
            }

        }

        if (right < 0){
            return arr[left];
        }

        if (left >= arr.length){
            return arr[right];
        }

        int distanceRight = Math.abs(arr[left] - target);
        int distanceLeft = Math.abs(arr[right] - target);

        if (distanceLeft < distanceRight){
            return arr[right];
        }

        if (distanceRight < distanceLeft){
            return arr[left];
        }

        return arr[right];

    }

    public static void main(String[] args){

        int[] arr = {1, 3 ,5 ,6 ,9};
        int target = 10;

        System.out.println(findClosestToTarget(arr, target));

    }
}
