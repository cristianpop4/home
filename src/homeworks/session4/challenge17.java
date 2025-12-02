package homeworks.session4;

public class challenge17 {
    public static void main(String[] args) {
        boolean hasUsername = true;
        boolean hasPassword = false;
        if (hasUsername == true && hasPassword == true){
            System.out.println("Authentication successful");
        } else if (hasUsername == false && hasPassword == false) {
            System.out.println("Authentication failed");
        } else if (hasUsername == true && hasPassword == false) {
            System.out.println("Passwword is incorect");
        }
    }
}
