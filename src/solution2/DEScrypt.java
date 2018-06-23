package solution2;

public class DEScrypt extends AbstractEncryption{
    public DEScrypt(String text, String key) {
        super(text, key);
    }

    private String cryptedString = null;

    @Override
    public String crypt() {
        //some action
        return cryptedString;
    }


/*
    public String DEScrypt(String text, String key) {
        String cryptedString = null;
        // some action
        return cryptedString;
    }

    public String RSAcrypt(String text, String key) {
        String cryptedString = null;
        // some action
        return cryptedString;
    }

    public String GOSTcrypt(String text, String key) {
        String cryptedString = null;
        // some action
        return cryptedString;
    }*/
}
