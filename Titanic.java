// public class Titanic {
//     String directorName;
//     String featuredSong;

//     public Titanic(String name1, String name2) {
//         directorName = name1;
//         featuredSong = name2;
//     }

//     {
//         System.out.println("Titanic sank in the North Atlantic Ocean on 15 April \n" +
//                 "1912 after striking an iceberg");
//     }

//     static void showDetails() {
//         System.out.println(name1 + " " + name2);
//     }

//     public static void main(String[] args) {
//         Titanic myObj = new Titanic("James Cameron", "My Heart Will Go On");
//         myObj.showDetailes();
//     }
// }

public class Titanic {
    String Name1, Name2;

    public Titanic(String directorName, String feturedSong) {
        Name1 = directorName;
        Name2 = feturedSong;
    }

    {
        System.out.println("Titanic sank in the North Atlantic Ocean on 15 April\n" +
                "1912 after striking an iceberg");
    }

    public void showDetails() {
        System.out.println(Name1 + " " + Name2);
    }

    public static void main(String[] args) {
        Titanic myObj = new Titanic("James Cameron", "My Heart Will Go On");
        myObj.showDetails();
    }
}