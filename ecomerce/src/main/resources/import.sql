insert into categoria (nome, descricao) values ('Livros', 'Livros Técnicos');
insert into categoria (nome, descricao) values ('Eletrônicos', 'Equipamentos Eletrônicos');
insert into categoria (nome, descricao) values ('Escritório', 'Material de Escritório');
insert into categoria (nome, descricao) values ('Periféricos', 'Acessórios para Computador');
insert into categoria (nome, descricao) values ('Móveis', 'Móveis para Home Office');

insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Código Limpo', 'Livro do Autor Robert Martin', 73.44, 20, 1);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Notebook Dell Inspiron', 'Notebook 16GB de RAM e SSD de 512GB', 4199.90, 8, 2);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Caderno Universitário', 'Caderno de 10 matérias com 200 folhas', 32.50, 50, 3);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Teclado Mecânico', 'Teclado mecânico ABNT2 com switch red', 289.90, 15, 4);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Cadeira Ergonômica', 'Cadeira de escritório com apoio lombar', 1249.00, 6, 5);

insert into cliente (nome, email, telefone) values ('Bruno Shiguematu', 'bruno.shiguematu@email.com', '(14) 99711-1001');
insert into cliente (nome, email, telefone) values ('Davi Corsini', 'davi.corsini@email.com', '(14) 99711-1002');
insert into cliente (nome, email, telefone) values ('Miguel Prevedelli', 'miguel.prevedelli@email.com', '(14) 99711-1003');
insert into cliente (nome, email, telefone) values ('Diego Marques', 'diego.marques@email.com', '(14) 99711-1004');
insert into cliente (nome, email, telefone) values ('Guilherme Costa', 'guilherme.costa@email.com', '(14) 99711-1005');

insert into pedido (data, status, valor_total, cliente_id) values ('2026-03-02 10:15:00', 'FINALIZADO', 146.88, 1);
insert into pedido (data, status, valor_total, cliente_id) values ('2026-03-05 14:40:00', 'FINALIZADO', 4199.90, 2);
insert into pedido (data, status, valor_total, cliente_id) values ('2026-03-08 09:05:00', 'PAGO', 97.50, 3);
insert into pedido (data, status, valor_total, cliente_id) values ('2026-03-11 16:25:00', 'PENDENTE', 579.80, 4);
insert into pedido (data, status, valor_total, cliente_id) values ('2026-03-14 11:50:00', 'CANCELADO', 1249.00, 5);

insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (2, 73.44, 1, 1);
insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 4199.90, 2, 2);
insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (3, 32.50, 3, 3);
insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (2, 289.90, 4, 4);
insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 1249.00, 5, 5);

insert into pagamento (valor, data, status, tipo, pedido_id) values (146.88, '2026-03-02 10:20:00', 'APROVADO', 'PIX', 1);
insert into pagamento (valor, data, status, tipo, pedido_id) values (4199.90, '2026-03-05 14:45:00', 'APROVADO', 'CARTAO_CREDITO', 2);
insert into pagamento (valor, data, status, tipo, pedido_id) values (97.50, '2026-03-08 09:10:00', 'APROVADO', 'BOLETO', 3);
insert into pagamento (valor, data, status, tipo, pedido_id) values (579.80, '2026-03-11 16:30:00', 'PENDENTE', 'BOLETO', 4);
insert into pagamento (valor, data, status, tipo, pedido_id) values (1249.00, '2026-03-14 11:55:00', 'RECUSADO', 'CARTAO_DEBITO', 5);