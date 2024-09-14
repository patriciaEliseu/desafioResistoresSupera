package exemplo;


import java.util.Scanner;



public class CodigosDeCores {



    static int valorConvertido;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual valor de ohms? ");
        String valorDeOhms = scanner.next();


        System.out.println(valorDeOhms + " ohms");

        if (valorDeOhms.toLowerCase().contains("k")) {
            String valorSemK = valorDeOhms.replace("k", "")
                    .replace("K", "");

            valorConvertido = (int) (Double.parseDouble(valorSemK) * 1000);
//            System.out.println(valorConvertido);
        } else if (valorDeOhms.toLowerCase().contains("m")) {
            String valorSemM = valorDeOhms.replace("M", "")
                    .replace("m", "");
            valorConvertido = (int) (Double.parseDouble(valorSemM) * 1000000);
//            System.out.println(valorConvertido);
        } else {
            valorConvertido = Integer.parseInt(valorDeOhms);
//            System.out.println(valorConvertido);
        }

        String valorStr = Integer.toString(valorConvertido);
        System.out.println(valorStr);
        String numerosResisters = valorStr.substring(0,2);
//        System.out.println(numerosResisters);
        int doisPrimeirosNumeros = Integer.parseInt(numerosResisters);
        int base = doisPrimeirosNumeros;
        int result = valorConvertido;
        int x = (result / base) / 10 ;
//        System.out.println(x);

        String[] cores = {"preto", "marrom", "vermelho", "laranja", "amarelo", "verde", "azul", "violeta", "cinza", "branco"};

        StringBuilder resultado = new StringBuilder();

        for (char digito : numerosResisters.toCharArray()) {
            int v = Character.getNumericValue(digito);
            resultado.append(cores[v]).append(", ");
        }
            if (x >= 0 && x < cores.length) {
                resultado.append(cores[x]).append(", ");
            }
        resultado.append("dourado");

        System.out.println(resultado);
        scanner.close();
    }


}


