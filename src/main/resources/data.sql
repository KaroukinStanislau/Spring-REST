INSERT INTO priority (value)
VALUES ('critical');
INSERT INTO priority (value)
VALUES ('major');
INSERT INTO priority (value)
VALUES ('important');
INSERT INTO priority (value)
VALUES ('minor');

INSERT INTO type (value)
VALUES ('cosmetic');
INSERT INTO type (value)
VALUES ('bug');
INSERT INTO type (value)
VALUES ('feature');
INSERT INTO type (value)
VALUES ('performance');

INSERT INTO status (value)
VALUES ('new');
INSERT INTO status (value)
VALUES ('assigned');
INSERT INTO status (value)
VALUES ('in progress');
INSERT INTO status (value)
VALUES ('resolved');

INSERT INTO user (username, password)
VALUES ('ivan', '1');
INSERT INTO user (username, password)
VALUES ('alex', '1');

INSERT INTO project (name, description, build, manager)
VALUES ('Pied Piper', 'We need a platform, not a box', '0.1', 'alex');
INSERT INTO project (name, description, build, manager)
VALUES ('Hello world!', 'Hello world project', '0', 'alex');

INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '1', '1', '1', '1', '1');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '2', '2', '2', '2', '1');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '3', '1', '3', '3', '2');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '4', '2', '4', '4', '2');

INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '1', '1', '1', '4', '2');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '4', '2', '2', '3', '1');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '3', '1', '3', '2', '2');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '2', '2', '4', '1', '1');

INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '4', '1', '1', '2', '2');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '3', '2', '2', '4', '2');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '2', '1', '3', '1', '1');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '1', '2', '4', '3', '1');

INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '1', '1', '1', '1', '1');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '2', '2', '2', '2', '1');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '3', '1', '3', '3', '2');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '4', '2', '4', '4', '2');

INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '1', '1', '1', '4', '2');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '4', '2', '2', '3', '1');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '3', '1', '3', '2', '2');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '2', '2', '4', '1', '1');

INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '4', '1', '1', '2', '2');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '3', '2', '2', '4', '2');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '2', '1', '3', '1', '1');
INSERT INTO issue (summary, priority_id, user_id, type_id, status_id, project_id)
VALUES ('very huge description', '1', '2', '4', '3', '1');

INSERT INTO role (role)
VALUES ('USER');
INSERT INTO role (role)
VALUES ('ADMIN');