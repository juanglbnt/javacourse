package com.juan.finalthesis.Relpositories;

import com.juan.finalthesis.model.Message;
import com.juan.finalthesis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    //!! si funciona el query !!
    //@Query("select p from Product p where p.id=:id")
    @Query("select m from Message m where m.identifier=:identifier")
    public Message findByIdentifier(String identifier);

    @Query("select m from Message m where m.sender=:sender")
    List<Message> findBySender(User sender);

}
