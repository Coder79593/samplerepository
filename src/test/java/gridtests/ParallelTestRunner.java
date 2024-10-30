package gridtests;

public class ParallelTestRunner {
    public static void main(String[] args) {
    	
    	long startTime = System.currentTimeMillis();
        // Create threads for each test
        Thread googleTest = new Thread(new GoogleTest());
        Thread bingTest = new Thread(new BingTest());
        Thread yahooTest = new Thread(new YahooTest());
        Thread wikipediaTest = new Thread(new WikipediaTest());
        Thread youtubeTest = new Thread(new YouTubeTest());
        Thread amazonTest = new Thread(new AmazonTest());
        Thread facebookTest = new Thread(new FacebookTest());

        // Start all the threads
        googleTest.start();
        bingTest.start();
        yahooTest.start();
        wikipediaTest.start();
        youtubeTest.start();
        amazonTest.start();
        facebookTest.start();

        // Wait for all threads to complete
        try {
            googleTest.join();
            bingTest.join();
            yahooTest.join();
            wikipediaTest.join();
            youtubeTest.join();
            amazonTest.join();
            facebookTest.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long endTime = System.currentTimeMillis();

        System.out.println("Total Execution Time: " + (endTime - startTime) + " ms");
    }
}
