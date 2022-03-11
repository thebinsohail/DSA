package dsa.searching;

public class LinearSearch {

    public int search(int arr [],int target){

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,9};
        LinearSearch linearSearch=new LinearSearch();
        System.out.println(linearSearch.search(arr,7));
        System.out.println(linearSearch.search(arr,15));

    }

}
