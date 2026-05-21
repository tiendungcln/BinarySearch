public class Level_2_2 {
    // Đếm số lần xuất hiện
    // Dùng: last - first + 1

    public static int findFirstOccurrence(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;
        int answer = -1;

        while (left <= right){

            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                answer = mid;
                right = mid - 1;
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

    public static void countOccurrences(int[] arr, int target){

        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);
        int count = last - first + 1;

        if (first == -1){
            System.out.println(target + " không xuất hiện");;
        }else{
            System.out.println(target + " xuất hiện " + count +" lần");;
        }

    }

    public static void main(String[] args){

        int[] arr = {1, 2, 2, 2, 5 };
        int target = 2;

        countOccurrences(arr, target);

    }

}
