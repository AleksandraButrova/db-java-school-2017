public class Main {
    public static void main(String[] args) {
        int counter = 0;
        double arrDouble[] = {1.111, 1, 2, 2.121};
        int arrInt[] = new int[arrDouble.length];


        for(double d : arrDouble) {
            if ((int) d == d) {
                arrInt[counter] = (int) d;
                counter++;
            }
        }

        System.out.println("Скопированных элементов: " + (counter - 1));
        for(int i = 0; i < counter; i++){
           System.out.printf(i + ": " + arrInt[i] + "\n");
        }
    }
}
