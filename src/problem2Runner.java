import java.util.Random;

public class problem2Runner {
    public static void main(String[] args) {
        Random random = new Random();
        Sensor[] array = new Sensor[5];

        double sum = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = new Sensor();
        }

        for(int i = 0; i<5; i++) {
            array[i].setReading(random.nextDouble(1000));
            array[i].setLocation("Tashkent");
        }

        for(int i=0; i<5; i++) {
            sum += array[i].getReading();
        }

        double average = sum/5;

        System.out.printf("Average: %.2f", average);

    }
}
