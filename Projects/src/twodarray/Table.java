package twodarray;

public class Table {
    private int[][] arr = new int[][]{{2, 5, 8, 0}, {0, 1, 7, 9}, {9, 1, 8, 14}};


    public static void main(String[] args) {

    }
    public int min(){
        int minimum=arr[0][0];
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                if(arr[i][j]<minimum){
                    minimum=arr[i][j];

                }
            }
        }
        return minimum;
    }
    public int max(){
        int maximum=arr[0][0];
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                if(arr[i][j]>maximum){
                    maximum=arr[i][j];

                }
            }
        }
        return maximum;
    }
    public int avg(){
        int average = 0;
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                average += arr[i][j];
            }
        }
        average=average/12;
        return average;
    }
    public int sumUnderSomething(){
        int sum=0;
        int i,j;
        for(i=0;i<3;i++) {
            for (j = 0; j < 4; j++) {
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;

    }
}
