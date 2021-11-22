package treemap;

public class Student1 implements Comparable <Student1> {
    private String name;
    private int age;
    private String addres;

    public Student1(String name, int age, String addres) {
        this.name = name;
        this.age = age;
        this.addres = addres;
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

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public int compareTo(Student1 o) {
        return  this.getName().compareTo(getName()) ;
    }

    @Override
    public String toString() {
        return "Hsinh{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addres='" + addres + '\'' +
                '}';
    }
}
