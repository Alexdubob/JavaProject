public class GaudiMitStatistikV1 {
    public static void main(String[] args) {


        String content= "Unter #Handy finden sich 6 große Anbieter, 2 davon sind aber die besten!";
        int lowerCase = 0;
        int signs = 0;
        int numbers = 0;
        int upperCase = 0;

        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);

            if (c >= '0' && c <= '9')
                numbers++;
            else if (c >= 'A' && c <= 'Z')
                upperCase++;
            else if (c >= 'a' && c <= 'z')
                lowerCase++;
            else if (c >= ' ' && c <= '/')
                signs++;
        }
        System.out.println("Großbuchstaben " + upperCase);
        System.out.println("Kleinbuchstaben " + lowerCase);
        System.out.println("Zahlen " + numbers);
        System.out.println("Stonstige Zeichen "+ signs);







        }
}

