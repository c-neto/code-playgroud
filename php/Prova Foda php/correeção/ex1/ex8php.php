<?php 

$i 	= $_GET ["i"];
$a 	= $_GET ["a"];
$i



if ($i==1){

	if ($a<$b && $b<$c){
	echo "ORDEM CRESCENTE: Joaozinho".$a." <br> " .$b. "  " .$c;
	}
	
	elseif ($a==$b && $a==$c){
	echo "NUMEROS IGUAIS: ".$a."  " .$b. "  " .$c;
	}

	elseif ($a==$b && $C>$a){
	echo "VARIAVEL A & B S�O IGUAIS, E O MAIOR NUMERO � O C: ".$c."  >  ".$a." = ".$b;
	}

	elseif ($a==$c && $b>$c){
	echo "VARIAVEL A & C S�O IGUAIS, E O MAIOR NUMERO � O B: ".$b."  >  ".$a." = " .$c;
	}

	elseif ($b==$c && $a>$c){
	echo "VARIAVEL B & C S�O IGUAIS, E O MAIOR NUMERO � O A: ".$a."  >  ".$c." = " .$b;
	}

	elseif ($a==$b && $a>$c){
	echo "VARIAVEL A & B S�O IGUAIS E MAIORES DO QUE A VARIAVEL C ".$a." = ".$b." > " .$c;
	}
	
	elseif ($a==$b && $a>$c){
	echo "VARIAVEL B & C S�O IGUAIS E MAIORES DO QUE A VARIAVEL A ".$b." = ".$c." > " .$a;
	}
	
	elseif ($a==$b && $a>$c){
	echo "VARIAVEL A & C S�O IGUAIS E MAIORES DO QUE A VARIAVEL B ".$a." = ".$c." > " .$b;
	}
	
	



?>


