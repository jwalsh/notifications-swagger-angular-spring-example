package io.swagger.api;

import io.swagger.model.ISEError;
import io.swagger.model.ModelError;
import io.swagger.model.Notification;

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
public class NotificationsApiController implements NotificationsApi {



    public ResponseEntity<List<Notification>> notificationsGet() {
        // do some magic!
        return new ResponseEntity<List<Notification>>(HttpStatus.OK);
    }

    public ResponseEntity<Notification> notificationsIdGet( @Min(1)@ApiParam(value = "the target notification",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Notification>(HttpStatus.OK);
    }

    public ResponseEntity<Notification> notificationsIdPut( @Min(1)@ApiParam(value = "the target notification",required=true ) @PathVariable("id") Long id,
        @ApiParam(value = ""  )  @Valid @RequestBody Notification body) {
        // do some magic!
        return new ResponseEntity<Notification>(HttpStatus.OK);
    }

}
