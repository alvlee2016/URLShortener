public class LinkRemoval implements Runnable{
    private static final URLMap urlMap = URLMap.getInstance();
    @Override
    public void run()
    {
        while(true)
        {
            try{
                Thread.sleep(60000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
