import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getPercentFull() {
        assert(true);
    }


    @Test
    void getLiquidType() {
        Cup c = new Cup("Orange Juice",85.3);
        assertEquals("Orange Juice",c.getLiquidType());
    }
}