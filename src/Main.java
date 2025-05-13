import java.util.Scanner;

import static java.lang.System.out;


public class Main {
    public static int menu(Scanner sc) {
        out.println(
                "Sistema de eventos de Itajai \n"+
                        "Escolha as opções que deseja\n"+
                        "-----------------------------------\n"+
                        "[1] cadastrar usuario\n"+
                        "[2] Consultar eventos\n"+
                        "[3] Cadastrar Eventos\n"+
                        "[4] Consultar Usuarios\n"+
                        "[5] Sair\n"

        );
        return sc.nextInt();

            }
}