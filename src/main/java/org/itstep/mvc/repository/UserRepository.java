package org.itstep.mvc.repository;

import org.itstep.mvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository представляет собой все объекты определенного типа в виде концептуального множества.
//Его поведение похоже на поведение коллекции, за исключением более развитых возможностей для построения запросов
//Repository будем использовать вместо DAO.

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
