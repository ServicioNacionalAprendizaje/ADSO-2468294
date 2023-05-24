<?php
include('../model/salarioM.php');
$accion = $_POST['boton'];

if(isset($accion)){
    switch($accion){
        case 'calcular':
            $salarioM = new SalarioModel;
            $salarioM->setCantidadHora($_POST['txtCantidadHora']);
            $salarioM->setValorHora($_POST['txtValorHora']);
            $salarioM-> Operaciones();
            break;
    }
}
?>