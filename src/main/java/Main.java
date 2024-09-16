import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Voorbeeldlijst
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(10);

        // Roep de functie aan en print het resultaat
        List<Integer> result = getEvenDivisions(numbers);
        System.out.println(result);  // Output: [1, 2]
    }

    // Functie om lijst terug te geven met aantal delingen door 2
    public static List<Integer> getEvenDivisions(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>(); // Nieuwe lijst voor resultaten

        for (int number : numbers) {
            if (number % 2 == 0) { // Controleer of het getal even is
                int count = 0;

                // Deel door 2 totdat het oneven wordt
                while (number % 2 == 0) {
                    number /= 2;
                    count++;
                }

                // Voeg het aantal delingen door 2 toe aan de resultaatlijst
                result.add(count);
            }
        }

        return result; // Geef de resultaatlijst terug
    }
}