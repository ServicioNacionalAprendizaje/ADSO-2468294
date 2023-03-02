function Login(){
    let user = document.getElementById('txtUser').value;
    let password = document.getElementById('txtPassword').value;

    //Datos de ingreso de la aplicación User: abcd Pass: abcd1234
    if(user == 'abcd' && password == 'abcd1234'){
        alert("Bienvenido!");
        window.location.assign('/SENA/ADSO-2468294/Sesiones-2468294/2023/Sesion_02_03/view/dashboard.html');
    }else{
        alert("Error en la autenticación");
        document.getElementById('txtUser').value = '';
        document.getElementById('txtPassword').value = '';
    }
}