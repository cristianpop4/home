package homeworks.session6;

public class StringReplacement {
    public static void main(String[] args) {
        String text = "ana are mere ana";
        String target = "ana";
        String replacement = "ANA";
        StringBuilder sb = new StringBuilder(text);
        int index = sb.indexOf("ana");
        while (index != -1){
            sb.replace(index, index + target.length() , replacement);
            index = sb.indexOf(target , index + replacement.length());
        }

        System.out.println(sb.toString());
    }
}
