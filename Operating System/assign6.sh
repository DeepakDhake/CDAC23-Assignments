#!/bin/bash

read -p "Input the Number (Table to be calculated) " num
mul=1
for((i=1; i<=10; i++))
do
	mul=`expr $num \* $i`
	echo $num "X" $i "=" $mul
done
