public class Main {

    public static void main(String[] args) {
	int bottles = 99;

	while (bottles > 2) {
	    System.out.print(bottles);
        System.out.println(" bottles of beer on the wall,");
        System.out.print(bottles);
        System.out.println(" bottles of beer,");
        System.out.println("Take one down and pass it around,");
        System.out.print(bottles - 1);
        System.out.println(" bottles of beer on the wall!");
        System.out.println();
        bottles -= 1;
    }

    while (bottles == 2) {
        System.out.print(bottles);
        System.out.println(" bottles of beer on the wall,");
        System.out.print(bottles);
        System.out.println(" bottles of beer,");
        System.out.println("Take one down and pass it around,");
        System.out.print(bottles - 1);
        System.out.println(" bottle of beer on the wall!");
        System.out.println();
        bottles -= 1;
    }

    while (bottles == 1) {
        System.out.print(bottles);
        System.out.println(" bottle of beer on the wall,");
        System.out.print(bottles);
        System.out.println(" bottle of beer,");
        System.out.println("Take it down and pass it around,");
        System.out.println("No more bottles of beer on the wall!");
        bottles -= 1;
    }

    }
}
