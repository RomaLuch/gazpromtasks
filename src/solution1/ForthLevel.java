package solution1;

import java.util.HashMap;
import java.util.Map;

public class ForthLevel {
    private Map<ThirdLevel, SecondLevel> benfAndCatToCtx = new HashMap<>();

    public Map<ThirdLevel, SecondLevel> getBenfAndCatToCtx() {
        return benfAndCatToCtx;
    }

    public void setBenfAndCatToCtx(Map<ThirdLevel, SecondLevel> benfAndCatToCtx) {
        this.benfAndCatToCtx = benfAndCatToCtx;
    }

}
