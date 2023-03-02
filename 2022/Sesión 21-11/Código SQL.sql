create database ev_tienda;
use ev_tienda;

create table personas(
	id int primary key auto_increment,
    tipo_documento enum('CC','TI','CE','DNI'),
    identificacion varchar(12),
    nombre varchar(50),
    apellido varchar(50),
    genero bit(1),
    correo varchar(50),
    estado bit(1)
);

create table roles(
	id int primary key auto_increment,    
    codigo varchar(20),
    nombre varchar(50),    
    estado bit(1)
);

create table usuarios(
	id int primary key auto_increment,    
    usuario varchar(20),
    contrasenia varchar(50),    
    estado bit(1),
    persona_id int,
    rol_id int,
    constraint fk_usuarios_roles_rol_id foreign key (rol_id) references roles(id),
    constraint fk_usuarios_personas_persona_id foreign key (persona_id) references personas(id)
);

create table facturas(
	id int primary key auto_increment,    
    codigo varchar(20),
    valor_total double,
    fecha timestamp,
    estado bit(1),
    cliente_id int,
    vendedor_id int,
    constraint fk_factura_usuarios_cliente_id foreign key (cliente_id) references usuarios(id),
	constraint fk_factura_usuarios_vendedor_id foreign key (vendedor_id) references usuarios(id)
);

create table categorias(
	id int primary key auto_increment, 
    nombre varchar(50),    
    estado bit(1)
);

create table marcas(
	id int primary key auto_increment, 
    nombre varchar(50),    
    estado bit(1)
);

create table productos(
	id int primary key auto_increment, 
    nombre varchar(50),    
    estado bit(1),
    categoria_id int,
    marca_id int,
    constraint fk_productos_categorias_categoria_id foreign key (categoria_id) references categorias(id),
    constraint fk_productos_marcas_marca_id foreign key (marca_id) references marcas(id)
);

create table invetarios(
	id int primary key auto_increment, 
    valor_initario double,
    cantidad int,
    estado bit(1),    
    producto_id int,
    constraint fk_invetarios_productos_producto_id foreign key (producto_id) references productos(id)    
);

create table facturas_productos(
	id int primary key auto_increment,     
    cantidad int,
    valor_total double,    
    producto_id int,
    factura_id int,
    constraint fk_facturas_productos_productos_producto_id foreign key (producto_id) references productos(id),
    constraint fk_facturas_productos_facturas_factura_id foreign key (factura_id) references facturas(id)
);




