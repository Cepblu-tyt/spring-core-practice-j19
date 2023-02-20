package org.sda.beans;

import org.sda.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Sergei Oksanen
 * @Date 2/20/2023
 */
@Component(value="firstName")
public class FirstName implements BeanName {
    private String name;

    public FirstName(){
        this.name = "Sergei";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
