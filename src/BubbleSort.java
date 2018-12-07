public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int end = arr.length - 1; end >= 1; end--) {
            for (int j = 0; j < end; j++) {
                if (arr[j] > arr[j + 1]) //if (arr[j] <arr[j+1]);
                swap(arr, j, j + 1);
            }
        }
    }

    private static void swap(int[] arr,int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 6, 4, 8, 9};
        bubbleSort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i =0;i<arr.length;i++){
         sb.append(arr[i]);
         if(i != arr.length-1);
         sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
