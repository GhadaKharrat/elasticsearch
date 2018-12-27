import org.assertj.core.api.Assertions;
import org.junit.Test;

public class applicationTest {

    @Test
    public void testApp(){
        Assertions.assertThat("1").isEqualTo("1");
    }
}
