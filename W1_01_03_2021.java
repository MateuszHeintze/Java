import java.util.Scanner;

public class W1_01_03_2021 {

    public static void main(String[] args){
        System.out.println("Wprowadź nazwisko: ");
        Scanner scanner = new Scanner(System.in);
        String nazwisko = scanner.nextLine();
        if (nazwisko.charAt(0) == 'H'){
            System.out.println("Pierwsza litera to 'H'. Litera zostaje");
        }
        else {
            nazwisko = nazwisko.replaceFirst("\\w","");
        }

        String zmiana = nazwisko.replace('i','e');
        String zmiana1 = zmiana.replace('y','e');
        String zmiana2 = zmiana1.replace('p','b');
        String zmiana3 = zmiana2.replace('k','c');
        String zmiana4 = zmiana3.replace('s','c');
        String zmiana5 = zmiana4.replace('t','d');
        String zmiana6 = zmiana5.replace('j','g');
        String zmiana7 = zmiana6.replace('n','m');
        String zmiana8 = zmiana7.replace('w','v');


        System.out.println("Zmienione nazwisko to: " + zmiana8);
    }
}
