use library;
create table book(id integer not null primary key, name varchar(50), author varchar(50), year integer);
select * from book;
insert into book values(128, "animal farm", "george orwell", 1945), (176, "crime and punishment", "fyodor dostoevsky", 1866);
insert into book values(423, "crhonicle of a death foretold", "gabriel garcia marquez", 1981);
select * from book where name = "chronicle of a death foretold";