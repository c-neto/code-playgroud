<?php 

$id 	= $_GET ["id"];
$n1 	= $_GET ["n1"];
$n2	= $_GET ["n2"];
$n3	= $_GET ["n3"];
$me	= ($n1+$n2+$n3)/3;
$ma     = ($n1+$n2*2+$n3*3+$me)/7;

if ($ma >= 9){

echo "Aluno: ".$id.
", Sua m�dia de Exercicios �: ".$me.
", Sua nota 1 �: ".$n1.
" ,Sua nota 2 �: ".$n2.
" ,Sua nota 3 �: ".$n3.
" ,Sua media aritm�tica �: ".$ma.
" ,sua nota de conceito �: A";

}

elseif ($ma == 7 || $ma == 6){

echo "Aluno: ".$id.
", Sua m�dia de Exercicios �: ".$me.
", Sua nota 1 �: ".$n1.
" ,Sua nota 2 �: ".$n2.
" ,Sua nota 3 �: ".$n3.
" ,Sua media aritm�tica �: ".$ma.
" ,sua nota de conceito �: B";

}

elseif ($ma == 5 || $ma == 6){

echo "Aluno: ".$id.
", Sua m�dia de Exercicios �: ".$me.
", Sua nota 1 �: ".$n1.
" ,Sua nota 2 �: ".$n2.
" ,Sua nota 3 �: ".$n3.
" ,Sua media aritm�tica �: ".$ma.
" ,sua nota de conceito �: C";

}

elseif ($ma == 3 || $ma == 2 || $ma == 1){

echo "Aluno: ".$id.
", Sua m�dia de Exercicios �: ".$me.
", Sua nota 1 �: ".$n1.
" ,Sua nota 2 �: ".$n2.
" ,Sua nota 3 �: ".$n3.
" ,Sua media aritm�tica �: ".$ma.
" ,sua nota de conceito �: D";

}

elseif ($ma == 0){

echo "Aluno: ".$id.
", Sua m�dia de Exercicios �: ".$me.
", Sua nota 1 �: ".$n1.
" ,Sua nota 2 �: ".$n2.
" ,Sua nota 3 �: ".$n3.
" ,Sua media aritm�tica �: ".$ma.
" ,sua nota de conceito �: E";

}


?>
