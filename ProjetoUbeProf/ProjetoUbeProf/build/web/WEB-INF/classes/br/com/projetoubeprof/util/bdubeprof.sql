create table usuario(
idusuario serial not null,
nomeusuario varchar(50),
emailusuario varchar(50),
senhausuario char(8),
loginusuario varchar(50),
telefoneusuario varchar(20),
statususuario integer,
tipousuario varchar(13),
/*descricaoimagem varchar(30),
imagem bytea,*/
constraint pk_usuario primary key(idusuario)
);



create table cliente(
idcliente serial not null,
idusuario integer,
cpfcliente varchar(20),
enderecocliente varchar(30),
cidadecliente varchar(30),
cnpjcliente varchar(18),
constraint pk_cliente primary key(idcliente),
constraint fk_cliente_usuario foreign key(idusuario) references usuario(idusuario)
);



create table professor(
idprofessor serial not null,
idusuario integer,
cidadeprofessor varchar(30),
cpfprofessor char(20),
descricaoprofessor varchar (100),
constraint pk_professor primary key(idprofessor),
constraint fk_professor_usuario foreign key(idusuario) references usuario(idusuario)
);



create table administrador(
idadministrador serial not null,
idusuario integer,
constraint pk_administrador primary key(idadministrador),
constraint fk_administrador_usuario foreign key(idusuario) references usuario(idusuario)

);



create table avalia(
idavaliacao serial not null,
idcliente integer,
idprofessor integer,
nomecliente varchar(50),
comentarioavaliacao varchar(50),
notaavaliacao integer,
constraint pk_avalia primary key(idavaliacao),
constraint fk_avalia_cliente foreign key(idcliente)
references cliente(idcliente),
constraint fk_avalia_professor foreign key(idprofessor)
references professor(idprofessor)
);



create table area(
idarea serial not null,
nomearea varchar(50),
constraint pk_area primary key(idarea)
);


create table curso(
idcurso serial not null,
idarea integer,
nomecurso varchar(50),
constraint pk_curso primary key(idcurso),
constraint fk_curso_area foreign key(idarea)
references area(idarea)
);

create table cursoprofessor(
idcurso integer,
idprofessor integer,
constraint pk_professorcurso primary key(idcurso,idprofessor),
constraint fk_professorcurso_curso foreign key(idcurso)
references curso(idcurso),
constraint fk_professorcurso_professor foreign key(idprofessor)
references professor(idprofessor)
);



insert into area(nomearea) values ('Ciências Exatas');
insert into area(nomearea) values ('Ciências da Terra');
insert into area(nomearea) values ('Ciências Biológicas');
insert into area(nomearea) values ('Engenharias');
insert into area(nomearea) values ('Ciências da Saúde');
insert into area(nomearea) values ('Ciências Agrárias');
insert into area(nomearea) values ('Linguística, Letras e Artes');
insert into area(nomearea) values ('Ciências Sociais Aplicadas');
insert into area(nomearea) values ('Ciências Humanas');
insert into area(nomearea) values ('Tecnologia');
insert into area(nomearea) values ('Musica');
insert into area(nomearea) values ('Diversas');

insert into curso(idarea, nomecurso) values ('1','Fisica');
insert into curso(idarea, nomecurso) values ('10','Java');
insert into curso(idarea, nomecurso) values ('11','Teclado');
insert into curso(idarea, nomecurso) values ('4','Engenharia Civil');

insert into usuario(nomeusuario, emailusuario, senhausuario, loginusuario, telefoneusuario, tipousuario, statususuario )values ('João Vitor Senha dos Santos', 'joao@etec.sp.gov.br', '000', 'adm', '17-98838-8612', 'administrador', '1') returning idusuario;
insert into administrador( idusuario) values ('1');

insert into usuario(nomeusuario, emailusuario, senhausuario, loginusuario, telefoneusuario, tipousuario, statususuario )values ('Nilton César Barbosa dos Santos', 'nilton@etec.sp.gov.br', '123', 'nilton', '17-98855-9821', 'cliente', '1') returning idusuario;
insert into cliente( cpfcliente, enderecocliente, cidadecliente, cnpjcliente, idusuario) values ( '511.814.808-17','Rua Jonas Marin','Fernandópolis','','2');

insert into usuario(nomeusuario, emailusuario, senhausuario, loginusuario, telefoneusuario, tipousuario, statususuario )values ('João Paulo Alvarenga', 'joao@etec.sp.gov.br', '123', 'joaoprof', '17-99712-2335', 'professor', '1') returning idusuario;
insert into professor( cidadeprofessor, cpfprofessor, idusuario) values ('Fernandópolis', '724.256.088-85', '3') ;

insert into usuario(nomeusuario, emailusuario, senhausuario, loginusuario, telefoneusuario, tipousuario, statususuario )values ('Kauã Alves da Silva ', 'kaua@etec.sp.gov.br', '123', 'kauaprof', '17-99238-9226', 'professor', '1') returning idusuario;
insert into professor( cidadeprofessor, cpfprofessor, idusuario) values ('Ouroeste', '779.236.788-63', '4') ;


insert into avalia (comentarioavaliacao, nomecliente, idcliente, idprofessor, notaavaliacao) values ('Professor muito bom', 'Nilton César Barbosa dos Santos', '1', '2', '5');

insert into avalia (comentarioavaliacao, nomecliente, idcliente, idprofessor, notaavaliacao) values ('Não me ensinou muito', 'Nilton César Barbosa dos Santos', '1', '1', '1');

insert into cursoprofessor(idcurso, idprofessor) values ('1','1');
insert into cursoprofessor(idcurso, idprofessor) values ('2','1');
insert into cursoprofessor(idcurso, idprofessor) values ('3','2');
insert into cursoprofessor(idcurso, idprofessor) values ('4','2');
insert into cursoprofessor(idcurso, idprofessor) values ('4','1');