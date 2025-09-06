package NewsAgg;
import java.util.*;

public class NewsService {
	private List<Source> sources = new ArrayList<>();
	private List<Article> articles = new ArrayList<>();
	private List<Subscriber> subscribers = new ArrayList<>();
	
	public void addSource(Source s) {
		sources.add(s);
	}
	
	public void addSubscriber(Subscriber sub) {
		subscribers.add(sub);
	}
	public void fetchArticles() {
	    articles.add(new Article(1, "AI beats humans in chess", "Tech", "TechCrunch", java.time.LocalDateTime.now()));
	    articles.add(new Article(2, "New iPhone released", "Tech", "TechCrunch", java.time.LocalDateTime.now()));
	    articles.add(new Article(3, "Messi scores a hat-trick", "Sports", "ESPN", java.time.LocalDateTime.now()));
	    articles.add(new Article(4, "Olympics 2028 updates", "Sports", "ESPN", java.time.LocalDateTime.now()));
	    articles.add(new Article(5, "Cybersecurity tips", "Tech", "TechCrunch", java.time.LocalDateTime.now()));
	}
	
	public List<Article> filter(String categoty){
		return new ArrayList<>();
	}
	public List<Article> filter(String keyword, String timeWindow){
		return new ArrayList<>();
	}
	
	public List<Article> filter(Date from, Date to){
		return new ArrayList<>();
	}
	
	public void buildDigestForAll() {
	    for (Subscriber s : subscribers) {
	        System.out.println("\n-- Digest for " + s.getName() + " (" + s.getPlan() + ") --");


	        if (s instanceof FreeSubscriber) {
	            int limit = 3;
	            for (int i = 0; i < limit; i++) {
	                Article a = articles.get(i);
	                System.out.println((i+1) + ". " + a.getTitle() + " - " + a.getPublisher());
	            }
	        }
	        else if (s instanceof PaidSubscriber) {
	            int i = 1;
	            for (Article a : articles) {
	                System.out.println(i++ + ". " + a.getTitle() + " - " + a.getPublisher());
	            }
	        }
	    }
	}

	
	public void printSourceTrustReport() {
		System.out.println("\n--- Source Trust Report ---");
		for(Source s : sources) {
			System.out.println(s.getName() + " (" + s.getCategory() + ")"
					+ " - Trust Score: " + s.getTrustScore());
		}
	}
}
