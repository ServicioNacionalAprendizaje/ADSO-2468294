<?php
require_once '../../environment/conection.php';
require_once '../base/BaseModel.php';
class Persons extends BaseModel
{
    /**
     * @var string El primer nombre de la persona.
     */
    private $firstName;
    private $secondName;
    private $firstLastName;
    private $secondLastName;
    private $age;
    private $documentType;
    private $document;
    private $mail;
    private $gender;
    private $numberPhone;
    private $address;
    private $status;
    private $userCreationId;
    private $userModificationId;
    private $dateCreation;
    private $dateModification;

    /**
     * Constructor de la clase. Crea una nueva instancia de la clase Conexion.
     */
    function __construct()
    {
        $this->conn = new Conexion();
    }

    /**
     * Establece el primer nombre de la persona.
     *
     * @param string $firstName El nuevo primer nombre.
     */
    public function setFirstName($firstName)
    {
        $this->firstName = $firstName;
    }

    /**
     * Obtiene el primer nombre de la persona.
     *
     * @return string El primer nombre de la persona.
     */
    public function getFirstName()
    {
        return $this->firstName;
    }

    // secondLastName
    public function setSecondLastName($secondLastName)
    {
        $this->secondLastName = $secondLastName;
    }
    public function getSecondLastName()
    {
        return $this->secondLastName;
    }

    // Id
    public function setSecondName($secondName)
    {
        $this->secondName = $secondName;
    }
    public function getSecondName()
    {
        return $this->secondName;
    }

    // Id
    public function setFirstLastName($firstLastName)
    {
        $this->firstLastName = $firstLastName;
    }
    public function getFirstLastName()
    {
        return $this->firstLastName;
    }

    // Id
    public function setage($age)
    {
        $this->age = $age;
    }
    public function getage()
    {
        return $this->age;
    }

    // Id
    public function setDocumentType($documentType)
    {
        $this->documentType = $documentType;
    }
    public function getDocumentType()
    {
        return $this->documentType;
    }

    // Id
    public function setdocument($document)
    {
        $this->document = $document;
    }
    public function getdocument()
    {
        return $this->document;
    }


    // Id
    public function setGender($gender)
    {
        $this->gender = $gender;
    }
    public function getGender()
    {
        return $this->gender;
    }

    // Id
    public function setNumberPhone($numberPhone)
    {
        $this->numberPhone = $numberPhone;
    }
    public function getNumberPhone()
    {
        return $this->numberPhone;
    }


    // Id
    public function setAddress($adress)
    {
        $this->address = $adress;
    }
    public function getAddress()
    {
        return $this->address;
    }

    // Id
    public function setMail($Mail)
    {
        $this->mail = $Mail;
    }
    public function getMail()
    {
        return $this->mail;
    }



    /**
     * Inserta un nuevo registro en la tabla persons.
     *
     * @return bool Retorna verdadero si la inserción fue exitosa, de lo contrario retorna falso.
     */
    public function Add()
    {

        $sentenciaSql = "
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
            date_modification
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
             $this->numberPhone,
            '$this->address',
            '$this->status',
             1,
             1,
            NOW(),
            NOW()                      
        );";
        $this->conn->Preparar($sentenciaSql);
        $this->conn->Ejecutar();
        return true;
    }

    /**
     * Actualiza un registro existente en la tabla persons.
     *
     * @return bool Retorna verdadero si la actualización fue exitosa, de lo contrario retorna falso.
     */
    public function Update()
    {
        $sentenciaSql = "
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
                        phone_number=  $this->numberPhone,
                        address= '$this->address',
                        status= '$this->status',
                        user_creation=  1,
                        user_modification=  1,
                        date_creation= NOW(),
                        date_modification= NOW()  
                    WHERE id = $this->id                    
                    );";
        $this->conn->Preparar($sentenciaSql);
        $this->conn->Ejecutar();
        return true;
    }

    /**
     * Realiza una consulta a la tabla persons para obtener información de un registro específico.
     *
     * @return bool Retorna verdadero si la consulta fue exitosa, de lo contrario retorna falso.
     */
    public function Consult()
    {
        $sentenciaSql = "SELECT * FROM  persons WHERE id = $this->id);";
        $this->conn->Preparar($sentenciaSql);
        $this->conn->Ejecutar();
        return true;
    }

    /**
     * Elimina un registro específico de la tabla persons en la base de datos.
     *
     * @return bool Retorna verdadero si la eliminación fue exitosa, de lo contrario retorna falso.
     */
    public function Delete()
    {
        $sentenciaSql = "DELETE FROM  persons WHERE id = $this->id);";
        $this->conn->Preparar($sentenciaSql);
        $this->conn->Ejecutar();
        return true;
    }

    /**
     * Filtra los registros de la tabla persons en función de uno o varios atributos de la clase.
     *
     * @param array $filters Un array asociativo donde las claves son los nombres de los atributos y los valores son los valores a filtrar.
     * @return array|null Un array de objetos Person que cumplen con los filtros especificados, o null si no se encontraron registros.
     * @throws Exception Si se produce un error al realizar la consulta.
     */
    public function Filter()
    {
    }

    // Method to destruct
    function __destruct()
    {
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
        unset($this->numberPhone);
        unset($this->address);
        unset($this->status);
        unset($this->userCreationId);
        unset($this->userModificationId);
        unset($this->dateCreation);
        unset($this->dateModification);
    }
}
