package Interface_question;

public class SortingDemo {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 8, 1, 3};
        int[] arr2 = {9, 4, 6, 2, 7};

        Sortable bubble = new BubbleSort();
        bubble.sort(arr1);

        Sortable selection = new SelectionSort();
        selection.sort(arr2);
    }
}