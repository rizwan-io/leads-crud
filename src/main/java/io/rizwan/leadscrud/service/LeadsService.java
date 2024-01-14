package io.rizwan.leadscrud.service;

import io.rizwan.leadscrud.dao.LeadsDAO;
import io.rizwan.leadscrud.entity.Leads;
import io.rizwan.leadscrud.model.Response;
import io.rizwan.leadscrud.model.ResponseBodyError;
import io.rizwan.leadscrud.model.ResponseBodySuccess;
import io.rizwan.leadscrud.model.ResponseForFindBodySuccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadsService {
    private final LeadsDAO dao;

    @Autowired
    public LeadsService(LeadsDAO dao) {
        this.dao = dao;
    }

    public Response saveLeads(Leads leads) {
        Response response;
        if (dao.findById(leads.getLeadId()).isEmpty()) {
            dao.save(leads);
            response = new ResponseBodySuccess("success", "Created Leads Successfully");
        } else {
            response =
                    new ResponseBodyError("error",
                            new ResponseBodyError.ErrorResponse("E10010", "Lead Already Exists in the database with the lead id"));
        }
        return response;
    }

    public Response findLeadsByMobileNumber(String mobileNumber) {
        Response response;
        List<Leads> foundLeads = dao.findAllByMobileNumber(mobileNumber);
        if (foundLeads.isEmpty()) {
            response =
                    new ResponseBodyError("error",
                            new ResponseBodyError.ErrorResponse("E10011", "No Lead found with the Mobile Number"));
        } else {
            response = new ResponseForFindBodySuccess("success", foundLeads);
        }
        return response;
    }
}
