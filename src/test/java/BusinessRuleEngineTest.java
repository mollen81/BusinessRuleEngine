import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BusinessRuleEngineTest {
    @Test
    public void shouldHaveNoRulesInitially() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        assertEquals(0, businessRuleEngine.count());
    }

    @Test
    public void shouldAddTwoActions() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        businessRuleEngine.addRule(() -> {});
        businessRuleEngine.addRule(() -> {});

        assertEquals(2, businessRuleEngine.count());
    }

    @Test
    public void shouldExecuteOneAction() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
        final Action mockAction = mock(Action.class);

        businessRuleEngine.addRule(mockAction);
        businessRuleEngine.run();

        verify(mockAction).execute();
    }
}
