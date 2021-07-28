import java.util.*;
public class URLMap {
    private static URLMap instance = null;
    private static final Map<String, String> urlMap = new HashMap<>();
    public static URLMap getInstance()
    {
        if(instance == null)
        {
            instance = new URLMap();
        }
        return instance;
    }
    public void putEntry(String key, String link)
    {
        urlMap.put(key, link);
    }
    public String getValue(String key)
    {
        return urlMap.get(key);
    }
    public boolean contains(String key)
    {
        return urlMap.containsKey(key);
    }
}
