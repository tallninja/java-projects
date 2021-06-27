public class Person {

    private String name;
    private int age;
    private char gender;
    public static int numOfPeople = 0;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
        ++numOfPeople;
    }

    public void display() {
        System.out.printf("Name: %s %nAge: %d %nGender: %s %nNum of people: %d%n%n", this.getName(), this.getAge(), this.getGender(), this.numOfPeople);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
