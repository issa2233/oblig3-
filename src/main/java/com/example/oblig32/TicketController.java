package com.example.oblig32;

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
    public void saveTickets(Tickets innTickets) {
        rep.saveTicket(innTickets);
    }

    @GetMapping("/hentAlleTickets")
    public List<Tickets> hentAlle() {
        return rep.hentAlleTickets();
    }
    @GetMapping("/slettAlleTickets")
    public void deleteAlle() {
        rep.deleteAllTickets();
    }
}