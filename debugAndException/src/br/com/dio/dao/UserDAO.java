package br.com.dio.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.dio.model.UserModel;

public class UserDAO {
    private Long nextId = 1L;

    private final List<UserModel> models = new ArrayList<>();


    public void delete(final Long id){
        var toDelete = findById(id);
        models.remove(toDelete);
    }

    public UserModel save( final UserModel model){
        model.setId(nextId++);
        models.add(model);
        return model;
    }

    public UserModel update(final UserModel model){
        var toUpdate = findById(model.getId());
        models.remove(toUpdate);
        models.add(model);
        return model;
    }

    public UserModel findById(final Long id){
        var mesage = String.format("Não existe o usuário com o ID %s cadastrado: ", id);
        return models.stream()
            .filter(u -> u.getId() == id)
            .findFirst()
            .orElseThrow(() -> new UserNotFoundException(mesage));
    }

    public List<UserModel> findAll(){
        return models;
    }

}
