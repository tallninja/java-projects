public class Person {

    private String name;
    private int age;
    private char gender;
    public static int numOfPeople = 0;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        numOfPeople++;
    }

}
