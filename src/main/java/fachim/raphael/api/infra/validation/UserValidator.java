package fachim.raphael.api.infra.validation;

import fachim.raphael.api.domain.User;
import fachim.raphael.api.infra.exception.EntityCreationException;
import fachim.raphael.api.infra.validation.messages.ValidationMessageUtil;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@ApplicationScoped
public class UserValidator {
    @Inject
    Validator validator;

    public void validate(User user) throws EntityCreationException {
        System.out.println(user);
        Set<ConstraintViolation<User>> constraintViolationSet = validator.validate(user);
        if(!constraintViolationSet.isEmpty()) {
            String message = "Erro ao criar usuário!\n";
            message = message.concat(new ValidationMessageUtil<User>()
                    .getValidationMessages(constraintViolationSet));
            throw new EntityCreationException(message);
        }

    }
}
