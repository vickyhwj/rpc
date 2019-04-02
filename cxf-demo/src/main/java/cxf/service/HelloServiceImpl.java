package cxf.service;

import javax.jws.WebService;

/**
 * @author liyebing created on 16/12/4.
 * @version $Id$
 */
@WebService(endpointInterface = "cxf.service.HelloService")
public class HelloServiceImpl implements HelloService {

    public School sayHello(String content) {
    	School school=new School();
    	school.setId(1L);
    	school.setName(content);
        return school;
       
    }
}
