public class UserService {
    private UserDb userDb;

    public UserService(UserDb db) {
        userDb = db;
    }

    public String getRole(int id) {
        User result = userDb.get(id);
        if (result == null) return null;
        if(result.getRole() == 1)
            return "Admin";
        else if (result.getRole() == 2)
            return "Client";
        else
            return "User";
    }

    //dependency usage for mocking
    public User getUser(int id) {
        return userDb.get(id);
    }
}
