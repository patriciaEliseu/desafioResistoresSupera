package exemplo;

import java.util.List;
import java.util.Scanner;
import java.lang.Enum;

public class CodigosDeCores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual valor de ohms? ");
        String valorDeOhms = scanner.next();
        scanner.close();

        System.out.println(valorDeOhms + " ohms");

        if (valorDeOhms.toLowerCase().contains("k")) {
            String valorSemK = valorDeOhms.replace("k", "")
                    .replace("K", "");

           double valorConvertido = Double.parseDouble(valorSemK) * 1000;
            System.out.println((int) valorConvertido);
        } else if (valorDeOhms.toLowerCase().contains("m")) {
            String valorSemM = valorDeOhms.replace("M", "")
                    .replace("m", "");
            double valorConvertido = Double.parseDouble(valorSemM) * 1000000;
            System.out.println((int)valorConvertido);
        } else {
            int valorConvertido = Integer.parseInt(valorDeOhms);
            System.out.println(valorConvertido);
        }


    }
}


