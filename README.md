# API Linguagem
Essa é uma API que consulta, cria e deleta dados no banco de dados MongoDB

O documento no banco de dados precisa conter as chaves name, image, ranking

Exemplo: { "name": "C", "image": "url da imagem", "ranking": 1}

### Guia
* Necessário alterar a propriedade **uri** no arquivo [aplication.properties](https://github.com/bruno600/imersa-java-alura-linguagens-api/blob/main/src/main/resources/application.properties) para sua url mongodb
* Nome da collection no bando de dados: **principaisLinguagens**