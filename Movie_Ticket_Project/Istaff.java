
public interface IStaff {
    String getId();
    String getUsername();
    String getPassword();
    String getPosition();
    
 boolean can (String action);
}
