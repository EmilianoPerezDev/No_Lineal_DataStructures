import java.util.Arrays;

public class Heap {

    private int[] items;
    private int size;

    public Heap(int capacity) {
        items = new int[capacity];
    }

    public void insert(int value) {
        if (isFull())
            throw new IllegalArgumentException();

        items[size++] = value;

        bubbleUp();
    }

    private void bubbleUp() {
        var index = size - 1;
        while (index > 0 && items[index] > items[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private void swap(int first, int second) {
        var temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    private int parentIndex(int index) {
        return (index - 1) / 2;
    }

    private int parent(int index) {
        return items[parentIndex(index)];
    }

    private boolean isFull() {
        return size == items.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }

}
