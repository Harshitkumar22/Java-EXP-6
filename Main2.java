final class SecuritySystem{
    String usename;
    String password;
    public void authenticateUser(String username, String password){    
        if(username=="admin" && password=="password123"){
            System.out.println("Authentication successful!");
        } else{
            System.out.println("Authentication failed!");
        }
    }
}

// Attempting to inherit from a final class (This will cause a compilation error)
// class AdvancedSecurity extends SecuritySystem {
//     @Override
//     public void authenticateUser(String username, String password) {
//         // Modified authentication logic (Security risk)
//         System.out.println("Unauthorized override attempt!");
//     }
// }


public class Main2{
    public static void main(String[] args){
        // Create an instance of SecuritySystem
        SecuritySystem system=new SecuritySystem();
        
        // Test authentication
        system.authenticateUser("admin", "password123"); // Valid credentials
        system.authenticateUser("user", "wrongpass");    // Invalid credentials
    }
}
