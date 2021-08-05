public class Patient {

    private String name;
    private int age;
    private String bloodGroup;

    public Patient(String name, int age, String bloodGroup) {
        this.setName(name);
        this.setAge(age);
        this.setBloodGroup(bloodGroup);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBloodGroup(String bloodGroup) {
        if(bloodGroup.equals("A") || bloodGroup.equals("B") || bloodGroup.equals("AB") || bloodGroup.equals("O")) {
            this.bloodGroup = bloodGroup;
        } else {
            System.out.println("Invalid blood group !");
        }
    }

    @Override
    public String toString() {
        return String.format("Patient{name: %s, age: %d, bloodGroup: %s}", this.getName(), this.getAge(), this.getBloodGroup());
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getBloodGroup() {
        return this.bloodGroup;
    }

}
