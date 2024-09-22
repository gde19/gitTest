package Builder;

// Пример использования
public class Main {
    public static void main(String[] args) {
        // Создание объекта Car через Builder
        Car car = new Car.CarBuilder()
                .setModel("Sedan")
                .setEngine("V8")
                .setSeats(5)
                .setAirConditioning(true)
                .build();

        System.out.println("Модель: " + car.getModel());
        System.out.println("Двигатель: " + car.getEngine());
        System.out.println("Кол-во мест: " + car.getSeats());
        System.out.println("Кондиционер: " + (car.hasAirConditioning() ? "Есть" : "Нет"));
    }
}
