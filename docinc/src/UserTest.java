import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;

public class UserTest {

    UserDb fakeUserDb = mock(UserDb.class);

    UserService userService = new UserService(fakeUserDb);

    //Mock testing
    @Test
    public void getRole_requests_correct_id() {
        userService.getRole(194);

        //verify interaction on mock
        verify(fakeUserDb).get(194);
    }

    //Stub testing
    @Test
    public void getUser_returns_null_when_userId_not_found() {
        //Replace DB with stub response
        when(fakeUserDb.get(anyInt())).thenReturn(null);

        assertNull(userService.getUser(22));
    }

    //Regular testing
    @Test
    public void setBirthday_throws_exception_on_invalid_date() {
        User testUser = new User(1, 1, "Sam Samson", 19981010, 1000);
        assertThrows(IllegalArgumentException.class,
                    () -> { testUser.setBirthday(-1); });
    }
}