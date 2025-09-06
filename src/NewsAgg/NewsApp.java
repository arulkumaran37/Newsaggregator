package NewsAgg;
public class NewsApp {
    public static void main(String[] args) {
        NewsService service = new NewsService();

    
        service.addSource(new Source(1, "TechCrunch", "Tech", 90));
        service.addSource(new Source(2, "ESPN", "Sports", 80));

      
        Subscriber s1 = new FreeSubscriber(101, "Arul", "arul65@mail.com", "Tech");
        Subscriber s2 = new PaidSubscriber(102, "Jack", "jack@mail.com", "Sports");
        service.addSubscriber(s1);
        service.addSubscriber(s2);

        
        service.fetchArticles();
        service.buildDigestForAll();

       
        service.printSourceTrustReport();
    }
}
