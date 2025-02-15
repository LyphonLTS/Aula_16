package Controller;

import Interface.IUser;

public class User implements IUser {
  private String username;
  private String password;

  public User(String username, String password) {
    this.password = password;
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString() {
    return "Username: " + this.getUsername() + "\nPassword: " + this.getPassword();
  }
}
