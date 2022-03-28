package com.juan.finalthesis.Relpositories;

import com.juan.finalthesis.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    //!! si funciona el query !!
    //@Query("select p from Product p where p.id=:id")
    @Query("select m from Message m where m.identifier=:identifier")
    public Message findByIdentifier(String identifier);
}
