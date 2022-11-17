public class Car implements Inter{
    private String logotip;
    private String model;

    public Car(String logotip, String model) {
        this.logotip = logotip;
        this.model = model;
    }

    public String getLogotip() {
        return logotip;
    }

    public void setLogotip(String logotip) {
        this.logotip = logotip;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void myMethod() {
        System.out.println(getLogotip() + "Most popular car");
    }

    @Override
    public void myMethod2() {
        System.out.println(getModel() + "Legendary car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "logotip='" + logotip + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
