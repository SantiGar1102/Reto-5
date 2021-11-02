package com.reto5.repository.crud;

// importaciones

import com.reto5.modelo.Message;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Santiago Garcia
 */
public interface MessageCrudRepository extends CrudRepository<Message, Integer> {

}