//Cargar de manera automatica los datos regostrados
// Busqueda por id
function findById(id) {
    $.ajax({
        url: 'http://localhost:9000/security/api/security/usuarios/' + id,
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (item) {
        $("#id").val(item.id)
        $("#usuario").val(item.usuario)
        $("#contrasenia").val(item.contrasenia)
        $("#personaId").val(item.personaId.id)        
        $("#estado").val(item.estado==true?'1':'0')      
    })
}

function loadTable() {
    $.ajax({
        url: 'http://localhost:9000/security/api/security/usuarios',
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (items) {
        var registros = "";
        items.forEach(function (item, index, array) {
            registros += `
                        <tr class="table-light">
                            <td>`+item.usuario+`</td>
                            <td>`+item.contrasenia+`</td>
                            <td>`+item.personaId.nombreCompleto+`</td>                            
                            <td>`+(item.estado==true?'Activo':'Inactivo')+`</td>
                            <td><img src="../../asset/library/node_modules/bootstrap-icons/icons/pencil-square.svg" alt="" onclick="findById(`+item.id+`);"></td>
                            <td><img src="../../asset/library/node_modules/bootstrap-icons/icons/person-x.svg" alt="" onclick="deleteById(`+item.id+`);"></td>
                        </tr>
                        `;
        })
        $("#dataResult").html(registros);   
    })
}

//Accion para eliminar un registro seleccionado 
function deleteById(id){
    $.ajax({
        url: 'http://localhost:9000/security/api/security/usuarios/' + id,
        method: "delete",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (result) {
        loadTable();
    })
}


//Accion de adicionar un registro
function Add(){
    $.ajax({
        url: 'http://localhost:9000/security/api/security/usuarios',
        data: JSON.stringify({
            usuario: $("#usuario").val(),
            contrasenia: $("#contrasenia").val(),
            personaId: {
                id:$("#personaId").val()
            },  
            estado: parseInt($("#estado").val())
        }),
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (result) {
        //Cargar datos
        loadTable();

        //Limpiar formulario
        clearData();
    })
}


//Accion de actualizar un registro
function Update(){
    $.ajax({
        url: 'http://localhost:9000/security/api/security/usuarios/' + $("#id").val(),
        data: JSON.stringify({
            usuario: $("#usuario").val(),
            contrasenia: $("#contrasenia").val(),
            personaId: {
                id:parseInt($("#personaId").val())
            },
            estado: parseInt($("#estado").val())
        }),
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (result) {
        //Cargar datos
        loadTable();

        //Limpiar formulario
        clearData();
    })
}

// Función para limpiar datos
function clearData(){
    $("#id").val(""),
    $("#usuario").val(""),
    $("#contrasenia").val(""),
    $("#personaId").val(""),    
    $("#estado").val("")
}