package solution3.task;

import java.util.HashMap;

public class ResponseCASoap {


    public HashMap propertyMap;
    public String log = "";
    public String result = "ERROR";

    public HashMap getPropertyMap() {
        return propertyMap;
    }

    public void setPropertyMap(
            HashMap parametrMap) {
        this.propertyMap = parametrMap;
    }

}
