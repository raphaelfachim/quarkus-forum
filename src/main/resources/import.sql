-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-3');

INSERT INTO User (username, mail) VALUES ('raphaelfachim', 'raphaelsiller@gmail.com');
INSERT INTO User (username, mail) VALUES ('raphaelsiller', 'raphael.fachim@etaure.com.br');

INSERT INTO Question (user_id, title, content) VALUES (1, 'Question Title', 'Question Content');
