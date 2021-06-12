package comm.example;

public class Friend {
	
	private Integer friendnum;
	private String name;
	private FriendType friendType;
	public static int loveScale = 100;
	public Friend() {
		super();
	}
	public Friend(Integer friendnum, String name, FriendType friendType) {
		super();
		this.friendnum = friendnum;
		this.name = name;
		this.friendType = friendType;
	}
	public Integer getFriendnum() {
		return friendnum;
	}
	public void setFriendnum(Integer friendnum) {
		this.friendnum = friendnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FriendType getFriendType() {
		return friendType;
	}
	public void setFriendType(FriendType friendType) {
		this.friendType = friendType;
	}
	@Override
	public String toString() {
		return "Friend [friendnum=" + friendnum + ", name=" + name + ", friendType=" + friendType.getMessage() + "]";
	}
	
	
	
	

}
