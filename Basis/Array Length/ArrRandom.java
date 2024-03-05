// import java.util.*;
// // import java.lang.*;

// public class ArrRandom {
//     public static void main(String[] args) {
//         int[] arr = new int[10];
//         Scanner input = new Scanner(System.in);
//         for (int i = 0; i < arr.length; i++) {
//             // arr[i] = input.nextInt();
//             arr[i] =(int) (Math.random()*10);
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }
import java.util.*;

public class ArrRandom {
    public static void main(String[] args) {
        int[] asib = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < asib.length; i++) {
            asib[i] = input.nextInt();
        }
        for(int i=0;i<asib.length;i++) {
            System.out.println(asib[i]);
        }
    }
}
