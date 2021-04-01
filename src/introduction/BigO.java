package introduction;

public class BigO {

    public static void main(String[] args) {
        final String[] nemo = new String[] {"nemo"};
        findNemo(nemo);
    }

    public static void findNemo(String[] array) {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("nemo")) {
                System.out.println("Found NEMO!");
            }
        }
        long t1 = System.currentTimeMillis();
        System.out.println("Call to find Nemo took " + (t1-t0) + " milliseconds");
    }
}
