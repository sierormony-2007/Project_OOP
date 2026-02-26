
public class CashierStaff implements IStaff {

    private String id;
    private String username;
    private String password;

    public CashierStaff(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getPosition() { return "Cashier"; }

    public boolean can(String action) {

        if (action == null) return false;

        return action.equals(Cinema.SELL_TICKET)
                || action.equals(Cinema.VIEW_MOVIES);
    }
}