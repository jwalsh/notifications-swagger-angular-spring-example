package io.swagger.api;

import io.swagger.model.ISEError;
import io.swagger.model.Login;
import io.swagger.model.ModelError;
import io.swagger.model.Token;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-27T16:33:35.088-04:00")

@Controller
public class LoginApiController implements LoginApi {



    public ResponseEntity<Token> loginPost(@ApiParam(value = ""  )  @Valid @RequestBody Login body) {
        // do some magic!
        return new ResponseEntity<Token>(HttpStatus.OK);
    }

}
