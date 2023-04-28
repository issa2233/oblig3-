package com.example.oblig3cinematickets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



import java.util.List;

@Repository
public class TicketRepository {
    @Autowired
    private JdbcTemplate db;

    public void createTickets(Tickets innTickets){
        String sql= "INSERT INTO tickets (movies, firstName, lastName, phoneNumber, email, amount ) VALUES (?,?)";
        db.update(sql, innTickets.getFirstName(),innTickets.getPhoneNumber());
    }

    public List<Tickets> hentAlleTickets(){
        String sql= "SELECT * FROM Tickets";
        List <Tickets> alleTickets = db.query(sql, new BeanPropertyRowMapper(Tickets.class));
        return alleTickets;
    }

    public void deleteAllTickets() {
        String sql= "DELETE FROM Tickets";
        db.update(sql);
    }


}
