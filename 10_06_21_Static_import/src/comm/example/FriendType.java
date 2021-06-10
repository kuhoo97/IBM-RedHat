package comm.example;

public enum FriendType {
	
	BESTFRIEND("Is Very good"),
	FRENEMY("Is Toxic");
	
	private String message;

	private FriendType(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
