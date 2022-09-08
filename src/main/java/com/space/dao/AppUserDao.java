package com.space.dao;


import com.space.entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserDao extends CrudRepository<AppUser, String> {
}
