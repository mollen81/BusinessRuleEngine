import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEngine {

   private final List<Action> actions;

   private final Facts facts;


   public BusinessRuleEngine(final Facts facts) {
       this.actions = new ArrayList<>();
       this.facts = facts;
   }

    public void addAction(Action action) {
        this.actions.add(action);
    }

    public void run() {
        this.actions.forEach(action -> action.execute(facts));
    }

    public int count() {
        return this.actions.size();
    }
}
