//Accion de adicionar un registro
function Add(){
    $.ajax({
        url: '../../controller/security/Persons.php',
        data: JSON.stringify({
            action:$('#action'),
            id:$('#id'),
            documentType:$('#documentType'),
            document:$('#document'),
            firstName:$('#firstName'),
            secondName:$('#secondName'),
            firstLastName:$('#firstLastName'),
            secondLastName:$('#secondLastName'),
            age:$('#age'),
            gender:$('#gender'),
            mail:$('#mail'),
            phoneNumber:$('#phoneNumber'),
            address:$('#address'),
            status: parseInt($("#status").val())
        }),
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (result) {
        loadTable();
    })
}