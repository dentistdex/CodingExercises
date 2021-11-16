public class EqualityPrinter {
    public static void printEqual (int x, int y, int z) {
        if (x < 0 | y < 0 | z < 0) {
            System.out.println("Invalid Value");
        }else if (x != y &&  x != z && y != z) { // neden x = y = z yazamıyoruz ? boolean kabul ediyor ?
            System.out.println("All numbers are different");
        }else if (x == y && x != z || y == z && x != z || x == z && x != y) {
            System.out.println("Neither all are equal or different");
        }else {
            System.out.println("All numbers are equal");
        }
    }
}
