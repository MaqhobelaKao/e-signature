package com.liparola.umang.core.user.admin.jpa;

import com.liparola.umang.core.user.admin.data.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<AdminUser, Long> {
    Optional<AdminUser> findByUserName(String userName);
    Optional<AdminUser> findByEmail(String email);
}
