class Student {
    private String name;
    private  String surname;
    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Student()
    {
        name = "Null";
        surname = "Null";
    }

    public Student(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public boolean PassExam() {
        return true;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
    public void printNameSurnameAge() {
        System.out.println(name + " " + surname + " " + age);
    }

    public void printGrade() {
        System.out.println("This is printing method");
    }
}

class StudentWithWeight extends Student {
    private double weight;

    StudentWithWeight (String name, String surname, int age, double weight) {
        super(name, surname, age);
        this.weight = weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
}

class StudentWithLightLongHair extends StudentWithWeight {
    private int longOfHair;
    StudentWithLightLongHair(String name, String surname, int age, double weight, int longOfHair) {
        super(name, surname, age, weight);
        this.longOfHair = longOfHair;
    }

}


public class Main {

    public static void main(String[] args) {
        Student stud1 = new Student("Zybenko", "Mykhailo");

        System.out.println(stud1.getName());
        System.out.println(stud1.getSurname());
        stud1.printGrade();
        stud1.setAge(22);
        stud1.setName("Sokolov");
        System.out.println(stud1.getAge());
        System.out.println(stud1.getName());
        System.out.println(stud1.getSurname());

        Student stud2 = new Student();
        System.out.println(stud2.getName());
        System.out.println(stud2.getSurname());
        stud1.printNameSurnameAge();
        System.out.println(stud1);

        StudentWithWeight studW1 = new StudentWithWeight("Augusto", "Pinochet", 20, 100);

        System.out.println(studW1.getWeight());
        StudentWithLightLongHair studWithLongHair = new StudentWithLightLongHair("Vasya", "Linolyum", 20, 100, 10);
        System.out.println(studWithLongHair);

    }

}

