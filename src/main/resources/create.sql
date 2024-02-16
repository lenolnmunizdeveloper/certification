INSERT INTO
    questions (id, description, technology)
VALUES (
        'a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', 'Qual é a diferença entre ArrayList e LinkedList?', 'Java'
    ),
    (
        'b1eebc99-9c0b-4ef8-bb6d-6bb9bd380a12', 'Como você pode evitar o Callback Hell?', 'JavaScript'
    ),
    (
        'c2eebc99-9c0b-4ef8-bb6d-6bb9bd380a13', 'O que é polimorfismo?', 'OOP'
    ),
    (
        'd3eebc99-9c0b-4ef8-bb6d-6bb9bd380a14', 'Qual é a diferença entre uma classe abstrata e uma interface?', 'Java'
    ),
    (
        'e4eebc99-9c0b-4ef8-bb6d-6bb9bd380a15', 'O que são Promises?', 'JavaScript'
    );

INSERT INTO
    alternatives (
        id, question_id, is_correct, description
    )
VALUES (
        '698d10ba-81b1-4c0e-987e-5ab4cc78e09e', 'a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', true, 'ArrayList é baseado em um array, enquanto LinkedList é baseada em uma lista encadeada.'
    ),
    (
        'bc2ac7d1-61ee-4cf6-885e-84a6706984ed', 'a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', false, 'ArrayList e LinkedList são a mesma coisa.'
    ),
    (
        '8bbee6bb-9661-405c-919d-ab16e1de030c', 'a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', false, 'ArrayList é baseado em uma lista encadeada, enquanto LinkedList é baseada em um array.'
    ),
    (
        'b6a5fb11-39ba-48c1-a390-1596a80b5055', 'b1eebc99-9c0b-4ef8-bb6d-6bb9bd380a12', true, 'Usando Promises, async/await ou bibliotecas como bluebird.'
    ),
    (
        '28a6fd88-df82-4c49-97d7-756c93bfc51e', 'b1eebc99-9c0b-4ef8-bb6d-6bb9bd380a12', false, 'Callback Hell não pode ser evitado.'
    ),
    (
        'cc05bf04-0937-4cf5-8cbe-70f4b87453da', 'b1eebc99-9c0b-4ef8-bb6d-6bb9bd380a12', false, 'Callback Hell é um termo usado para descrever Promises.'
    ),
    (
        'e9a0b299-b93e-4d82-a57b-0e39c1a41c2c', 'c2eebc99-9c0b-4ef8-bb6d-6bb9bd380a13', true, 'Polimorfismo é a capacidade de um objeto poder ser referenciado de várias formas.'
    ),
    (
        '66b6c0eb-7edb-4076-8c87-cf6eabc8885c', 'c2eebc99-9c0b-4ef8-bb6d-6bb9bd380a13', false, 'Polimorfismo é uma característica exclusiva do Java.'
    ),
    (
        'bcf8e361-0edd-4c99-ad74-3f0ab6866cd9', 'c2eebc99-9c0b-4ef8-bb6d-6bb9bd380a13', false, 'Polimorfismo é uma característica exclusiva do Java.'
    ),
    (
        '2162ee1c-5f37-40b1-9d7a-c4f2761d3ed7', 'd3eebc99-9c0b-4ef8-bb6d-6bb9bd380a14', true, 'Uma classe abstrata pode ter métodos implementados, enquanto uma interface não pode.'
    ),
    (
        '778b8a43-7418-4701-b227-fc1d78758f6e', 'd3eebc99-9c0b-4ef8-bb6d-6bb9bd380a14', false, 'Uma classe abstrata e uma interface são a mesma coisa.'
    ),
    (
        '4f23c786-361b-4091-954c-8bfcd0f70aae', 'd3eebc99-9c0b-4ef8-bb6d-6bb9bd380a14', false, 'Uma interface pode ter métodos implementados, enquanto uma classe abstrata não pode.'
    ),
    (
        '8c7bd45e-9253-4043-9aa9-b9c4a318970c', 'e4eebc99-9c0b-4ef8-bb6d-6bb9bd380a15', true, 'Promises são objetos que representam o eventual cumprimento ou falha de uma operação assíncrona.'
    ),
    (
        '33b5232c-de33-4b22-8b9c-eb322b415418', 'e4eebc99-9c0b-4ef8-bb6d-6bb9bd380a15', false, 'Promises são uma característica exclusiva do JavaScript.'
    );