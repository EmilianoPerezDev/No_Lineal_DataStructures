public class MaxHeap {
    public static int[] heapify(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(i, array);
        }
        return array;
    }

    public static int kthLargestItem(int kth, int[] array) {
        kth--;
        if (kth >= array.length)
            throw new IllegalArgumentException();

        return array[kth];
    }

    private static void heapify(int index, int[] array) {
        var largerIndex = index;

        var leftIndex = index * 2 + 1;
        if (leftIndex < array.length && array[leftIndex] > array[largerIndex])
            largerIndex = leftIndex;

        var rightIndex = index * 2 + 2;
        if (rightIndex < array.length && array[rightIndex] > array[largerIndex])
            largerIndex = rightIndex;

        if (index == largerIndex) return;

        swap(index, largerIndex, array);
        heapify(largerIndex, array);
    }

    private static void swap(int first, int second, int[] array) {
        var temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}