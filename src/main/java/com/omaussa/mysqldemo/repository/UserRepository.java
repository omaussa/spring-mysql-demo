package com.omaussa.mysqldemo.repository;

import com.omaussa.mysqldemo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
