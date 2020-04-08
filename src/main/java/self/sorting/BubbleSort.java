package self.sorting;

public class BubbleSort {


    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int[] toSort = new int[]{5, 2, 1, 4, 3};
        b.sort(toSort);

        for(int i = 0; i < toSort.length; i++) {
            System.out.print(toSort[i] + " ");
        }
        System.out.println();
    }

    private void sort(int[] toSort) {
        for(int i = 0; i < toSort.length - 1; i++) {
            for(int j = i+1; j < toSort.length; j++) {
                if(toSort[i] > toSort[j]) {
                    int temp = toSort[i];
                    toSort[i] = toSort[j];
                    toSort[j] = temp;
                }
            }
        }
    }
}
