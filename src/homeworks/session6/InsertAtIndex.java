package homeworks.session6;

public class InsertAtIndex {
    public static void main(String[] args) {
        String text = "Hello world";
        StringBuilder sb = new StringBuilder(text);
        sb.insert(6 , "salut ");
        System.out.println(sb.toString());
    }
}
