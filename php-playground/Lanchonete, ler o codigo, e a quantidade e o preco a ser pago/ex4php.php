<?php 

$codigo		= $_GET ["cod"];
$quantidade	= $_GET ["qua"];


if ($codigo == 100){
$r = 1.20 *$quantidade;

echo "Cachorro quente, Pre�o a ser pago:R$ ".$r;
}

elseif ($codigo == 101){
$r = 1.30 *$quantidade;

echo "Bauru simples, Pre�o a ser pago:R$ ".$r;
}

elseif ($codigo == 102){
$r = 1.50*$quantidade;

echo "Bauru com ovo, Pre�o a ser pago:R$ ".$r;
}


elseif ($codigo == 103){
$r = 1.20*$quantidade;

echo "Hamburguer, Pre�o a ser pago:R$ ".$r;
}

elseif ($codigo == 104){
$r = 1.30*$quantidade;

echo "Cheese Burger, Pre�o a ser pago:R$ ".$r;
}

elseif ($codigo == 105){
$r = 1.00*$quantidade;

echo "Refrigerante, Pre�o a ser pago:R$ ".$r;
}



?>



