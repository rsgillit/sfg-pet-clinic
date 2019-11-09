package com.gill.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    save(T object);

    void delete(T object);

    void deleteById(Long id);
}
