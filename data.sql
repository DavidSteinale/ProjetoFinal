create database letsSuporte;

create table tb_analista(
	id_analista int unsigned auto_increment primary key,
    nome_analista varchar(100) not null
);

create table tb_contato(
	id_contato int unsigned auto_increment primary key,
    nome varchar(100) not null,
    telefone varchar(20) not null,
    email varchar(50) not null
);

create table tb_empresa(
	id_empresa int unsigned auto_increment primary key,
    razao_social varchar(100) not null,
    cnpj varchar(20) not null,
    telefone varchar(20) not null,
    endereco varchar(100) not null,
    ativo boolean not null,
    id_contato int unsigned not null,
    CONSTRAINT `fk_id_contato` FOREIGN KEY (`id_contato`) REFERENCES `tb_contato` (`id_contato`) 
);

create table tb_atendimento(
	num_atendimento int unsigned auto_increment primary key,
    descricao varchar(5000) not null, 
    id_empresa int unsigned not null,    
    id_analista int unsigned not null, 
    CONSTRAINT `fk_id_empresa` FOREIGN KEY (`id_empresa`) REFERENCES `tb_empresa` (`id_empresa`),    
    CONSTRAINT `fk_id_analista` FOREIGN KEY (`id_analista`) REFERENCES `tb_analista` (`id_analista`)
);
