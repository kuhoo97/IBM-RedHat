package comm.example;

public class Family extends Friend {

	private String isFriend;

	public Family() {
		super();
	}

	public Family(Integer friendnum, String name, FriendType friendType, String isFriend) {
		super(friendnum, name, friendType);
		this.isFriend = isFriend;
	}

	@Override
	public String toString() {
		return "Family [isFriend=" + isFriend + ", toString()=" + super.toString() + "]";
	}
	
	
}
