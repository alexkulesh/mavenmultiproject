import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;


public class DataServiceTest {
    @Test
    public void serviceTest(){
        DataService dataService = new DataService();
        DataClazz dataClazz = new DataClazz();
        dataClazz.setName("Mike");
        assertEquals(dataService.enrichValue(dataClazz), "Value is Mike");
    }
}
