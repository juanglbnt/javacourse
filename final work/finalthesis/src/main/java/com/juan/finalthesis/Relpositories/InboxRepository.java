package com.juan.finalthesis.Relpositories;

import com.juan.finalthesis.model.Inbox;
import com.juan.finalthesis.model.Message;
import com.juan.finalthesis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InboxRepository extends JpaRepository<Inbox, Long> {

    @Query("select i from Inbox i where i.receiver=:receiver")
    List<Inbox> findByReceiver(User receiver);
}
