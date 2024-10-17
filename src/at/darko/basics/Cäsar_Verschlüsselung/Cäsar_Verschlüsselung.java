package at.darko.basics.Cäsar_Verschlüsselung;

public class Cäsar_Verschlüsselung {

    public static void main(String[] args) {

        String result = encrypt("abc");
        String results = decrypt("cde");
        System.out.println(result);
    }

    public static String encrypt(String data) {
        char[] letters = data.toCharArray();
        for (char c : letters) {
            char letter = c;
            letter += 2;
            System.out.println("encrypted: " + letter);
        }
        return "";
    }

    public static String decrypt(String data) {
        char[] letters = data.toCharArray();
        for (char c : letters) {
            char letter = c;
            letter -= 2;
            System.out.println("decrypted: " + letter);
        }
        return "";
    }
}




