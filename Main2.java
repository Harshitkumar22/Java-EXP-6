class SecuritySystem{
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

public class Main2{
    public static void main(String[] args){
        // Create an instance of SecuritySystem
        SecuritySystem system=new SecuritySystem();
        
        // Test authentication
        system.authenticateUser("admin", "password123"); // Valid credentials
        system.authenticateUser("user", "wrongpass");    // Invalid credentials
    }
}
