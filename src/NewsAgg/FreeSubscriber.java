package NewsAgg;

public class FreeSubscriber extends Subscriber {
	private int articleLimit = 3;
	
    public FreeSubscriber(int id, String name, String email, String preferences) {
        super(id, name, email, preferences, "Free");
    }
    @Override
    public String getDigest() {
        return "Free Subscriber Digest (max " + articleLimit + " articles)";
    }
}
