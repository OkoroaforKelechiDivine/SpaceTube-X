package com.space.service;

import com.space.domain.AppUser;
import com.space.domain.Role;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AppUserService {
    AppUser saveUser(AppUser appUser);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getAppUsers();
}
