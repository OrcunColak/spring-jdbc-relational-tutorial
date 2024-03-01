-- Inserting data into the User table
INSERT INTO USERS (USER_ID, FIRST_NAME, LAST_NAME, EMAIL)
VALUES (1, 'John', 'Doe', 'john.doe@example.com');

INSERT INTO USERS (USER_ID, FIRST_NAME, LAST_NAME, EMAIL)
VALUES (2, 'Jane', 'Smith', 'jane.smith@example.com');

-- Inserting data into the Task table
INSERT INTO TASKS (TASK_ID, TASK_NAME, USER_ID)
VALUES (101, 'Task 1', 1);

INSERT INTO TASKS (TASK_ID, TASK_NAME, USER_ID)
VALUES (102, 'Task 2', 1);

INSERT INTO TASKS (TASK_ID, TASK_NAME, USER_ID)
VALUES (103, 'Task 3', 2);
