package web.model;

public class Car {

    private String model;
    private String serial;


    public Car() {
    }

    public Car(String model, String serial) {
        this.model = model;
        this.serial = serial;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                ", date=" +
                '}';
    }
}