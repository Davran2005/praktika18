public class MyClass implements Inter{
    private String name;
    private int age;


    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public void myMethod() {
        System.out.println(getName() + "he is a student");
    }

    @Override
    public void myMethod2() {
        System.out.println(getAge() + "His birthday is in april");
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
