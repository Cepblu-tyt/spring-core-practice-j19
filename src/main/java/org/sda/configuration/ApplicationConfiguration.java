package org.sda.configuration;

import org.sda.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sergei Oksanen
 * @Date 2/20/2023
 */

@Configuration
public class ApplicationConfiguration {
    @Bean
    public MyBean myBean(){
        MyBean myBean = new MyBean();
        myBean.setName("Sergei");
        return myBean;
    }
}
