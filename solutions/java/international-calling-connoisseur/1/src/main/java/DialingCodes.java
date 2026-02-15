import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    Map<Integer, String> dialingCodes = new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(getCountry(code) == null && !dialingCodes.containsValue(country)){
            setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for(Map.Entry<Integer, String> entry : dialingCodes.entrySet()) {
            if(entry.getValue().equals(country)){
                return entry.getKey();
            }
        }

        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        int old_code = findDialingCode(country);
        if(getCountry(old_code) != null){
            dialingCodes.remove(old_code);
            setDialingCode(code, country);
        }
    }
        
}
