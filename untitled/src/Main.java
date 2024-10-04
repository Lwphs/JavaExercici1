import java.util.Scanner;

import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Write a number from 1 to 10 (press Enter)");
        //Compando per a donar un output del programa a l'usuari
        int num1;
        do  {
            //Comando per a repetir una acció fins a tindre el número desitjat
            num1= input.nextInt();
            input.nextLine();
            if (num1 > 10 || num1 < 1){
                System.out.println("Please write that number again");
            }

        } while (num1 > 10 || num1 < 1 );
        System.out.println("Correct!");
    }


}