<?php 

$nome 	= $_GET ["nome"];
$n1 	= $_GET ["n1"];
$n2	= $_GET ["n2"];
$n3 	= $_GET ["n3"];
$mf             = ($n1*2+$n2*3+$n3*5)/10;

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

