package self.sorting;

public class SelectionSort {

    public void sort(int[] toSort) {

        for(int i = toSort.length - 1; i >= 1; i--) {
            int index = findIndexOfMax(toSort, i);
            int temp = toSort[i];
            toSort[i] = toSort[index];
            toSort[index] = temp;
        }

    }

    private int findIndexOfMax(int[] array, int stop) {
        int max = 0;
        int index = -1;
        for(int i = 0; i <= stop; i++) {
            if(array[i] > max) {
                index = i;
                max = array[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();

        int[] toSort = new int[]{5, 2, 1, 4, 3};
        s.sort(toSort);

        for(int i = 0; i < toSort.length; i++) {
            System.out.print(toSort[i] + " ");
        }
        System.out.println();
    }

}
