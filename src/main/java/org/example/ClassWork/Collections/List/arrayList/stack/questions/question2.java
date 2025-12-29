public static void main(String[] args) {
    int[] nums = {4, 5, 2, 10};
    int n = nums.length;
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
        result[i] = -1;
        for (int j = i + 1; j < n; j++) {
            if (nums[j] > nums[i]) {

                break;
            }
        }
    }
    System.out.println();
}