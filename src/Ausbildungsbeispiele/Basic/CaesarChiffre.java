package Ausbildungsbeispiele.Basic;

public class CaesarChiffre {
    public static void main(String[] args) {


        String plainText = "Ein Charakter namens Caesar!";
        char plainTextChar;
        String encryptedText = "";
        int key = 26;

        for (int i = 0; i <= plainText.length()-1; i++) {
            plainTextChar = plainText.charAt(i);
            if (plainTextChar >= 'a' && plainTextChar <= 'z') {
                plainTextChar = (char) (plainTextChar + key);

                if (plainTextChar > 'z') {
                    plainTextChar = (char) (plainTextChar - 'z' + 'a' - 1);
                }
                encryptedText += plainTextChar;
            } else if (plainTextChar >= 'A' && plainTextChar <= 'Z') {
                plainTextChar = (char) (plainTextChar + key);

                if (plainTextChar > 'Z') {
                    plainTextChar = (char) (plainTextChar - 'Z' + 'A' - 1);
                }
                encryptedText += plainTextChar;
            } else {
                encryptedText += plainTextChar;
            }

        }
        System.out.println("Original Text: " + plainText + "\n");
        System.out.println("Encrypted Text: " + encryptedText);



    }
}