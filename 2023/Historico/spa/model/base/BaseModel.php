<?php
class BaseModel
{
    
    private $id;
    private $status;
    private $userCreationId;
    private $userModificationId;
    private $dateCreation;
    private $dateModification;
    
    /**
    * @var Conexion La conexión a la base de datos.
    */
    public $conn;

    // Id
    public function setId($id)
    {
        $this->id = $id;
    }
    public function getId()
    {
        return $this->id;
    }

    // Id
    public function setStatus($status)
    {
        $this->status = $status;
    }

    public function getStatus()
    {
        return $this->status;
    }

    // Id
    public function setUserCreationId($userCreationId)
    {
        $this->userCreationId = $userCreationId;
    }
    public function getUserCreationId()
    {
        return $this->userCreationId;
    }

    // Id
    public function setUserModificationId($userModificationId)
    {
        $this->userModificationId = $userModificationId;
    }
    public function getUserModificationId()
    {
        return $this->userModificationId;
    }

    // Id
    public function setDateCreation($dateCreation)
    {
        $this->dateCreation = $dateCreation;
    }
    public function getDateCreation()
    {
        return $this->dateCreation;
    }

    // Id
    public function setDateModification($dateModification)
    {
        $this->dateModification = $dateModification;
    }
    public function getDateModification()
    {
        return $this->dateModification;
    }
}
