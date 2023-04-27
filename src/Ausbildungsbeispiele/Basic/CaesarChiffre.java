package Ausbildungsbeispiele.Basic;

public class CaesarChiffre {
    public static void main(String[] args) {


        String plainText = "Ein Charakter namens Caesar!";
        int key = 6;
        char plaintextChar;
        String encryptedText = "";


        for (int i = 0; i <= plainText.length()-1; i++) {
            plaintextChar = plainText.charAt(i);
            if (plaintextChar >= 'a' && plaintextChar <= 'z') {
                plaintextChar = (char) (plaintextChar + key);

                if (plaintextChar > 'z') {
                    plaintextChar = (char) (plaintextChar - 'z' + 'a' - 1);
                }
                encryptedText += plaintextChar;
            } else if (plaintextChar >= 'A' && plaintextChar <= 'Z') {
                plaintextChar = (char) (plaintextChar + key);

                if (plaintextChar > 'Z') {
                    plaintextChar = (char) (plaintextChar - 'Z' + 'A' - 1);
                }
                encryptedText += plaintextChar;
            } else {
                encryptedText += plaintextChar;
            }

        }
        System.out.println("Original Text: " + plainText + "\n");
        System.out.println("Encrypted Text: " + encryptedText);



    }
}