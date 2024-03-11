public class Fun_Cons {
    String name;
    int age;


    public Fun_Cons(String name, int age) {
        this.name = name;
        this.age = age;
    }
        public static void main(String[] args) {
            Fun_Cons myObj = new Fun_Cons("Asib", 23);
            System.out.println(myObj.name + " " + myObj.age);
        }
}