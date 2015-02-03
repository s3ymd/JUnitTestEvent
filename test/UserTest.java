import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MyRunner.class)
public class UserTest {
	@Test
	public void testBirthday() {
		User user = new User();
		int age1 = user.getAge();
		user.birthday();
		int age2 = user.getAge();
		assertTrue(age2 == age1 + 1);
	}
}
