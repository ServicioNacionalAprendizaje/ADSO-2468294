function Login() {
    let user = document.getElementById('txtUser').value;
    let password = document.getElementById('txtPassword').value;

    //Datos de ingreso de la aplicación User: abcd Pass: abcd1234
    if (user == 'abcd' && password == 'abcd1234') {
        Swal.fire({
            position: 'top-end',
            icon: 'success',
            title: 'Bienvenido',
            showConfirmButton: false,
            timer: 3000
        })
        Swal.fire({
            title: 'Bienvenido',
            showDenyButton: true,
            showCancelButton: true,
            confirmButtonText: 'Continuar',
            denyButtonText: `No continuar`,
        }).then((result) => {
            /* Read more about isConfirmed, isDenied below */
            if (result.isConfirmed) {
                Swal.fire('Saved!', '', 'success')
                window.location.assign('/SENA/ADSO-2468294/Sesiones-2468294/2023/Sesion_02_03/view/dashboard.html');
            } else if (result.isDenied) {
                Swal.fire('Se canceló el ingreso', '', 'info')
                Clear();
            }
        })

    } else {
        Swal.fire({
            icon: 'error',
            title: 'Error en la autenticación',
            text: 'Something went wrong!',
            footer: '<a href="">Why do I have this issue?</a>'
        })
        Clear();
    }
}

function SignOut(){
    Swal.fire({
        title: '¡Hasta pronto!',
        showDenyButton: true,
        showCancelButton: true,
        confirmButtonText: 'Cerrar Sesión',
        denyButtonText: `Continuar en la Sesión`,
    }).then((result) => {
        /* Read more about isConfirmed, isDenied below */
        if (result.isConfirmed) {
            Swal.fire('Saved!', '', 'success')
            window.location.assign('/SENA/ADSO-2468294/Sesiones-2468294/2023/Sesion_02_03/index.html');
        } else if (result.isDenied) {
            Swal.fire('Se continúa en la sesión', '', 'info')
            Clear();
        }
    })
}

function Clear() {
    document.getElementById('txtUser').value = '';
    document.getElementById('txtPassword').value = '';
}