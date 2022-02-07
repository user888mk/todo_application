create table todos
(
    id   int auto_increment primary key,
    text varchar(100) not null,
    done bit
);

insert into todos(text, done)
values ('Done todo', 1);

insert into todos(text, done)
values ('Undone todo', 0);
