import java.util.*;
public class RandomKeyGenerator {
    public static HashMap<String, String> map = new HashMap<>();
//    public static void main(String[] args)
//    {
//        Scanner console = new Scanner(System.in);
//
//        String link = console.next();
//        String shortened = randomKey(link);
//        System.out.println(shortened);
//    }
    public String randomKey(String link)
    {
        if(link.length() == 0)
        {
            return null;
        }
        String key = "";
        Random rand = new Random();
        for(int i = 0; i < 8; i++)
        {
            int a = (int)(Math.random() * 26) + 97;
            char b = (char)a;
            key += b;
        }
        if(map.containsKey(key))
        {
            randomKey(link);
        }
        else
        {
            map.put(key, link);
        }
        return key;
    }
}
