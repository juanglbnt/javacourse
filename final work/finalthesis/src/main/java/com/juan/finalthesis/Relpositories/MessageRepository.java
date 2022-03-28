package com.juan.finalthesis.Relpositories;

import com.juan.finalthesis.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    @Query("select * from message where identifier = ?")
    public Message findByIdentifier(String identifier);
}
