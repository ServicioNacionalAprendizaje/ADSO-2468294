<?php
require_once '../../model/security/Persons.php';
require_once '../../environment/message.php';

$dataResult = array();
$action = $_POST['action'];

if (isset($action)) {
    $person = new Persons();
    switch ($action) {
        case 'Add':
            try {
                $person->setDocumentType($_POST['documentType']);
                $person->setDocument($_POST['document']);
                $person->setFirstName($_POST['firstName']);
                $person->setSecondName($_POST['secondName']);
                $person->setfirstLastName($_POST['firstLastName']);
                $person->setsecondLastName($_POST['secondLastName']);
                $person->setAge($_POST['age']);
                $person->setGender($_POST['gender']);
                $person->setMail($_POST['mail']);
                $person->setNumberPhone($_POST['phoneNumber']);
                $person->setAddress($_POST['address']);
                $person->setStatus($_POST['status']);
                $person->Add();
                $dataResult['message'] = saveMessage;
            } catch (Exception $e) {
                $dataResult['message'] = errorMessage;
            }
            $dataResult['action'] = 'Add';
            break;
        case 'Update':
            try {
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
                $person->setNumberPhone($phoneNumber);
                $person->setAddress($address);
                $person->setStatus($status);
                $person->Update();
                $dataResult['message'] = updateMessage;
            } catch (Exception $e) {
                $dataResult['message'] = errorMessage;
            }
            $dataResult['action'] = 'Update';
            break;
        case 'Consult':
            try {
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
                $person->setNumberPhone($phoneNumber);
                $person->setAddress($address);
                $person->setStatus($status);
                $result= $person->Consult();
                $dataResult['data'] = $person->Consult();
                $dataResult['message'] = consultMessage;
            } catch (Exception $e) {
                $dataResult['message'] = errorMessage;
            }
            $dataResult['action'] = 'Consult';
            break;
        case 'Delete':
            try {
                $person->setId($_POST['id']);                
                $person->Delete();
                $dataResult['message'] = consultMessage;                
            } catch (Exception $e) {
                $dataResult['message'] = errorMessage;
            }
            $dataResult['action'] = 'Delete';
            break;
    }
    echo json_encode($dataResult);
}
