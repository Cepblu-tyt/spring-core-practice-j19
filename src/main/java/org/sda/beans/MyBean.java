package org.sda.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * @author Sergei Oksanen
 * @Date 2/20/2023
 */


@Setter
@Service ("myBean")

public class MyBean {
    public String name;
    public String sayHello(){
        return "Hello!" + name;
    }


}
