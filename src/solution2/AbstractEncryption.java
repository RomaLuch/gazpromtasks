package solution2;

public abstract class AbstractEncryption implements Crypt{

    private String text;
    private String key;

    public AbstractEncryption(String text, String key) {
        this.text = text;
        this.key = key;
    }


    @Override
    public abstract String crypt();
}
