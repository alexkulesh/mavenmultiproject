
public class DataService {
    private static final String PREFIX = "Value is ";

    public String enrichValue(DataClazz data) {
        return PREFIX.concat(data.getName());
    }

    public String getSomething(Integer id) {
        if (Integer.valueOf(1).equals(id)) {
            throw new IllegalArgumentException("No 1 value");
        }
        return id.toString();
    }
}
