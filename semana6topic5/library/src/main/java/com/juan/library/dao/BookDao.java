package com.juan.library.dao;

import com.juan.library.mapper.BookRowMapper;
import com.juan.library.model.Book;
import com.juan.library.view.BookView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class BookDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String getBookNameForId(int id) {
        String sql = "select name from book where id = ?";

        try{
            return jdbcTemplate.queryForObject(sql, new Object[] {id}, String.class);
        }catch (EmptyResultDataAccessException e) {
            return "the book with id [" + id + "] doesn't exist";
        }
    }

    public List<Book> getBookForName(String name) {
        String sql = "select * from book where name = ?";
        return jdbcTemplate.query(sql, new Object[] {name} ,new BookRowMapper());
    }

    public List<Book> getAllBooks() {
        String sql = "select * from book";
        return jdbcTemplate.query(sql, new BookRowMapper());
    }

    public void insertBook(Book book) {
        String sql = "insert into book (id, name, author, year) values (?,?,?,?)";

        try{
            jdbcTemplate.update(sql, new Object[] {book.getId(), book.getName(), book.getAuthor(), book.getYear()});
            System.out.println("register good");
        } catch (DuplicateKeyException ex) {
            System.out.println("THE BOOK WITH ID: [" + book.getId() + "] ALREADY EXISTS");
            System.err.println("BOOK NOT REGISTERED");
        }
    }

    public void deleteBook(int id) {
        String sql = "delete from book where id = ?";
        jdbcTemplate.update(sql, new Object[] {id});
    }


}
