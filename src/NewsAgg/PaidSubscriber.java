package NewsAgg;

public class PaidSubscriber extends Subscriber {

    public PaidSubscriber(int id, String name, String email, String preferences) {
        super(id, name, email, preferences, "Paid");
    }

    @Override
    public String getDigest() {
        return "Paid Subscriber Digest (unlimited articles)";
    }
}
