package solution2;

public class Test {
    public static void main(String[] args) {
        String key = "key";
        String text = "text";
        int alg = 1;

        Crypt encryption = new DEScrypt(text, key);
        String cryptedText = encryption.crypt();
    }
}
