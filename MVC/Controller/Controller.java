package Controller;

import Interface.IUser;
import Model.Model;

public class Controller {
  public Controller() {
    System.out.println("Acessando controlador");
  }

  public IUser createUser(String username, String password) {
    System.out.println("Enviando usuário " + username + " para a camada de modelo...\n");

    return new Model().createUser(username, password);
  }
}
