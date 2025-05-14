import model.User;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;


public class Main {


    public static int menu(Scanner sc) {
        out.println(
                "Sistema de eventos de Itajai \n" +
                        "Escolha as opções que deseja\n" +
                        "-----------------------------------\n" +
                        "[1] cadastrar usuario\n" +
                        "[2] Consultar eventos\n" +
                        "[3] Cadastrar Eventos\n" +
                        "[4] Consultar Usuarios\n" +
                        "[5] Sair\n"

        );
        return sc.nextInt();
    }

    public static void createUser(Scanner sc, User user) {
        out.println("Cadastro de usuario");
        out.println("informe seu cpf");
        user.setId(sc.nextInt());
        out.println("informe seu nome");
        user.setFirstName(sc.next());
        out.println("informe seu sobrenome");
        user.setLastName(sc.next());
        out.println("informe seu email");
        user.setEmail(sc.next());
        out.println("informe seu endereco");
        user.setAddress(sc.next());
        out.println("informe seu telefone");
        user.setPhone(sc.next());
    }

    public static void readUser(List<User> users) {
        out.println("----------------");
        for (var user : users) {
            out.println("Nome: " + user.getFirstName() + " Sobrenome: " + user.getLastName());
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        var option = menu(sc);

        while (option > 0 && option <= 5) {
            switch (option) {
                case 1:
                    User User = new User();
                    createUser(sc, User);
                    option = menu(sc);
                    break;
                case 2:
                    readUser();
                    option = menu(sc);
            }
        }
    }
}