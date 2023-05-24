function loadPersona() {
    $.ajax({
        url: 'http://localhost:9000/security/api/security/personas',
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (items) {
        var registros = `<option selected="" selected disabled hidden value="">--Seleccione--</option>`;
        items.forEach(function (item, index, array) {
            registros += `                       
                            <option value="`+item.id+`">`+item.nombreCompleto+`</option>
                        `;
        })
        $("#personaId").html(registros);   
    })
}