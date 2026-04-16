package br.com.dio.Validator;

import br.com.dio.exception.ValidatorException;
import br.com.dio.model.UserModel;

public class UserValidator {

    private UserValidator(){

    }

    public static void verifyModel(final UserModel model) throws ValidatorException{
        if(stringIsBlack(model.getName()))  
            throw new ValidatorException("Informe um nome válido");
        if(model.getName().length() < 3) 
            throw new ValidatorException("O nome deve conter mais de 2 caracteres");
         if(stringIsBlack(model.getEmail()))  
            throw new ValidatorException("Informe um e-mail válido");
        if(!model.getEmail().contains("@") || !model.getEmail().contains(".")) 
            throw new ValidatorException("Informe um e-mail válido");
        
    } 


    private static boolean stringIsBlack(final String value){
        return value == null || value.isBlank();
    }
}
