<?php
    class SalarioModel{

    private $cantidadHora;
    private $salarioTotal;
    private $valorHora;

    public function setCantidadHora($cantidadHora){$this->cantidadHora= $cantidadHora;}

    public function getCantidadHora(){return $this->cantidadHora;}
    
    public function setSalarioTotal($salarioTotal){$this->salarioTotal= $salarioTotal;}
    
    public function getSalarioTotal(){return $this-> salarioTotal;}

    public function setValorHora($valorHora){$this->valorHora= $valorHora;}
    
    public function getValorHora(){return $this-> valorHora;}
 
    function __construct(){


    } 

    function Operaciones(){
        $salario=0;
        if($this->getCantidadHora() > 40){
            $salario = $this->getValorHora()*40;
            $salario += ($this->getCantidadHora()-40)*($this->getValorHora()*1.5);
        }else{
            $salario = $this->getValorHora()*$this->getCantidadHora();
        }
            $this->setSalarioTotal($salario);
            echo $this->getSalarioTotal();
        }
    }
?>