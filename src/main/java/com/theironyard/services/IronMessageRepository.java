package com.theironyard.services;

import com.theironyard.entities.IronMessage;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by PiratePowWow on 4/3/16.
 */
public interface IronMessageRepository extends CrudRepository<IronMessage, Integer> {
}
