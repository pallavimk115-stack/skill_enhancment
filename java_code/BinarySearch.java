package skill_enhancment;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int target = 20;

        int low = 0, high = arr.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            }
            else if(arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println("Not Found");
    }
}
