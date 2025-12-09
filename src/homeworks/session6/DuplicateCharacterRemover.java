package homeworks.session6;

public class DuplicateCharacterRemover {
    public static void main(String[] args) {
        String text = "aadeeffgg";
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < text.length() ; i++){
            char c = text.charAt(i);
            boolean exista = false;
            for (int j = 0 ; j <sb.length() ; j++){
                if(sb.charAt(j) == c){
                    exista = true;
                    break;
                }
            }
            if (!exista){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
