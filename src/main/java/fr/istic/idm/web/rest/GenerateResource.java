package fr.istic.idm.web.rest;

import com.codahale.metrics.annotation.Timed;
import fr.istic.idm.config.Constants;
import fr.istic.idm.domain.User;
import fr.istic.idm.repository.UserRepository;
import fr.istic.idm.security.AuthoritiesConstants;
import fr.istic.idm.service.MailService;
import fr.istic.idm.service.UserService;
import fr.istic.idm.web.rest.util.HeaderUtil;
import fr.istic.idm.web.rest.util.PaginationUtil;
import fr.istic.idm.web.rest.vm.ManagedUserVM;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class GenerateResource {

    private final Logger log = LoggerFactory.getLogger(GenerateResource.class);

    @RequestMapping(value = "/generate",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public List<Object> generate(){
        ArrayList list = null;
        return list;
    }

}
