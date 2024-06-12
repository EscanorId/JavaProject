import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        while(true){
            System.out.print("- My Store -\n\n1. Keyboard\n2. Keycaps\n3. Switch\n\nWhat do you want to buy? ");
            Integer category = num.nextInt();
            switch (category) {
                case 1:
                    System.out.print("1. Cidoo v75 Plus\n2. Rover84 v4 Lightyear Edition\n3. Monsgeek M1W\n4. Noir Timeless 82\nChoice : ");
                    Integer keyboard = num.nextInt();
                    switch (keyboard) {
                        case 1:
                            System.out.println("Cidoo v75 Plus | Rp. 1.570.000");
                            break;
                        case 2:
                            System.out.println("Rover84 v4 Lightyear Edition | Rp. 1.840.000");
                            break;
                        case 3:
                            System.out.println("Monsgeek M1W | Rp. 1.990.000");
                            break;
                        case 4:
                            System.out.println("Noir Timeless 82 | Rp. 1.320.000");
                            break;
                        default:
                            System.out.println("Input only 1-4");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("1. Cherry Profile - Retro Dark Lights PBT\n2. SA Profle - White on Black\n3. JSA Profile - Rust\n4. XDA Profile - Cinnamon Roll\nChoice : ");
                    Integer keycaps = num.nextInt();
                    switch (keycaps) {
                        case 1:
                            System.out.println("Cherry Profile - Retro Dark Lights | Rp. 384.000");
                            break;
                        case 2:
                            System.out.println("SA Profile - White on Black | Rp. 348.000");
                            break;
                        case 3:
                            System.out.println("JSA Profile - Rust | Rp. 320.000");
                            break;
                        case 4:
                            System.out.println("XDA Profile - Cinnamon Roll | Rp. 260.000");
                            break;
                        default:
                            System.out.println("Input only 1-4");
                            break;
                        }
                    break;
                case 3:
                    System.out.println("1. Gateron Milky Yellow\n2. KTT Kang White\n3. Wuque Studio Brown\n4. Akko Cream Yellow v3 Pro\nChoice : ");
                    Integer switchh = num.nextInt();
                    switch (switchh) {
                        case 1:
                            System.out.println("Gateron Milky Yellow | Rp. 3.200");
                            break;
                        case 2:
                            System.out.println("KTT Kang White | Rp. 2.900");
                            break;
                        case 3:
                            System.out.println("Wuque Studio Brown | Rp. 5.400");
                            break;
                        case 4:
                            System.out.println("Akko Cream Yellow v3 Pro | Rp. 3.000");
                            break;
                        default:
                            System.out.println("Input only 1-4");
                            break;
                        }
                    break;
                default:
                    System.out.println("Input only 1-3");
                    break;
            }
        }
    }
}
