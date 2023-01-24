package com.liparola.umang.core.user.admin.service;

import com.liparola.umang.core.user.admin.data.entinties.AdminEntity;

public interface AdminService {
    void register(final AdminEntity user);
    boolean checkIfUserExist(final String email);
    void sendRegistrationConfirmationEmail(final AdminEntity user);
    AdminEntity getUserById(final String id);

}
