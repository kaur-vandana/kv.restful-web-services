INSERT INTO user (id, name, birth_date) VALUES (11, 'James', sysdate());
INSERT INTO user (id, name, birth_date) VALUES (22, 'Abby', sysdate());
INSERT INTO user (id, name, birth_date) VALUES (33, 'Bond', sysdate());
INSERT INTO post (id, description, user_id) VALUES (100, 'this is first post for james',11);
INSERT INTO post (id, description, user_id) VALUES (101, 'this is second post for james',11);