package main;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myList = {87, 21, 45, 93};

        System.out.println(binarySearch(myList, 93));
        System.out.println(binarySearch(myList, 16));
    }

    public static int binarySearch(int[] list, int item) {
        if(isListEmpty(list)) {
            return -1;
        }

        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static boolean isListEmpty(int[] myList) {
        int listSize = myList.length;
        if( listSize == 0) {
            return true;
        }
        return false;
    }
}

