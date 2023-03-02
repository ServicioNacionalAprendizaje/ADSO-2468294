<?php
    include('../model/SumarM.php');

   $accion=$_POST['btnEnviar'];

   if(isset($accion)){

        switch($accion){
            case 'Sumar':
                $suma = new Sumar();
                $suma->setN1($_POST['txtNumero1']);
                $suma->setN2($_POST['txtNumero2']);
                $suma->Calcular();
            break;           
        }
   }
?>