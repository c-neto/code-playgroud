<?php 

$nome 	= $_GET ["nome"];
$n1 	= $_GET ["n1"];
$n2	= $_GET ["n2"];
$n3 	= $_GET ["n3"];
$n4 	= $_GET ["n4"];
$mf     = ($n1+$n2+$n3+$n4)/4;

if ($mf >= 7){

echo "$nome voc� esta aprovado!!! sua m�dia final �: ".$mf;
}


elseif ($mf >= 5){

echo "$nome voc� esta de recupera��o!!! sua m�dia final �: ".$mf;
}


else{

echo "$nome voc� esta reprovado!!! sua m�dia final �: ".$mf;
}

?>

