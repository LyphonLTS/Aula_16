import java.util.ArrayList;

import Interface.IUser;
import Interface.UserDAO;

public class UserDAOConrete implements UserDAO {
  private ArrayList<IUser> users;

  public UserDAOConrete(String username, String password) {
    this.users = new ArrayList<>();

    this.saveUser(username, password);
  }

  @Override
  public ArrayList<IUser> getAllUsers() {
    return users;
  }

  @Override
  public IUser getUserById(int id) {
    return users.get(id);
  }

  @Override
  public boolean updateUser(String username, String password, int id) {
    if (!username.equals("") && !password.equals("") && 0 < id) {
      this.users.get(id).setPassword(password);
      this.users.get(id).setUsername(username);

      return true;
    }

    return false;
  }

  @Override
  public void deleteUser(int id) {
    this.users.get(id);
  }

  @Override
  public boolean saveUser(String username, String password) {
    if (!username.equals("") && !password.equals("")) {
      this.users.add(new User(username, password));

      return true;
    }

    return false;
  }
}
