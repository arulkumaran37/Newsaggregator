package NewsAgg;

public class Source {
	private int sourceId;
	private String name;
	private String category;
	private int trustScore;

	public Source(int sourceId, String name, String category, int trustScore) {
		this.sourceId =sourceId;
		this.name = name;
		this.category = category;
		this.trustScore = trustScore;
	}
	 public int getSourceId() { 
			return sourceId; 
			 }
	    public String getName() { 
	    	return name; 
	    	}
	    public String getCategory() { 
	    	return category;
	    	}
	    public int getTrustScore() { 
	    	return trustScore; 
	    	}
}
