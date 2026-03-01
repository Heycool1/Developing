public class bday1 {
    int age;
    String name;

    void have_birthday(String name , int age){
        this.name = name;
        this.age = age;
        age = age + 1;
        System.out.println(name + " is " + age + " years old.");

    }
}
