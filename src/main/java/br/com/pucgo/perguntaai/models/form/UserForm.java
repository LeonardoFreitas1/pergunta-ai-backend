package br.com.pucgo.perguntaai.models.form;

import br.com.pucgo.perguntaai.models.User;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserForm {

    @NotNull
    @NotEmpty
    @Length(min = 6)
    private String name;
    @NotNull
    @NotEmpty
    @Length(min = 10)
    private String email;
    @NotNull
    @NotEmpty
    @Length(min = 3)
    private String password;
    @NotNull
    @NotEmpty
    @Length(min = 3)
    private String course;

//    public User convert() {
//        return new User(name, email, course, password);
//    }
}