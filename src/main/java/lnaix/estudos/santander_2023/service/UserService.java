package lnaix.estudos.santander_2023.service;

import lnaix.estudos.santander_2023.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
