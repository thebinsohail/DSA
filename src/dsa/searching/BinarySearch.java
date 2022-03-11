package dsa.searching;

import java.util.logging.Logger;

public class BinarySearch {

    private static final Logger logger = Logger.getLogger(String.valueOf(BinarySearch.class));


    public int search(int array[], int targetValue) {

        int start = 0;                    // start of the array index
        int end = array.length;          //  ending index of the array

        while (start <= end) {

            logger.info("start:" + start+",end:"+end);

            int mid = (start + end) / 2;
            logger.info("Mid:" + mid);

            if (targetValue < array[mid]) {
                end = mid - 1;
            } else if (targetValue > array[mid]) {
                start = mid + 1;
            } else {
               logger.info("Found at index: "+mid);
                return mid;
            }
        }
        logger.warning("Not Found!");
        return -1;
    }
}

class Main {
    public static void main(String[] args) {
        int[] array = {4, 8, 12, 15, 33, 50, 53, 70};
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.search(array, 12);

    }
}