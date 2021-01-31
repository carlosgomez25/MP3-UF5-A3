package exemple.org;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        CSVNacimientosBcn parser = new CSVNacimientosBcn();
        Menu menu = new Menu();


        menu.start(parser.parse());

    }
}
