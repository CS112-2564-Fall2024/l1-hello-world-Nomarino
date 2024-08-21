class Car {
    private String year;
    private String make;
    private String model;
    private String color;
    private String car;
    private String newCar;

    //Default constructor
    public Car() {
        car = "Unknown";
    }

    //Full constructor
    public Car(String year, String make, String model, String color) {
        car = newCar;
    }

    //setter
    public void setYear(String year) {
        this.year = year;
    }

    //getter
    public String getYear() {
        return year;
    }

    //setter
    public void setMake(String make) {
        this.make = make;
    }

    //getter
    public String getMake() {
        return make;
    }

    //setter
    public void setModel(String model) {
        this.model = model;
    }

    //getter
    public String getModel() {
        return model;
    }

    //setter
    public void setColor(String color) {
        this.color = color;
    }

    //getter
    public String getColor() {
        return color;
    }

    //toString
    public String toString() {
        return "Your dream car is a: " + color + " " + year + " " + make + " " + model;
    }

    //equals
    public boolean equals(Car userCar) {
        return car == newCar;
    }
}
