package exploringJavaConcepts;

public class Part2 {

    public static void main(String[] args){
        //Part 2: Increment and Decrement Operations
        System.out.println("Part 2: Increment and Decrement Operations ----");
        int counter = 10;
        counter++;
        counter--;

        System.out.println(counter);

        for(counter++ ; counter <= 15 ; counter++) {
            System.out.println(counter);
        }

        while(counter > 10){
            System.out.println(--counter);
        }
    }
}
