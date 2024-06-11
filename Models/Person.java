package Models;

public abstract class Person {

    // properties
    private String firstName;
    private String lastName;
    private byte age;
    private String gender;
    private String nationality;

    // constructors
    public Person() {
        this.firstName = "insertFirstName";
        this.lastName = "insertLastName";
        this.age = 0;
        this.gender = "insertGender";
        this.nationality = "insertNationality";
    }

    public Person(String firstName, String lastName, byte age, String gender, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // abstract methods
    public abstract void personMethod1();
    public abstract void personMethod2();

    // concrete methods
    public void personConcreteMethod1() {
        System.out.println("Concrete method example 1");
    }

    @Override
    public String toString() {
        return "This is the result when you print the Person class";
    }
}