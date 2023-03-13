<?php
class Persons
{
    private $id;
    private $documentType;
    private $document;
    private $firstName;
    private $secondName;
    private $firstLastName;
    private $secondLastName;
    private $age;
    private $gender;
    private $mail;
    private $phoneNumber;
    private $address;
    private $status;
    private $userCreation;
    private $userModification;
    private $dateCreation;
    private $dateModification;

    // Method to construct
    function __construct(){}

    // Id
    public function setId ($id){$this->id =$id;} 
    public function getId(){return $this->id;}

    // documentType
    public function setDocumentType ($documentType){$this->documentType =$documentType;} 
    public function getDocumentType(){return $this->documentType;}

    // document
    public function setDocument ($document){$this->document =$document;} 
    public function getDocument(){return $this->document;}

    // firstName
    public function setFirstName ($firstName){$this->firstName =$firstName;} 
    public function getFirstName(){return $this->firstName;}

    // Method to add
    public function Add(){

    }

    // Method to update
    public function Update(){
        
    }

    // Method to consult
    public function Consult(){
        
    }

    // Method to delete
    public function Delete(){
        
    }

    // Method to filter
    private function Filter(){
        
    }

    // Method to destruct
    function __destruct() {}
}

?>