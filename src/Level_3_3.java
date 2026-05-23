public class Level_3_3 {
    // Peak Element
    // Tìm đỉnh trong mảng.

    public static int peakElement(int[] arr){

        int left = 0;
        int right = arr.length - 1;

        while (left < right){

            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]){
                left = mid + 1;
            }

            if (arr[mid] > arr[mid + 1]){
                // Peak có thể là bằng mid hoặc nằm bên trái mid
                right = mid;
            }

        }

        return arr[left];

    }

    public static void main(String[] args){

        int[] arr = {1, 9, 8, 7, 6};

        System.out.println(peakElement(arr));

    }

}
