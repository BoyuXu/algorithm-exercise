package pattern;

public class User {
	private final String firstName;
	private final String lastName;
	private int age;
	private String phone;
	private String address;
	
	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getphone() {
		return phone;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public static class UserBuilder{
		private final String firstName;
		private final String lastName;
		private int age = 0;
		private String phone = "";
		private String address;
		
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder Age(int age) {
			this.age = age;
			return this;
		}
		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		public User build() {
			return new User(this);
		}
	}

	public static void main(String [] args){
		User user = new User.UserBuilder("Frank", "Lampard").Age(25)
				.phone("111").address("Fake").build();
	}
}
