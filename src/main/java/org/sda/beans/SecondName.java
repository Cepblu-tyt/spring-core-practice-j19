package org.sda.beans;

import org.sda.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Sergei Oksanen
 * @Date 2/20/2023
 */

@Component(value= "secondName")
public class SecondName implements BeanName {

    private String name;

    public SecondName(){
        this.name = "Oksanen";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
