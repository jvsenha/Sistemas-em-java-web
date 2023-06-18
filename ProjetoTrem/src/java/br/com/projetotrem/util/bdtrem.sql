create table usuario(
idusuario serial not null,
nomeusuario varchar (30),
telusuario varchar (13),
loginusuario varchar (30),
senhausuario varchar (8),
nascusuario date,
rgusuario varchar(13), 
statususuario integer,
tipousuario varchar(13),
cidadeusuario varchar(30), 
constraint pk_usuario primary key (idusuario)  
);
create table administrador(
idadmin serial not null,
idusuario integer,
constraint pk_administrador primary key (idadmin),  
constraint fk_administrador_usuario foreign key(idusuario)
references usuario(idusuario)
);
create table empresa(
idemp serial not null,
telefoneemp varchar (13),
nomeemp varchar(30),
razaosocemp varchar(50),
cnpjemp varchar(14),
emailemp varchar(100),
ruaemp varchar(100),
cepemp varchar(9), 
bairroemp varchar(50),
municipioemp varchar(50),
ufemp varchar(30),
constraint pk_empresa primary key (idemp)  
);	

create table admempresa(
idadmemp serial not null,
idemp integer,
idusuario integer,
constraint pk_admempresa primary key (idadmemp),  
constraint fk_admempresa_empresa foreign key(idemp)
references empresa(idemp),
constraint fk_administrador_usuario foreign key(idusuario)
references usuario(idusuario)
);
 
create table maquinista(
idmaq serial not null,
idemp integer,
idusuario integer,
constraint pk_maquinista primary key (idmaq),
constraint fk_maquinista_empresa foreign key(idemp)
references empresa(idemp),
constraint fk_maquinista_usuario foreign key(idusuario)
references usuario(idusuario)
 );


 create table produto(
idprod serial not null,
nomeprod varchar (30),
tipoprod varchar(30),    
constraint pk_produto primary key (idprod)  
 );

 create table prodemp(
idprod integer,
idemp integer,
constraint pk_prodemp primary key (idprod,idemp),
constraint fk_prodemp_produto foreign key(idprod)
references produto(idprod),
constraint fk_prodemp_empresa foreign key(idemp)
references empresa(idemp)
 );

 
  
  create table trem( 
idtrem serial not null,
nometrem varchar (30),
modelotrem varchar (30),
tpcombtrem varchar (30),
idemp integer,
constraint pk_trem primary key (idtrem),
constraint fk_trem_empresa foreign key(idemp)
references empresa(idemp)
  );

create table acidente(
idacd serial not null,
idtrem integer,
idemp integer,
idmaq integer,
emailemp varchar(100),
emailacd varchar(100),
senhaacd varchar (8),
msgacd varchar(300),
localacd varchar(100),
constraint pk_acidente primary key (idacd),
constraint fk_acidente_empresa foreign key(idemp)references empresa(idemp),
constraint fk_acidente_trem foreign key(idtrem)references trem(idtrem),
constraint fk_acidente_maq foreign key(idmaq)references maquinista(idmaq)
);

create table terminal(
idterm serial not null,
nometerm varchar(30),
longterm varchar(20),
latterm varchar(20),
constraint pk_terminal primary key (idterm)
); 

 create table termtrem(
idtermtrem serial not null,
idtrem integer, 
idtermdest integer,
idtermsai integer,
idmaq integer,
vagaotermtrem  integer,
tpcargatermtrem varchar(30),
pesotermtrem NUMERIC(10,5),
linhatermtrem varchar(30),
constraint pk_termtrem primary key (idtermtrem),
constraint fk_termtrem_trem foreign key(idtrem)references trem(idtrem),
constraint fk_termtrem_termdest foreign key(idtermdest)references terminal(idterm),
constraint fk_termtrem_termsai foreign key(idtermsai)references terminal(idterm),
constraint fk_termtrem_maq foreign key(idmaq)references maquinista(idmaq)
);