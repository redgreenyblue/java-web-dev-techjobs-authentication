package org.launchcode.javawebdevtechjobsauthentication.models.dto;

public class RegisterForm extends LoginForm {

    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
