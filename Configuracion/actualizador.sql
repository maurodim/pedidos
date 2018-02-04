create table `juanjo1`.facturas
(
	id INT not null primary key,
	idcliente INT default 0 not null,
	total DOUBLE PRECISION default 0 not null,
	tipo INT default 0 not null,
	idusuario INT default 0 not null,
	idpedido INT,
	idremito INT,
	numerofactura VARCHAR(30) default ' ' not null,
	estado INT default 0 not null,
	saldo DOUBLE PRECISION default 0 not null,
	subtotal DOUBLE PRECISION default 0 not null,
	descuento DOUBLE PRECISION default 0 not null,
	porcentajed DOUBLE PRECISION default 0 not null,
	fecha TIMESTAMP default CURRENT_TIMESTAMP not null
);
create table `juanjo1`.detallefacturas
(
	id INT not null primary key,
	idfactura INT not null,
	idarticulo INT not null,
	cantidad INT not null,
	descripcionarticulo VARCHAR(150),
	preciounitario DOUBLE PRECISION not null,
	descuento INT not null,
	cantidadremitida DOUBLE PRECISION not null
);
create table `juanjo1`.facturaelectronica
(
	id INT not null primary key,
	cae VARCHAR(20),
	cae_vto VARCHAR(8),
	fecha_cae VARCHAR(20),
	afipqty VARCHAR(4),
	afipplastid VARCHAR(20),
	afipplastcbte VARCHAR(10),
	idfactura INT not null,
	idcliente INT not null,
	estado INT default 0 not null,
	customerid VARCHAR(11),
	customertypedoc VARCHAR(2),
	tipo_comprobante VARCHAR(2),
	importe_total VARCHAR(30),
	importe_neto VARCHAR(25),
	impto_liq VARCHAR(25),
	fecha TIMESTAMP default CURRENT_TIMESTAMP not null
);
create table `juanjo1`.ivatasa
(
	id INT not null primary key,
	tasa DOUBLE PRECISION default 0,
	idiva INT default 1,
	descripcion VARCHAR(30) default '21%',
	predeterminado INT default 1
);
alter table facturas modify id int(11) not null auto_increment;
alter table detallefacturas modify id int(11) not null auto_increment;
alter table ivatasa modify id int(11) not null auto_increment;
alter table facturaelectronica modify id int(11) not null auto_increment;