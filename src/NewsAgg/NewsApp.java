package NewsAgg;
public class NewsApp {
    public static void main(String[] args) {
        NewsService service = new NewsService();

        // Add sources
        service.addSource(new Source(1, "TechCrunch", "Tech", 90));
        service.addSource(new Source(2, "ESPN", "Sports", 80));

        // Add subscribers
        Subscriber s1 = new FreeSubscriber(101, "Alice", "alice@mail.com", "Tech");
        Subscriber s2 = new PaidSubscriber(102, "Bob", "bob@mail.com", "Sports");
        service.addSubscriber(s1);
        service.addSubscriber(s2);

        // Simulate fetch
        service.fetchArticles();

        // Build digests
        service.buildDigestForAll();

        // Print trust report
        service.printSourceTrustReport();
    }
}
