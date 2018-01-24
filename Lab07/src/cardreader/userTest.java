package cardreader;
 
public class userTest {
public static void main(String [] args)
{
	UserTable u = new UserTable();
	User p = new User(1234, "hej");
	u.add(p);
	int user1 = 24073;
	User user = u.find(user1);
	System.out.println(user);
	user = u.find(24074);
	System.out.println(user);
	user = u.findByName("Jens Holmgren");
	System.out.println(user);
	int x = u.testFind();
	System.out.println(x);
}
}