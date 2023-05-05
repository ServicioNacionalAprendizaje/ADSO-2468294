<?php
include '../../environment/conexion.php';
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
    function __construct(){
        $this->conn = new Conexion();
    }

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
        $sentenciaSql="
                        INSERT INTO persons(                           
                            document_type,
                            document,
                            first_name,
                            second_name,
                            first_last_name,
                            second_last_name,
                            age,
                            gender,
                            mail,
                            phone_number,
                            address,
                            status,
                            user_creation,
                            user_modification,
                            date_creation,
                            date_modification,
                        ) 
                        VALUES (                            
                            '$this->documentType',
                            '$this->document',
                            '$this->firstName',
                            '$this->secondName',
                            '$this->firstLastName',
                            '$this->secondLastName',
                             $this->age,
                            '$this->gender',
                            '$this->mail',
                             $this->phoneNumber,
                            '$this->address',
                            '$this->status',
                             1,
                             1,
                            NOW(),
                            NOW()'                      
                        );";
        $this->conn->Preparar($sentenciaSql);
        $this->conn->Ejecutar();
        return true;
    }

    // Method to update
    public function Update(){
        $sentenciaSql="
                        UPDATE persons SET                           
                            document_type= '$this->documentType',
                            document= '$this->document',
                            first_name= '$this->firstName',
                            second_name= '$this->secondName',
                            first_last_name= '$this->firstLastName',
                            second_last_name= '$this->secondLastName',
                            age=  $this->age,
                            gender= '$this->gender',
                            mail= '$this->mail',
                            phone_number=  $this->phoneNumber,
                            address= '$this->address',
                            status= '$this->status',
                            user_creation=  1,
                            user_modification=  1,
                            date_creation= NOW(),
                            date_modification= NOW()' 
                        WHERE id = $this->id                    
                        );";
        $this->conn->Preparar($sentenciaSql);
        $this->conn->Ejecutar();
        return true;
    }

    // Method to consult
    public function Consult(){
        $sentenciaSql="SELECT * FROM  persons WHERE id = $this->id);";
        $this->conn->Preparar($sentenciaSql);
        $this->conn->Ejecutar();
        return true;
    }

    // Method to delete
    public function Delete(){
        $sentenciaSql="DELETE FROM  persons WHERE id = $this->id);";
        $this->conn->Preparar($sentenciaSql);
        $this->conn->Ejecutar();
        return true;
    }

    // Method to filter
    private function Filter(){
        
    }

    // Method to destruct
    function __destruct() {
        unset($this->id);
        unset($this->documentType);
        unset($this->document);
        unset($this->firstName);
        unset($this->secondName);
        unset($this->firstLastName);
        unset($this->secondLastName);
        unset($this->age);
        unset($this->gender);
        unset($this->mail);
        unset($this->phoneNumber);
        unset($this->address);
        unset($this->status);
        unset($this->userCreation);
        unset($this->userModification);
        unset($this->dateCreation);
        unset($this->dateModification);
    }
}

?>