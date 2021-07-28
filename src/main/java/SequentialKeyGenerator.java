import java.util.*;
public class SequentialKeyGenerator {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        String link = "a";
        int i = 0;
        while(!link.equals("stop"))
        {
            link = console.next();
            if(link.equals("stop"))
            {
                break;
            }
            String shortened = orderedKey(i);
            map.put(shortened, link);
            System.out.println(shortened);
            i++;
        }

    }

    public static String orderedKey(int count)
    {
        if(count < 9999)
        {
            String padded = String.format("%08d", count);
            return padded;
        }
        String a = "aaaaaaaa";
        String letters = a.substring(0, 7);
        char letter = (char)(97 + (count - 10000));
        letters += letter;
        return letters;
    }
}
