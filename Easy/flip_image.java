class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i< A.length; i++){
            invert(reverse(A[i]));
        }
        return A; 
    }
    public int[] reverse(int[] arr){
        for (int i = 0; i< arr.length/2; i ++){
            int temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length-1-i] = temp;
        }
        return arr; 
    }
    public void invert(int [] arr){
        for (int i = 0; i< arr.length; i++){
            if(arr[i] == 0) arr[i] = 1; 
            else arr[i] = 0; 
        }
        return ; 
    }
}