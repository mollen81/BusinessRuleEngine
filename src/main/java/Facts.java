import java.util.HashMap;
import java.util.Map;

public class Facts {

    private final Map<String, String> facts = new HashMap<>();

    public String getFact(final String factName) {
        return facts.get(factName);
    }

    public void addFact(final String factName, final String factValue) {
        facts.put(factName, factValue);
    }
}
