<?php
    $numero1=0;
    $numero2=0;
    $suma = 0;

    $numero1 = $_POST['txtNumero1'];
    $numero2 = $_POST['txtNumero2'];

    if(isset($numero1) && isset($numero2)){
        $suma = $numero1 +  $numero2;
        echo $suma;
    }
    
    $a = 10;
    $a="hola mundo";
?>
