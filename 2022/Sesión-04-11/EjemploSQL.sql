create database registro;

use registro;

create table aprendiz(
	id int primary key auto_increment,
    tipo_documento enum('CC','TI','CE'),
    documento varchar(12),
    nombre_completo varchar(50)
);

create table asistencia(
	id int primary key auto_increment,
    fecha date,
    estado_asistencia enum('Asistió','No Asistió','Excusa'),
    aprendiz_id int,
    constraint fk_aprendiz_id foreign key (aprendiz_id) references aprendiz(id)
);	
