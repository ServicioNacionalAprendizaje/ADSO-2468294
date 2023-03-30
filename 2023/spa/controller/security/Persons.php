<?php
require_once '../../model/security/Persons.php';
    
$respuesta = array();

if(isset($action))
{
    $person = new Persons();
    switch($action)
    {
        case 'Add':  
            try{
                $person->setDocumentType($_POST['documentType']);
                $person->setDocument($_POST['document']);
                $person->setFirstName($_POST['firstName']);
                $person->setSecondName($_POST['secondName']);
                $person->setfirstLastName($_POST['firstLastName']);
                $person->setsecondLastName($_POST['secondLastName']);
                $person->setAge($_POST['age']);
                $person->setGender($_POST['gender']);
                $person->setMail($_POST['mail']);
                $person->setPhoneNumber($_POST['phoneNumber']);
                $person->setAddress($_POST['address']);
                $person->setStatus($_POST['status']);                
                $resultado = $person->Add();
                $respuesta['respuesta']="La información se adicionó correctamente.";
            }catch(Exception $e){
                $respuesta['respuesta']="Error, no fué posible agregar la información, consulte con el administrador.";
            }
            $respuesta['accion']='Add';
            echo json_encode($respuesta);
        break;
        case 'Update': 
            $person->setId($_POST['id']);
            $person->setDocumentType($documentType);
            $person->setDocument($document);
            $person->setFirstName($firstName);
            $person->setSecondName($secondName);
            $person->setfirstLastName($firstLastName);
            $person->setsecondLastName($secondLastName);
            $person->setAge($age);
            $person->setGender($gender);
            $person->setMail($mail);
            $person->setPhoneNumber($phoneNumber);
            $person->setAddress($address);
            $person->setStatus($status);  
            $person->Update();             
        break;
        case 'Consult':   
            $person->setId($_POST['id']);
            $person->setDocumentType($documentType);
            $person->setDocument($document);
            $person->setFirstName($firstName);
            $person->setSecondName($secondName);
            $person->setfirstLastName($firstLastName);
            $person->setsecondLastName($secondLastName);
            $person->setAge($age);
            $person->setGender($gender);
            $person->setMail($mail);
            $person->setPhoneNumber($phoneNumber);
            $person->setAddress($address);
            $person->setStatus($status);  
            $person->Update();              
        break;
        case 'Delete':  
            $person->setId($_POST['id']);
            $person->Delete();                           
        break;
    }    

}
