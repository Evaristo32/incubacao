# Incubação
Controle de incubação de aves 


Esse projeto e destino a gerenciar o tempo de incubação das aves e os recursos disponíveis para a incubação das mesmas.


# Arquitetura do Projeto


A arquitetura do projeto e baseada no MVC, basicamente o fluxo do projeto funcionara da seguinte maneira. As requisições vão chegar as Controllers que ficaram no pacote (br.com.incubacao.controller) que são responsáveis por direcionar as requisições para o serviço responsável por tratar aquela requisição chamando assim a camada Service que fica no pacote (br.com.incubacao.service), o mesmo tera os contratos e suas implementações onde as regras do negócio ficaram dentro das implementações desses contratos que serão responsáveis por validar algumas e regras e chamar a camada de acesso ao banco de dados.


![image](https://user-images.githubusercontent.com/20672368/165120581-2048a9ef-4682-41f5-a89c-622bd57ab35c.png)


