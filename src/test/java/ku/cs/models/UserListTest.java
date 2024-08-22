package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("aock", "eiei-1");
        userList.addUser("nest", "eiei-2");
        userList.addUser("bright", "eiei-3");
        // TODO: find one of them
        User user = userList.findUserByUsername("nest");
        // TODO: assert that UserList found User
         String expected = "nest";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("aock", "eiei-1");
        userList.addUser("nest", "eiei-2");
        userList.addUser("bright", "eiei-3");
        // TODO: change password of one user
        boolean changed = userList.changePassword("bright", "eiei-3", "comSci-Student");
        // TODO: assert that user can change password
        assertTrue(changed);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("aock", "eiei-1");
        userList.addUser("nest", "eiei-2");
        userList.addUser("bright", "eiei-3");
        // TODO: call login() with correct username and password
        User actual = userList.login("aock", "eiei-1");
        // TODO: assert that User object is found
         assertEquals("aock", actual.getUsername());
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("aock", "eiei-1");
        userList.addUser("nest", "eiei-2");
        userList.addUser("bright", "eiei-3");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("aock", "eiei-123");
        // TODO: assert that the method return null
         assertNull(actual);
    }

}