package NewsAgg;

public class Subscriber {
	private int id;
	private String name;
	private String email;
	private String plan;
	private String preferences;
	
public Subscriber(int id, String name,String email , String plan, String preferences) {
	this.id = id;
	this.name = name;
	this.email = email;
	this.plan = plan;
	this.preferences = preferences;
}

	public int getId() {
		return this.id;
		}
    public String getName() {
    	return name; 
    	}
    public String getEmail() { 
    	return email; 
    	}
    public String getPreferences() { 
    	return preferences;
    	}
    public String getPlan() { 
    	return plan;
    	}
    

    public void setPreferences(String preferences) { 
    	this.preferences = preferences; 
    	}
    public void setPlan(String plan) { 
    	this.plan = plan;
    	}
    public String getDigest() {
        return "Default digest()";
    }
}
