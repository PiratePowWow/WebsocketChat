package com.theironyard.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by PiratePowWow on 4/3/16.
 */
@Entity
public class IronMessage {
    @Id
    @GeneratedValue
    int id;
    @NotNull
    String message;

    public IronMessage() {
    }
}
