import java.util.Scanner;

import Controller.Controller;
import Interface.IUser;

class View {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome de usuário: ");
    String username = scanner.nextLine();

    System.out.print("Digite a senha: ");
    String password = scanner.nextLine();

    System.out.println();
    scanner.close();

    IUser user = createUser(username, password);

    if (user != null) {
      System.out.println(user.toString());
    } else {
      System.out.println("Falha ao criar o usuário");
    }
  }

  public static IUser createUser(String username, String password) {
    System.out.println("Enviando dados para a camada de controle...\n");
    return new Controller().createUser(username, password);
  }
}