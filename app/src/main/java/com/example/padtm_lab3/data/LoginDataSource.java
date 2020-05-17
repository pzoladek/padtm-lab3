package com.example.padtm_lab3.data;

import com.example.padtm_lab3.data.model.LoggedInUser;
import com.example.padtm_lab3.ui.login.LoginActivity;

import java.io.IOException;
import java.util.UUID;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
//            LoggedInUser fakeUser =
//                    new LoggedInUser(
//                            java.util.UUID.randomUUID().toString(),
//                            "Jane Doe");
//            return new Result.Success<>(fakeUser);
            if (LoginActivity.DUMMY_CREDENTIALS[0].equals(username) && LoginActivity.DUMMY_CREDENTIALS[1].equals(password)) {
                return new Result.Success(new LoggedInUser("1", "DummyUser"));
            } else {
                return new Result.Success(new LoggedInUser(UUID.randomUUID().toString(), "zarejestrowany " + username));
            }

        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}
