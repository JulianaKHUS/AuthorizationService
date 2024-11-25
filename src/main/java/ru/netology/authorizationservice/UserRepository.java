package ru.netology.authorizationservice;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<Authorities> getUserAuthorities(String user, String password) {
        if ("testuser".equals(user) && "testpass".equals(password)) {
            List<Authorities> authorities = new ArrayList<>();
            authorities.add(Authorities.READ);
            authorities.add(Authorities.WRITE);
            return authorities;
        } else {
            return new ArrayList<>();
        }
    }
}
