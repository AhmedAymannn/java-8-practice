import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int permissionReq = 3;
        // Define each User with a unique variable name
        User adminUser = new User("Ahmed_Admin", 10, true);
        User devUser = new User("Sohila_Dev", 6, true);
        User guestUser = new User("Guest_01", 2, true);
        User offlineManager = new User("Zaid_Manager", 9, false);

        List<User> userList = new ArrayList<>();
        userList.add(adminUser);
        userList.add(devUser);
        userList.add(guestUser);
        userList.add(offlineManager);

        // product
        Product phone = new Product("Galaxy S24", 30000.0);


        Function <Double , Double> blackFridayDiscount = (p)-> p*0.50;
        Function <Double , Double> goldCustomersDiscount = (p)->p*0.02;
        Function <Double , Double> premiumCustomersDiscount=(p)->p*0.03 ;

        PricingEngine.calculate(phone,blackFridayDiscount) ;


//        Scanner sc  = new Scanner(System.in);
        // check for Online
        Predicate<User> isOnline = (user) -> {
            if (user.isSystemActive() == true) {
                return true;
            }
            return false;
        };
        // check Access Guard
        SecurityValidator securityValidator = (user, requiredLevel) -> {
            if (user.getSecurityLevel() >= requiredLevel) {
                return true;
            }
            return false;
        };

        for (int i = 0; i < userList.size(); i++) {
            User currentUser = userList.get(i);
//             1 : check for online

            if (isOnline.test(currentUser) && securityValidator.validate(currentUser, permissionReq)) {
                System.out.println(currentUser.getUsername() + " Logged In successfully ");
            } else {
                System.out.println(currentUser.getUsername() + " Failed To Login ");
            }


        }


    }
}
