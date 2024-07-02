package ElecronicStore;

import java.util.ArrayList;
import java.util.List;

public class Estore {

    private List<Users> usersList = new ArrayList<>();
    private Users users;

    public void addUsers(int age,String email_address, String home_address,String name,String password,String phone) {
        Users user = new Users();
        user.setAge(age);
        user.setEmailAddress(email_address);
        user.setHomeAddress(home_address);
        user.setName(name);
        user.setPassword(password);
        user.setPhone(phone);
        usersList.add(user);
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Users getUsers() {
        return users;
    }

}
