INSERT INTO blocos (nome) VALUES ('Bloco A');
INSERT INTO blocos (nome) VALUES ('Bloco B');

INSERT INTO apartamentos (numero, andar, bloco_id) VALUES ('101', 1, 1);
INSERT INTO apartamentos (numero, andar, bloco_id) VALUES ('102', 1, 1);

INSERT INTO moradores (nome, telefone, apartamento_id) VALUES ('João Silva', '123456789', 1);
INSERT INTO moradores (nome, telefone, apartamento_id) VALUES ('Maria Oliveira', '987654321', 2);

INSERT INTO ocorrencias (descricao, data_hora, morador_id) VALUES ('Vazamento', '2020-01-01T00:00:00', 1);
INSERT INTO ocorrencias (descricao, data_hora, morador_id) VALUES ('Lâmpada queimada', '2020-01-02T00:00:00', 2);