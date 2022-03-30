package com.juan.finalthesis.config;

import com.juan.finalthesis.Relpositories.UserRepository;
import com.juan.finalthesis.model.Authority;
import com.juan.finalthesis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //.orElseThrow(() -> new UsernameNotFoundException("The user doesn't exist"))
        User appUser = userRepository.findByUsername(username);
        List grantList = new ArrayList<>();

        for(Authority authority: appUser.getAuthority()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
            grantList.add(grantedAuthority);
        }

        UserDetails user = (org.springframework.security.core.userdetails.User)
                new org.springframework.security.core.userdetails.User(appUser.getUsername(), appUser.getPassword(), grantList);

        return user;
    }
}
