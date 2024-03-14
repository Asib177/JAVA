public class Count {
private float a=100, b=200, c=300, sum;
 
 protected Count(int a, int b, float c) {
 this.a = a;
 this.b = b;
 this.c = c;
 sum = a+b+c+sum;
  System.out.println("protected: " + sum);
 }
 
 {
 sum = a+b+c+sum;
 System.out.println("Block: " + sum);
 }
 
 private void output() {
 sum = a+b+c+sum;
 System.out.println("Tolat count: " + sum);
 }
 
 public static void main(String[] args) {
 Count count = new Count(200, 200, 310.5F);
 count.output();
 } 
}