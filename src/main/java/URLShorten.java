public class URLShorten {
    private static final RandomKeyGenerator randomKeyGenerator = new RandomKeyGenerator();
    private static final URLMap urlMap = URLMap.getInstance();
    public static void generateShortURL(String link, int time)
    {
        String key = randomKeyGenerator.randomKey(link);
        while(urlMap.contains(key))
        {
            key = randomKeyGenerator.randomKey(link);
        }
        urlMap.putEntry(key, link);
    }

}
