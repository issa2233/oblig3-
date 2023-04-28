package com.example.oblig3cinematickets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {

   @Autowired
   private TicketRepository rep;

    @PostMapping("/save")
    public void saveTicket(Tickets innTicket){
        rep.hentAlleTickets();
    }

    @GetMapping("/getAlt")
    public List<Tickets> getAlt(){
        return rep.hentAlleTickets() ;
    }

    @GetMapping("/deleteAlt")
    public void DeleteAlt (){
        rep.deleteAllTickets();
    }
}


