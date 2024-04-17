create table NIVEL(
      ID_Nivel    int primary key,
      desNivel varchar(300)
);

create table USUARIO(
    ID_cpf     varchar(14) primary key,
    nome         varchar(300),
    SENHA           varchar(300),
    Email        varchar(300),
    Telefone     varchar(300)
);

create table FORNECEDOR(
    ID_FORNECEDOR      int primary key auto_increment,
    nome            varchar(300),
    numero           varchar(300),
  foreign key (ID_cpf) references USUARIO(ID_cpf),
  foreign key (categoria) references PRODUTO(categoria),
    foreign key (nomeProduto) references PRODUTO (nomeProduto)
);

create table PRODUTO(
    ID_produto   int primary key auto_increment,
    nome            varchar(300),
    descricao          varchar(300),
    preco              float, 
    categoria          varchar(300))
);
create table ORCAMENTO(
     ID_orcamento int, primary key, auto_increment,
     data   date,
     total  double( 15, 2) ,
    foreign key (ID_cpf) references USUARIO(ID_cpf)
);

create table ITEM(
 ID_item  int primary key auto_increment,
 data date, 
 total  double( 15, 2) ,
 foreign key (ID_orcamento) references ORCAMENTO(ID_orcamento),
 foreign key (ID_produto) references PRODUTO(ID_produto),
 foreign key (preco) references USUARIO(preco)
);