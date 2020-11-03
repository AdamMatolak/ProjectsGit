package bubblesort;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{21,30,60,12,2,5,16,1,35};
        int len = arr.length;
        for(int i = 0;i<len-1;i++){
            for(int j = 0;j<len-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i = 0;i<len;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
