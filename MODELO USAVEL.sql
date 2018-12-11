
CREATE SEQUENCE public.idproduto_seq;

CREATE TABLE public.produto (
                idProduto BIGINT NOT NULL DEFAULT nextval('public.idproduto_seq'),
                nome VARCHAR(200),
                descricao VARCHAR(1000),
                preco_custo NUMERIC,
                preco_venda NUMERIC,
                foto BYTEA,
                CONSTRAINT idproduto PRIMARY KEY (idProduto)
);


ALTER SEQUENCE public.idproduto_seq OWNED BY public.produto.idProduto;

CREATE SEQUENCE public.idpessoa_seq;

CREATE TABLE public.pessoa (
                idPessoa INTEGER NOT NULL DEFAULT nextval('public.idpessoa_seq'),
                nome VARCHAR(60),
                email VARCHAR(60),
                cidade_estado VARCHAR(100),
                senha VARCHAR(45),
                administrador BOOLEAN NOT NULL,
                CONSTRAINT idpessoa PRIMARY KEY (idPessoa)
);


ALTER SEQUENCE public.idpessoa_seq OWNED BY public.pessoa.idPessoa;

CREATE SEQUENCE public.idcarrinho_seq;

CREATE TABLE public.carrinho (
                idCarrinho INTEGER NOT NULL DEFAULT nextval('public.idcarrinho_seq'),
                quantidade INTEGER,
                idProduto BIGINT NOT NULL,
                idPessoa INTEGER NOT NULL,
                CONSTRAINT idcarrinho PRIMARY KEY (idCarrinho)
);


ALTER SEQUENCE public.idcarrinho_seq OWNED BY public.carrinho.idCarrinho;

CREATE SEQUENCE public.idpedido_seq;

CREATE TABLE public.pedido (
                idPedido BIGINT NOT NULL DEFAULT nextval('public.idpedido_seq'),
                data TIMESTAMP,
                valor_total NUMERIC,
                idPessoa INTEGER NOT NULL,
                CONSTRAINT idpedido PRIMARY KEY (idPedido)
);


ALTER SEQUENCE public.idpedido_seq OWNED BY public.pedido.idPedido;

CREATE SEQUENCE public.idproduto_seq;

CREATE TABLE public.pedido_produto (
                idproduto INTEGER NOT NULL DEFAULT nextval('public.idproduto_seq'),
                preco NUMERIC,
                quantidade INTEGER,
                idPedido BIGINT NOT NULL,
                idProduto BIGINT NOT NULL,
                CONSTRAINT idprodruto PRIMARY KEY (idproduto)
);


ALTER SEQUENCE public.idproduto_seq OWNED BY public.pedido_produto.idproduto;

ALTER TABLE public.pedido_produto ADD CONSTRAINT produto_pedido_produto_fk
FOREIGN KEY (idProduto)
REFERENCES public.produto (idProduto)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.carrinho ADD CONSTRAINT produto_carrinho_fk
FOREIGN KEY (idProduto)
REFERENCES public.produto (idProduto)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.pedido ADD CONSTRAINT pessoa_pedido_fk
FOREIGN KEY (idPessoa)
REFERENCES public.pessoa (idPessoa)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.carrinho ADD CONSTRAINT pessoa_carrinho_fk
FOREIGN KEY (idPessoa)
REFERENCES public.pessoa (idPessoa)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.pedido_produto ADD CONSTRAINT pedido_pedido_produto_fk
FOREIGN KEY (idPedido)
REFERENCES public.pedido (idPedido)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
