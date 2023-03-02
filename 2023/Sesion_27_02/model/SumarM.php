<?php
    class Sumar{

        private $n1;
        private $n2;
        private $resultado;

        // set n1
        public function setN1($n1){$this->n1=$n1;}

        // get n1
        public function getN1(){return $this->n1;}

        // set n2
        public function setN2($n2){$this->n2=$n2;}

        // get n2
        public function getN2(){return $this->n2;}

        // set resultado
        public function setResultado($resultado){$this->resultado=$resultado;}

        // get resultado
        public function getResultado(){return $this->resultado;}

        function Calcular(){
            $this->resultado= $this->getN1()+$this->getN2();
            echo $this->resultado;
        }
    }    
?>