-- usar base de datos 
use ev_tienda;

-- registro personas 
insert into personas(
    tipo_documento,
    identificacion,
    nombre,
    apellido,
    genero,
    correo,
    estado
)values(
	'CC',
    '298372139',
    'Pepita',
    'Perez',
    'F',
    "pepita@sena",
    1   
); 

-- Consultar
select * from personas;

-- Update
update personas 
	set tipo_documento = 'TI',
		identificacion = "234253874",
        nombre = "Adriana Maria",
        apellido ="Tique Moreno",
        correo = "adriana@sena",
        estado = 0
where id = 3;


-- delete
delete from personas where id = 2;


-- otros
insert into roles(codigo, nombre, estado)values
('101','Admin',1),
('1243','Vendedor',1),
('121234','Cliente',1);


select * from roles;

insert into usuarios(usuario, contrasenia, estado, persona_id, rol_id)values
('pepita233','abcd1234',1,1,2);


select * from usuarios;

-- Mostrar nombre de la persona, usuario, rol. Solo activos.

SELECT 
	concat(p.nombre,' ', p.apellido) nombre,
    u.usuario,
    r.nombre rol
FROM 
	personas p
    INNER JOIN usuarios u ON p.id = u.persona_id
    INNER JOIN roles r ON u.rol_id = r.id
WHERE p.estado = 1 AND u.estado = 1 AND r.estado = 1
