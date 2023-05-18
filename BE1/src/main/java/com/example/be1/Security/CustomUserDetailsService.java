package com.example.be1.Security;
import com.example.be1.Model.User;
import com.example.be1.Repository.user.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         User user = userRepository.findByUserName(username).orElseThrow(() -> new UsernameNotFoundException("Không tìm thấy tên người dùng " + username));
        return UserPrinciple.build(user);
    }
}
