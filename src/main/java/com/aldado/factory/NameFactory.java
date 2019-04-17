package com.aldado.factory;

import com.aldado.domain.Inspector;
import com.aldado.domain.Name;

public class NameFactory {

    public static Name getName(String firstName, String lastName) {
        return new Name.Builder().firstName(firstName).lastName(lastName).build();
    }
}