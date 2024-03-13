public class TwoDArr {
    public static void main(String[] args) {
        int [][] myArray = {{1,2,3,4},{5,6,7}};
        for(int i = 0 ; i < myArray.length ; i++) {
            for(int j = 0 ; j < myArray[i].length ; j++) {
                System.out.println(myArray[i][j]);
            }
        }
    }
}