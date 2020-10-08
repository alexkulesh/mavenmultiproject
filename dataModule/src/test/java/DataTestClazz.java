
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class DataTestClazz {

    @Test
    public void testGetters_Setters(){
        DataClazz dataClazz1 = new DataClazz();
        dataClazz1.setName("Nick");
        dataClazz1.setNum(1);
        assertEquals(dataClazz1.getName(), "Nick");
        assertEquals(dataClazz1.getNum(), 1);
    }
}
