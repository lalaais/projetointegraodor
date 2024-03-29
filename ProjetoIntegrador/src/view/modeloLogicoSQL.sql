create table TB_USUARIO(
    ID_USUARIO      int primary key auto_increment,
    USUARIO         varchar(300),
    SENHA           varchar(300),
    FUNCAO          varchar(300))
);

create table TB_PRODUTO(
    ID_PRODUTO      int primary key auto_increment,
    CATEGORIA       varchar(300),
    PRODUTO         varchar(300),
    PRECO           decimal(15,2),
    QTD             int,
    DESCRICAO       varchar(300)),
  foreign key (ID_USUARIO) references TB_USUARIO(ID_USUARIO),
    foreign key (ID_FORNECEDOR) references TB_FORNECEDOR(ID_FORNECEDOR)
);

create table TB_FORNECEDOR(
    ID_FORNECEDOR   int primary key auto_increment,
    NOME            varchar(300),
    NUMERO          varchar(300),
    foreign key (CATEGORIA) references TB_PRODUTO(CATEGORIA),
    foreign key (PRODUTO) references TB_PRODUTO(PRODUTO),
    foreign key (ID_USUARIO) references TB_USUARIO(ID_USUARIO)
);