package com.campusdual.springontimize.ws.core.rest;

import com.campusdual.springontimize.api.core.service.IContactService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactRestController extends ORestController<IContactService> {

    @Autowired
    private IContactService contactSrv;

    @Override
    public IContactService getService() {
        return this.contactSrv;
    }


}
