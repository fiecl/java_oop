package Models;

import Services.StudentService;

public class Student extends Person implements StudentService {

    // properties
    private long studentId;
    private String education;
    private String school;
    private String level;

    // constructors
    public Student() {
        super();
        this.studentId = 0;
        this.education = "insertEducation";
        this.school = "insertSchool";
        this.level = "insertLevel";
    }

    public Student(
        String firstName,
        String lastName,
        byte age,
        String gender,
        String nationality,
        long studentId,
        String education,
        String school,
        String level
        ) {
        super(firstName, lastName, age, gender, nationality);
        this.studentId = studentId;
        this.education = education;
        this.school = school;
        this.level = level;
    }

    // getters and setters
    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    // abstract methods implementation
    @Override
    public void personMethod1() {
        System.out.println("Calling personMethod1() from the parent class 'Person'");
    }

    @Override
    public void personMethod2() {
        System.out.println("Calling personMethod2() from the parent class 'Person'");
    }

    // interface methods implementation
    @Override
    public void studentMethod1() {
        System.out.println("Overriding studentMethod1() from interface 'StudentServiceImpl'");
    }

    @Override
    public void studentMethod2() {
        System.out.println("Overriding studentMethod2() from interface 'StudentServiceImpl'");
    }

    @Override
    public void studentMethod3() {
        System.out.println("Overriding studentMethod3() from interface 'StudentServiceImpl'");
    }

    // useful methods to override
    @Override
    public String toString() {
        return "This is the result when you print the Student class";
    }
    public static void main(String[] args) {
        Student defaultStudent = new Student();
        Person defaultStudent2 = new Student(); // INTERESTING EXAMPLE
        Student completeStudent = new Student(
            "Saki",
            "Tenma",
            (byte) 16,
            "Female",
            "Japanese",
            1,
            "High School",
            "Project Sekai High School",
            "2nd year"
        );

        System.out.println(defaultStudent);
        System.out.println(defaultStudent2);
        System.out.println(completeStudent);
    }
}