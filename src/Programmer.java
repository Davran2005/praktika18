public class Programmer implements Inter{
    private String programmingLanguages;
    private String student;

    public Programmer(String programmingLanguages, String student) {
        this.programmingLanguages = programmingLanguages;
        this.student = student;
    }

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    @Override
    public void myMethod() {
        System.out.println(getProgrammingLanguages() + "Most popular programming language");
    }

    @Override
    public void myMethod2() {
        System.out.println(getStudent() + "Study well");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLanguages='" + programmingLanguages + '\'' +
                ", student='" + student + '\'' +
                '}';
    }
}
