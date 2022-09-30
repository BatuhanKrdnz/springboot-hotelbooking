package com.batuhankaradeniz.hotelbooking.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements ConstraintValidator<ValidEmail, String> {
    // set email validator regex pattern

    private Pattern pattern;

    private Matcher matcher;

    private static final String EMAIL_PATTERN =  "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    // override valid method with custom pattern
    @Override
    public void initialize(ValidEmail constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(final String email, ConstraintValidatorContext constraintValidatorContext) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        if(email == null){
            return false;
        }

        matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
