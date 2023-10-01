package task1;
import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.*;

//библиотека Random

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int mas_1[] =new int[10];
        for(int i = 0; i < 10;i++){
            mas_1[i] = rand.nextInt(20);
            System.out.print(mas_1[i] + " ");
        }
        System.out.print("\n");
        Arrays.sort(mas_1);
        for(int i = 0; i < 10;i++){
            System.out.print(mas_1[i] + " ");
        }

        System.out.print("\n");


        double mas_2[] =new double[10];
        for(int i = 0; i < 10;i++){
            mas_2[i] = Math.random() * 20;
            System.out.print(mas_2[i] + " ");
        }

        System.out.print("\n");
        Arrays.sort(mas_2);
        for(int i = 0; i < 10;i++){
            System.out.print(mas_2[i] + " ");
        }
    }
}