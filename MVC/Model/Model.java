package Model;

import Controller.User;
import Interface.IUser;

public class Model {
  public Model() {
    System.out.println("Iniciando conexão com o banco de dados");
  }

  public IUser createUser(String username, String password) {
    System.out.println("Usuário " + username + " está sendo salvo no banco de dados...\n");
    return new User(username, password);
  }
}
