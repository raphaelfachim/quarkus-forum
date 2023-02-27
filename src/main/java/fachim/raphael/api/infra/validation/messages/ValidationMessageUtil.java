package fachim.raphael.api.infra.validation.messages;

import javax.validation.ConstraintViolation;
import java.util.Set;
import java.util.stream.Collectors;

public class ValidationMessageUtil<T> {

    public String getValidationMessages(Set<ConstraintViolation<T>> violationSet){
        return violationSet.stream().map(ConstraintViolation::getMessage).collect(Collectors.joining("\n"));
    }
}
