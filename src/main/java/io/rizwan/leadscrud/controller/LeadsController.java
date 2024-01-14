package io.rizwan.leadscrud.controller;

import io.rizwan.leadscrud.entity.Leads;
import io.rizwan.leadscrud.model.Response;
import io.rizwan.leadscrud.model.ResponseBodySuccess;
import io.rizwan.leadscrud.model.ResponseForFindBodySuccess;
import io.rizwan.leadscrud.service.LeadsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leads")
public class LeadsController {
    private final LeadsService service;

    @Autowired
    public LeadsController(LeadsService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Response> saveLeads(@RequestBody Leads leads) {
        Response response = service.saveLeads(leads);
        if (response instanceof ResponseBodySuccess) {
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(response, HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/{mobileNumber}")
    public ResponseEntity<Response> findLeadsByMobileNumber(@PathVariable String mobileNumber) {
        Response response = service.findLeadsByMobileNumber(mobileNumber);
        if (response instanceof ResponseForFindBodySuccess) {
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }

    }
}
