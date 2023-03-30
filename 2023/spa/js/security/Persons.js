function Add(action) {
    var parametros = {              
        "documentType": $('#documentType').val(),
        "document": $('#document').val(),
        "firstName": $('#firstName').val(),
        "secondName": $('#secondName').val(),
        "firstLastName": $('#firstLastName').val(),
        "secondLastName": $('#secondLastName').val(),
        "age": $('#age').val(),
        "gender": $('#gender').val(),
        "mail": $('#mail').val(),
        "phoneNumber": $('#phoneNumber').val(),
        "address": $('#address').val(),
        "status": $('#status').val(),
        "action": action
    };

    $.ajax({
        data: parametros, //datos que se van a enviar al ajax
        url: '../../controller/security/Persons.php', //archivo php que recibe los datos
        type: 'post', //método para enviar los datos
        dataType: 'json', //Recibe el array desde php

        success: function(respuesta) { //procesa y devuelve la respuesta
            
            //Respueta adicionar
            if(respuesta['accion']=='Add'){
                alert(respuesta['respuesta']);
                Limpiar();                
            }           
        }
    });
}

function Limpiar(){
    $('#typeDocument').val("");
    $('#document').val("");
    $('#firstName').val("");    
}