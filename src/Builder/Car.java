package Builder;

// Класс Car
public class Car {

    private String model;
    private String engine;
    private int seats;
    private boolean airConditioning;

    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.airConditioning = builder.airConditioning;
    }

    // Геттеры для параметров
    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public boolean hasAirConditioning() {
        return airConditioning;
    }


    public static class CarBuilder {

        private String model;
        private String engine;
        private int seats;
        private boolean airConditioning;


        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setAirConditioning(boolean airConditioning) {
            this.airConditioning = airConditioning;
            return this;
        }

        public Car build() {
            return new Car(this); 
        }
    }
}

