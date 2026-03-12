import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEngine {

   private final List<Action> actions;


   public BusinessRuleEngine() {
       this.actions = new ArrayList<>();
   }


    public void addRule(Action action) {
        this.actions.add(action);
    }

    public void run() {
        this.actions.forEach(Action::execute);
    }

    public int count() {
        return this.actions.size();
    }
}
