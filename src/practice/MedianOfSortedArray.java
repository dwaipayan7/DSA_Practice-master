package practice;

public class MedianOfSortedArray {

    public static double findMedianSortedArray(int[] num1, int[] num2) {
        // Ensure num1 is the smaller array to minimize the binary search range
        if (num1.length > num2.length) {
            return findMedianSortedArray(num2, num1);
        }

        int n1 = num1.length;
        int n2 = num2.length;
        int start = 0;
        int end = n1;

        while (start <= end) {
            int cut1 = (start + end) / 2;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : num1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : num2[cut2 - 1];
            int r1 = (cut1 == n1) ? Integer.MAX_VALUE : num1[cut1];
            int r2 = (cut2 == n2) ? Integer.MAX_VALUE : num2[cut2];

            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            } else if (l1 > r2) {
                end = cut1 - 1;
            } else {
                start = cut1 + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted or invalid");
    }

    public static void main(String[] args) {
        int[] num1 = {1, 3};
        int[] num2 = {2};

        double median = findMedianSortedArray(num1, num2);
        System.out.println("The median is: " + median);
    }

}
