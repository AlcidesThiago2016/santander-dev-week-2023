package me.dio.service;

import me.dio.domain.model.User;

public interface UsersService {

    User findBuId(Long id);

    User create(User userToCreate);

}
