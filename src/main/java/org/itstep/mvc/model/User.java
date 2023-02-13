package org.itstep.mvc.model;


//Java Persistence — спецификация, предоставляет возможность сохранять в удобном виде Java-объекты в базе данных.
//Технология Jakarta EE, до 2018 года известная как Java EE, помогает соединить старые и новые технологии
// и позволяет приложениям эффективно взаимодействовать
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity   //@Entity - Должен иметь пустой конструктор, должен содержать хотя бы одно @Id-поле, Не может быть вложенным, интерфейсом или enum
@Table (name = "users")

public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "user_name")
    String userName;
    @Column (name = "user_lastname")
    String userLastName;
    @Column (name = "email")
    String email;


}
