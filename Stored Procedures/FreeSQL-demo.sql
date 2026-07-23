CREATE TABLE Employee (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(50),
    department VARCHAR2(30),
    salary NUMBER
);
INSERT INTO Employee VALUES (101,'Rahul','IT',50000);
INSERT INTO Employee VALUES (102,'Anita','HR',45000);
INSERT INTO Employee VALUES (103,'Karan','Finance',60000);

COMMIT;
CREATE OR REPLACE PROCEDURE GetEmployeeDetails(
    p_empid IN NUMBER
)
IS
    v_name Employee.emp_name%TYPE;
    v_dept Employee.department%TYPE;
    v_salary Employee.salary%TYPE;
BEGIN
    SELECT emp_name, department, salary
    INTO v_name, v_dept, v_salary
    FROM Employee
    WHERE emp_id = p_empid;

    DBMS_OUTPUT.PUT_LINE('Employee ID : ' || p_empid);
    DBMS_OUTPUT.PUT_LINE('Employee Name : ' || v_name);
    DBMS_OUTPUT.PUT_LINE('Department : ' || v_dept);
    DBMS_OUTPUT.PUT_LINE('Salary : ' || v_salary);

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Employee not found.');
END;
/
BEGIN
    GetEmployeeDetails(101);
END;
/