package ComparatorDemo;

public class Student {
    private String name, surname;
    private int age;
    private double avrgGrade;

    public Student(String name, String surname, int age, double avrgGrade) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.avrgGrade = avrgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvrgGrade() {
        return avrgGrade;
    }

    public void setAvrgGrade(double avrgGrade) {
        this.avrgGrade = avrgGrade;
    }

    public String getFullName(){
        return getName() + " " + getSurname();
    }

    @Override
    public String toString() {
        return " Student { " + getFullName() + " AGE: " + getAge() + " AVRG: " + getAvrgGrade() + " } ";
    }
}
