package Multiple_Interface;

class Democlass implements FirstInterface,SecondInterface {
    public void myMethod() {
        System.out.println("Some text...");
    }
    public void myOtherMethod() {
        System.out.println("Spme other text...");
    }
}
