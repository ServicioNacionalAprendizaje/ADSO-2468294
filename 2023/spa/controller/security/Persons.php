<?php
require_once '../../model/security/Persons.php';
    
//Data - JSON
$action=$_POST['action'];
$id=$_POST['id'];
$documentType=$_POST['documentType'];
$document=$_POST['document'];
$firstName=$_POST['firstName'];
$secondName=$_POST['secondName'];
$firstLastName=$_POST['firstLastName'];
$secondLastName=$_POST['secondLastName'];
$age=$_POST['age'];
$gender=$_POST['gender'];
$mail=$_POST['mail'];
$phoneNumber=$_POST['phoneNumber'];
$address=$_POST['address'];
$status=$_POST['status'];
$userCreation;
$userModification;
$dateCreation;
$dateModification;

if(isset($action))
{
    $person = new Persons();
    switch($action)
    {
        case 'Add':     
            $person->setDocumentType($documentType);
            $person->setDocument($document);
            $person->setFirstName($firstName);
            // $person->setSecondName($secondName);
            // $person->setfirstLastName($firstLastName);
            // $person->setsecondLastName($secondLastName);
            // $person->setAge($age);
            // $person->setGender($gender);
            // $person->setMail($mail);
            // $person->setPhoneNumber($phoneNumber);
            // $person->setAddress($address);
            // $person->setStatus($status);
            $person->Add();
        break;
        case 'Update': 
            $person->setId($id);
            $person->setDocumentType($documentType);
            $person->setDocument($document);
            $person->setFirstName($firstName);
            // $person->setSecondName($secondName);
            // $person->setfirstLastName($firstLastName);
            // $person->setsecondLastName($secondLastName);
            // $person->setAge($age);
            // $person->setGender($gender);
            // $person->setMail($mail);
            // $person->setPhoneNumber($phoneNumber);
            // $person->setAddress($address);
            // $person->setStatus($status);  
            $person->Update();             
        break;
        case 'Consult':   
            $person->setId($id);
            $person->setDocumentType($documentType);
            $person->setDocument($document);
            $person->setFirstName($firstName);
            // $person->setSecondName($secondName);
            // $person->setfirstLastName($firstLastName);
            // $person->setsecondLastName($secondLastName);
            // $person->setAge($age);
            // $person->setGender($gender);
            // $person->setMail($mail);
            // $person->setPhoneNumber($phoneNumber);
            // $person->setAddress($address);
            // $person->setStatus($status);  
            $person->Update();              
        break;
        case 'Delete':  
            $person->setId($id);
            $person->Delete();                           
        break;
    }    

}
