package Interface;

import java.util.ArrayList;

public interface UserDAO {
  public ArrayList<IUser> getAllUsers();

  public IUser getUserById(int id);

  public boolean updateUser(String username, String password, int id);

  public void deleteUser(int id);

  public boolean saveUser(String username, String password);
}
