package com.liparola.umang.core.user.admin.service;

import com.liparola.umang.core.user.admin.data.AdminUser;
import com.liparola.umang.core.user.admin.data.entinties.MyUserDetails;
import com.liparola.umang.core.user.admin.jpa.AdminRepository;
import jakarta.annotation.Resource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.Optional;

public class DefaultAdminService implements UserDetailsService {
    @Resource
    AdminRepository adminRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AdminUser> user = adminRepository.findByUserName(username);
        user.orElseThrow(()-> new UsernameNotFoundException("Not found " + username));
        return new MyUserDetails(user);bbbbbbbbbbb bb   bb nb  b b     
            }

            @Override
            public String getPassword() {
                return null;
            }

            @Override
            public String getUsername() {
                return null;
            }

            @Override
            public boolean isAccountNonExpired() {
                return false;
            }

            @Override
            public boolean isAccountNonLocked() {
                return false;
            }

            @Override
            public boolean isCredentialsNonExpired() {
                return false;
            }

            @Override
            public boolean isEnabled() {
                return false;
            }
        }
    }
}
