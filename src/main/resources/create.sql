INSERT INTO
    questions (id, description, technology)
VALUES (
        '35866851-c60f-4586-8e86-8339f9437d99', 'Qual é a diferença entre ArrayList e LinkedList?', 'Java'
    ),
    (
        '9b97797e-413c-44de-9343-9586652bf656', 'Como você pode evitar o Callback Hell?', 'JavaScript'
    ),
    (
        'd3302a90-3bfb-49e9-9c26-22ae9ab1edcd', 'O que é polimorfismo?', 'OOP'
    ),
    (
        '7e699290-5524-4631-824d-4c30ed9803a9', 'Qual é a diferença entre uma classe abstrata e uma interface?', 'Java'
    ),
    (
        '783812dc-dab7-4b0e-9936-7eee49770728', 'O que são Promises?', 'JavaScript'
    ),
    (
        'b835d6ca-61e1-4e68-ba4b-cf9e14c2cb68', 'O que é herança em programação orientada a objetos?', 'OOP'
    ),
    (
        'ab21a6fc-0d6f-42d4-afe5-70e7b5a03d1e', 'Quais são as principais diferenças entre Python 2 e Python 3?', 'Python'
    ),
    (
        '2a8fcfa1-cf41-46d3-ba52-6ff30a3fc7c8', 'Explique o conceito de chave primária em bancos de dados.', 'Databases'
    ),
    (
        '14d89f43-f0d8-4536-bb71-6d5a82bf8765', 'Como você implementaria um loop em SQL?', 'SQL'
    ),
    (
        'db57350d-6c6d-476a-8b8b-d6e5bf08c758', 'Qual é a diferença entre uma variável global e uma variável local?', 'Java'
    ),
    (
        'a52f4085-44d4-4b7c-96a0-7e22e96d9d22', 'O que é MVC (Model-View-Controller) e como ele é usado em desenvolvimento web?', 'Web Development'
    ),
    (
        '13ef905b-7f5e-4a22-90e7-858faa6406d1', 'Quais são as vantagens e desvantagens de usar um banco de dados relacional?', 'Databases'
    ),
    (
        '4503f4e6-f9b0-4a57-b3e3-2cc051628474', 'Explique o conceito de herança múltipla e como é tratado em linguagens de programação.', 'Java'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        'ead6184e-4a71-44d9-9015-a32ec4d7a423', '35866851-c60f-4586-8e86-8339f9437d99', true, 'ArrayList é baseado em um array, enquanto LinkedList é baseada em uma lista encadeada.'
    ),
    (
        '105e4a7d-a0cf-482f-a976-657e5d401c6d', '35866851-c60f-4586-8e86-8339f9437d99', false, 'ArrayList e LinkedList são a mesma coisa.'
    ),
    (
        'f7b093f6-2153-4d3e-bb7b-c080f2d4ae1f', '35866851-c60f-4586-8e86-8339f9437d99', false, 'ArrayList é baseado em uma lista encadeada, enquanto LinkedList é baseada em um array.'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        'ae9470c6-323f-49f7-b353-3afe97832132', '9b97797e-413c-44de-9343-9586652bf656', true, 'Usando Promises, async/await ou bibliotecas como bluebird.'
    ),
    (
        'e8588599-04ee-4ecd-9392-5bb40c5da762', '9b97797e-413c-44de-9343-9586652bf656', false, 'Callback Hell não pode ser evitado.'
    ),
    (
        'eb741a45-6fc4-49fe-922b-298bbd8a079e', '9b97797e-413c-44de-9343-9586652bf656', false, 'Callback Hell é um termo usado para descrever Promises.'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        '31da69b2-df0f-4647-ab92-64bda8b001b2', 'd3302a90-3bfb-49e9-9c26-22ae9ab1edcd', true, 'Polimorfismo é a capacidade de um objeto poder ser referenciado de várias formas.'
    ),
    (
        '27b2750c-6e60-480e-b0e7-c3ff25876ccb', 'd3302a90-3bfb-49e9-9c26-22ae9ab1edcd', false, 'Polimorfismo é uma característica exclusiva do Java.'
    ),
    (
        'f2dad960-9d16-470d-a388-143429359865', 'd3302a90-3bfb-49e9-9c26-22ae9ab1edcd', false, 'Polimorfismo é uma característica exclusiva do Java.'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        'c485e4c3-fd75-4ae2-b033-86c85b54441b', '7e699290-5524-4631-824d-4c30ed9803a9', true, 'Uma classe abstrata pode ter métodos implementados, enquanto uma interface não pode.'
    ),
    (
        '05db6f9e-d920-482d-8774-12b831f29a76', '7e699290-5524-4631-824d-4c30ed9803a9', false, 'Uma classe abstrata e uma interface são a mesma coisa.'
    ),
    (
        '49b4dc9b-9411-4695-b65a-aa9d0e8eb47f', '7e699290-5524-4631-824d-4c30ed9803a9', false, 'Uma interface pode ter métodos implementados, enquanto uma classe abstrata não pode.'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        'ed107d6d-9cfa-4092-8b58-c02bb4e97d58', '783812dc-dab7-4b0e-9936-7eee49770728', true, 'Promises são objetos que representam o eventual cumprimento ou falha de uma operação assíncrona.'
    ),
    (
        '60c0bf3f-f535-47b7-b733-6530e1377e54', '783812dc-dab7-4b0e-9936-7eee49770728', false, 'Promises são uma característica exclusiva do JavaScript.'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        '3cfd535f-41d1-43cb-851d-89a77729f3cc', 'b835d6ca-61e1-4e68-ba4b-cf9e14c2cb68', true, 'Herança é um conceito em que uma classe (subclasse) herda características (atributos e métodos) de outra classe (superclasse).'
    ),
    (
        '1b91b8c8-8efb-4914-901d-1af4c24e3707', 'b835d6ca-61e1-4e68-ba4b-cf9e14c2cb68', false, 'Herança refere-se à capacidade de uma classe possuir múltiplas instâncias.'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        '953d3f39-66f2-42f0-9869-d58a02b4a16f', 'ab21a6fc-0d6f-42d4-afe5-70e7b5a03d1e', true, 'Python 3 introduziu várias melhorias em relação ao Python 2, incluindo suporte total a Unicode, mudanças na sintaxe e melhorias na performance.'
    ),
    (
        '7be42d8e-8759-4f47-ae32-58f2bf1ad30b', 'ab21a6fc-0d6f-42d4-afe5-70e7b5a03d1e', false, 'Python 2 é completamente compatível com Python 3, não havendo diferenças significativas entre eles.'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        '2dd27371-9a0c-4f8e-b17a-014a1165b1c2', '2a8fcfa1-cf41-46d3-ba52-6ff30a3fc7c8', true, 'Uma chave primária é um campo ou conjunto de campos que identifica exclusivamente cada registro em uma tabela de banco de dados.'
    ),
    (
        'bfbf8a5f-7a1e-462a-a25d-ba7b74224b90', '2a8fcfa1-cf41-46d3-ba52-6ff30a3fc7c8', false, 'Uma chave primária não é necessária em bancos de dados.'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        'b22099a5-9fd4-4d1e-a86b-fcd9f7e02f52', '14d89f43-f0d8-4536-bb71-6d5a82bf8765', true, 'Em SQL, você pode usar a cláusula WHILE para implementar loops.'
    ),
    (
        '9f04478b-728f-4b17-8678-98c50febb953', '14d89f43-f0d8-4536-bb71-6d5a82bf8765', false, 'Looping em SQL não é possível.'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        '63e63630-6484-499e-85e1-312d001b8b5e', 'db57350d-6c6d-476a-8b8b-d6e5bf08c758', true, 'Uma variável global é acessível em todo o programa, enquanto uma variável local está acessível apenas dentro de um escopo específico, como uma função.'
    ),
    (
        'f4c3d47c-5d11-491d-b9ff-0f5720d0c1d4', 'db57350d-6c6d-476a-8b8b-d6e5bf08c758', false, 'Variáveis globais e locais são conceitos idênticos.'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        'b24b6359-0721-4a86-af5f-5393e8f0ab1c', 'a52f4085-44d4-4b7c-96a0-7e22e96d9d22', true, 'MVC é um padrão de design arquitetônico que separa uma aplicação em três componentes principais: o Model (dados), a View (interface com o usuário) e o Controller (lógica de controle).'
    ),
    (
        'b44844da-28a4-4a7b-a49c-672cc3dfecf0', 'a52f4085-44d4-4b7c-96a0-7e22e96d9d22', false, 'MVC é um tipo de linguagem de programação.'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        'be02d1b8-9b21-4f11-b367-1423033f212d', '13ef905b-7f5e-4a22-90e7-858faa6406d1', true, 'As vantagens de usar um banco de dados relacional incluem a integridade referencial, a capacidade de realizar consultas complexas e a segurança dos dados.'
    ),
    (
        '4fb5e77f-fa1e-4c31-af81-960ac0c7dd06', '13ef905b-7f5e-4a22-90e7-858faa6406d1', false, 'Bancos de dados relacionais não têm vantagens sobre outros tipos de bancos de dados.'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        '5011cc45-8e01-4693-b937-72a5e5df1ab2', '4503f4e6-f9b0-4a57-b3e3-2cc051628474', true, 'Herança múltipla é um conceito em que uma classe pode herdar atributos e métodos de mais de uma classe pai.'
    ),
    (
        'dbd80e95-8c1b-4c24-987e-eb62cc5d9a7e', '4503f4e6-f9b0-4a57-b3e3-2cc051628474', false, 'Herança múltipla não é suportada em linguagens de programação.'
    );