SELECT * FROM qatar2022.empleados;
insert into empleados values("11","Paul","Sanches","23456788","Argentina","Programación");
update empleados SET Nacionalidad="Armenio" where idEmpleados=1;
select* from qatar2022.departamentos;
Select * from empleados where departamento="Programación";
DELETE FROM qatar2022.departamentos WHERE (idDepartamentos = "4");
select* from departamentos order by departamento ASC;