console.log("Olá Itau");
//let ano = prompt("Digite o ano do seu nascimento");
//let idade = 2020 - ano;
//console.log("Meu ano de nascimento é " +ano);
//console.log("Minha idade é " +idade);
//verificaidade(idade);
const apiurl ="http://blockchain.i3lab.tech/api/run";
let tiporequisicao = {
    method: 'GET'
}

fetch(apiurl, tiporequisicao)
    .then(function(response){
        response.json()
            .then(function(objeto){
                document.getElementById("status").innerHTML = objeto.status;
                document.getElementById("data").innerHTML = objeto.date;
                document.getElementById("versao").innerHTML
                 = objeto.version;

                
            })
            .catch(function(ex){
                console.error(ex)
           })
    })
    .catch(function(ex){
        console.error(ex)
    })
//comentario

function validaCPF(){
    document.getElementById("success").style.display = 'none';
    document.getElementById("error").style.display = 'none';
    let numeroscpf = document.getElementById("cpf").value;
    console.log("CPF " +numeroscpf);
    let soma =0, result, soma2=0, result2, i;
    console.log("Caracteres " +numeroscpf.length);

    if (numeroscpf.length < 11){
            console.log("CPF Invalido - Menor que 11 Caracteres");
            document.getElementById("error").style.display = 'block';
        return false;}

    if (numeroscpf.length > 11){
            console.log("CPF Invalido - Maior que 11 Caracteres");
            document.getElementById("error").style.display = 'block';
        return false;}

          for (i = 0; i < numeroscpf.length - 2; i++){
            soma = soma + (parseInt(numeroscpf.charAt(i)) * (10-i));
            console.log("Executado 1x");}
            result = 11 - (soma % 11);
                if (result == 10 || result == 11 )
                    result=0;
                if (result != parseInt(numeroscpf.charAt(9))){
                    console.log("CPF Invalido");
                    document.getElementById("error").style.display = 'block';
                return false;
            }

            for (i = 0; i < numeroscpf.length - 1; i++){
                soma2 = soma2 + (parseInt(numeroscpf.charAt(i)) * (11-i));
                console.log("Executado 1x");
            }
            result2 = 11 - (soma2 % 11);
                if (result2 == 10 || result2 == 11 )
                    result2=0;
                if (result2 != parseInt(numeroscpf.charAt(10))){
                    console.log("CPF Invalido");
                    document.getElementById("error").style.display = 'block';
                    return false;}
                else{
             console.log("CPF Valido");
             document.getElementById("success").style.display = 'block';
        return true;}
    }
        function calcular(){
            console.log("Calculando");
            let ano = document.getElementById("anoNascimento").value;
            console.log("Ano " +ano);
            let idade = 2020 - ano;
            console.log("Idade " +idade);
            verificaidade(idade);
        }
        function verificaidade(idadedapessoa){
            if (idadedapessoa >= 60){
                console.log("Fique em Casa");
            }else{
                console.log("Saia Se For Necessário");
            }

            
 

}
