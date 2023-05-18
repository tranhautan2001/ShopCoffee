package com.example.be1.service.mail;


import com.example.be1.Model.User;

public interface IEmailService {
    void sendResetPasswordEmail(String email, String otp);
    boolean validateOtp(String otpCode, String email);
    String generateOtp(User user);
}
