package module2;

public class FindLargest_3 {
    public static void main(String[] args) {
        int x = 100, y = 88, z = 12; //our initial numbers

        int largest; //defining the variable

        if (x >= y && x >= z) { //checking if x is largest
            largest = x;
            System.out.println("Largest  is x: " + largest); //prints out the result
        } else if (y >= x && y >= z) { //checking if y is largest
            largest = y;
            System.out.println("Largest number is y: " + largest); //prints out the result
        } else { //checking if z is largest
            largest = z;
            System.out.println("Largest number is z: " + largest); //prints out the result
        }
    }
}