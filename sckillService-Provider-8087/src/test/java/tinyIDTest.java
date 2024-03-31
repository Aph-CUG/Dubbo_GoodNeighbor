import com.xiaoju.uemc.tinyid.client.utils.TinyId;
import org.junit.Test;


public class tinyIDTest {
    @Test
    public void testNextId() {
        for (int i = 0; i < 100; i++) {
            Long id = TinyId.nextId("test");
            System.out.println("current id is: " + id);
        }
    }
}
