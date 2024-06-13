import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class array {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        String color[] = {"Red", "Green", "Blue", "Black", "White"};
        System.out.print("Memorize Game Generator\n\nRules: \nYou should remember the animal names and order!\nInput back the animal name in the correct order\nyour score start at 100 point\neach wrong answer your score will deducted by 10 point\nPress enter if you're ready...");
        String skip = string.nextLine();
        for(int i = 0; i < color.length; i++){
            System.out.println((i+1)+". "+ color[i]);
        }
        System.out.println("Rewrite the colors in the correct order");
        // Konversi array menjadi List
        List<String> list = Arrays.asList(color);

        // Mengacak List
        Collections.shuffle(list);

        // Jika perlu mengkonversi kembali ke array
        String[] shuffledArray = list.toArray(new String[0]);

        // Menampilkan array yang sudah diacak
        System.out.println(shuffledArray);
        System.out.println(Arrays.toString(shuffledArray));





    }
}
