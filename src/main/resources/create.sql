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
    ),
    (
        'ae9470c6-323f-49f7-b353-3afe97832132', '9b97797e-413c-44de-9343-9586652bf656', true, 'Usando Promises, async/await ou bibliotecas como bluebird.'
    ),
    (
        'e8588599-04ee-4ecd-9392-5bb40c5da762', '9b97797e-413c-44de-9343-9586652bf656', false, 'Callback Hell não pode ser evitado.'
    ),
    (
        'eb741a45-6fc4-49fe-922b-298bbd8a079e', '9b97797e-413c-44de-9343-9586652bf656', false, 'Callback Hell é um termo usado para descrever Promises.'
    ),
    (
        '31da69b2-df0f-4647-ab92-64bda8b001b2', 'd3302a90-3bfb-49e9-9c26-22ae9ab1edcd', true, 'Polimorfismo é a capacidade de um objeto poder ser referenciado de várias formas.'
    ),
    (
        '27b2750c-6e60-480e-b0e7-c3ff25876ccb', 'd3302a90-3bfb-49e9-9c26-22ae9ab1edcd', false, 'Polimorfismo é uma característica exclusiva do Java.'
    ),
    (
        'f2dad960-9d16-470d-a388-143429359865', 'd3302a90-3bfb-49e9-9c26-22ae9ab1edcd', false, 'Polimorfismo é uma característica exclusiva do Java.'
    ),
    (
        'c485e4c3-fd75-4ae2-b033-86c85b54441b', '7e699290-5524-4631-824d-4c30ed9803a9', true, 'Uma classe abstrata pode ter métodos implementados, enquanto uma interface não pode.'
    ),
    (
        '05db6f9e-d920-482d-8774-12b831f29a76', '7e699290-5524-4631-824d-4c30ed9803a9', false, 'Uma classe abstrata e uma interface são a mesma coisa.'
    ),
    (
        '49b4dc9b-9411-4695-b65a-aa9d0e8eb47f', '7e699290-5524-4631-824d-4c30ed9803a9', false, 'Uma interface pode ter métodos implementados, enquanto uma classe abstrata não pode.'
    ),
    (
        'ed107d6d-9cfa-4092-8b58-c02bb4e97d58', '783812dc-dab7-4b0e-9936-7eee49770728', true, 'Promises são objetos que representam o eventual cumprimento ou falha de uma operação assíncrona.'
    ),
    (
        '60c0bf3f-f535-47b7-b733-6530e1377e54', '783812dc-dab7-4b0e-9936-7eee49770728', false, 'Promises são uma característica exclusiva do JavaScript.'
    );