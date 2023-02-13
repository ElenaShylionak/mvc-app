package org.itstep.mvc.service;

import org.itstep.mvc.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void deleteUserById(Long id);

    //Пагинация (Pagination) – это порядковая нумерация страниц, которая в основном размещается вверху либо внизу страниц сайта.
    Page<User> pagination (int page, int size, String sortField, String sortDir);

}
