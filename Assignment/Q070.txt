
package Part6;

/**
 *
 * @author user
 */
public class Q070 {
//calculates the product
    public static int product(int... numbers) {

        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;


        System.out.printf("The product of a and b is: %d%n", product(a, b));

        System.out.printf("The product of a, b and c is: %d%n", product(a, b, c));

        System.out.printf("The product of a, b, c and d is: %d%n", product(a, b, c, d));

        System.out.printf("The product of a, b, c, d and e is: %d%n", product(a, b, c, d, e));

    }
}

