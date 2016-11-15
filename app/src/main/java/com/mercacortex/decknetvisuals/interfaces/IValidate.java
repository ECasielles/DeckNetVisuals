package com.mercacortex.decknetvisuals.interfaces;

import android.text.TextUtils;
import android.util.Patterns;


public interface IValidate {

    int OK = 0;
    int DATA_EMPTY = 1;
    int PASSWORD_DIGIT = 11;
    int PASSWORD_CASE = 12;
    int PASSWORD_LENGTH = 13;
    int EMAIL_VALIDATE = 14;

    class UserPwd {

        public static int validateCredentialsUser(String user) {
            int idMessage = OK;

            if (TextUtils.isEmpty(user)) {
                idMessage = DATA_EMPTY;
            }
            return idMessage;
        }

        public static int validateCredentialsPassword(String password) {
            int idMessage = OK;

            if (TextUtils.isEmpty(password)) {
                idMessage = DATA_EMPTY;
            } else if (!password.matches(".*[0-9].*")) {
                idMessage = PASSWORD_DIGIT;
            } else if (!password.matches(".*[a-zA-Z].*")) {
                idMessage = PASSWORD_CASE;
            } else if (password.length() < 8) {
                idMessage = PASSWORD_LENGTH;
            }
            return idMessage;
        }
    }
    class UserEmail {

        public static int validateCredentialsEmail(String email) {
            int idMessage = OK;

            if (TextUtils.isEmpty(email)) {
                idMessage = DATA_EMPTY;
            }else if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                idMessage = EMAIL_VALIDATE;
            }
            return idMessage;
        }
    }
}
