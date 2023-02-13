package org.itstep.mvc.service;

import org.itstep.mvc.model.User;
import org.itstep.mvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired //@Autowired обеспечивает контроль над тем, где и как автосвязывание должны быть осуществлено.
    //при создании контекста Spring автоматически определит, что для создания UserService требуется bean типа или наследник,
    // найдёт его у себя, в рамках подставит зависимость UserServiceImpl в bean UserService.

    private UserRepository userRepository;


    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        // Optional этот подход используется в том случае, когда Объект-контейнер может содержать или не содержать ненулевое значение.
        // Если значение присутствует, isPresent() возвращает true, нет - а isPresent() возвращает false.
        User user = null;
        if (optionalUser.isPresent()){ // если присутвует - isPresent
            user = optionalUser.get(); //тогда получить данные пользотеля
        } else{
            System.out.println("User not found with ID  "+ id);
            throw new RuntimeException("User not found with ID  "+ id);
        }
        return user;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
        System.out.println("Saving User with ID  "+ user.getId());

    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
        System.out.println("User with ID  "+ id + " has been removed");

    }

    @Override
    public Page<User> pagination(int page, int size, String sortField, String sortDir) {
        return null;
    }
}
