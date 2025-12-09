package homeworks.session6;

public class MorseCodeConvertor {
    public static void main(String[] args) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."
        };
        String text = "java";
        text = text.toUpperCase();
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < text.length(); i++) {
            char c = sb.charAt(i);
            int index = letters.indexOf(c);
            if (index != -1) {
                sb.append(morse[index]).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
