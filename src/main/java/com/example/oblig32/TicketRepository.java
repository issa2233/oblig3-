package com.example.oblig32;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketRepository {

    Logger logger = LoggerFactory.getLogger(TicketRepository.class);
    @Autowired
    private JdbcTemplate db;

    public boolean saveTicket(Tickets billett) {
        String sql = "INSERT INTO Kino (movies, firstName, lastName, phoneNumber, email, amount) VALUES (?,?,?,?,?,?)";
        try {
            db.update(sql, billett.getMovies(), billett.getFirstName(), billett.getLastName(), billett.getPhoneNumber(), billett.getEmail(), billett.getAmount());
        } catch(Exception e) {
            logger.error("there is an error()");
        }
        return true;
    }

    public List<Tickets> hentAlleTickets() {
        String sql = "SELECT * FROM Kino ORDER BY Etternavn ASC";
        try {
            List<Tickets> alleTickets = db.query(sql, new BeanPropertyRowMapper(Tickets.class));
            return alleTickets;
        } catch (Exception e) {
            logger.error("Det er noe feil i henting av lista hentAlleBilletter()");
            return null;
        }
    }

    public void deleteAllTickets() {
        String sql = "DELETE FROM Kino";
        db.update(sql);
    }



}