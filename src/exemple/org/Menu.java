package exemple.org;

import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    void start(CsvToBean<Nacimientos> naixementCsvToBean) {

        String menu = "";

        while (!(menu.equals("5"))){
            System.out.println("--MENU PRINCIPAL--");
            System.out.println("1. Nacimientos de Italia");
            System.out.println("2. Nacimientos de paises que empiezan por F");
            System.out.println("3. Nacimientos de Clot");
            System.out.println("4. Nacimientos que empiecen por Ciutat");
            System.out.println("5. Sortir");

            menu = input.nextLine();
            CsvToBean<Nacimientos> llista = naixementCsvToBean;

            switch(menu){
                case "1":
                    llista.stream()
                            .filter(naixement -> naixement.getLloc_de_naixement().contains("Itàlia"))
                            .count());
                    break;

                case "2":
                    System.out.println(llista.stream()
                            .filter(naixement -> naixement.getLloc_de_naixement().equals("F"))
                            .forEach(System.out::println);
                    break;

                case "3":
                    llista.stream()
                    .filter(naixement -> naixement.getNom_Barri().equals("el Clot"))
                        .forEach(System.out::println);
                    break;

                case "4":
                    llista.stream()
                        .filter(naixement -> naixement.getNom_Districte().contains("Sant"))
                        .forEach(System.out::println);

                    break;

            }
        } }
}
