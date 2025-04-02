import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] number1 = new int[]{1, 2, 3};
        double[] number2 = new double[]{1.57, 7.654, 9.986};
        String[] word = new String[]{"Backend", "разработчик", "Java"};


        for(int i = 0; i < number1.length; i++){
            System.out.print(number1[i]);
            if(i < number1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0; i < number2.length; i++){
            System.out.print(number2[i]);
            if (i < number2.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0; i < word.length; i++){
            System.out.print(word[i]);
            if (i < word.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}