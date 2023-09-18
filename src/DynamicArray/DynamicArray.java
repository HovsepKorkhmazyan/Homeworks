package DynamicArray;
public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array[size] >= 10) {
            extend();
        } else {
            array[size++] = value;
        }
    }

    private void extend() {
        int[] secondArray = new int[array.length + 10];
        array = secondArray;
    }

    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return -1;
        }
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
