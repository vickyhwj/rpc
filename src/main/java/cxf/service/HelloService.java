package cxf.service;


import javax.jws.WebService;

import cxf.service.po.School;

/**
 * @author liyebing created on 16/12/4.
 * @version $Id$
 */
@WebService
public interface HelloService {

    public School sayHello(String content);

}
