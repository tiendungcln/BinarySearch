public class Level_3_2 {
    // sqrt(x)
    // Tìm căn bậc 2 bằng Binary Search.
    // Ví dụ:
    // x = 16
    // => 4

    public static int searchSqrt(int x){

        int left = 0;
        int right = x;

        while (left <= right){

            int mid = left + (right - left) / 2;

            if (mid * mid == x){
                return mid;
            }

            if (mid * mid < x){
                left = mid + 1;
            }

            if (mid * mid > x){
                right = mid - 1;
            }

        }

        // Số nhỏ hơn x và là số gần nhất với nó
        return right;

    }

    public static void main(String[] args){

        int x = 8;
        System.out.println(searchSqrt(x));

    }
}
